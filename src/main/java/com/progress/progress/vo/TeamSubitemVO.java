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
 * TeamSubitem的VO类
 *
 * @author ru3an 
 */
public class TeamSubitemVO extends ParentVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
    /** 
     * 属性主键
     */  
    @ViewAttribute(name ="id",caption="主键", editor=EditorType.NumberEditor,nullable =false,readOnly=false, type=AttributeType.LONG)
    private Long id;    
    /** 
     * 属性施工队伍名称
     */  
    @ViewAttribute(name ="teamName",caption="施工队伍名称", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String teamName;    
    /** 
     * 属性施工队伍id
     */  
    @ViewAttribute(name ="teamId",caption="施工队伍id", editor=EditorType.NumberEditor,nullable =true,readOnly=false, type=AttributeType.INTEGER)
    private Integer teamId;    
    /** 
     * 属性分项名称
     */  
    @ViewAttribute(name ="subitemName",caption="分项名称", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String subitemName;    
    /** 
     * 属性分项id
     */  
    @ViewAttribute(name ="subitemId",caption="分项id", editor=EditorType.NumberEditor,nullable =true,readOnly=false, type=AttributeType.INTEGER)
    private Integer subitemId;    
    /** 
     * 属性创建时间
     */  
    @ViewAttribute(name ="createTime",caption="创建时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp createTime;    
    /**
     * TeamSubitemVO构造函数
     */
    public TeamSubitemVO() {
        super();
    } 
   
	 /**
     * TeamSubitemVO完整的构造函数
     */  
    public TeamSubitemVO(Long id){
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
     * 施工队伍名称的get方法
     * @return teamName
     */
    public String getTeamName(){
        return teamName;
    }
    /**
     * 施工队伍名称的set方法
     * @param teamName
     */
    public void setTeamName(String teamName){
		this.teamName = teamName;
	} 
    /**
     * 施工队伍id的get方法
     * @return teamId
     */
    public Integer getTeamId(){
        return teamId;
    }
    /**
     * 施工队伍id的set方法
     * @param teamId
     */
    public void setTeamId(Integer teamId){
		this.teamId = teamId;
	} 
    /**
     * 分项名称的get方法
     * @return subitemName
     */
    public String getSubitemName(){
        return subitemName;
    }
    /**
     * 分项名称的set方法
     * @param subitemName
     */
    public void setSubitemName(String subitemName){
		this.subitemName = subitemName;
	} 
    /**
     * 分项id的get方法
     * @return subitemId
     */
    public Integer getSubitemId(){
        return subitemId;
    }
    /**
     * 分项id的set方法
     * @param subitemId
     */
    public void setSubitemId(Integer subitemId){
		this.subitemId = subitemId;
	} 
    /**
     * 创建时间的get方法
     * @return createTime
     */
    public Timestamp getCreateTime(){
        return createTime;
    }
    /**
     * 创建时间的set方法
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
				.append("TEAM_NAME"+":"+getTeamName())
				.append("TEAM_ID"+":"+getTeamId())
				.append("SUBITEM_NAME"+":"+getSubitemName())
				.append("SUBITEM_ID"+":"+getSubitemId())
				.append("CREATE_TIME"+":"+getCreateTime())
		        .toString(); 
			
    } 
   


}
