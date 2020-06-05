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
 * Notification的VO类
 *
 * @author ru3an 
 */
public class NotificationVO extends ParentVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
    /** 
     * 属性主键
     */  
    @ViewAttribute(name ="id",caption="主键", editor=EditorType.NumberEditor,nullable =false,readOnly=false, type=AttributeType.LONG)
    private Long id;    
    /** 
     * 属性周报标题
     */  
    @ViewAttribute(name ="title",caption="周报标题", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String title;    
    /** 
     * 属性周报日期
     */  
    @ViewAttribute(name ="_date",caption="周报日期", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp _date;    
    /**
     * NotificationVO构造函数
     */
    public NotificationVO() {
        super();
    } 
   
	 /**
     * NotificationVO完整的构造函数
     */  
    public NotificationVO(Long id){
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
     * 周报标题的get方法
     * @return title
     */
    public String getTitle(){
        return title;
    }
    /**
     * 周报标题的set方法
     * @param title
     */
    public void setTitle(String title){
		this.title = title;
	} 
    /**
     * 周报日期的get方法
     * @return _date
     */
    public Timestamp get_date(){
        return _date;
    }
    /**
     * 周报日期的set方法
     * @param _date
     */
    public void set_date(Timestamp _date){
		this._date = _date;
	} 

    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
	  			.append("ID"+":"+getId())
				.append("TITLE"+":"+getTitle())
				.append("DATE"+":"+get_date())
		        .toString(); 
			
    } 
   


}
