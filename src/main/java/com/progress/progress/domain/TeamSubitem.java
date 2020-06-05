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
 * TeamSubitem的POJO类
 * @author ru3an 
 */
@Entity
@Table(name = "team_subitem")
public class TeamSubitem implements Serializable {

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
     * 施工队伍名称
     */
    @Column(name = "TEAM_NAME", nullable = true, length = 64)
    private String teamName ;
    
    /** 
     * 施工队伍id
     */
    @Column(name = "TEAM_ID", nullable = true, length = 10)
    private Integer teamId ;
    
    /** 
     * 分项名称
     */
    @Column(name = "SUBITEM_NAME", nullable = true, length = 64)
    private String subitemName ;
    
    /** 
     * 分项id
     */
    @Column(name = "SUBITEM_ID", nullable = true, length = 10)
    private Integer subitemId ;
    
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
	
	public TeamSubitem(){
	
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
     * @getTeamId:施工队伍id的get方法
     * @return teamId
     * @date 2020-06-05 11:23:23
     * @author ru3an
     */
    public Integer getTeamId(){
        return this.teamId;
    }
    /**
     * @setTeamId:施工队伍id的set方法
     * @param teamId teamId
     * @date 2020-06-05 11:23:23
     * @author ru3an
     */
    public void setTeamId(Integer teamId){
		this.teamId = teamId;
	} 
    /**
     * @getSubitemName:分项名称的get方法
     * @return subitemName
     * @date 2020-06-05 11:23:23
     * @author ru3an
     */
    public String getSubitemName(){
        return this.subitemName;
    }
    /**
     * @setSubitemName:分项名称的set方法
     * @param subitemName subitemName
     * @date 2020-06-05 11:23:23
     * @author ru3an
     */
    public void setSubitemName(String subitemName){
		this.subitemName = subitemName;
	} 
    /**
     * @getSubitemId:分项id的get方法
     * @return subitemId
     * @date 2020-06-05 11:23:23
     * @author ru3an
     */
    public Integer getSubitemId(){
        return this.subitemId;
    }
    /**
     * @setSubitemId:分项id的set方法
     * @param subitemId subitemId
     * @date 2020-06-05 11:23:23
     * @author ru3an
     */
    public void setSubitemId(Integer subitemId){
		this.subitemId = subitemId;
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
		
        if (obj == null || !(obj instanceof TeamSubitem))
	        return false; 
	        
		if (getClass() != obj.getClass())
			return false;
		
		TeamSubitem other = (TeamSubitem) obj;
		
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (teamName == null) {
			if (other.teamName != null) {
				return false;
			}
		} else if (!teamName.equals(other.teamName)) {
			return false;
		}
		if (teamId == null) {
			if (other.teamId != null) {
				return false;
			}
		} else if (!teamId.equals(other.teamId)) {
			return false;
		}
		if (subitemName == null) {
			if (other.subitemName != null) {
				return false;
			}
		} else if (!subitemName.equals(other.subitemName)) {
			return false;
		}
		if (subitemId == null) {
			if (other.subitemId != null) {
				return false;
			}
		} else if (!subitemId.equals(other.subitemId)) {
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
		return "TeamSubitem ["
			+ ", id=" + id
			+ ", teamName=" + teamName
			+ ", teamId=" + teamId
			+ ", subitemName=" + subitemName
			+ ", subitemId=" + subitemId
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