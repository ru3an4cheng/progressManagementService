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
 * MaterialArrivalManagement的VO类
 *
 * @author ru3an 
 */
public class MaterialArrivalManagementVO extends ParentVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
    /** 
     * 属性主键
     */  
    @ViewAttribute(name ="id",caption="主键", editor=EditorType.NumberEditor,nullable =false,readOnly=false, type=AttributeType.LONG)
    private Long id;    
    /** 
     * 属性工程名称
     */  
    @ViewAttribute(name ="projectName",caption="工程名称", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String projectName;    
    /** 
     * 属性工程id
     */  
    @ViewAttribute(name ="projectId",caption="工程id", editor=EditorType.NumberEditor,nullable =true,readOnly=false, type=AttributeType.INTEGER)
    private Integer projectId;    
    /** 
     * 属性物资名称
     */  
    @ViewAttribute(name ="suppliesName",caption="物资名称", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String suppliesName;    
    /** 
     * 属性物资状态
     */  
    @ViewAttribute(name ="_status",caption="物资状态", editor=EditorType.NumberEditor,nullable =true,readOnly=false, type=AttributeType.INTEGER)
    private Integer _status;    
    /** 
     * 属性厂家
     */  
    @ViewAttribute(name ="manufacturer",caption="厂家", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String manufacturer;    
    /** 
     * 属性联系人
     */  
    @ViewAttribute(name ="contactPerson",caption="联系人", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String contactPerson;    
    /** 
     * 属性计划到货时间
     */  
    @ViewAttribute(name ="plannedArrivalTime",caption="计划到货时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp plannedArrivalTime;    
    /** 
     * 属性创建时间
     */  
    @ViewAttribute(name ="createTime",caption="创建时间", editor=EditorType.DateTimeEditor,nullable =true,readOnly=false, type=AttributeType.TIMESTAMP)
    private Timestamp createTime;    
    /**
     * MaterialArrivalManagementVO构造函数
     */
    public MaterialArrivalManagementVO() {
        super();
    } 
   
	 /**
     * MaterialArrivalManagementVO完整的构造函数
     */  
    public MaterialArrivalManagementVO(Long id){
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
     * 工程id的get方法
     * @return projectId
     */
    public Integer getProjectId(){
        return projectId;
    }
    /**
     * 工程id的set方法
     * @param projectId
     */
    public void setProjectId(Integer projectId){
		this.projectId = projectId;
	} 
    /**
     * 物资名称的get方法
     * @return suppliesName
     */
    public String getSuppliesName(){
        return suppliesName;
    }
    /**
     * 物资名称的set方法
     * @param suppliesName
     */
    public void setSuppliesName(String suppliesName){
		this.suppliesName = suppliesName;
	} 
    /**
     * 物资状态的get方法
     * @return _status
     */
    public Integer get_status(){
        return _status;
    }
    /**
     * 物资状态的set方法
     * @param _status
     */
    public void set_status(Integer _status){
		this._status = _status;
	} 
    /**
     * 厂家的get方法
     * @return manufacturer
     */
    public String getManufacturer(){
        return manufacturer;
    }
    /**
     * 厂家的set方法
     * @param manufacturer
     */
    public void setManufacturer(String manufacturer){
		this.manufacturer = manufacturer;
	} 
    /**
     * 联系人的get方法
     * @return contactPerson
     */
    public String getContactPerson(){
        return contactPerson;
    }
    /**
     * 联系人的set方法
     * @param contactPerson
     */
    public void setContactPerson(String contactPerson){
		this.contactPerson = contactPerson;
	} 
    /**
     * 计划到货时间的get方法
     * @return plannedArrivalTime
     */
    public Timestamp getPlannedArrivalTime(){
        return plannedArrivalTime;
    }
    /**
     * 计划到货时间的set方法
     * @param plannedArrivalTime
     */
    public void setPlannedArrivalTime(Timestamp plannedArrivalTime){
		this.plannedArrivalTime = plannedArrivalTime;
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
				.append("SUPPLIES_NAME"+":"+getSuppliesName())
				.append("STATUS"+":"+get_status())
				.append("MANUFACTURER"+":"+getManufacturer())
				.append("CONTACT_PERSON"+":"+getContactPerson())
				.append("PLANNED_ARRIVAL_TIME"+":"+getPlannedArrivalTime())
				.append("CREATE_TIME"+":"+getCreateTime())
		        .toString(); 
			
    } 
   


}
