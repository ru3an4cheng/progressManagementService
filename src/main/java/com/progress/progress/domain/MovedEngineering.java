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
 * MovedEngineering的POJO类
 * @author ru3an 
 */
@Entity
@Table(name = "moved_engineering")
public class MovedEngineering implements Serializable {

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
     * 运维管理单位
     */
    @Column(name = "OPERATIONS_MANAGEMENT_UNIT", nullable = true, length = 64)
    private String operationsManagementUnit ;
    
    /** 
     * 外部单位
     */
    @Column(name = "EXTERNAL_UNIT", nullable = true, length = 64)
    private String externalUnit ;
    
    /** 
     * 项目名称
     */
    @Column(name = "PROJECT_NAME", nullable = true, length = 64)
    private String projectName ;
    
    /** 
     * 来函时间
     */
    @Column(name = "COME_LETTER_TIME", nullable = true, length = 19)
    private Timestamp comeLetterTime ;
    
    /** 
     * 复函时间
     */
    @Column(name = "REPEAT_LETTER_TIME", nullable = true, length = 19)
    private Timestamp repeatLetterTime ;
    
    /** 
     * 设计方评审意见签发时间
     */
    @Column(name = "REVIEW_COMMENTS_TIME", nullable = true, length = 19)
    private Timestamp reviewCommentsTime ;
    
    /** 
     * 电力设施迁改协议签订时间
     */
    @Column(name = "CHANGE_AGREEMENT_TIME", nullable = true, length = 19)
    private Timestamp changeAgreementTime ;
    
    /** 
     * 迁改工程招标完成时间
     */
    @Column(name = "BIDDING_COMPLETE_TIME", nullable = true, length = 19)
    private Timestamp biddingCompleteTime ;
    
    /** 
     * 设计单位
     */
    @Column(name = "DESIGNER_UNIT", nullable = true, length = 64)
    private String designerUnit ;
    
    /** 
     * 施工单位
     */
    @Column(name = "CONSTRUCTION_UNIT", nullable = true, length = 64)
    private String constructionUnit ;
    
    /** 
     * 监理单位
     */
    @Column(name = "SUPERVISION_UNIT", nullable = true, length = 64)
    private String supervisionUnit ;
    
    /** 
     * 参建单位资质业绩省公司审批
     */
    @Column(name = "PROVINCIAL_COMPANY_APPROVAL", nullable = true, length = 64)
    private String provincialCompanyApproval ;
    
    /** 
     * 施工计划工期
     */
    @Column(name = "CONSTRUCTION_PLAN_SCHEDULE", nullable = true, length = 64)
    private String constructionPlanSchedule ;
    
    /** 
     * 主要工程规模
     */
    @Column(name = "MAJOR_PROJECT_SCALE", nullable = true, length = 64)
    private String majorProjectScale ;
    
    /** 
     * 施工进展情况
     */
    @Column(name = "CONSTRUCTION_PROGRESS", nullable = true, length = 64)
    private String constructionProgress ;
    
    /** 
     * 安全监管主体单位
     */
    @Column(name = "SECURITY_REGULATORY_UNIT", nullable = true, length = 64)
    private String securityRegulatoryUnit ;
    
    /** 
     * 施工完成时间
     */
    @Column(name = "COMPLETION_TIME", nullable = true, length = 19)
    private Timestamp completionTime ;
    
    /** 
     * 其他
     */
    @Column(name = "OTHER", nullable = true, length = 255)
    private String other ;
    
	/**
	  *虚拟主键
	  */
	@Transient
	private String mxVirtualId;
	
	public MovedEngineering(){
	
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
     * @getOperationsManagementUnit:运维管理单位的get方法
     * @return operationsManagementUnit
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getOperationsManagementUnit(){
        return this.operationsManagementUnit;
    }
    /**
     * @setOperationsManagementUnit:运维管理单位的set方法
     * @param operationsManagementUnit operationsManagementUnit
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setOperationsManagementUnit(String operationsManagementUnit){
		this.operationsManagementUnit = operationsManagementUnit;
	} 
    /**
     * @getExternalUnit:外部单位的get方法
     * @return externalUnit
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getExternalUnit(){
        return this.externalUnit;
    }
    /**
     * @setExternalUnit:外部单位的set方法
     * @param externalUnit externalUnit
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setExternalUnit(String externalUnit){
		this.externalUnit = externalUnit;
	} 
    /**
     * @getProjectName:项目名称的get方法
     * @return projectName
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getProjectName(){
        return this.projectName;
    }
    /**
     * @setProjectName:项目名称的set方法
     * @param projectName projectName
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setProjectName(String projectName){
		this.projectName = projectName;
	} 
    /**
     * @getComeLetterTime:来函时间的get方法
     * @return comeLetterTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Timestamp getComeLetterTime(){
        return this.comeLetterTime;
    }
    /**
     * @setComeLetterTime:来函时间的set方法
     * @param comeLetterTime comeLetterTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setComeLetterTime(Timestamp comeLetterTime){
		this.comeLetterTime = comeLetterTime;
	} 
    /**
     * @getRepeatLetterTime:复函时间的get方法
     * @return repeatLetterTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Timestamp getRepeatLetterTime(){
        return this.repeatLetterTime;
    }
    /**
     * @setRepeatLetterTime:复函时间的set方法
     * @param repeatLetterTime repeatLetterTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setRepeatLetterTime(Timestamp repeatLetterTime){
		this.repeatLetterTime = repeatLetterTime;
	} 
    /**
     * @getReviewCommentsTime:设计方评审意见签发时间的get方法
     * @return reviewCommentsTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Timestamp getReviewCommentsTime(){
        return this.reviewCommentsTime;
    }
    /**
     * @setReviewCommentsTime:设计方评审意见签发时间的set方法
     * @param reviewCommentsTime reviewCommentsTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setReviewCommentsTime(Timestamp reviewCommentsTime){
		this.reviewCommentsTime = reviewCommentsTime;
	} 
    /**
     * @getChangeAgreementTime:电力设施迁改协议签订时间的get方法
     * @return changeAgreementTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Timestamp getChangeAgreementTime(){
        return this.changeAgreementTime;
    }
    /**
     * @setChangeAgreementTime:电力设施迁改协议签订时间的set方法
     * @param changeAgreementTime changeAgreementTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setChangeAgreementTime(Timestamp changeAgreementTime){
		this.changeAgreementTime = changeAgreementTime;
	} 
    /**
     * @getBiddingCompleteTime:迁改工程招标完成时间的get方法
     * @return biddingCompleteTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Timestamp getBiddingCompleteTime(){
        return this.biddingCompleteTime;
    }
    /**
     * @setBiddingCompleteTime:迁改工程招标完成时间的set方法
     * @param biddingCompleteTime biddingCompleteTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setBiddingCompleteTime(Timestamp biddingCompleteTime){
		this.biddingCompleteTime = biddingCompleteTime;
	} 
    /**
     * @getDesignerUnit:设计单位的get方法
     * @return designerUnit
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getDesignerUnit(){
        return this.designerUnit;
    }
    /**
     * @setDesignerUnit:设计单位的set方法
     * @param designerUnit designerUnit
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setDesignerUnit(String designerUnit){
		this.designerUnit = designerUnit;
	} 
    /**
     * @getConstructionUnit:施工单位的get方法
     * @return constructionUnit
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getConstructionUnit(){
        return this.constructionUnit;
    }
    /**
     * @setConstructionUnit:施工单位的set方法
     * @param constructionUnit constructionUnit
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setConstructionUnit(String constructionUnit){
		this.constructionUnit = constructionUnit;
	} 
    /**
     * @getSupervisionUnit:监理单位的get方法
     * @return supervisionUnit
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getSupervisionUnit(){
        return this.supervisionUnit;
    }
    /**
     * @setSupervisionUnit:监理单位的set方法
     * @param supervisionUnit supervisionUnit
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setSupervisionUnit(String supervisionUnit){
		this.supervisionUnit = supervisionUnit;
	} 
    /**
     * @getProvincialCompanyApproval:参建单位资质业绩省公司审批的get方法
     * @return provincialCompanyApproval
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getProvincialCompanyApproval(){
        return this.provincialCompanyApproval;
    }
    /**
     * @setProvincialCompanyApproval:参建单位资质业绩省公司审批的set方法
     * @param provincialCompanyApproval provincialCompanyApproval
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setProvincialCompanyApproval(String provincialCompanyApproval){
		this.provincialCompanyApproval = provincialCompanyApproval;
	} 
    /**
     * @getConstructionPlanSchedule:施工计划工期的get方法
     * @return constructionPlanSchedule
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getConstructionPlanSchedule(){
        return this.constructionPlanSchedule;
    }
    /**
     * @setConstructionPlanSchedule:施工计划工期的set方法
     * @param constructionPlanSchedule constructionPlanSchedule
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setConstructionPlanSchedule(String constructionPlanSchedule){
		this.constructionPlanSchedule = constructionPlanSchedule;
	} 
    /**
     * @getMajorProjectScale:主要工程规模的get方法
     * @return majorProjectScale
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getMajorProjectScale(){
        return this.majorProjectScale;
    }
    /**
     * @setMajorProjectScale:主要工程规模的set方法
     * @param majorProjectScale majorProjectScale
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setMajorProjectScale(String majorProjectScale){
		this.majorProjectScale = majorProjectScale;
	} 
    /**
     * @getConstructionProgress:施工进展情况的get方法
     * @return constructionProgress
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getConstructionProgress(){
        return this.constructionProgress;
    }
    /**
     * @setConstructionProgress:施工进展情况的set方法
     * @param constructionProgress constructionProgress
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setConstructionProgress(String constructionProgress){
		this.constructionProgress = constructionProgress;
	} 
    /**
     * @getSecurityRegulatoryUnit:安全监管主体单位的get方法
     * @return securityRegulatoryUnit
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getSecurityRegulatoryUnit(){
        return this.securityRegulatoryUnit;
    }
    /**
     * @setSecurityRegulatoryUnit:安全监管主体单位的set方法
     * @param securityRegulatoryUnit securityRegulatoryUnit
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setSecurityRegulatoryUnit(String securityRegulatoryUnit){
		this.securityRegulatoryUnit = securityRegulatoryUnit;
	} 
    /**
     * @getCompletionTime:施工完成时间的get方法
     * @return completionTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Timestamp getCompletionTime(){
        return this.completionTime;
    }
    /**
     * @setCompletionTime:施工完成时间的set方法
     * @param completionTime completionTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setCompletionTime(Timestamp completionTime){
		this.completionTime = completionTime;
	} 
    /**
     * @getOther:其他的get方法
     * @return other
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getOther(){
        return this.other;
    }
    /**
     * @setOther:其他的set方法
     * @param other other
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setOther(String other){
		this.other = other;
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
		
        if (obj == null || !(obj instanceof MovedEngineering))
	        return false; 
	        
		if (getClass() != obj.getClass())
			return false;
		
		MovedEngineering other = (MovedEngineering) obj;
		
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (operationsManagementUnit == null) {
			if (other.operationsManagementUnit != null) {
				return false;
			}
		} else if (!operationsManagementUnit.equals(other.operationsManagementUnit)) {
			return false;
		}
		if (externalUnit == null) {
			if (other.externalUnit != null) {
				return false;
			}
		} else if (!externalUnit.equals(other.externalUnit)) {
			return false;
		}
		if (projectName == null) {
			if (other.projectName != null) {
				return false;
			}
		} else if (!projectName.equals(other.projectName)) {
			return false;
		}
		if (comeLetterTime == null) {
			if (other.comeLetterTime != null) {
				return false;
			}
		} else if (!comeLetterTime.equals(other.comeLetterTime)) {
			return false;
		}
		if (repeatLetterTime == null) {
			if (other.repeatLetterTime != null) {
				return false;
			}
		} else if (!repeatLetterTime.equals(other.repeatLetterTime)) {
			return false;
		}
		if (reviewCommentsTime == null) {
			if (other.reviewCommentsTime != null) {
				return false;
			}
		} else if (!reviewCommentsTime.equals(other.reviewCommentsTime)) {
			return false;
		}
		if (changeAgreementTime == null) {
			if (other.changeAgreementTime != null) {
				return false;
			}
		} else if (!changeAgreementTime.equals(other.changeAgreementTime)) {
			return false;
		}
		if (biddingCompleteTime == null) {
			if (other.biddingCompleteTime != null) {
				return false;
			}
		} else if (!biddingCompleteTime.equals(other.biddingCompleteTime)) {
			return false;
		}
		if (designerUnit == null) {
			if (other.designerUnit != null) {
				return false;
			}
		} else if (!designerUnit.equals(other.designerUnit)) {
			return false;
		}
		if (constructionUnit == null) {
			if (other.constructionUnit != null) {
				return false;
			}
		} else if (!constructionUnit.equals(other.constructionUnit)) {
			return false;
		}
		if (supervisionUnit == null) {
			if (other.supervisionUnit != null) {
				return false;
			}
		} else if (!supervisionUnit.equals(other.supervisionUnit)) {
			return false;
		}
		if (provincialCompanyApproval == null) {
			if (other.provincialCompanyApproval != null) {
				return false;
			}
		} else if (!provincialCompanyApproval.equals(other.provincialCompanyApproval)) {
			return false;
		}
		if (constructionPlanSchedule == null) {
			if (other.constructionPlanSchedule != null) {
				return false;
			}
		} else if (!constructionPlanSchedule.equals(other.constructionPlanSchedule)) {
			return false;
		}
		if (majorProjectScale == null) {
			if (other.majorProjectScale != null) {
				return false;
			}
		} else if (!majorProjectScale.equals(other.majorProjectScale)) {
			return false;
		}
		if (constructionProgress == null) {
			if (other.constructionProgress != null) {
				return false;
			}
		} else if (!constructionProgress.equals(other.constructionProgress)) {
			return false;
		}
		if (securityRegulatoryUnit == null) {
			if (other.securityRegulatoryUnit != null) {
				return false;
			}
		} else if (!securityRegulatoryUnit.equals(other.securityRegulatoryUnit)) {
			return false;
		}
		if (completionTime == null) {
			if (other.completionTime != null) {
				return false;
			}
		} else if (!completionTime.equals(other.completionTime)) {
			return false;
		}
		if (other == null) {
			if (other.other != null) {
				return false;
			}
		} else if (!other.equals(other.other)) {
			return false;
		}
		return true;
	}
    
    /**
     * toString方法
     * @return String
     */
	public String toString(){
		return "MovedEngineering ["
			+ ", id=" + id
			+ ", operationsManagementUnit=" + operationsManagementUnit
			+ ", externalUnit=" + externalUnit
			+ ", projectName=" + projectName
			+ ", comeLetterTime=" + comeLetterTime
			+ ", repeatLetterTime=" + repeatLetterTime
			+ ", reviewCommentsTime=" + reviewCommentsTime
			+ ", changeAgreementTime=" + changeAgreementTime
			+ ", biddingCompleteTime=" + biddingCompleteTime
			+ ", designerUnit=" + designerUnit
			+ ", constructionUnit=" + constructionUnit
			+ ", supervisionUnit=" + supervisionUnit
			+ ", provincialCompanyApproval=" + provincialCompanyApproval
			+ ", constructionPlanSchedule=" + constructionPlanSchedule
			+ ", majorProjectScale=" + majorProjectScale
			+ ", constructionProgress=" + constructionProgress
			+ ", securityRegulatoryUnit=" + securityRegulatoryUnit
			+ ", completionTime=" + completionTime
			+ ", other=" + other;
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