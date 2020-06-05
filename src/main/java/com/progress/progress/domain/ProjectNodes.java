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
 * ProjectNodes的POJO类
 * @author ru3an 
 */
@Entity
@Table(name = "project_nodes")
public class ProjectNodes implements Serializable {

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
     * 项目名称
     */
    @Column(name = "PROJECT_NAME", nullable = true, length = 64)
    private String projectName ;
    
    /** 
     * 项目id
     */
    @Column(name = "PROJECT_ID", nullable = true, length = 10)
    private Integer projectId ;
    
    /** 
     * 所属部门
     */
    @Column(name = "PROJECT_DEPARTMENT", nullable = true, length = 255)
    private String projectDepartment ;
    
    /** 
     * 节点名称
     */
    @Column(name = "NODE_NAME", nullable = true, length = 64)
    private String nodeName ;
    
    /** 
     * 计划开始时间
     */
    @Column(name = "PLAN_START_TIME", nullable = true, length = 19)
    private Timestamp planStartTime ;
    
    /** 
     * 计划结束时间
     */
    @Column(name = "PLAN_END_TIME", nullable = true, length = 19)
    private Timestamp planEndTime ;
    
    /** 
     * 实际开始时间
     */
    @Column(name = "ACTUAL_START_TIME", nullable = true, length = 19)
    private Timestamp actualStartTime ;
    
    /** 
     * 实际结束时间
     */
    @Column(name = "ACTUAL_END_TIME", nullable = true, length = 19)
    private Timestamp actualEndTime ;
    
    /** 
     * 完成状态
     */
    @Column(name = "IS_FINISHED", nullable = true, length = 10)
    private Integer isFinished ;
    
    /** 
     * 节点阶段0项目前期1工程前期2工程施工3竣工验收
     */
    @Column(name = "STATUS", nullable = true, length = 10)
    private Integer _status ;
    
    /** 
     * 填报时间
     */
    @Column(name = "FILL_TIME", nullable = true, length = 19)
    private Timestamp fillTime ;
    
    /** 
     * 填报人
     */
    @Column(name = "FILL_PERSON", nullable = true, length = 64)
    private String fillPerson ;
    
    /** 
     * 责任人
     */
    @Column(name = "RELATED_PERSON", nullable = true, length = 64)
    private String relatedPerson ;
    
    /** 
     * 创建时间
     */
    @Column(name = "CREATE_TIME", nullable = true, length = 19)
    private Timestamp createTime ;
    
    /** 
     * 权重
     */
    @Column(name = "WEIGHT", nullable = true, length = 64)
    private String weight ;
    
    /** 
     * 文件编码
     */
    @Column(name = "FILE_CODE", nullable = true, length = 64)
    private String fileCode ;
    
    /** 
     * 文件路径
     */
    @Column(name = "FILE_PATH", nullable = true, length = 255)
    private String filePath ;
    
    /** 
     * 前置条件
     */
    @Column(name = "PRECONDITION", nullable = true, length = 64)
    private String precondition ;
    
    /** 
     * 有效期至
     */
    @Column(name = "VALID_TIME", nullable = true, length = 19)
    private Timestamp validTime ;
    
	/**
	  *虚拟主键
	  */
	@Transient
	private String mxVirtualId;
	
	public ProjectNodes(){
	
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
     * @getProjectId:项目id的get方法
     * @return projectId
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Integer getProjectId(){
        return this.projectId;
    }
    /**
     * @setProjectId:项目id的set方法
     * @param projectId projectId
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setProjectId(Integer projectId){
		this.projectId = projectId;
	} 
    /**
     * @getProjectDepartment:所属部门的get方法
     * @return projectDepartment
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getProjectDepartment(){
        return this.projectDepartment;
    }
    /**
     * @setProjectDepartment:所属部门的set方法
     * @param projectDepartment projectDepartment
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setProjectDepartment(String projectDepartment){
		this.projectDepartment = projectDepartment;
	} 
    /**
     * @getNodeName:节点名称的get方法
     * @return nodeName
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getNodeName(){
        return this.nodeName;
    }
    /**
     * @setNodeName:节点名称的set方法
     * @param nodeName nodeName
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setNodeName(String nodeName){
		this.nodeName = nodeName;
	} 
    /**
     * @getPlanStartTime:计划开始时间的get方法
     * @return planStartTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Timestamp getPlanStartTime(){
        return this.planStartTime;
    }
    /**
     * @setPlanStartTime:计划开始时间的set方法
     * @param planStartTime planStartTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setPlanStartTime(Timestamp planStartTime){
		this.planStartTime = planStartTime;
	} 
    /**
     * @getPlanEndTime:计划结束时间的get方法
     * @return planEndTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Timestamp getPlanEndTime(){
        return this.planEndTime;
    }
    /**
     * @setPlanEndTime:计划结束时间的set方法
     * @param planEndTime planEndTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setPlanEndTime(Timestamp planEndTime){
		this.planEndTime = planEndTime;
	} 
    /**
     * @getActualStartTime:实际开始时间的get方法
     * @return actualStartTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Timestamp getActualStartTime(){
        return this.actualStartTime;
    }
    /**
     * @setActualStartTime:实际开始时间的set方法
     * @param actualStartTime actualStartTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setActualStartTime(Timestamp actualStartTime){
		this.actualStartTime = actualStartTime;
	} 
    /**
     * @getActualEndTime:实际结束时间的get方法
     * @return actualEndTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Timestamp getActualEndTime(){
        return this.actualEndTime;
    }
    /**
     * @setActualEndTime:实际结束时间的set方法
     * @param actualEndTime actualEndTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setActualEndTime(Timestamp actualEndTime){
		this.actualEndTime = actualEndTime;
	} 
    /**
     * @getIsFinished:完成状态的get方法
     * @return isFinished
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Integer getIsFinished(){
        return this.isFinished;
    }
    /**
     * @setIsFinished:完成状态的set方法
     * @param isFinished isFinished
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setIsFinished(Integer isFinished){
		this.isFinished = isFinished;
	} 
    /**
     * @get_status:节点阶段0项目前期1工程前期2工程施工3竣工验收的get方法
     * @return _status
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Integer get_status(){
        return this._status;
    }
    /**
     * @set_status:节点阶段0项目前期1工程前期2工程施工3竣工验收的set方法
     * @param _status _status
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void set_status(Integer _status){
		this._status = _status;
	} 
    /**
     * @getFillTime:填报时间的get方法
     * @return fillTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Timestamp getFillTime(){
        return this.fillTime;
    }
    /**
     * @setFillTime:填报时间的set方法
     * @param fillTime fillTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setFillTime(Timestamp fillTime){
		this.fillTime = fillTime;
	} 
    /**
     * @getFillPerson:填报人的get方法
     * @return fillPerson
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getFillPerson(){
        return this.fillPerson;
    }
    /**
     * @setFillPerson:填报人的set方法
     * @param fillPerson fillPerson
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setFillPerson(String fillPerson){
		this.fillPerson = fillPerson;
	} 
    /**
     * @getRelatedPerson:责任人的get方法
     * @return relatedPerson
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getRelatedPerson(){
        return this.relatedPerson;
    }
    /**
     * @setRelatedPerson:责任人的set方法
     * @param relatedPerson relatedPerson
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setRelatedPerson(String relatedPerson){
		this.relatedPerson = relatedPerson;
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
    /**
     * @getWeight:权重的get方法
     * @return weight
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getWeight(){
        return this.weight;
    }
    /**
     * @setWeight:权重的set方法
     * @param weight weight
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setWeight(String weight){
		this.weight = weight;
	} 
    /**
     * @getFileCode:文件编码的get方法
     * @return fileCode
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getFileCode(){
        return this.fileCode;
    }
    /**
     * @setFileCode:文件编码的set方法
     * @param fileCode fileCode
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setFileCode(String fileCode){
		this.fileCode = fileCode;
	} 
    /**
     * @getFilePath:文件路径的get方法
     * @return filePath
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getFilePath(){
        return this.filePath;
    }
    /**
     * @setFilePath:文件路径的set方法
     * @param filePath filePath
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setFilePath(String filePath){
		this.filePath = filePath;
	} 
    /**
     * @getPrecondition:前置条件的get方法
     * @return precondition
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getPrecondition(){
        return this.precondition;
    }
    /**
     * @setPrecondition:前置条件的set方法
     * @param precondition precondition
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setPrecondition(String precondition){
		this.precondition = precondition;
	} 
    /**
     * @getValidTime:有效期至的get方法
     * @return validTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Timestamp getValidTime(){
        return this.validTime;
    }
    /**
     * @setValidTime:有效期至的set方法
     * @param validTime validTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setValidTime(Timestamp validTime){
		this.validTime = validTime;
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
		
        if (obj == null || !(obj instanceof ProjectNodes))
	        return false; 
	        
		if (getClass() != obj.getClass())
			return false;
		
		ProjectNodes other = (ProjectNodes) obj;
		
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
		if (projectDepartment == null) {
			if (other.projectDepartment != null) {
				return false;
			}
		} else if (!projectDepartment.equals(other.projectDepartment)) {
			return false;
		}
		if (nodeName == null) {
			if (other.nodeName != null) {
				return false;
			}
		} else if (!nodeName.equals(other.nodeName)) {
			return false;
		}
		if (planStartTime == null) {
			if (other.planStartTime != null) {
				return false;
			}
		} else if (!planStartTime.equals(other.planStartTime)) {
			return false;
		}
		if (planEndTime == null) {
			if (other.planEndTime != null) {
				return false;
			}
		} else if (!planEndTime.equals(other.planEndTime)) {
			return false;
		}
		if (actualStartTime == null) {
			if (other.actualStartTime != null) {
				return false;
			}
		} else if (!actualStartTime.equals(other.actualStartTime)) {
			return false;
		}
		if (actualEndTime == null) {
			if (other.actualEndTime != null) {
				return false;
			}
		} else if (!actualEndTime.equals(other.actualEndTime)) {
			return false;
		}
		if (isFinished == null) {
			if (other.isFinished != null) {
				return false;
			}
		} else if (!isFinished.equals(other.isFinished)) {
			return false;
		}
		if (_status == null) {
			if (other._status != null) {
				return false;
			}
		} else if (!_status.equals(other._status)) {
			return false;
		}
		if (fillTime == null) {
			if (other.fillTime != null) {
				return false;
			}
		} else if (!fillTime.equals(other.fillTime)) {
			return false;
		}
		if (fillPerson == null) {
			if (other.fillPerson != null) {
				return false;
			}
		} else if (!fillPerson.equals(other.fillPerson)) {
			return false;
		}
		if (relatedPerson == null) {
			if (other.relatedPerson != null) {
				return false;
			}
		} else if (!relatedPerson.equals(other.relatedPerson)) {
			return false;
		}
		if (createTime == null) {
			if (other.createTime != null) {
				return false;
			}
		} else if (!createTime.equals(other.createTime)) {
			return false;
		}
		if (weight == null) {
			if (other.weight != null) {
				return false;
			}
		} else if (!weight.equals(other.weight)) {
			return false;
		}
		if (fileCode == null) {
			if (other.fileCode != null) {
				return false;
			}
		} else if (!fileCode.equals(other.fileCode)) {
			return false;
		}
		if (filePath == null) {
			if (other.filePath != null) {
				return false;
			}
		} else if (!filePath.equals(other.filePath)) {
			return false;
		}
		if (precondition == null) {
			if (other.precondition != null) {
				return false;
			}
		} else if (!precondition.equals(other.precondition)) {
			return false;
		}
		if (validTime == null) {
			if (other.validTime != null) {
				return false;
			}
		} else if (!validTime.equals(other.validTime)) {
			return false;
		}
		return true;
	}
    
    /**
     * toString方法
     * @return String
     */
	public String toString(){
		return "ProjectNodes ["
			+ ", id=" + id
			+ ", projectName=" + projectName
			+ ", projectId=" + projectId
			+ ", projectDepartment=" + projectDepartment
			+ ", nodeName=" + nodeName
			+ ", planStartTime=" + planStartTime
			+ ", planEndTime=" + planEndTime
			+ ", actualStartTime=" + actualStartTime
			+ ", actualEndTime=" + actualEndTime
			+ ", isFinished=" + isFinished
			+ ", _status=" + _status
			+ ", fillTime=" + fillTime
			+ ", fillPerson=" + fillPerson
			+ ", relatedPerson=" + relatedPerson
			+ ", createTime=" + createTime
			+ ", weight=" + weight
			+ ", fileCode=" + fileCode
			+ ", filePath=" + filePath
			+ ", precondition=" + precondition
			+ ", validTime=" + validTime;
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