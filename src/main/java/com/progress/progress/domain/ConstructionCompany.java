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
 * ConstructionCompany的POJO类
 * @author ru3an 
 */
@Entity
@Table(name = "construction_company")
public class ConstructionCompany implements Serializable {

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
    @Column(name = "NAME", nullable = true, length = 64)
    private String name ;
    
    /** 
     * 负责人
     */
    @Column(name = "PRINCIPAL", nullable = true, length = 255)
    private String principal ;
    
    /** 
     * 作业人数
     */
    @Column(name = "WOKERS", nullable = true, length = 10)
    private Integer wokers ;
    
    /** 
     * 日期
     */
    @Column(name = "CREATE_TIME", nullable = true, length = 19)
    private Timestamp createTime ;
    
	/**
	  *虚拟主键
	  */
	@Transient
	private String mxVirtualId;
	
	public ConstructionCompany(){
	
	}
    /**
     * @getId:主键的get方法
     * @return id
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Long getId(){
        return this.id;
    }
    /**
     * @setId:主键的set方法
     * @param id id
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setId(Long id){
		this.id = id;
	} 
    /**
     * @getName:公司名称的get方法
     * @return name
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getName(){
        return this.name;
    }
    /**
     * @setName:公司名称的set方法
     * @param name name
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setName(String name){
		this.name = name;
	} 
    /**
     * @getPrincipal:负责人的get方法
     * @return principal
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getPrincipal(){
        return this.principal;
    }
    /**
     * @setPrincipal:负责人的set方法
     * @param principal principal
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setPrincipal(String principal){
		this.principal = principal;
	} 
    /**
     * @getWokers:作业人数的get方法
     * @return wokers
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Integer getWokers(){
        return this.wokers;
    }
    /**
     * @setWokers:作业人数的set方法
     * @param wokers wokers
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setWokers(Integer wokers){
		this.wokers = wokers;
	} 
    /**
     * @getCreateTime:日期的get方法
     * @return createTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Timestamp getCreateTime(){
        return this.createTime;
    }
    /**
     * @setCreateTime:日期的set方法
     * @param createTime createTime
     * @date 2020-06-05 11:23:22
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
		
        if (obj == null || !(obj instanceof ConstructionCompany))
	        return false; 
	        
		if (getClass() != obj.getClass())
			return false;
		
		ConstructionCompany other = (ConstructionCompany) obj;
		
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (principal == null) {
			if (other.principal != null) {
				return false;
			}
		} else if (!principal.equals(other.principal)) {
			return false;
		}
		if (wokers == null) {
			if (other.wokers != null) {
				return false;
			}
		} else if (!wokers.equals(other.wokers)) {
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
		return "ConstructionCompany ["
			+ ", id=" + id
			+ ", name=" + name
			+ ", principal=" + principal
			+ ", wokers=" + wokers
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