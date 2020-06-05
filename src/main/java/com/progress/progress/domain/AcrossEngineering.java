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
 * AcrossEngineering的POJO类
 * @author ru3an 
 */
@Entity
@Table(name = "across_engineering")
public class AcrossEngineering implements Serializable {

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
     * 建管单位
     */
    @Column(name = "CONSTRUCTION_MANAGEMENT_UNIT", nullable = true, length = 64)
    private String constructionManagementUnit ;
    
    /** 
     * 电压等级
     */
    @Column(name = "VOLTAGE_LEVEL", nullable = true, length = 64)
    private String voltageLevel ;
    
    /** 
     * 工程名称
     */
    @Column(name = "PROJECT_NAME", nullable = true, length = 64)
    private String projectName ;
    
    /** 
     * 开工时间
     */
    @Column(name = "START_TIME", nullable = true, length = 19)
    private Timestamp startTime ;
    
    /** 
     * 投产时间
     */
    @Column(name = "PRODUCTION_TIME", nullable = true, length = 19)
    private Timestamp productionTime ;
    
    /** 
     * 计划施工月份
     */
    @Column(name = "PLANNED_CONSTRUCTION_MONTH", nullable = true, length = 64)
    private String plannedConstructionMonth ;
    
    /** 
     * 来函时间
     */
    @Column(name = "COME_LETTER_TIME", nullable = true, length = 19)
    private Timestamp comeLetterTime ;
    
    /** 
     * 施工方案通过审查实际时间
     */
    @Column(name = "PASS_REVIEW_ACTUAL_TIME", nullable = true, length = 19)
    private Timestamp passReviewActualTime ;
    
    /** 
     * 施工方案通过审查理论时间
     */
    @Column(name = "PASS_REVIEW_THEORY_TIME", nullable = true, length = 19)
    private Timestamp passReviewTheoryTime ;
    
    /** 
     * 计划开工时间
     */
    @Column(name = "PLAN_START_TIME", nullable = true, length = 19)
    private Timestamp planStartTime ;
    
    /** 
     * 施工单位
     */
    @Column(name = "CONSTRUCTION_UNIT", nullable = true, length = 64)
    private String constructionUnit ;
    
    /** 
     * 备注
     */
    @Column(name = "REMARK", nullable = true, length = 255)
    private String remark ;
    
	/**
	  *虚拟主键
	  */
	@Transient
	private String mxVirtualId;
	
	public AcrossEngineering(){
	
	}
    /**
     * @getId:主键的get方法
     * @return id
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public Long getId(){
        return this.id;
    }
    /**
     * @setId:主键的set方法
     * @param id id
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public void setId(Long id){
		this.id = id;
	} 
    /**
     * @getConstructionManagementUnit:建管单位的get方法
     * @return constructionManagementUnit
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public String getConstructionManagementUnit(){
        return this.constructionManagementUnit;
    }
    /**
     * @setConstructionManagementUnit:建管单位的set方法
     * @param constructionManagementUnit constructionManagementUnit
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public void setConstructionManagementUnit(String constructionManagementUnit){
		this.constructionManagementUnit = constructionManagementUnit;
	} 
    /**
     * @getVoltageLevel:电压等级的get方法
     * @return voltageLevel
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public String getVoltageLevel(){
        return this.voltageLevel;
    }
    /**
     * @setVoltageLevel:电压等级的set方法
     * @param voltageLevel voltageLevel
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public void setVoltageLevel(String voltageLevel){
		this.voltageLevel = voltageLevel;
	} 
    /**
     * @getProjectName:工程名称的get方法
     * @return projectName
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public String getProjectName(){
        return this.projectName;
    }
    /**
     * @setProjectName:工程名称的set方法
     * @param projectName projectName
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public void setProjectName(String projectName){
		this.projectName = projectName;
	} 
    /**
     * @getStartTime:开工时间的get方法
     * @return startTime
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public Timestamp getStartTime(){
        return this.startTime;
    }
    /**
     * @setStartTime:开工时间的set方法
     * @param startTime startTime
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public void setStartTime(Timestamp startTime){
		this.startTime = startTime;
	} 
    /**
     * @getProductionTime:投产时间的get方法
     * @return productionTime
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public Timestamp getProductionTime(){
        return this.productionTime;
    }
    /**
     * @setProductionTime:投产时间的set方法
     * @param productionTime productionTime
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public void setProductionTime(Timestamp productionTime){
		this.productionTime = productionTime;
	} 
    /**
     * @getPlannedConstructionMonth:计划施工月份的get方法
     * @return plannedConstructionMonth
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public String getPlannedConstructionMonth(){
        return this.plannedConstructionMonth;
    }
    /**
     * @setPlannedConstructionMonth:计划施工月份的set方法
     * @param plannedConstructionMonth plannedConstructionMonth
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public void setPlannedConstructionMonth(String plannedConstructionMonth){
		this.plannedConstructionMonth = plannedConstructionMonth;
	} 
    /**
     * @getComeLetterTime:来函时间的get方法
     * @return comeLetterTime
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public Timestamp getComeLetterTime(){
        return this.comeLetterTime;
    }
    /**
     * @setComeLetterTime:来函时间的set方法
     * @param comeLetterTime comeLetterTime
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public void setComeLetterTime(Timestamp comeLetterTime){
		this.comeLetterTime = comeLetterTime;
	} 
    /**
     * @getPassReviewActualTime:施工方案通过审查实际时间的get方法
     * @return passReviewActualTime
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public Timestamp getPassReviewActualTime(){
        return this.passReviewActualTime;
    }
    /**
     * @setPassReviewActualTime:施工方案通过审查实际时间的set方法
     * @param passReviewActualTime passReviewActualTime
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public void setPassReviewActualTime(Timestamp passReviewActualTime){
		this.passReviewActualTime = passReviewActualTime;
	} 
    /**
     * @getPassReviewTheoryTime:施工方案通过审查理论时间的get方法
     * @return passReviewTheoryTime
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public Timestamp getPassReviewTheoryTime(){
        return this.passReviewTheoryTime;
    }
    /**
     * @setPassReviewTheoryTime:施工方案通过审查理论时间的set方法
     * @param passReviewTheoryTime passReviewTheoryTime
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public void setPassReviewTheoryTime(Timestamp passReviewTheoryTime){
		this.passReviewTheoryTime = passReviewTheoryTime;
	} 
    /**
     * @getPlanStartTime:计划开工时间的get方法
     * @return planStartTime
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public Timestamp getPlanStartTime(){
        return this.planStartTime;
    }
    /**
     * @setPlanStartTime:计划开工时间的set方法
     * @param planStartTime planStartTime
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public void setPlanStartTime(Timestamp planStartTime){
		this.planStartTime = planStartTime;
	} 
    /**
     * @getConstructionUnit:施工单位的get方法
     * @return constructionUnit
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public String getConstructionUnit(){
        return this.constructionUnit;
    }
    /**
     * @setConstructionUnit:施工单位的set方法
     * @param constructionUnit constructionUnit
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public void setConstructionUnit(String constructionUnit){
		this.constructionUnit = constructionUnit;
	} 
    /**
     * @getRemark:备注的get方法
     * @return remark
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public String getRemark(){
        return this.remark;
    }
    /**
     * @setRemark:备注的set方法
     * @param remark remark
     * @date 2020-06-05 11:23:21
     * @author ru3an
     */
    public void setRemark(String remark){
		this.remark = remark;
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
		
        if (obj == null || !(obj instanceof AcrossEngineering))
	        return false; 
	        
		if (getClass() != obj.getClass())
			return false;
		
		AcrossEngineering other = (AcrossEngineering) obj;
		
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (constructionManagementUnit == null) {
			if (other.constructionManagementUnit != null) {
				return false;
			}
		} else if (!constructionManagementUnit.equals(other.constructionManagementUnit)) {
			return false;
		}
		if (voltageLevel == null) {
			if (other.voltageLevel != null) {
				return false;
			}
		} else if (!voltageLevel.equals(other.voltageLevel)) {
			return false;
		}
		if (projectName == null) {
			if (other.projectName != null) {
				return false;
			}
		} else if (!projectName.equals(other.projectName)) {
			return false;
		}
		if (startTime == null) {
			if (other.startTime != null) {
				return false;
			}
		} else if (!startTime.equals(other.startTime)) {
			return false;
		}
		if (productionTime == null) {
			if (other.productionTime != null) {
				return false;
			}
		} else if (!productionTime.equals(other.productionTime)) {
			return false;
		}
		if (plannedConstructionMonth == null) {
			if (other.plannedConstructionMonth != null) {
				return false;
			}
		} else if (!plannedConstructionMonth.equals(other.plannedConstructionMonth)) {
			return false;
		}
		if (comeLetterTime == null) {
			if (other.comeLetterTime != null) {
				return false;
			}
		} else if (!comeLetterTime.equals(other.comeLetterTime)) {
			return false;
		}
		if (passReviewActualTime == null) {
			if (other.passReviewActualTime != null) {
				return false;
			}
		} else if (!passReviewActualTime.equals(other.passReviewActualTime)) {
			return false;
		}
		if (passReviewTheoryTime == null) {
			if (other.passReviewTheoryTime != null) {
				return false;
			}
		} else if (!passReviewTheoryTime.equals(other.passReviewTheoryTime)) {
			return false;
		}
		if (planStartTime == null) {
			if (other.planStartTime != null) {
				return false;
			}
		} else if (!planStartTime.equals(other.planStartTime)) {
			return false;
		}
		if (constructionUnit == null) {
			if (other.constructionUnit != null) {
				return false;
			}
		} else if (!constructionUnit.equals(other.constructionUnit)) {
			return false;
		}
		if (remark == null) {
			if (other.remark != null) {
				return false;
			}
		} else if (!remark.equals(other.remark)) {
			return false;
		}
		return true;
	}
    
    /**
     * toString方法
     * @return String
     */
	public String toString(){
		return "AcrossEngineering ["
			+ ", id=" + id
			+ ", constructionManagementUnit=" + constructionManagementUnit
			+ ", voltageLevel=" + voltageLevel
			+ ", projectName=" + projectName
			+ ", startTime=" + startTime
			+ ", productionTime=" + productionTime
			+ ", plannedConstructionMonth=" + plannedConstructionMonth
			+ ", comeLetterTime=" + comeLetterTime
			+ ", passReviewActualTime=" + passReviewActualTime
			+ ", passReviewTheoryTime=" + passReviewTheoryTime
			+ ", planStartTime=" + planStartTime
			+ ", constructionUnit=" + constructionUnit
			+ ", remark=" + remark;
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