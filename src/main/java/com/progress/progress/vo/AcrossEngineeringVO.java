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
 * AcrossEngineering的VO类
 *
 * @author ru3an 
 */
public class AcrossEngineeringVO extends ParentVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
    /** 
     * 属性主键
     */  
    @ViewAttribute(name ="id",caption="主键", editor=EditorType.NumberEditor,nullable =false,readOnly=false, type=AttributeType.LONG)
    private Long id;    
    /** 
     * 属性建管单位
     */  
    @ViewAttribute(name ="constructionManagementUnit",caption="建管单位", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String constructionManagementUnit;    
    /** 
     * 属性电压等级
     */  
    @ViewAttribute(name ="voltageLevel",caption="电压等级", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String voltageLevel;    
    /** 
     * 属性工程名称
     */  
    @ViewAttribute(name ="projectName",caption="工程名称", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String projectName;    
    /** 
     * 属性开工时间
     */  
    @ViewAttribute(name ="startTime",caption="开工时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp startTime;    
    /** 
     * 属性投产时间
     */  
    @ViewAttribute(name ="productionTime",caption="投产时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp productionTime;    
    /** 
     * 属性计划施工月份
     */  
    @ViewAttribute(name ="plannedConstructionMonth",caption="计划施工月份", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String plannedConstructionMonth;    
    /** 
     * 属性来函时间
     */  
    @ViewAttribute(name ="comeLetterTime",caption="来函时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp comeLetterTime;    
    /** 
     * 属性施工方案通过审查实际时间
     */  
    @ViewAttribute(name ="passReviewActualTime",caption="施工方案通过审查实际时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp passReviewActualTime;    
    /** 
     * 属性施工方案通过审查理论时间
     */  
    @ViewAttribute(name ="passReviewTheoryTime",caption="施工方案通过审查理论时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp passReviewTheoryTime;    
    /** 
     * 属性计划开工时间
     */  
    @ViewAttribute(name ="planStartTime",caption="计划开工时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp planStartTime;    
    /** 
     * 属性施工单位
     */  
    @ViewAttribute(name ="constructionUnit",caption="施工单位", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String constructionUnit;    
    /** 
     * 属性备注
     */  
    @ViewAttribute(name ="remark",caption="备注", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String remark;    
    /**
     * AcrossEngineeringVO构造函数
     */
    public AcrossEngineeringVO() {
        super();
    } 
   
	 /**
     * AcrossEngineeringVO完整的构造函数
     */  
    public AcrossEngineeringVO(Long id){
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
     * 建管单位的get方法
     * @return constructionManagementUnit
     */
    public String getConstructionManagementUnit(){
        return constructionManagementUnit;
    }
    /**
     * 建管单位的set方法
     * @param constructionManagementUnit
     */
    public void setConstructionManagementUnit(String constructionManagementUnit){
		this.constructionManagementUnit = constructionManagementUnit;
	} 
    /**
     * 电压等级的get方法
     * @return voltageLevel
     */
    public String getVoltageLevel(){
        return voltageLevel;
    }
    /**
     * 电压等级的set方法
     * @param voltageLevel
     */
    public void setVoltageLevel(String voltageLevel){
		this.voltageLevel = voltageLevel;
	} 
    /**
     * 工程名称的get方法
     * @return projectName
     */
    public String getProjectName(){
        return projectName;
    }
    /**
     * 工程名称的set方法
     * @param projectName
     */
    public void setProjectName(String projectName){
		this.projectName = projectName;
	} 
    /**
     * 开工时间的get方法
     * @return startTime
     */
    public Timestamp getStartTime(){
        return startTime;
    }
    /**
     * 开工时间的set方法
     * @param startTime
     */
    public void setStartTime(Timestamp startTime){
		this.startTime = startTime;
	} 
    /**
     * 投产时间的get方法
     * @return productionTime
     */
    public Timestamp getProductionTime(){
        return productionTime;
    }
    /**
     * 投产时间的set方法
     * @param productionTime
     */
    public void setProductionTime(Timestamp productionTime){
		this.productionTime = productionTime;
	} 
    /**
     * 计划施工月份的get方法
     * @return plannedConstructionMonth
     */
    public String getPlannedConstructionMonth(){
        return plannedConstructionMonth;
    }
    /**
     * 计划施工月份的set方法
     * @param plannedConstructionMonth
     */
    public void setPlannedConstructionMonth(String plannedConstructionMonth){
		this.plannedConstructionMonth = plannedConstructionMonth;
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
     * 施工方案通过审查实际时间的get方法
     * @return passReviewActualTime
     */
    public Timestamp getPassReviewActualTime(){
        return passReviewActualTime;
    }
    /**
     * 施工方案通过审查实际时间的set方法
     * @param passReviewActualTime
     */
    public void setPassReviewActualTime(Timestamp passReviewActualTime){
		this.passReviewActualTime = passReviewActualTime;
	} 
    /**
     * 施工方案通过审查理论时间的get方法
     * @return passReviewTheoryTime
     */
    public Timestamp getPassReviewTheoryTime(){
        return passReviewTheoryTime;
    }
    /**
     * 施工方案通过审查理论时间的set方法
     * @param passReviewTheoryTime
     */
    public void setPassReviewTheoryTime(Timestamp passReviewTheoryTime){
		this.passReviewTheoryTime = passReviewTheoryTime;
	} 
    /**
     * 计划开工时间的get方法
     * @return planStartTime
     */
    public Timestamp getPlanStartTime(){
        return planStartTime;
    }
    /**
     * 计划开工时间的set方法
     * @param planStartTime
     */
    public void setPlanStartTime(Timestamp planStartTime){
		this.planStartTime = planStartTime;
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
     * 备注的get方法
     * @return remark
     */
    public String getRemark(){
        return remark;
    }
    /**
     * 备注的set方法
     * @param remark
     */
    public void setRemark(String remark){
		this.remark = remark;
	} 

    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
	  			.append("ID"+":"+getId())
				.append("CONSTRUCTION_MANAGEMENT_UNIT"+":"+getConstructionManagementUnit())
				.append("VOLTAGE_LEVEL"+":"+getVoltageLevel())
				.append("PROJECT_NAME"+":"+getProjectName())
				.append("START_TIME"+":"+getStartTime())
				.append("PRODUCTION_TIME"+":"+getProductionTime())
				.append("PLANNED_CONSTRUCTION_MONTH"+":"+getPlannedConstructionMonth())
				.append("COME_LETTER_TIME"+":"+getComeLetterTime())
				.append("PASS_REVIEW_ACTUAL_TIME"+":"+getPassReviewActualTime())
				.append("PASS_REVIEW_THEORY_TIME"+":"+getPassReviewTheoryTime())
				.append("PLAN_START_TIME"+":"+getPlanStartTime())
				.append("CONSTRUCTION_UNIT"+":"+getConstructionUnit())
				.append("REMARK"+":"+getRemark())
		        .toString(); 
			
    } 
   


}
