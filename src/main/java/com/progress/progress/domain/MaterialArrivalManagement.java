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
 * MaterialArrivalManagement的POJO类
 * @author ru3an 
 */
@Entity
@Table(name = "material_arrival_management")
public class MaterialArrivalManagement implements Serializable {

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
     * 工程名称
     */
    @Column(name = "PROJECT_NAME", nullable = true, length = 64)
    private String projectName ;
    
    /** 
     * 工程id
     */
    @Column(name = "PROJECT_ID", nullable = true, length = 10)
    private Integer projectId ;
    
    /** 
     * 物资名称
     */
    @Column(name = "SUPPLIES_NAME", nullable = true, length = 64)
    private String suppliesName ;
    
    /** 
     * 物资状态
     */
    @Column(name = "STATUS", nullable = true, length = 10)
    private Integer _status ;
    
    /** 
     * 厂家
     */
    @Column(name = "MANUFACTURER", nullable = true, length = 64)
    private String manufacturer ;
    
    /** 
     * 联系人
     */
    @Column(name = "CONTACT_PERSON", nullable = true, length = 64)
    private String contactPerson ;
    
    /** 
     * 计划到货时间
     */
    @Column(name = "PLANNED_ARRIVAL_TIME", nullable = true, length = 19)
    private Timestamp plannedArrivalTime ;
    
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
	
	public MaterialArrivalManagement(){
	
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
     * @getProjectName:工程名称的get方法
     * @return projectName
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getProjectName(){
        return this.projectName;
    }
    /**
     * @setProjectName:工程名称的set方法
     * @param projectName projectName
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setProjectName(String projectName){
		this.projectName = projectName;
	} 
    /**
     * @getProjectId:工程id的get方法
     * @return projectId
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Integer getProjectId(){
        return this.projectId;
    }
    /**
     * @setProjectId:工程id的set方法
     * @param projectId projectId
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setProjectId(Integer projectId){
		this.projectId = projectId;
	} 
    /**
     * @getSuppliesName:物资名称的get方法
     * @return suppliesName
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getSuppliesName(){
        return this.suppliesName;
    }
    /**
     * @setSuppliesName:物资名称的set方法
     * @param suppliesName suppliesName
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setSuppliesName(String suppliesName){
		this.suppliesName = suppliesName;
	} 
    /**
     * @get_status:物资状态的get方法
     * @return _status
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Integer get_status(){
        return this._status;
    }
    /**
     * @set_status:物资状态的set方法
     * @param _status _status
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void set_status(Integer _status){
		this._status = _status;
	} 
    /**
     * @getManufacturer:厂家的get方法
     * @return manufacturer
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getManufacturer(){
        return this.manufacturer;
    }
    /**
     * @setManufacturer:厂家的set方法
     * @param manufacturer manufacturer
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setManufacturer(String manufacturer){
		this.manufacturer = manufacturer;
	} 
    /**
     * @getContactPerson:联系人的get方法
     * @return contactPerson
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getContactPerson(){
        return this.contactPerson;
    }
    /**
     * @setContactPerson:联系人的set方法
     * @param contactPerson contactPerson
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setContactPerson(String contactPerson){
		this.contactPerson = contactPerson;
	} 
    /**
     * @getPlannedArrivalTime:计划到货时间的get方法
     * @return plannedArrivalTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Timestamp getPlannedArrivalTime(){
        return this.plannedArrivalTime;
    }
    /**
     * @setPlannedArrivalTime:计划到货时间的set方法
     * @param plannedArrivalTime plannedArrivalTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setPlannedArrivalTime(Timestamp plannedArrivalTime){
		this.plannedArrivalTime = plannedArrivalTime;
	} 
    /**
     * @getCreateTime:创建时间的get方法
     * @return createTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Timestamp getCreateTime(){
        return this.createTime;
    }
    /**
     * @setCreateTime:创建时间的set方法
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
		
        if (obj == null || !(obj instanceof MaterialArrivalManagement))
	        return false; 
	        
		if (getClass() != obj.getClass())
			return false;
		
		MaterialArrivalManagement other = (MaterialArrivalManagement) obj;
		
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (projectName == null) {
			if (other.projectName != null) {
				return false;
			}
		} else if (!projectName.equals(other.projectName)) {
			return false;
		}
		if (projectId == null) {
			if (other.projectId != null) {
				return false;
			}
		} else if (!projectId.equals(other.projectId)) {
			return false;
		}
		if (suppliesName == null) {
			if (other.suppliesName != null) {
				return false;
			}
		} else if (!suppliesName.equals(other.suppliesName)) {
			return false;
		}
		if (_status == null) {
			if (other._status != null) {
				return false;
			}
		} else if (!_status.equals(other._status)) {
			return false;
		}
		if (manufacturer == null) {
			if (other.manufacturer != null) {
				return false;
			}
		} else if (!manufacturer.equals(other.manufacturer)) {
			return false;
		}
		if (contactPerson == null) {
			if (other.contactPerson != null) {
				return false;
			}
		} else if (!contactPerson.equals(other.contactPerson)) {
			return false;
		}
		if (plannedArrivalTime == null) {
			if (other.plannedArrivalTime != null) {
				return false;
			}
		} else if (!plannedArrivalTime.equals(other.plannedArrivalTime)) {
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
		return "MaterialArrivalManagement ["
			+ ", id=" + id
			+ ", projectName=" + projectName
			+ ", projectId=" + projectId
			+ ", suppliesName=" + suppliesName
			+ ", _status=" + _status
			+ ", manufacturer=" + manufacturer
			+ ", contactPerson=" + contactPerson
			+ ", plannedArrivalTime=" + plannedArrivalTime
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