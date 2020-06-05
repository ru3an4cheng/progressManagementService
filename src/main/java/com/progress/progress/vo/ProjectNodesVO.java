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
 * ProjectNodes的VO类
 *
 * @author ru3an 
 */
public class ProjectNodesVO extends ParentVO implements Serializable{

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
     * 属性项目id
     */  
    @ViewAttribute(name ="projectId",caption="项目id", editor=EditorType.NumberEditor,nullable =true,readOnly=false, type=AttributeType.INTEGER)
    private Integer projectId;    
    /** 
     * 属性所属部门
     */  
    @ViewAttribute(name ="projectDepartment",caption="所属部门", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String projectDepartment;    
    /** 
     * 属性节点名称
     */  
    @ViewAttribute(name ="nodeName",caption="节点名称", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String nodeName;    
    /** 
     * 属性计划开始时间
     */  
    @ViewAttribute(name ="planStartTime",caption="计划开始时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp planStartTime;    
    /** 
     * 属性计划结束时间
     */  
    @ViewAttribute(name ="planEndTime",caption="计划结束时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp planEndTime;    
    /** 
     * 属性实际开始时间
     */  
    @ViewAttribute(name ="actualStartTime",caption="实际开始时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp actualStartTime;    
    /** 
     * 属性实际结束时间
     */  
    @ViewAttribute(name ="actualEndTime",caption="实际结束时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp actualEndTime;    
    /** 
     * 属性完成状态
     */  
    @ViewAttribute(name ="isFinished",caption="完成状态", editor=EditorType.NumberEditor,nullable =true,readOnly=false, type=AttributeType.INTEGER)
    private Integer isFinished;    
    /** 
     * 属性节点阶段0项目前期1工程前期2工程施工3竣工验收
     */  
    @ViewAttribute(name ="_status",caption="节点阶段0项目前期1工程前期2工程施工3竣工验收", editor=EditorType.NumberEditor,nullable =true,readOnly=false, type=AttributeType.INTEGER)
    private Integer _status;    
    /** 
     * 属性填报时间
     */  
    @ViewAttribute(name ="fillTime",caption="填报时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp fillTime;    
    /** 
     * 属性填报人
     */  
    @ViewAttribute(name ="fillPerson",caption="填报人", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String fillPerson;    
    /** 
     * 属性责任人
     */  
    @ViewAttribute(name ="relatedPerson",caption="责任人", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String relatedPerson;    
    /** 
     * 属性创建时间
     */  
    @ViewAttribute(name ="createTime",caption="创建时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp createTime;    
    /** 
     * 属性权重
     */  
    @ViewAttribute(name ="weight",caption="权重", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String weight;    
    /** 
     * 属性文件编码
     */  
    @ViewAttribute(name ="fileCode",caption="文件编码", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String fileCode;    
    /** 
     * 属性文件路径
     */  
    @ViewAttribute(name ="filePath",caption="文件路径", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String filePath;    
    /** 
     * 属性前置条件
     */  
    @ViewAttribute(name ="precondition",caption="前置条件", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String precondition;    
    /** 
     * 属性有效期至
     */  
    @ViewAttribute(name ="validTime",caption="有效期至", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp validTime;    
    /**
     * ProjectNodesVO构造函数
     */
    public ProjectNodesVO() {
        super();
    } 
   
	 /**
     * ProjectNodesVO完整的构造函数
     */  
    public ProjectNodesVO(Long id){
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
     * 项目id的get方法
     * @return projectId
     */
    public Integer getProjectId(){
        return projectId;
    }
    /**
     * 项目id的set方法
     * @param projectId
     */
    public void setProjectId(Integer projectId){
		this.projectId = projectId;
	} 
    /**
     * 所属部门的get方法
     * @return projectDepartment
     */
    public String getProjectDepartment(){
        return projectDepartment;
    }
    /**
     * 所属部门的set方法
     * @param projectDepartment
     */
    public void setProjectDepartment(String projectDepartment){
		this.projectDepartment = projectDepartment;
	} 
    /**
     * 节点名称的get方法
     * @return nodeName
     */
    public String getNodeName(){
        return nodeName;
    }
    /**
     * 节点名称的set方法
     * @param nodeName
     */
    public void setNodeName(String nodeName){
		this.nodeName = nodeName;
	} 
    /**
     * 计划开始时间的get方法
     * @return planStartTime
     */
    public Timestamp getPlanStartTime(){
        return planStartTime;
    }
    /**
     * 计划开始时间的set方法
     * @param planStartTime
     */
    public void setPlanStartTime(Timestamp planStartTime){
		this.planStartTime = planStartTime;
	} 
    /**
     * 计划结束时间的get方法
     * @return planEndTime
     */
    public Timestamp getPlanEndTime(){
        return planEndTime;
    }
    /**
     * 计划结束时间的set方法
     * @param planEndTime
     */
    public void setPlanEndTime(Timestamp planEndTime){
		this.planEndTime = planEndTime;
	} 
    /**
     * 实际开始时间的get方法
     * @return actualStartTime
     */
    public Timestamp getActualStartTime(){
        return actualStartTime;
    }
    /**
     * 实际开始时间的set方法
     * @param actualStartTime
     */
    public void setActualStartTime(Timestamp actualStartTime){
		this.actualStartTime = actualStartTime;
	} 
    /**
     * 实际结束时间的get方法
     * @return actualEndTime
     */
    public Timestamp getActualEndTime(){
        return actualEndTime;
    }
    /**
     * 实际结束时间的set方法
     * @param actualEndTime
     */
    public void setActualEndTime(Timestamp actualEndTime){
		this.actualEndTime = actualEndTime;
	} 
    /**
     * 完成状态的get方法
     * @return isFinished
     */
    public Integer getIsFinished(){
        return isFinished;
    }
    /**
     * 完成状态的set方法
     * @param isFinished
     */
    public void setIsFinished(Integer isFinished){
		this.isFinished = isFinished;
	} 
    /**
     * 节点阶段0项目前期1工程前期2工程施工3竣工验收的get方法
     * @return _status
     */
    public Integer get_status(){
        return _status;
    }
    /**
     * 节点阶段0项目前期1工程前期2工程施工3竣工验收的set方法
     * @param _status
     */
    public void set_status(Integer _status){
		this._status = _status;
	} 
    /**
     * 填报时间的get方法
     * @return fillTime
     */
    public Timestamp getFillTime(){
        return fillTime;
    }
    /**
     * 填报时间的set方法
     * @param fillTime
     */
    public void setFillTime(Timestamp fillTime){
		this.fillTime = fillTime;
	} 
    /**
     * 填报人的get方法
     * @return fillPerson
     */
    public String getFillPerson(){
        return fillPerson;
    }
    /**
     * 填报人的set方法
     * @param fillPerson
     */
    public void setFillPerson(String fillPerson){
		this.fillPerson = fillPerson;
	} 
    /**
     * 责任人的get方法
     * @return relatedPerson
     */
    public String getRelatedPerson(){
        return relatedPerson;
    }
    /**
     * 责任人的set方法
     * @param relatedPerson
     */
    public void setRelatedPerson(String relatedPerson){
		this.relatedPerson = relatedPerson;
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
     * 权重的get方法
     * @return weight
     */
    public String getWeight(){
        return weight;
    }
    /**
     * 权重的set方法
     * @param weight
     */
    public void setWeight(String weight){
		this.weight = weight;
	} 
    /**
     * 文件编码的get方法
     * @return fileCode
     */
    public String getFileCode(){
        return fileCode;
    }
    /**
     * 文件编码的set方法
     * @param fileCode
     */
    public void setFileCode(String fileCode){
		this.fileCode = fileCode;
	} 
    /**
     * 文件路径的get方法
     * @return filePath
     */
    public String getFilePath(){
        return filePath;
    }
    /**
     * 文件路径的set方法
     * @param filePath
     */
    public void setFilePath(String filePath){
		this.filePath = filePath;
	} 
    /**
     * 前置条件的get方法
     * @return precondition
     */
    public String getPrecondition(){
        return precondition;
    }
    /**
     * 前置条件的set方法
     * @param precondition
     */
    public void setPrecondition(String precondition){
		this.precondition = precondition;
	} 
    /**
     * 有效期至的get方法
     * @return validTime
     */
    public Timestamp getValidTime(){
        return validTime;
    }
    /**
     * 有效期至的set方法
     * @param validTime
     */
    public void setValidTime(Timestamp validTime){
		this.validTime = validTime;
	} 

    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
	  			.append("ID"+":"+getId())
				.append("PROJECT_NAME"+":"+getProjectName())
				.append("PROJECT_ID"+":"+getProjectId())
				.append("PROJECT_DEPARTMENT"+":"+getProjectDepartment())
				.append("NODE_NAME"+":"+getNodeName())
				.append("PLAN_START_TIME"+":"+getPlanStartTime())
				.append("PLAN_END_TIME"+":"+getPlanEndTime())
				.append("ACTUAL_START_TIME"+":"+getActualStartTime())
				.append("ACTUAL_END_TIME"+":"+getActualEndTime())
				.append("IS_FINISHED"+":"+getIsFinished())
				.append("STATUS"+":"+get_status())
				.append("FILL_TIME"+":"+getFillTime())
				.append("FILL_PERSON"+":"+getFillPerson())
				.append("RELATED_PERSON"+":"+getRelatedPerson())
				.append("CREATE_TIME"+":"+getCreateTime())
				.append("WEIGHT"+":"+getWeight())
				.append("FILE_CODE"+":"+getFileCode())
				.append("FILE_PATH"+":"+getFilePath())
				.append("PRECONDITION"+":"+getPrecondition())
				.append("VALID_TIME"+":"+getValidTime())
		        .toString(); 
			
    } 
   


}
