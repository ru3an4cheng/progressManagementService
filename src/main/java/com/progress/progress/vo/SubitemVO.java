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
 * Subitem的VO类
 *
 * @author ru3an 
 */
public class SubitemVO extends ParentVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
    /** 
     * 属性主键
     */  
    @ViewAttribute(name ="id",caption="主键", editor=EditorType.NumberEditor,nullable =false,readOnly=false, type=AttributeType.LONG)
    private Long id;    
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
     * SubitemVO构造函数
     */
    public SubitemVO() {
        super();
    } 
   
	 /**
     * SubitemVO完整的构造函数
     */  
    public SubitemVO(Long id){
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
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
	  			.append("ID"+":"+getId())
				.append("NAME"+":"+getName())
				.append("CREATE_PERSON"+":"+getCreatePerson())
				.append("CREATE_TIME"+":"+getCreateTime())
				.append("PHASE"+":"+getPhase())
				.append("NODE_LEVEL"+":"+getNodeLevel())
				.append("PARENT_ID"+":"+getParentId())
				.append("STATUS"+":"+get_status())
		        .toString(); 
			
    } 
   


}
