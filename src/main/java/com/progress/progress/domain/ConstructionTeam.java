package com.progress.progress.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.URL;

import com.sgcc.uap.service.validator.constraints.ZNStr;
import com.sgcc.uap.service.validator.constraints.ENStr;
import com.sgcc.uap.service.validator.constraints.Figure;
import com.sgcc.uap.service.validator.constraints.IntegerRange;
import com.sgcc.uap.service.validator.constraints.LongRange;
import com.sgcc.uap.service.validator.constraints.Postcode;
import com.sgcc.uap.service.validator.constraints.DateRange;
import com.sgcc.uap.service.validator.constraints.Unique;
import com.sgcc.uap.service.validator.constraints.UserDefine;

/**
 * ConstructionTeam的POJO类
 * @author ru3an 
 */
@Entity
@Table(name = "construction_team")
public class ConstructionTeam implements Serializable {

    /** 
     * serialVersionUID
     */
	private static final long serialVersionUID = -7768637914227571159L;

    /** 
     * 主键
     */
	@Id
	@GeneratedValue(generator = "idGenerator")
	@GenericGenerator(name = "idGenerator", strategy = "identity")
    @Column(name = "ID", nullable = false, length = 10)
    private Long id ;
    
    /** 
     * 公司名称
     */
    @Column(name = "COMPANY_NAME", nullable = true, length = 64)
    private String companyName ;
    
    /** 
     * 公司id
     */
    @Column(name = "COMPANY_ID", nullable = true, length = 10)
    private Integer companyId ;
    
    /** 
     * 施工队伍名称
     */
    @Column(name = "TEAM_NAME", nullable = true, length = 64)
    private String teamName ;
    
    /** 
     * 施工队伍人数
     */
    @Column(name = "TEAM_WOKERS", nullable = true, length = 10)
    private Integer teamWokers ;
    
    /** 
     * 负责人
     */
    @Column(name = "PRINCIPAL", nullable = true, length = 64)
    private String principal ;
    
    /** 
     * 负责项目名称
     */
    @Column(name = "PROJECT_NAME", nullable = true, length = 64)
    private String projectName ;
    
    /** 
     * 创建时间
     */
    @Column(name = "CREATE_TIME", nullable = true, length = 19)
    private Timestamp createTime ;
    
	/**
	  *虚拟主键
	  */
	@Transient
	private String mxVirtualId;
	
	public ConstructionTeam(){
	
	}
    /**
     * @getId:主键的get方法
     * @return id
     * @date 2020-06-05 11:23:23
     * @author ru3an
     */
    public Long getId(){
        return this.id;
    }
    /**
     * @setId:主键的set方法
     * @param id id
     * @date 2020-06-05 11:23:23
     * @author ru3an
     */
    public void setId(Long id){
		this.id = id;
	} 
    /**
     * @getCompanyName:公司名称的get方法
     * @return companyName
     * @date 2020-06-05 11:23:23
     * @author ru3an
     */
    public String getCompanyName(){
        return this.companyName;
    }
    /**
     * @setCompanyName:公司名称的set方法
     * @param companyName companyName
     * @date 2020-06-05 11:23:23
     * @author ru3an
     */
    public void setCompanyName(String companyName){
		this.companyName = companyName;
	} 
    /**
     * @getCompanyId:公司id的get方法
     * @return companyId
     * @date 2020-06-05 11:23:23
     * @author ru3an
     */
    public Integer getCompanyId(){
        return this.companyId;
    }
    /**
     * @setCompanyId:公司id的set方法
     * @param companyId companyId
     * @date 2020-06-05 11:23:23
     * @author ru3an
     */
    public void setCompanyId(Integer companyId){
		this.companyId = companyId;
	} 
    /**
     * @getTeamName:施工队伍名称的get方法
     * @return teamName
     * @date 2020-06-05 11:23:23
     * @author ru3an
     */
    public String getTeamName(){
        return this.teamName;
    }
    /**
     * @setTeamName:施工队伍名称的set方法
     * @param teamName teamName
     * @date 2020-06-05 11:23:23
     * @author ru3an
     */
    public void setTeamName(String teamName){
		this.teamName = teamName;
	} 
    /**
     * @getTeamWokers:施工队伍人数的get方法
     * @return teamWokers
     * @date 2020-06-05 11:23:23
     * @author ru3an
     */
    public Integer getTeamWokers(){
        return this.teamWokers;
    }
    /**
     * @setTeamWokers:施工队伍人数的set方法
     * @param teamWokers teamWokers
     * @date 2020-06-05 11:23:23
     * @author ru3an
     */
    public void setTeamWokers(Integer teamWokers){
		this.teamWokers = teamWokers;
	} 
    /**
     * @getPrincipal:负责人的get方法
     * @return principal
     * @date 2020-06-05 11:23:23
     * @author ru3an
     */
    public String getPrincipal(){
        return this.principal;
    }
    /**
     * @setPrincipal:负责人的set方法
     * @param principal principal
     * @date 2020-06-05 11:23:23
     * @author ru3an
     */
    public void setPrincipal(String principal){
		this.principal = principal;
	} 
    /**
     * @getProjectName:负责项目名称的get方法
     * @return projectName
     * @date 2020-06-05 11:23:23
     * @author ru3an
     */
    public String getProjectName(){
        return this.projectName;
    }
    /**
     * @setProjectName:负责项目名称的set方法
     * @param projectName projectName
     * @date 2020-06-05 11:23:23
     * @author ru3an
     */
    public void setProjectName(String projectName){
		this.projectName = projectName;
	} 
    /**
     * @getCreateTime:创建时间的get方法
     * @return createTime
     * @date 2020-06-05 11:23:23
     * @author ru3an
     */
    public Timestamp getCreateTime(){
        return this.createTime;
    }
    /**
     * @setCreateTime:创建时间的set方法
     * @param createTime createTime
     * @date 2020-06-05 11:23:23
     * @author ru3an
     */
    public void setCreateTime(Timestamp createTime){
		this.createTime = createTime;
	} 
	public String getMxVirtualId() {
        return this.mxVirtualId;
    }
    
    public void setMxVirtualId(String mxVirtualId) {
        this.mxVirtualId = mxVirtualId;
    } 
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object obj) {
        if (this == obj)
			return true;
		
        if (obj == null || !(obj instanceof ConstructionTeam))
	        return false; 
	        
		if (getClass() != obj.getClass())
			return false;
		
		ConstructionTeam other = (ConstructionTeam) obj;
		
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (companyName == null) {
			if (other.companyName != null) {
				return false;
			}
		} else if (!companyName.equals(other.companyName)) {
			return false;
		}
		if (companyId == null) {
			if (other.companyId != null) {
				return false;
			}
		} else if (!companyId.equals(other.companyId)) {
			return false;
		}
		if (teamName == null) {
			if (other.teamName != null) {
				return false;
			}
		} else if (!teamName.equals(other.teamName)) {
			return false;
		}
		if (teamWokers == null) {
			if (other.teamWokers != null) {
				return false;
			}
		} else if (!teamWokers.equals(other.teamWokers)) {
			return false;
		}
		if (principal == null) {
			if (other.principal != null) {
				return false;
			}
		} else if (!principal.equals(other.principal)) {
			return false;
		}
		if (projectName == null) {
			if (other.projectName != null) {
				return false;
			}
		} else if (!projectName.equals(other.projectName)) {
			return false;
		}
		if (createTime == null) {
			if (other.createTime != null) {
				return false;
			}
		} else if (!createTime.equals(other.createTime)) {
			return false;
		}
		return true;
	}
    
    /**
     * toString方法
     * @return String
     */
	public String toString(){
		return "ConstructionTeam ["
			+ ", id=" + id
			+ ", companyName=" + companyName
			+ ", companyId=" + companyId
			+ ", teamName=" + teamName
			+ ", teamWokers=" + teamWokers
			+ ", principal=" + principal
			+ ", projectName=" + projectName
			+ ", createTime=" + createTime;
	}
   
    
    /**
     * hashcode方法
     * @return int
     * 
     */
    @Override
    public int hashCode(){
		return super.hashCode();
	}
}