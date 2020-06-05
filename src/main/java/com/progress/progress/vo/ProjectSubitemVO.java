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
 * ProjectSubitem的VO类
 *
 * @author ru3an 
 */
public class ProjectSubitemVO extends ParentVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
    /** 
     * 属性主键
     */  
    @ViewAttribute(name ="id",caption="主键", editor=EditorType.NumberEditor,nullable =false,readOnly=false, type=AttributeType.LONG)
    private Long id;    
    /** 
     * 属性项目id
     */  
    @ViewAttribute(name ="projectId",caption="项目id", editor=EditorType.NumberEditor,nullable =true,readOnly=false, type=AttributeType.INTEGER)
    private Integer projectId;    
    /** 
     * 属性项目名称
     */  
    @ViewAttribute(name ="projectName",caption="项目名称", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String projectName;    
    /** 
     * 属性节点名称
     */  
    @ViewAttribute(name ="name",caption="节点名称", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String name;    
    /** 
     * 属性创建人
     */  
    @ViewAttribute(name ="createPerson",caption="创建人", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String createPerson;    
    /** 
     * 属性创建时间
     */  
    @ViewAttribute(name ="createTime",caption="创建时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp createTime;    
    /** 
     * 属性工程阶段
     */  
    @ViewAttribute(name ="phase",caption="工程阶段", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String phase;    
    /** 
     * 属性节点等级
     */  
    @ViewAttribute(name ="nodeLevel",caption="节点等级", editor=EditorType.NumberEditor,nullable =true,readOnly=false, type=AttributeType.INTEGER)
    private Integer nodeLevel;    
    /** 
     * 属性父节点id
     */  
    @ViewAttribute(name ="parentId",caption="父节点id", editor=EditorType.NumberEditor,nullable =true,readOnly=false, type=AttributeType.INTEGER)
    private Integer parentId;    
    /** 
     * 属性状态
     */  
    @ViewAttribute(name ="_status",caption="状态", editor=EditorType.NumberEditor,nullable =true,readOnly=false, type=AttributeType.INTEGER)
    private Integer _status;    
    /** 
     * 属性截至时间
     */  
    @ViewAttribute(name ="deadlineTime",caption="截至时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp deadlineTime;    
    /** 
     * 属性是否完成
     */  
    @ViewAttribute(name ="isFinished",caption="是否完成", editor=EditorType.NumberEditor,nullable =true,readOnly=false, type=AttributeType.INTEGER)
    private Integer isFinished;    
    /** 
     * 属性权重
     */  
    @ViewAttribute(name ="weight",caption="权重", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String weight;    
    /**
     * ProjectSubitemVO构造函数
     */
    public ProjectSubitemVO() {
        super();
    } 
   
	 /**
     * ProjectSubitemVO完整的构造函数
     */  
    public ProjectSubitemVO(Long id){
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
     * 节点名称的get方法
     * @return name
     */
    public String getName(){
        return name;
    }
    /**
     * 节点名称的set方法
     * @param name
     */
    public void setName(String name){
		this.name = name;
	} 
    /**
     * 创建人的get方法
     * @return createPerson
     */
    public String getCreatePerson(){
        return createPerson;
    }
    /**
     * 创建人的set方法
     * @param createPerson
     */
    public void setCreatePerson(String createPerson){
		this.createPerson = createPerson;
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
     * 工程阶段的get方法
     * @return phase
     */
    public String getPhase(){
        return phase;
    }
    /**
     * 工程阶段的set方法
     * @param phase
     */
    public void setPhase(String phase){
		this.phase = phase;
	} 
    /**
     * 节点等级的get方法
     * @return nodeLevel
     */
    public Integer getNodeLevel(){
        return nodeLevel;
    }
    /**
     * 节点等级的set方法
     * @param nodeLevel
     */
    public void setNodeLevel(Integer nodeLevel){
		this.nodeLevel = nodeLevel;
	} 
    /**
     * 父节点id的get方法
     * @return parentId
     */
    public Integer getParentId(){
        return parentId;
    }
    /**
     * 父节点id的set方法
     * @param parentId
     */
    public void setParentId(Integer parentId){
		this.parentId = parentId;
	} 
    /**
     * 状态的get方法
     * @return _status
     */
    public Integer get_status(){
        return _status;
    }
    /**
     * 状态的set方法
     * @param _status
     */
    public void set_status(Integer _status){
		this._status = _status;
	} 
    /**
     * 截至时间的get方法
     * @return deadlineTime
     */
    public Timestamp getDeadlineTime(){
        return deadlineTime;
    }
    /**
     * 截至时间的set方法
     * @param deadlineTime
     */
    public void setDeadlineTime(Timestamp deadlineTime){
		this.deadlineTime = deadlineTime;
	} 
    /**
     * 是否完成的get方法
     * @return isFinished
     */
    public Integer getIsFinished(){
        return isFinished;
    }
    /**
     * 是否完成的set方法
     * @param isFinished
     */
    public void setIsFinished(Integer isFinished){
		this.isFinished = isFinished;
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
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
	  			.append("ID"+":"+getId())
				.append("PROJECT_ID"+":"+getProjectId())
				.append("PROJECT_NAME"+":"+getProjectName())
				.append("NAME"+":"+getName())
				.append("CREATE_PERSON"+":"+getCreatePerson())
				.append("CREATE_TIME"+":"+getCreateTime())
				.append("PHASE"+":"+getPhase())
				.append("NODE_LEVEL"+":"+getNodeLevel())
				.append("PARENT_ID"+":"+getParentId())
				.append("STATUS"+":"+get_status())
				.append("DEADLINE_TIME"+":"+getDeadlineTime())
				.append("IS_FINISHED"+":"+getIsFinished())
				.append("WEIGHT"+":"+getWeight())
		        .toString(); 
			
    } 
   


}
