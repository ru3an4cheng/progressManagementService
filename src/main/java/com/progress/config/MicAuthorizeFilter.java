package com.progress.config;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;

import com.sgcc.isc.service.adapter.factory.AdapterFactory;
import com.sgcc.isc.service.adapter.helper.IResourceService;
import com.sgitg.sgcc.sm.SM4Utils;


/**
 * 功能描述：isc、lbss鉴权过滤器
 * @author ru3an
 * @date 2020-06-05 11:21:13
 */ 
@Order(1)
@WebFilter(filterName = "MicAuthorizeFilter", urlPatterns = "/*")
public class MicAuthorizeFilter implements Filter{
	
	 /**isc服务生成的业务应用appId*/
	 @Value("${sguap_isc.appId}")
	 private String appId;
	 /**国密算法sm4秘钥*/
	 @Value("${sguap.entryKey}")
	 private String entryKey;
	 /** isc资源服务接口 */
	 private IResourceService ress = (IResourceService) AdapterFactory.getResourceService();
	 @Value("${sguap_lbss.systemId}")
	 private String systemId;
	 
	 @Override
	 public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)  
			throws IOException, ServletException {
		//isc过滤操作
		doIscFilter(request,response,chain);
	}
	/**
	 * isc过滤操作
	 */
	public void doIscFilter(ServletRequest request, ServletResponse response, FilterChain chain)  
			throws IOException, ServletException {  
		  HttpServletRequest httpRequest = (HttpServletRequest) request;
		  HttpServletResponse httpResponse = (HttpServletResponse) response;
		  if(httpRequest.getMethod().equalsIgnoreCase("options")){
			  chain.doFilter(httpRequest, httpResponse);
		  }else {
			  httpResponse =  setResponseCors(httpResponse);
			  PrintWriter printWriter = null;
			  try {
				  String url = httpRequest.getRequestURI().substring(httpRequest.getContextPath().length());
				  if (url.startsWith("/") && url.length() > 1) {
					  url = url.substring(1).split("/")[0];
				  }
				  String iscUserId = httpRequest.getParameter("cl_u_id");
				  if(iscUserId == null || iscUserId.equals("")){
					  iscUserId = httpRequest.getHeader("cl_u_id");
				  }
				  boolean isPer=false;
				  if(null==iscUserId||("").equals(iscUserId)){
					  printWriter = response.getWriter();
					  printWriter.write("authorizeFail");
					  printWriter.flush();
					  return;
				  }
//				  LookSecret lookSecret = new LookSecret();
//				  iscUserId = lookSecret.look(iscUserId, entryKey);
				      SM4Utils sm4 = new SM4Utils();
//				  byte[] plainText1 = sm4.SG_DecECBData(entryKey.getBytes(),iscUserId.getBytes());

				  byte[] key = Util.hexToByte(entryKey);
				  byte[] cipherText = Util.hexToByte(iscUserId);
				  byte[] plainText1 = sm4.SG_DecECBData(key, cipherText);
				  iscUserId = Util.byteToString(plainText1);
				  try {//校验此用户是否有访问url的权限
					isPer= ress.hasPermitURLObj(iscUserId, appId, url);
				  } catch (Exception e) {
						e.printStackTrace();
				  }
				  if (isPer==true){
					  chain.doFilter(httpRequest, httpResponse);
					  return;
				  } else{
					  printWriter = response.getWriter();
					  printWriter.write("authorizeFail");
					  printWriter.flush();
				  }
			} catch (Exception e) {
				e.printStackTrace();
			} finally{
				if(printWriter!=null){
					printWriter.close();
				}
			}
		  }
	}  	
	    
      
    @Override  
    public void init(FilterConfig arg0) throws ServletException {
    	
    }
    
    @Override  
    public void destroy() {
    	
    }
    
    /**
     * 设置请求头允许跨域
     * @param httpResponse
     * @return httpResponse 配置完成后的response对象
     */
    private static HttpServletResponse setResponseCors(HttpServletResponse httpResponse){
    	 httpResponse.addHeader("Access-Control-Allow-Origin", "*");
         httpResponse.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
         httpResponse.setHeader("Access-Control-Allow-Methods", "GET, PUT, DELETE, POST");
         return httpResponse;
    	
    }
}  
