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
 * ProjectDetail的VO类
 *
 * @author ru3an 
 */
public class ProjectDetailVO extends ParentVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
    /** 
     * 属性主键
     */  
    @ViewAttribute(name ="id",caption="主键", editor=EditorType.NumberEditor,nullable =false,readOnly=false, type=AttributeType.LONG)
    private Long id;    
    /** 
     * 属性项目名称
     */  
    @ViewAttribute(name ="projectName",caption="项目名称", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String projectName;    
    /** 
     * 属性项目编码
     */  
    @ViewAttribute(name ="projectCode",caption="项目编码", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String projectCode;    
    /** 
     * 属性建管单位
     */  
    @ViewAttribute(name ="constructionUnit",caption="建管单位", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String constructionUnit;    
    /** 
     * 属性电压等级
     */  
    @ViewAttribute(name ="voltageLevel",caption="电压等级", editor=EditorType.NumberEditor,nullable =true,readOnly=false, type=AttributeType.INTEGER)
    private Integer voltageLevel;    
    /** 
     * 属性所属项目部
     */  
    @ViewAttribute(name ="projectDepartment",caption="所属项目部", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String projectDepartment;    
    /** 
     * 属性开工情况
     */  
    @ViewAttribute(name ="workSituation",caption="开工情况", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String workSituation;    
    /** 
     * 属性全部节点
     */  
    @ViewAttribute(name ="allNodes",caption="全部节点", editor=EditorType.NumberEditor,nullable =true,readOnly=false, type=AttributeType.INTEGER)
    private Integer allNodes;    
    /** 
     * 属性提前节点
     */  
    @ViewAttribute(name ="advancedNode",caption="提前节点", editor=EditorType.NumberEditor,nullable =true,readOnly=false, type=AttributeType.INTEGER)
    private Integer advancedNode;    
    /** 
     * 属性滞后节点
     */  
    @ViewAttribute(name ="lagNode",caption="滞后节点", editor=EditorType.NumberEditor,nullable =true,readOnly=false, type=AttributeType.INTEGER)
    private Integer lagNode;    
    /** 
     * 属性预警节点
     */  
    @ViewAttribute(name ="alertNode",caption="预警节点", editor=EditorType.NumberEditor,nullable =true,readOnly=false, type=AttributeType.INTEGER)
    private Integer alertNode;    
    /** 
     * 属性正常完成节点
     */  
    @ViewAttribute(name ="normalCompletionNode",caption="正常完成节点", editor=EditorType.NumberEditor,nullable =true,readOnly=false, type=AttributeType.INTEGER)
    private Integer normalCompletionNode;    
    /** 
     * 属性合计完成节点
     */  
    @ViewAttribute(name ="totalCompletionNode",caption="合计完成节点", editor=EditorType.NumberEditor,nullable =true,readOnly=false, type=AttributeType.INTEGER)
    private Integer totalCompletionNode;    
    /** 
     * 属性关联人员
     */  
    @ViewAttribute(name ="relatedPerson",caption="关联人员", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String relatedPerson;    
    /** 
     * 属性项目意义
     */  
    @ViewAttribute(name ="projectSignificance",caption="项目意义", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String projectSignificance;    
    /** 
     * 属性超期遗留
     */  
    @ViewAttribute(name ="overDeadline",caption="超期遗留", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String overDeadline;    
    /** 
     * 属性附件
     */  
    @ViewAttribute(name ="attachment",caption="附件", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String attachment;    
    /** 
     * 属性状态
     */  
    @ViewAttribute(name ="_status",caption="状态", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String _status;    
    /** 
     * 属性创建时间
     */  
    @ViewAttribute(name ="createTime",caption="创建时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp createTime;    
    /** 
     * 属性计划完成时间
     */  
    @ViewAttribute(name ="completionTime",caption="计划完成时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp completionTime;    
    /** 
     * 属性是否是关注项目
     */  
    @ViewAttribute(name ="projectAttention",caption="是否是关注项目", editor=EditorType.NumberEditor,nullable =true,readOnly=false, type=AttributeType.INTEGER)
    private Integer projectAttention;    
    /** 
     * 属性完成率
     */  
    @ViewAttribute(name ="completeRate",caption="完成率", editor=EditorType.NumberEditor,nullable =true,readOnly=false, type=AttributeType.DOUBLE)
    private Double completeRate;    
    /**
     * ProjectDetailVO构造函数
     */
    public ProjectDetailVO() {
        super();
    } 
   
	 /**
     * ProjectDetailVO完整的构造函数
     */  
    public ProjectDetailVO(Long id){
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
     * 项目编码的get方法
     * @return projectCode
     */
    public String getProjectCode(){
        return projectCode;
    }
    /**
     * 项目编码的set方法
     * @param projectCode
     */
    public void setProjectCode(String projectCode){
		this.projectCode = projectCode;
	} 
    /**
     * 建管单位的get方法
     * @return constructionUnit
     */
    public String getConstructionUnit(){
        return constructionUnit;
    }
    /**
     * 建管单位的set方法
     * @param constructionUnit
     */
    public void setConstructionUnit(String constructionUnit){
		this.constructionUnit = constructionUnit;
	} 
    /**
     * 电压等级的get方法
     * @return voltageLevel
     */
    public Integer getVoltageLevel(){
        return voltageLevel;
    }
    /**
     * 电压等级的set方法
     * @param voltageLevel
     */
    public void setVoltageLevel(Integer voltageLevel){
		this.voltageLevel = voltageLevel;
	} 
    /**
     * 所属项目部的get方法
     * @return projectDepartment
     */
    public String getProjectDepartment(){
        return projectDepartment;
    }
    /**
     * 所属项目部的set方法
     * @param projectDepartment
     */
    public void setProjectDepartment(String projectDepartment){
		this.projectDepartment = projectDepartment;
	} 
    /**
     * 开工情况的get方法
     * @return workSituation
     */
    public String getWorkSituation(){
        return workSituation;
    }
    /**
     * 开工情况的set方法
     * @param workSituation
     */
    public void setWorkSituation(String workSituation){
		this.workSituation = workSituation;
	} 
    /**
     * 全部节点的get方法
     * @return allNodes
     */
    public Integer getAllNodes(){
        return allNodes;
    }
    /**
     * 全部节点的set方法
     * @param allNodes
     */
    public void setAllNodes(Integer allNodes){
		this.allNodes = allNodes;
	} 
    /**
     * 提前节点的get方法
     * @return advancedNode
     */
    public Integer getAdvancedNode(){
        return advancedNode;
    }
    /**
     * 提前节点的set方法
     * @param advancedNode
     */
    public void setAdvancedNode(Integer advancedNode){
		this.advancedNode = advancedNode;
	} 
    /**
     * 滞后节点的get方法
     * @return lagNode
     */
    public Integer getLagNode(){
        return lagNode;
    }
    /**
     * 滞后节点的set方法
     * @param lagNode
     */
    public void setLagNode(Integer lagNode){
		this.lagNode = lagNode;
	} 
    /**
     * 预警节点的get方法
     * @return alertNode
     */
    public Integer getAlertNode(){
        return alertNode;
    }
    /**
     * 预警节点的set方法
     * @param alertNode
     */
    public void setAlertNode(Integer alertNode){
		this.alertNode = alertNode;
	} 
    /**
     * 正常完成节点的get方法
     * @return normalCompletionNode
     */
    public Integer getNormalCompletionNode(){
        return normalCompletionNode;
    }
    /**
     * 正常完成节点的set方法
     * @param normalCompletionNode
     */
    public void setNormalCompletionNode(Integer normalCompletionNode){
		this.normalCompletionNode = normalCompletionNode;
	} 
    /**
     * 合计完成节点的get方法
     * @return totalCompletionNode
     */
    public Integer getTotalCompletionNode(){
        return totalCompletionNode;
    }
    /**
     * 合计完成节点的set方法
     * @param totalCompletionNode
     */
    public void setTotalCompletionNode(Integer totalCompletionNode){
		this.totalCompletionNode = totalCompletionNode;
	} 
    /**
     * 关联人员的get方法
     * @return relatedPerson
     */
    public String getRelatedPerson(){
        return relatedPerson;
    }
    /**
     * 关联人员的set方法
     * @param relatedPerson
     */
    public void setRelatedPerson(String relatedPerson){
		this.relatedPerson = relatedPerson;
	} 
    /**
     * 项目意义的get方法
     * @return projectSignificance
     */
    public String getProjectSignificance(){
        return projectSignificance;
    }
    /**
     * 项目意义的set方法
     * @param projectSignificance
     */
    public void setProjectSignificance(String projectSignificance){
		this.projectSignificance = projectSignificance;
	} 
    /**
     * 超期遗留的get方法
     * @return overDeadline
     */
    public String getOverDeadline(){
        return overDeadline;
    }
    /**
     * 超期遗留的set方法
     * @param overDeadline
     */
    public void setOverDeadline(String overDeadline){
		this.overDeadline = overDeadline;
	} 
    /**
     * 附件的get方法
     * @return attachment
     */
    public String getAttachment(){
        return attachment;
    }
    /**
     * 附件的set方法
     * @param attachment
     */
    public void setAttachment(String attachment){
		this.attachment = attachment;
	} 
    /**
     * 状态的get方法
     * @return _status
     */
    public String get_status(){
        return _status;
    }
    /**
     * 状态的set方法
     * @param _status
     */
    public void set_status(String _status){
		this._status = _status;
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
     * 计划完成时间的get方法
     * @return completionTime
     */
    public Timestamp getCompletionTime(){
        return completionTime;
    }
    /**
     * 计划完成时间的set方法
     * @param completionTime
     */
    public void setCompletionTime(Timestamp completionTime){
		this.completionTime = completionTime;
	} 
    /**
     * 是否是关注项目的get方法
     * @return projectAttention
     */
    public Integer getProjectAttention(){
        return projectAttention;
    }
    /**
     * 是否是关注项目的set方法
     * @param projectAttention
     */
    public void setProjectAttention(Integer projectAttention){
		this.projectAttention = projectAttention;
	} 
    /**
     * 完成率的get方法
     * @return completeRate
     */
    public Double getCompleteRate(){
        return completeRate;
    }
    /**
     * 完成率的set方法
     * @param completeRate
     */
    public void setCompleteRate(Double completeRate){
		this.completeRate = completeRate;
	} 

    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
	  			.append("ID"+":"+getId())
				.append("PROJECT_NAME"+":"+getProjectName())
				.append("PROJECT_CODE"+":"+getProjectCode())
				.append("CONSTRUCTION_UNIT"+":"+getConstructionUnit())
				.append("VOLTAGE_LEVEL"+":"+getVoltageLevel())
				.append("PROJECT_DEPARTMENT"+":"+getProjectDepartment())
				.append("WORK_SITUATION"+":"+getWorkSituation())
				.append("ALL_NODES"+":"+getAllNodes())
				.append("ADVANCED_NODE"+":"+getAdvancedNode())
				.append("LAG_NODE"+":"+getLagNode())
				.append("ALERT_NODE"+":"+getAlertNode())
				.append("NORMAL_COMPLETION_NODE"+":"+getNormalCompletionNode())
				.append("TOTAL_COMPLETION_NODE"+":"+getTotalCompletionNode())
				.append("RELATED_PERSON"+":"+getRelatedPerson())
				.append("PROJECT_SIGNIFICANCE"+":"+getProjectSignificance())
				.append("OVER_DEADLINE"+":"+getOverDeadline())
				.append("ATTACHMENT"+":"+getAttachment())
				.append("STATUS"+":"+get_status())
				.append("CREATE_TIME"+":"+getCreateTime())
				.append("COMPLETION_TIME"+":"+getCompletionTime())
				.append("PROJECT_ATTENTION"+":"+getProjectAttention())
				.append("COMPLETE_RATE"+":"+getCompleteRate())
		        .toString(); 
			
    } 
   


}
