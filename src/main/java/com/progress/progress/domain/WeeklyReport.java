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
 * WeeklyReport的POJO类
 * @author ru3an 
 */
@Entity
@Table(name = "weekly_report")
public class WeeklyReport implements Serializable {

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
     * 本周工作内容
     */
    @Column(name = "THIS_WEEK_WORK", nullable = true, length = 255)
    private String thisWeekWork ;
    
    /** 
     * 下周工作内容
     */
    @Column(name = "NEXT_WEEK_WORK", nullable = true, length = 255)
    private String nextWeekWork ;
    
    /** 
     * 作业人员
     */
    @Column(name = "WORKERS", nullable = true, length = 10)
    private Integer workers ;
    
    /** 
     * 日期
     */
    @Column(name = "TIME", nullable = true, length = 19)
    private Timestamp _time ;
    
    /** 
     * 基本概况
     */
    @Column(name = "SITUATION", nullable = true, length = 255)
    private String situation ;
    
    /** 
     * 创建时间
     */
    @Column(name = "CREATE_TIME", nullable = true, length = 19)
    private Timestamp createTime ;
    
	/**
	  *虚拟主键
	  */
	@Transient
	private String mxVirtualId;
	
	public WeeklyReport(){
	
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
     * @getThisWeekWork:本周工作内容的get方法
     * @return thisWeekWork
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getThisWeekWork(){
        return this.thisWeekWork;
    }
    /**
     * @setThisWeekWork:本周工作内容的set方法
     * @param thisWeekWork thisWeekWork
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setThisWeekWork(String thisWeekWork){
		this.thisWeekWork = thisWeekWork;
	} 
    /**
     * @getNextWeekWork:下周工作内容的get方法
     * @return nextWeekWork
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getNextWeekWork(){
        return this.nextWeekWork;
    }
    /**
     * @setNextWeekWork:下周工作内容的set方法
     * @param nextWeekWork nextWeekWork
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setNextWeekWork(String nextWeekWork){
		this.nextWeekWork = nextWeekWork;
	} 
    /**
     * @getWorkers:作业人员的get方法
     * @return workers
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Integer getWorkers(){
        return this.workers;
    }
    /**
     * @setWorkers:作业人员的set方法
     * @param workers workers
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setWorkers(Integer workers){
		this.workers = workers;
	} 
    /**
     * @get_time:日期的get方法
     * @return _time
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Timestamp get_time(){
        return this._time;
    }
    /**
     * @set_time:日期的set方法
     * @param _time _time
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void set_time(Timestamp _time){
		this._time = _time;
	} 
    /**
     * @getSituation:基本概况的get方法
     * @return situation
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getSituation(){
        return this.situation;
    }
    /**
     * @setSituation:基本概况的set方法
     * @param situation situation
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setSituation(String situation){
		this.situation = situation;
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
		
        if (obj == null || !(obj instanceof WeeklyReport))
	        return false; 
	        
		if (getClass() != obj.getClass())
			return false;
		
		WeeklyReport other = (WeeklyReport) obj;
		
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
		if (thisWeekWork == null) {
			if (other.thisWeekWork != null) {
				return false;
			}
		} else if (!thisWeekWork.equals(other.thisWeekWork)) {
			return false;
		}
		if (nextWeekWork == null) {
			if (other.nextWeekWork != null) {
				return false;
			}
		} else if (!nextWeekWork.equals(other.nextWeekWork)) {
			return false;
		}
		if (workers == null) {
			if (other.workers != null) {
				return false;
			}
		} else if (!workers.equals(other.workers)) {
			return false;
		}
		if (_time == null) {
			if (other._time != null) {
				return false;
			}
		} else if (!_time.equals(other._time)) {
			return false;
		}
		if (situation == null) {
			if (other.situation != null) {
				return false;
			}
		} else if (!situation.equals(other.situation)) {
			return false;
		}
		if (createTime == null) {
			if (other.createTime != null) {
				return false;
			}
		} else if (!createTime.equals(other.createTime)) {
			return false;
		}
		return true;
	}
    
    /**
     * toString方法
     * @return String
     */
	public String toString(){
		return "WeeklyReport ["
			+ ", id=" + id
			+ ", projectName=" + projectName
			+ ", projectId=" + projectId
			+ ", thisWeekWork=" + thisWeekWork
			+ ", nextWeekWork=" + nextWeekWork
			+ ", workers=" + workers
			+ ", _time=" + _time
			+ ", situation=" + situation
			+ ", createTime=" + createTime;
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