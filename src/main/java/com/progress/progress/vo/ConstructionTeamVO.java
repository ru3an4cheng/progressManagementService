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
 * ConstructionTeam的VO类
 *
 * @author ru3an 
 */
public class ConstructionTeamVO extends ParentVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
    /** 
     * 属性主键
     */  
    @ViewAttribute(name ="id",caption="主键", editor=EditorType.NumberEditor,nullable =false,readOnly=false, type=AttributeType.LONG)
    private Long id;    
    /** 
     * 属性公司名称
     */  
    @ViewAttribute(name ="companyName",caption="公司名称", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String companyName;    
    /** 
     * 属性公司id
     */  
    @ViewAttribute(name ="companyId",caption="公司id", editor=EditorType.NumberEditor,nullable =true,readOnly=false, type=AttributeType.INTEGER)
    private Integer companyId;    
    /** 
     * 属性施工队伍名称
     */  
    @ViewAttribute(name ="teamName",caption="施工队伍名称", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String teamName;    
    /** 
     * 属性施工队伍人数
     */  
    @ViewAttribute(name ="teamWokers",caption="施工队伍人数", editor=EditorType.NumberEditor,nullable =true,readOnly=false, type=AttributeType.INTEGER)
    private Integer teamWokers;    
    /** 
     * 属性负责人
     */  
    @ViewAttribute(name ="principal",caption="负责人", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String principal;    
    /** 
     * 属性负责项目名称
     */  
    @ViewAttribute(name ="projectName",caption="负责项目名称", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String projectName;    
    /** 
     * 属性创建时间
     */  
    @ViewAttribute(name ="createTime",caption="创建时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp createTime;    
    /**
     * ConstructionTeamVO构造函数
     */
    public ConstructionTeamVO() {
        super();
    } 
   
	 /**
     * ConstructionTeamVO完整的构造函数
     */  
    public ConstructionTeamVO(Long id){
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
     * @return companyName
     */
    public String getCompanyName(){
        return companyName;
    }
    /**
     * 公司名称的set方法
     * @param companyName
     */
    public void setCompanyName(String companyName){
		this.companyName = companyName;
	} 
    /**
     * 公司id的get方法
     * @return companyId
     */
    public Integer getCompanyId(){
        return companyId;
    }
    /**
     * 公司id的set方法
     * @param companyId
     */
    public void setCompanyId(Integer companyId){
		this.companyId = companyId;
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
     * 施工队伍人数的get方法
     * @return teamWokers
     */
    public Integer getTeamWokers(){
        return teamWokers;
    }
    /**
     * 施工队伍人数的set方法
     * @param teamWokers
     */
    public void setTeamWokers(Integer teamWokers){
		this.teamWokers = teamWokers;
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
     * 负责项目名称的get方法
     * @return projectName
     */
    public String getProjectName(){
        return projectName;
    }
    /**
     * 负责项目名称的set方法
     * @param projectName
     */
    public void setProjectName(String projectName){
		this.projectName = projectName;
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
				.append("COMPANY_NAME"+":"+getCompanyName())
				.append("COMPANY_ID"+":"+getCompanyId())
				.append("TEAM_NAME"+":"+getTeamName())
				.append("TEAM_WOKERS"+":"+getTeamWokers())
				.append("PRINCIPAL"+":"+getPrincipal())
				.append("PROJECT_NAME"+":"+getProjectName())
				.append("CREATE_TIME"+":"+getCreateTime())
		        .toString(); 
			
    } 
   


}
