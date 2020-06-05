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
 * Notification的POJO类
 * @author ru3an 
 */
@Entity
@Table(name = "notification")
public class Notification implements Serializable {

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
     * 周报标题
     */
    @Column(name = "TITLE", nullable = true, length = 255)
    private String title ;
    
    /** 
     * 周报日期
     */
    @Column(name = "DATE", nullable = true, length = 19)
    private Timestamp _date ;
    
	/**
	  *虚拟主键
	  */
	@Transient
	private String mxVirtualId;
	
	public Notification(){
	
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
     * @getTitle:周报标题的get方法
     * @return title
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public String getTitle(){
        return this.title;
    }
    /**
     * @setTitle:周报标题的set方法
     * @param title title
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void setTitle(String title){
		this.title = title;
	} 
    /**
     * @get_date:周报日期的get方法
     * @return _date
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public Timestamp get_date(){
        return this._date;
    }
    /**
     * @set_date:周报日期的set方法
     * @param _date _date
     * @date 2020-06-05 11:23:22
     * @author ru3an
     */
    public void set_date(Timestamp _date){
		this._date = _date;
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
		
        if (obj == null || !(obj instanceof Notification))
	        return false; 
	        
		if (getClass() != obj.getClass())
			return false;
		
		Notification other = (Notification) obj;
		
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		if (_date == null) {
			if (other._date != null) {
				return false;
			}
		} else if (!_date.equals(other._date)) {
			return false;
		}
		return true;
	}
    
    /**
     * toString方法
     * @return String
     */
	public String toString(){
		return "Notification ["
			+ ", id=" + id
			+ ", title=" + title
			+ ", _date=" + _date;
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