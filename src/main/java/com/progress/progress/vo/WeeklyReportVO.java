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
 * WeeklyReport的VO类
 *
 * @author ru3an 
 */
public class WeeklyReportVO extends ParentVO implements Serializable{

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
     * 属性本周工作内容
     */  
    @ViewAttribute(name ="thisWeekWork",caption="本周工作内容", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String thisWeekWork;    
    /** 
     * 属性下周工作内容
     */  
    @ViewAttribute(name ="nextWeekWork",caption="下周工作内容", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String nextWeekWork;    
    /** 
     * 属性作业人员
     */  
    @ViewAttribute(name ="workers",caption="作业人员", editor=EditorType.NumberEditor,nullable =true,readOnly=false, type=AttributeType.INTEGER)
    private Integer workers;    
    /** 
     * 属性日期
     */  
    @ViewAttribute(name ="_time",caption="日期", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp _time;    
    /** 
     * 属性基本概况
     */  
    @ViewAttribute(name ="situation",caption="基本概况", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String situation;    
    /** 
     * 属性创建时间
     */  
    @ViewAttribute(name ="createTime",caption="创建时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp createTime;    
    /**
     * WeeklyReportVO构造函数
     */
    public WeeklyReportVO() {
        super();
    } 
   
	 /**
     * WeeklyReportVO完整的构造函数
     */  
    public WeeklyReportVO(Long id){
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
     * 本周工作内容的get方法
     * @return thisWeekWork
     */
    public String getThisWeekWork(){
        return thisWeekWork;
    }
    /**
     * 本周工作内容的set方法
     * @param thisWeekWork
     */
    public void setThisWeekWork(String thisWeekWork){
		this.thisWeekWork = thisWeekWork;
	} 
    /**
     * 下周工作内容的get方法
     * @return nextWeekWork
     */
    public String getNextWeekWork(){
        return nextWeekWork;
    }
    /**
     * 下周工作内容的set方法
     * @param nextWeekWork
     */
    public void setNextWeekWork(String nextWeekWork){
		this.nextWeekWork = nextWeekWork;
	} 
    /**
     * 作业人员的get方法
     * @return workers
     */
    public Integer getWorkers(){
        return workers;
    }
    /**
     * 作业人员的set方法
     * @param workers
     */
    public void setWorkers(Integer workers){
		this.workers = workers;
	} 
    /**
     * 日期的get方法
     * @return _time
     */
    public Timestamp get_time(){
        return _time;
    }
    /**
     * 日期的set方法
     * @param _time
     */
    public void set_time(Timestamp _time){
		this._time = _time;
	} 
    /**
     * 基本概况的get方法
     * @return situation
     */
    public String getSituation(){
        return situation;
    }
    /**
     * 基本概况的set方法
     * @param situation
     */
    public void setSituation(String situation){
		this.situation = situation;
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
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
	  			.append("ID"+":"+getId())
				.append("PROJECT_NAME"+":"+getProjectName())
				.append("PROJECT_ID"+":"+getProjectId())
				.append("THIS_WEEK_WORK"+":"+getThisWeekWork())
				.append("NEXT_WEEK_WORK"+":"+getNextWeekWork())
				.append("WORKERS"+":"+getWorkers())
				.append("TIME"+":"+get_time())
				.append("SITUATION"+":"+getSituation())
				.append("CREATE_TIME"+":"+getCreateTime())
		        .toString(); 
			
    } 
   


}
