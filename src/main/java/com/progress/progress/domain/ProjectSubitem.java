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
 * ProjectSubitem的POJO类
 * @author ru3an 
 */
@Entity
@Table(name = "project_subitem")
public class ProjectSubitem implements Serializable {

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
     * 项目id
     */
    @Column(name = "PROJECT_ID", nullable = true, length = 10)
    private Integer projectId ;
    
    /** 
     * 项目名称
     */
    @Column(name = "PROJECT_NAME", nullable = true, length = 64)
    private String projectName ;
    
    /** 
     * 节点名称
     */
    @Column(name = "NAME", nullable = true, length = 64)
    private String name ;
    
    /** 
     * 创建人
     */
    @Column(name = "CREATE_PERSON", nullable = true, length = 64)
    private String createPerson ;
    
    /** 
     * 创建时间
     */
    @Column(name = "CREATE_TIME", nullable = true, length = 19)
    private Timestamp createTime ;
    
    /** 
     * 工程阶段
     */
    @Column(name = "PHASE", nullable = true, length = 64)
    private String phase ;
    
    /** 
     * 节点等级
     */
    @Column(name = "NODE_LEVEL", nullable = true, length = 10)
    private Integer nodeLevel ;
    
    /** 
     * 父节点id
     */
    @Column(name = "PARENT_ID", nullable = true, length = 10)
    private Integer parentId ;
    
    /** 
     * 状态
     */
    @Column(name = "STATUS", nullable = true, length = 10)
    private Integer _status ;
    
    /** 
     * 截至时间
     */
    @Column(name = "DEADLINE_TIME", nullable = true, length = 19)
    private Timestamp deadlineTime ;
    
    /** 
     * 是否完成
     */
    @Column(name = "IS_FINISHED", nullable = true, length = 10)
    private Integer isFinished ;
    
    /** 
     * 权重
     */
    @Column(name = "WEIGHT", nullable = true, length = 64)
    private String weight ;
    
	/**
	  *虚拟主键
	  */
	@Transient
	private String mxVirtualId;
	
	public ProjectSubitem(){
	
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
     * @getName:节点名称的get方法
     * @return name
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getName(){
        return this.name;
    }
    /**
     * @setName:节点名称的set方法
     * @param name name
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setName(String name){
		this.name = name;
	} 
    /**
     * @getCreatePerson:创建人的get方法
     * @return createPerson
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getCreatePerson(){
        return this.createPerson;
    }
    /**
     * @setCreatePerson:创建人的set方法
     * @param createPerson createPerson
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setCreatePerson(String createPerson){
		this.createPerson = createPerson;
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
     * @getPhase:工程阶段的get方法
     * @return phase
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getPhase(){
        return this.phase;
    }
    /**
     * @setPhase:工程阶段的set方法
     * @param phase phase
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setPhase(String phase){
		this.phase = phase;
	} 
    /**
     * @getNodeLevel:节点等级的get方法
     * @return nodeLevel
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Integer getNodeLevel(){
        return this.nodeLevel;
    }
    /**
     * @setNodeLevel:节点等级的set方法
     * @param nodeLevel nodeLevel
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setNodeLevel(Integer nodeLevel){
		this.nodeLevel = nodeLevel;
	} 
    /**
     * @getParentId:父节点id的get方法
     * @return parentId
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Integer getParentId(){
        return this.parentId;
    }
    /**
     * @setParentId:父节点id的set方法
     * @param parentId parentId
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setParentId(Integer parentId){
		this.parentId = parentId;
	} 
    /**
     * @get_status:状态的get方法
     * @return _status
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Integer get_status(){
        return this._status;
    }
    /**
     * @set_status:状态的set方法
     * @param _status _status
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void set_status(Integer _status){
		this._status = _status;
	} 
    /**
     * @getDeadlineTime:截至时间的get方法
     * @return deadlineTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Timestamp getDeadlineTime(){
        return this.deadlineTime;
    }
    /**
     * @setDeadlineTime:截至时间的set方法
     * @param deadlineTime deadlineTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setDeadlineTime(Timestamp deadlineTime){
		this.deadlineTime = deadlineTime;
	} 
    /**
     * @getIsFinished:是否完成的get方法
     * @return isFinished
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Integer getIsFinished(){
        return this.isFinished;
    }
    /**
     * @setIsFinished:是否完成的set方法
     * @param isFinished isFinished
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setIsFinished(Integer isFinished){
		this.isFinished = isFinished;
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
		
        if (obj == null || !(obj instanceof ProjectSubitem))
	        return false; 
	        
		if (getClass() != obj.getClass())
			return false;
		
		ProjectSubitem other = (ProjectSubitem) obj;
		
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (projectId == null) {
			if (other.projectId != null) {
				return false;
			}
		} else if (!projectId.equals(other.projectId)) {
			return false;
		}
		if (projectName == null) {
			if (other.projectName != null) {
				return false;
			}
		} else if (!projectName.equals(other.projectName)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (createPerson == null) {
			if (other.createPerson != null) {
				return false;
			}
		} else if (!createPerson.equals(other.createPerson)) {
			return false;
		}
		if (createTime == null) {
			if (other.createTime != null) {
				return false;
			}
		} else if (!createTime.equals(other.createTime)) {
			return false;
		}
		if (phase == null) {
			if (other.phase != null) {
				return false;
			}
		} else if (!phase.equals(other.phase)) {
			return false;
		}
		if (nodeLevel == null) {
			if (other.nodeLevel != null) {
				return false;
			}
		} else if (!nodeLevel.equals(other.nodeLevel)) {
			return false;
		}
		if (parentId == null) {
			if (other.parentId != null) {
				return false;
			}
		} else if (!parentId.equals(other.parentId)) {
			return false;
		}
		if (_status == null) {
			if (other._status != null) {
				return false;
			}
		} else if (!_status.equals(other._status)) {
			return false;
		}
		if (deadlineTime == null) {
			if (other.deadlineTime != null) {
				return false;
			}
		} else if (!deadlineTime.equals(other.deadlineTime)) {
			return false;
		}
		if (isFinished == null) {
			if (other.isFinished != null) {
				return false;
			}
		} else if (!isFinished.equals(other.isFinished)) {
			return false;
		}
		if (weight == null) {
			if (other.weight != null) {
				return false;
			}
		} else if (!weight.equals(other.weight)) {
			return false;
		}
		return true;
	}
    
    /**
     * toString方法
     * @return String
     */
	public String toString(){
		return "ProjectSubitem ["
			+ ", id=" + id
			+ ", projectId=" + projectId
			+ ", projectName=" + projectName
			+ ", name=" + name
			+ ", createPerson=" + createPerson
			+ ", createTime=" + createTime
			+ ", phase=" + phase
			+ ", nodeLevel=" + nodeLevel
			+ ", parentId=" + parentId
			+ ", _status=" + _status
			+ ", deadlineTime=" + deadlineTime
			+ ", isFinished=" + isFinished
			+ ", weight=" + weight;
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