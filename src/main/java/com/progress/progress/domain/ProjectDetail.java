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
 * ProjectDetail的POJO类
 * @author ru3an 
 */
@Entity
@Table(name = "project_detail")
public class ProjectDetail implements Serializable {

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
     * 项目编码
     */
    @Column(name = "PROJECT_CODE", nullable = true, length = 64)
    private String projectCode ;
    
    /** 
     * 建管单位
     */
    @Column(name = "CONSTRUCTION_UNIT", nullable = true, length = 64)
    private String constructionUnit ;
    
    /** 
     * 电压等级
     */
    @Column(name = "VOLTAGE_LEVEL", nullable = true, length = 10)
    private Integer voltageLevel ;
    
    /** 
     * 所属项目部
     */
    @Column(name = "PROJECT_DEPARTMENT", nullable = true, length = 64)
    private String projectDepartment ;
    
    /** 
     * 开工情况
     */
    @Column(name = "WORK_SITUATION", nullable = true, length = 64)
    private String workSituation ;
    
    /** 
     * 全部节点
     */
    @Column(name = "ALL_NODES", nullable = true, length = 10)
    private Integer allNodes ;
    
    /** 
     * 提前节点
     */
    @Column(name = "ADVANCED_NODE", nullable = true, length = 10)
    private Integer advancedNode ;
    
    /** 
     * 滞后节点
     */
    @Column(name = "LAG_NODE", nullable = true, length = 10)
    private Integer lagNode ;
    
    /** 
     * 预警节点
     */
    @Column(name = "ALERT_NODE", nullable = true, length = 10)
    private Integer alertNode ;
    
    /** 
     * 正常完成节点
     */
    @Column(name = "NORMAL_COMPLETION_NODE", nullable = true, length = 10)
    private Integer normalCompletionNode ;
    
    /** 
     * 合计完成节点
     */
    @Column(name = "TOTAL_COMPLETION_NODE", nullable = true, length = 10)
    private Integer totalCompletionNode ;
    
    /** 
     * 关联人员
     */
    @Column(name = "RELATED_PERSON", nullable = true, length = 64)
    private String relatedPerson ;
    
    /** 
     * 项目意义
     */
    @Column(name = "PROJECT_SIGNIFICANCE", nullable = true, length = 500)
    private String projectSignificance ;
    
    /** 
     * 超期遗留
     */
    @Column(name = "OVER_DEADLINE", nullable = true, length = 64)
    private String overDeadline ;
    
    /** 
     * 附件
     */
    @Column(name = "ATTACHMENT", nullable = true, length = 500)
    private String attachment ;
    
    /** 
     * 状态
     */
    @Column(name = "STATUS", nullable = true, length = 64)
    private String _status ;
    
    /** 
     * 创建时间
     */
    @Column(name = "CREATE_TIME", nullable = true, length = 19)
    private Timestamp createTime ;
    
    /** 
     * 计划完成时间
     */
    @Column(name = "COMPLETION_TIME", nullable = true, length = 19)
    private Timestamp completionTime ;
    
    /** 
     * 是否是关注项目
     */
    @Column(name = "PROJECT_ATTENTION", nullable = true, length = 10)
    private Integer projectAttention ;
    
    /** 
     * 完成率
     */
    @Column(name = "COMPLETE_RATE", nullable = true, length = 10)
    private Double completeRate ;
    
	/**
	  *虚拟主键
	  */
	@Transient
	private String mxVirtualId;
	
	public ProjectDetail(){
	
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
     * @getProjectCode:项目编码的get方法
     * @return projectCode
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getProjectCode(){
        return this.projectCode;
    }
    /**
     * @setProjectCode:项目编码的set方法
     * @param projectCode projectCode
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setProjectCode(String projectCode){
		this.projectCode = projectCode;
	} 
    /**
     * @getConstructionUnit:建管单位的get方法
     * @return constructionUnit
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getConstructionUnit(){
        return this.constructionUnit;
    }
    /**
     * @setConstructionUnit:建管单位的set方法
     * @param constructionUnit constructionUnit
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setConstructionUnit(String constructionUnit){
		this.constructionUnit = constructionUnit;
	} 
    /**
     * @getVoltageLevel:电压等级的get方法
     * @return voltageLevel
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Integer getVoltageLevel(){
        return this.voltageLevel;
    }
    /**
     * @setVoltageLevel:电压等级的set方法
     * @param voltageLevel voltageLevel
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setVoltageLevel(Integer voltageLevel){
		this.voltageLevel = voltageLevel;
	} 
    /**
     * @getProjectDepartment:所属项目部的get方法
     * @return projectDepartment
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getProjectDepartment(){
        return this.projectDepartment;
    }
    /**
     * @setProjectDepartment:所属项目部的set方法
     * @param projectDepartment projectDepartment
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setProjectDepartment(String projectDepartment){
		this.projectDepartment = projectDepartment;
	} 
    /**
     * @getWorkSituation:开工情况的get方法
     * @return workSituation
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getWorkSituation(){
        return this.workSituation;
    }
    /**
     * @setWorkSituation:开工情况的set方法
     * @param workSituation workSituation
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setWorkSituation(String workSituation){
		this.workSituation = workSituation;
	} 
    /**
     * @getAllNodes:全部节点的get方法
     * @return allNodes
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Integer getAllNodes(){
        return this.allNodes;
    }
    /**
     * @setAllNodes:全部节点的set方法
     * @param allNodes allNodes
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setAllNodes(Integer allNodes){
		this.allNodes = allNodes;
	} 
    /**
     * @getAdvancedNode:提前节点的get方法
     * @return advancedNode
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Integer getAdvancedNode(){
        return this.advancedNode;
    }
    /**
     * @setAdvancedNode:提前节点的set方法
     * @param advancedNode advancedNode
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setAdvancedNode(Integer advancedNode){
		this.advancedNode = advancedNode;
	} 
    /**
     * @getLagNode:滞后节点的get方法
     * @return lagNode
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Integer getLagNode(){
        return this.lagNode;
    }
    /**
     * @setLagNode:滞后节点的set方法
     * @param lagNode lagNode
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setLagNode(Integer lagNode){
		this.lagNode = lagNode;
	} 
    /**
     * @getAlertNode:预警节点的get方法
     * @return alertNode
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Integer getAlertNode(){
        return this.alertNode;
    }
    /**
     * @setAlertNode:预警节点的set方法
     * @param alertNode alertNode
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setAlertNode(Integer alertNode){
		this.alertNode = alertNode;
	} 
    /**
     * @getNormalCompletionNode:正常完成节点的get方法
     * @return normalCompletionNode
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Integer getNormalCompletionNode(){
        return this.normalCompletionNode;
    }
    /**
     * @setNormalCompletionNode:正常完成节点的set方法
     * @param normalCompletionNode normalCompletionNode
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setNormalCompletionNode(Integer normalCompletionNode){
		this.normalCompletionNode = normalCompletionNode;
	} 
    /**
     * @getTotalCompletionNode:合计完成节点的get方法
     * @return totalCompletionNode
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Integer getTotalCompletionNode(){
        return this.totalCompletionNode;
    }
    /**
     * @setTotalCompletionNode:合计完成节点的set方法
     * @param totalCompletionNode totalCompletionNode
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setTotalCompletionNode(Integer totalCompletionNode){
		this.totalCompletionNode = totalCompletionNode;
	} 
    /**
     * @getRelatedPerson:关联人员的get方法
     * @return relatedPerson
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getRelatedPerson(){
        return this.relatedPerson;
    }
    /**
     * @setRelatedPerson:关联人员的set方法
     * @param relatedPerson relatedPerson
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setRelatedPerson(String relatedPerson){
		this.relatedPerson = relatedPerson;
	} 
    /**
     * @getProjectSignificance:项目意义的get方法
     * @return projectSignificance
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getProjectSignificance(){
        return this.projectSignificance;
    }
    /**
     * @setProjectSignificance:项目意义的set方法
     * @param projectSignificance projectSignificance
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setProjectSignificance(String projectSignificance){
		this.projectSignificance = projectSignificance;
	} 
    /**
     * @getOverDeadline:超期遗留的get方法
     * @return overDeadline
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getOverDeadline(){
        return this.overDeadline;
    }
    /**
     * @setOverDeadline:超期遗留的set方法
     * @param overDeadline overDeadline
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setOverDeadline(String overDeadline){
		this.overDeadline = overDeadline;
	} 
    /**
     * @getAttachment:附件的get方法
     * @return attachment
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getAttachment(){
        return this.attachment;
    }
    /**
     * @setAttachment:附件的set方法
     * @param attachment attachment
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setAttachment(String attachment){
		this.attachment = attachment;
	} 
    /**
     * @get_status:状态的get方法
     * @return _status
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String get_status(){
        return this._status;
    }
    /**
     * @set_status:状态的set方法
     * @param _status _status
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void set_status(String _status){
		this._status = _status;
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
     * @getCompletionTime:计划完成时间的get方法
     * @return completionTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Timestamp getCompletionTime(){
        return this.completionTime;
    }
    /**
     * @setCompletionTime:计划完成时间的set方法
     * @param completionTime completionTime
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setCompletionTime(Timestamp completionTime){
		this.completionTime = completionTime;
	} 
    /**
     * @getProjectAttention:是否是关注项目的get方法
     * @return projectAttention
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Integer getProjectAttention(){
        return this.projectAttention;
    }
    /**
     * @setProjectAttention:是否是关注项目的set方法
     * @param projectAttention projectAttention
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setProjectAttention(Integer projectAttention){
		this.projectAttention = projectAttention;
	} 
    /**
     * @getCompleteRate:完成率的get方法
     * @return completeRate
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Double getCompleteRate(){
        return this.completeRate;
    }
    /**
     * @setCompleteRate:完成率的set方法
     * @param completeRate completeRate
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setCompleteRate(Double completeRate){
		this.completeRate = completeRate;
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
		
        if (obj == null || !(obj instanceof ProjectDetail))
	        return false; 
	        
		if (getClass() != obj.getClass())
			return false;
		
		ProjectDetail other = (ProjectDetail) obj;
		
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
		if (projectCode == null) {
			if (other.projectCode != null) {
				return false;
			}
		} else if (!projectCode.equals(other.projectCode)) {
			return false;
		}
		if (constructionUnit == null) {
			if (other.constructionUnit != null) {
				return false;
			}
		} else if (!constructionUnit.equals(other.constructionUnit)) {
			return false;
		}
		if (voltageLevel == null) {
			if (other.voltageLevel != null) {
				return false;
			}
		} else if (!voltageLevel.equals(other.voltageLevel)) {
			return false;
		}
		if (projectDepartment == null) {
			if (other.projectDepartment != null) {
				return false;
			}
		} else if (!projectDepartment.equals(other.projectDepartment)) {
			return false;
		}
		if (workSituation == null) {
			if (other.workSituation != null) {
				return false;
			}
		} else if (!workSituation.equals(other.workSituation)) {
			return false;
		}
		if (allNodes == null) {
			if (other.allNodes != null) {
				return false;
			}
		} else if (!allNodes.equals(other.allNodes)) {
			return false;
		}
		if (advancedNode == null) {
			if (other.advancedNode != null) {
				return false;
			}
		} else if (!advancedNode.equals(other.advancedNode)) {
			return false;
		}
		if (lagNode == null) {
			if (other.lagNode != null) {
				return false;
			}
		} else if (!lagNode.equals(other.lagNode)) {
			return false;
		}
		if (alertNode == null) {
			if (other.alertNode != null) {
				return false;
			}
		} else if (!alertNode.equals(other.alertNode)) {
			return false;
		}
		if (normalCompletionNode == null) {
			if (other.normalCompletionNode != null) {
				return false;
			}
		} else if (!normalCompletionNode.equals(other.normalCompletionNode)) {
			return false;
		}
		if (totalCompletionNode == null) {
			if (other.totalCompletionNode != null) {
				return false;
			}
		} else if (!totalCompletionNode.equals(other.totalCompletionNode)) {
			return false;
		}
		if (relatedPerson == null) {
			if (other.relatedPerson != null) {
				return false;
			}
		} else if (!relatedPerson.equals(other.relatedPerson)) {
			return false;
		}
		if (projectSignificance == null) {
			if (other.projectSignificance != null) {
				return false;
			}
		} else if (!projectSignificance.equals(other.projectSignificance)) {
			return false;
		}
		if (overDeadline == null) {
			if (other.overDeadline != null) {
				return false;
			}
		} else if (!overDeadline.equals(other.overDeadline)) {
			return false;
		}
		if (attachment == null) {
			if (other.attachment != null) {
				return false;
			}
		} else if (!attachment.equals(other.attachment)) {
			return false;
		}
		if (_status == null) {
			if (other._status != null) {
				return false;
			}
		} else if (!_status.equals(other._status)) {
			return false;
		}
		if (createTime == null) {
			if (other.createTime != null) {
				return false;
			}
		} else if (!createTime.equals(other.createTime)) {
			return false;
		}
		if (completionTime == null) {
			if (other.completionTime != null) {
				return false;
			}
		} else if (!completionTime.equals(other.completionTime)) {
			return false;
		}
		if (projectAttention == null) {
			if (other.projectAttention != null) {
				return false;
			}
		} else if (!projectAttention.equals(other.projectAttention)) {
			return false;
		}
		if (completeRate == null) {
			if (other.completeRate != null) {
				return false;
			}
		} else if (!completeRate.equals(other.completeRate)) {
			return false;
		}
		return true;
	}
    
    /**
     * toString方法
     * @return String
     */
	public String toString(){
		return "ProjectDetail ["
			+ ", id=" + id
			+ ", projectName=" + projectName
			+ ", projectCode=" + projectCode
			+ ", constructionUnit=" + constructionUnit
			+ ", voltageLevel=" + voltageLevel
			+ ", projectDepartment=" + projectDepartment
			+ ", workSituation=" + workSituation
			+ ", allNodes=" + allNodes
			+ ", advancedNode=" + advancedNode
			+ ", lagNode=" + lagNode
			+ ", alertNode=" + alertNode
			+ ", normalCompletionNode=" + normalCompletionNode
			+ ", totalCompletionNode=" + totalCompletionNode
			+ ", relatedPerson=" + relatedPerson
			+ ", projectSignificance=" + projectSignificance
			+ ", overDeadline=" + overDeadline
			+ ", attachment=" + attachment
			+ ", _status=" + _status
			+ ", createTime=" + createTime
			+ ", completionTime=" + completionTime
			+ ", projectAttention=" + projectAttention
			+ ", completeRate=" + completeRate;
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