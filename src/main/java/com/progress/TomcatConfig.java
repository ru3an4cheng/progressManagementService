package com.progress;

import org.apache.catalina.Context;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;

@Configuration  
public class TomcatConfig {  
  
    @Bean  
    public TomcatServletWebServerFactory servletContainer() {  
    	TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory() {// 1  
            protected void postProcessContext(Context context) {  
                SecurityConstraint securityConstraint = new SecurityConstraint();  
                securityConstraint.setUserConstraint("CONFIDENTIAL");  
                SecurityCollection collection = new SecurityCollection();  
                collection.addPattern("/*");  
                collection.addMethod("PUT");  
                collection.addMethod("DELETE");  
                collection.addMethod("CONNECT");  
                //collection.addMethod("OPTIONS");  
                collection.addMethod("PATCH");  
                collection.addMethod("PROPFIND");  
                collection.addMethod("PROPPATCH");  
                collection.addMethod("MKCOL");
                collection.addMethod("COPY");  
                collection.addMethod("MOVE");  
                collection.addMethod("LOCK");  
                collection.addMethod("UNLOCK ");  
                collection.addMethod("TRACE");  
                collection.addMethod("HEAD");  
                securityConstraint.addCollection(collection);  
                context.addConstraint(securityConstraint);  
            }  
        };  
        return tomcat;  
    }  
}  