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
 * MovedEngineering的VO类
 *
 * @author ru3an 
 */
public class MovedEngineeringVO extends ParentVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
    /** 
     * 属性主键
     */  
    @ViewAttribute(name ="id",caption="主键", editor=EditorType.NumberEditor,nullable =false,readOnly=false, type=AttributeType.LONG)
    private Long id;    
    /** 
     * 属性运维管理单位
     */  
    @ViewAttribute(name ="operationsManagementUnit",caption="运维管理单位", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String operationsManagementUnit;    
    /** 
     * 属性外部单位
     */  
    @ViewAttribute(name ="externalUnit",caption="外部单位", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String externalUnit;    
    /** 
     * 属性项目名称
     */  
    @ViewAttribute(name ="projectName",caption="项目名称", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String projectName;    
    /** 
     * 属性来函时间
     */  
    @ViewAttribute(name ="comeLetterTime",caption="来函时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp comeLetterTime;    
    /** 
     * 属性复函时间
     */  
    @ViewAttribute(name ="repeatLetterTime",caption="复函时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp repeatLetterTime;    
    /** 
     * 属性设计方评审意见签发时间
     */  
    @ViewAttribute(name ="reviewCommentsTime",caption="设计方评审意见签发时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp reviewCommentsTime;    
    /** 
     * 属性电力设施迁改协议签订时间
     */  
    @ViewAttribute(name ="changeAgreementTime",caption="电力设施迁改协议签订时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp changeAgreementTime;    
    /** 
     * 属性迁改工程招标完成时间
     */  
    @ViewAttribute(name ="biddingCompleteTime",caption="迁改工程招标完成时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp biddingCompleteTime;    
    /** 
     * 属性设计单位
     */  
    @ViewAttribute(name ="designerUnit",caption="设计单位", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String designerUnit;    
    /** 
     * 属性施工单位
     */  
    @ViewAttribute(name ="constructionUnit",caption="施工单位", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String constructionUnit;    
    /** 
     * 属性监理单位
     */  
    @ViewAttribute(name ="supervisionUnit",caption="监理单位", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String supervisionUnit;    
    /** 
     * 属性参建单位资质业绩省公司审批
     */  
    @ViewAttribute(name ="provincialCompanyApproval",caption="参建单位资质业绩省公司审批", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String provincialCompanyApproval;    
    /** 
     * 属性施工计划工期
     */  
    @ViewAttribute(name ="constructionPlanSchedule",caption="施工计划工期", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String constructionPlanSchedule;    
    /** 
     * 属性主要工程规模
     */  
    @ViewAttribute(name ="majorProjectScale",caption="主要工程规模", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String majorProjectScale;    
    /** 
     * 属性施工进展情况
     */  
    @ViewAttribute(name ="constructionProgress",caption="施工进展情况", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String constructionProgress;    
    /** 
     * 属性安全监管主体单位
     */  
    @ViewAttribute(name ="securityRegulatoryUnit",caption="安全监管主体单位", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String securityRegulatoryUnit;    
    /** 
     * 属性施工完成时间
     */  
    @ViewAttribute(name ="completionTime",caption="施工完成时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp completionTime;    
    /** 
     * 属性其他
     */  
    @ViewAttribute(name ="other",caption="其他", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String other;    
    /**
     * MovedEngineeringVO构造函数
     */
    public MovedEngineeringVO() {
        super();
    } 
   
	 /**
     * MovedEngineeringVO完整的构造函数
     */  
    public MovedEngineeringVO(Long id){
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
     * 运维管理单位的get方法
     * @return operationsManagementUnit
     */
    public String getOperationsManagementUnit(){
        return operationsManagementUnit;
    }
    /**
     * 运维管理单位的set方法
     * @param operationsManagementUnit
     */
    public void setOperationsManagementUnit(String operationsManagementUnit){
		this.operationsManagementUnit = operationsManagementUnit;
	} 
    /**
     * 外部单位的get方法
     * @return externalUnit
     */
    public String getExternalUnit(){
        return externalUnit;
    }
    /**
     * 外部单位的set方法
     * @param externalUnit
     */
    public void setExternalUnit(String externalUnit){
		this.externalUnit = externalUnit;
	} 
    /**
     * 项目名称的get方法
     * @return projectName
     */
    public String getProjectName(){
        return projectName;
    }
    /**
     * 项目名称的set方法
     * @param projectName
     */
    public void setProjectName(String projectName){
		this.projectName = projectName;
	} 
    /**
     * 来函时间的get方法
     * @return comeLetterTime
     */
    public Timestamp getComeLetterTime(){
        return comeLetterTime;
    }
    /**
     * 来函时间的set方法
     * @param comeLetterTime
     */
    public void setComeLetterTime(Timestamp comeLetterTime){
		this.comeLetterTime = comeLetterTime;
	} 
    /**
     * 复函时间的get方法
     * @return repeatLetterTime
     */
    public Timestamp getRepeatLetterTime(){
        return repeatLetterTime;
    }
    /**
     * 复函时间的set方法
     * @param repeatLetterTime
     */
    public void setRepeatLetterTime(Timestamp repeatLetterTime){
		this.repeatLetterTime = repeatLetterTime;
	} 
    /**
     * 设计方评审意见签发时间的get方法
     * @return reviewCommentsTime
     */
    public Timestamp getReviewCommentsTime(){
        return reviewCommentsTime;
    }
    /**
     * 设计方评审意见签发时间的set方法
     * @param reviewCommentsTime
     */
    public void setReviewCommentsTime(Timestamp reviewCommentsTime){
		this.reviewCommentsTime = reviewCommentsTime;
	} 
    /**
     * 电力设施迁改协议签订时间的get方法
     * @return changeAgreementTime
     */
    public Timestamp getChangeAgreementTime(){
        return changeAgreementTime;
    }
    /**
     * 电力设施迁改协议签订时间的set方法
     * @param changeAgreementTime
     */
    public void setChangeAgreementTime(Timestamp changeAgreementTime){
		this.changeAgreementTime = changeAgreementTime;
	} 
    /**
     * 迁改工程招标完成时间的get方法
     * @return biddingCompleteTime
     */
    public Timestamp getBiddingCompleteTime(){
        return biddingCompleteTime;
    }
    /**
     * 迁改工程招标完成时间的set方法
     * @param biddingCompleteTime
     */
    public void setBiddingCompleteTime(Timestamp biddingCompleteTime){
		this.biddingCompleteTime = biddingCompleteTime;
	} 
    /**
     * 设计单位的get方法
     * @return designerUnit
     */
    public String getDesignerUnit(){
        return designerUnit;
    }
    /**
     * 设计单位的set方法
     * @param designerUnit
     */
    public void setDesignerUnit(String designerUnit){
		this.designerUnit = designerUnit;
	} 
    /**
     * 施工单位的get方法
     * @return constructionUnit
     */
    public String getConstructionUnit(){
        return constructionUnit;
    }
    /**
     * 施工单位的set方法
     * @param constructionUnit
     */
    public void setConstructionUnit(String constructionUnit){
		this.constructionUnit = constructionUnit;
	} 
    /**
     * 监理单位的get方法
     * @return supervisionUnit
     */
    public String getSupervisionUnit(){
        return supervisionUnit;
    }
    /**
     * 监理单位的set方法
     * @param supervisionUnit
     */
    public void setSupervisionUnit(String supervisionUnit){
		this.supervisionUnit = supervisionUnit;
	} 
    /**
     * 参建单位资质业绩省公司审批的get方法
     * @return provincialCompanyApproval
     */
    public String getProvincialCompanyApproval(){
        return provincialCompanyApproval;
    }
    /**
     * 参建单位资质业绩省公司审批的set方法
     * @param provincialCompanyApproval
     */
    public void setProvincialCompanyApproval(String provincialCompanyApproval){
		this.provincialCompanyApproval = provincialCompanyApproval;
	} 
    /**
     * 施工计划工期的get方法
     * @return constructionPlanSchedule
     */
    public String getConstructionPlanSchedule(){
        return constructionPlanSchedule;
    }
    /**
     * 施工计划工期的set方法
     * @param constructionPlanSchedule
     */
    public void setConstructionPlanSchedule(String constructionPlanSchedule){
		this.constructionPlanSchedule = constructionPlanSchedule;
	} 
    /**
     * 主要工程规模的get方法
     * @return majorProjectScale
     */
    public String getMajorProjectScale(){
        return majorProjectScale;
    }
    /**
     * 主要工程规模的set方法
     * @param majorProjectScale
     */
    public void setMajorProjectScale(String majorProjectScale){
		this.majorProjectScale = majorProjectScale;
	} 
    /**
     * 施工进展情况的get方法
     * @return constructionProgress
     */
    public String getConstructionProgress(){
        return constructionProgress;
    }
    /**
     * 施工进展情况的set方法
     * @param constructionProgress
     */
    public void setConstructionProgress(String constructionProgress){
		this.constructionProgress = constructionProgress;
	} 
    /**
     * 安全监管主体单位的get方法
     * @return securityRegulatoryUnit
     */
    public String getSecurityRegulatoryUnit(){
        return securityRegulatoryUnit;
    }
    /**
     * 安全监管主体单位的set方法
     * @param securityRegulatoryUnit
     */
    public void setSecurityRegulatoryUnit(String securityRegulatoryUnit){
		this.securityRegulatoryUnit = securityRegulatoryUnit;
	} 
    /**
     * 施工完成时间的get方法
     * @return completionTime
     */
    public Timestamp getCompletionTime(){
        return completionTime;
    }
    /**
     * 施工完成时间的set方法
     * @param completionTime
     */
    public void setCompletionTime(Timestamp completionTime){
		this.completionTime = completionTime;
	} 
    /**
     * 其他的get方法
     * @return other
     */
    public String getOther(){
        return other;
    }
    /**
     * 其他的set方法
     * @param other
     */
    public void setOther(String other){
		this.other = other;
	} 

    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
	  			.append("ID"+":"+getId())
				.append("OPERATIONS_MANAGEMENT_UNIT"+":"+getOperationsManagementUnit())
				.append("EXTERNAL_UNIT"+":"+getExternalUnit())
				.append("PROJECT_NAME"+":"+getProjectName())
				.append("COME_LETTER_TIME"+":"+getComeLetterTime())
				.append("REPEAT_LETTER_TIME"+":"+getRepeatLetterTime())
				.append("REVIEW_COMMENTS_TIME"+":"+getReviewCommentsTime())
				.append("CHANGE_AGREEMENT_TIME"+":"+getChangeAgreementTime())
				.append("BIDDING_COMPLETE_TIME"+":"+getBiddingCompleteTime())
				.append("DESIGNER_UNIT"+":"+getDesignerUnit())
				.append("CONSTRUCTION_UNIT"+":"+getConstructionUnit())
				.append("SUPERVISION_UNIT"+":"+getSupervisionUnit())
				.append("PROVINCIAL_COMPANY_APPROVAL"+":"+getProvincialCompanyApproval())
				.append("CONSTRUCTION_PLAN_SCHEDULE"+":"+getConstructionPlanSchedule())
				.append("MAJOR_PROJECT_SCALE"+":"+getMajorProjectScale())
				.append("CONSTRUCTION_PROGRESS"+":"+getConstructionProgress())
				.append("SECURITY_REGULATORY_UNIT"+":"+getSecurityRegulatoryUnit())
				.append("COMPLETION_TIME"+":"+getCompletionTime())
				.append("OTHER"+":"+getOther())
		        .toString(); 
			
    } 
   


}
