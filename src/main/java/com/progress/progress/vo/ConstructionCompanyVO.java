package com.progress.progress.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;

import com.sgcc.uap.rest.annotation.attribute.AttributeType;
import com.sgcc.uap.rest.annotation.attribute.EditorType;
import com.sgcc.uap.rest.annotation.attribute.ViewAttribute;
import com.sgcc.uap.rest.support.ParentVO;

/**
 * ConstructionCompany的VO类
 *
 * @author ru3an 
 */
public class ConstructionCompanyVO extends ParentVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
    /** 
     * 属性主键
     */  
    @ViewAttribute(name ="id",caption="主键", editor=EditorType.NumberEditor,nullable =false,readOnly=false, type=AttributeType.LONG)
    private Long id;    
    /** 
     * 属性公司名称
     */  
    @ViewAttribute(name ="name",caption="公司名称", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String name;    
    /** 
     * 属性负责人
     */  
    @ViewAttribute(name ="principal",caption="负责人", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String principal;    
    /** 
     * 属性作业人数
     */  
    @ViewAttribute(name ="wokers",caption="作业人数", editor=EditorType.NumberEditor,nullable =true,readOnly=false, type=AttributeType.INTEGER)
    private Integer wokers;    
    /** 
     * 属性日期
     */  
    @ViewAttribute(name ="createTime",caption="日期", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp createTime;    
    /**
     * ConstructionCompanyVO构造函数
     */
    public ConstructionCompanyVO() {
        super();
    } 
   
	 /**
     * ConstructionCompanyVO完整的构造函数
     */  
    public ConstructionCompanyVO(Long id){
        this.id = id;
    }
    /**
     * 主键的get方法
     * @return id
     */
    public Long getId(){
        return id;
    }
    /**
     * 主键的set方法
     * @param id
     */
    public void setId(Long id){
		this.id = id;
	} 
    /**
     * 公司名称的get方法
     * @return name
     */
    public String getName(){
        return name;
    }
    /**
     * 公司名称的set方法
     * @param name
     */
    public void setName(String name){
		this.name = name;
	} 
    /**
     * 负责人的get方法
     * @return principal
     */
    public String getPrincipal(){
        return principal;
    }
    /**
     * 负责人的set方法
     * @param principal
     */
    public void setPrincipal(String principal){
		this.principal = principal;
	} 
    /**
     * 作业人数的get方法
     * @return wokers
     */
    public Integer getWokers(){
        return wokers;
    }
    /**
     * 作业人数的set方法
     * @param wokers
     */
    public void setWokers(Integer wokers){
		this.wokers = wokers;
	} 
    /**
     * 日期的get方法
     * @return createTime
     */
    public Timestamp getCreateTime(){
        return createTime;
    }
    /**
     * 日期的set方法
     * @param createTime
     */
    public void setCreateTime(Timestamp createTime){
		this.createTime = createTime;
	} 

    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
	  			.append("ID"+":"+getId())
				.append("NAME"+":"+getName())
				.append("PRINCIPAL"+":"+getPrincipal())
				.append("WOKERS"+":"+getWokers())
				.append("CREATE_TIME"+":"+getCreateTime())
		        .toString(); 
			
    } 
   


}
