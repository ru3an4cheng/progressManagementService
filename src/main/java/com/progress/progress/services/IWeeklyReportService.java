package com.progress.progress.services;

import java.util.Map;

import com.progress.progress.domain.WeeklyReport;
import com.sgcc.uap.rest.support.IDRequestObject;
import com.sgcc.uap.rest.support.QueryResultObject;
import com.sgcc.uap.rest.support.RequestCondition;

/**
 * <b>概述</b>：<br>
 *	TODO
 * <p>
 * <b>功能</b>：<br>
 *	TODO
 *
 * @author ru3an
 */
public interface IWeeklyReportService {

	/**
	 * @getWeeklyReportById:根据主键 查询
	 * @param queryCondition 查询条件
	 * @return QueryResultObject 查询结果
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public QueryResultObject getWeeklyReportById(String id);
	/**
	 * @remove:根据idObject删除
	 * @param idObject 主键id
	 * @return void
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public void remove(IDRequestObject idObject);
	/**
	 * @save:保存或更新
	 * @param map 保存或更新的数据
	 * @return WeeklyReport WeeklyReport对象
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public WeeklyReport saveWeeklyReport(Map<String,Object> map) throws Exception;
	/**
	 * @query:根据查询条件 查询
	 * @param queryCondition 查询条件
	 * @return QueryResultObject 查询结果
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public QueryResultObject query(RequestCondition queryCondition);



}
