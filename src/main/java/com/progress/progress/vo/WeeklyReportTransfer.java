package com.progress.progress.vo;

import com.progress.progress.domain.WeeklyReport;
/**
 * <b>概述</b>：WeeklyReportTransfer类<br>
 * TODO
 * <p>
 * <b>功能</b>：<br>
 * TODO
 *
 * @author ru3an
 */
public class WeeklyReportTransfer {
	
	private WeeklyReportTransfer(){}

	/**
	 * @toPO:vo转为po
	 * @param vo vo对象
	 * @return WeeklyReport WeeklyReport对象
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public static WeeklyReport toPO(WeeklyReportVO vo) {
		WeeklyReport weeklyReport = new WeeklyReport();
		if(vo != null){
			weeklyReport.setId(vo.getId());
			weeklyReport.setProjectName(vo.getProjectName());
			weeklyReport.setProjectId(vo.getProjectId());
			weeklyReport.setThisWeekWork(vo.getThisWeekWork());
			weeklyReport.setNextWeekWork(vo.getNextWeekWork());
			weeklyReport.setWorkers(vo.getWorkers());
			weeklyReport.set_time(vo.get_time());
			weeklyReport.setSituation(vo.getSituation());
			weeklyReport.setCreateTime(vo.getCreateTime());
        }
		return weeklyReport;
	}
	/**
	 * @toVO:po转为vo
	 * @param po po对象
	 * @return WeeklyReportVO WeeklyReportVO对象
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public static WeeklyReportVO toVO(WeeklyReport po) {
		WeeklyReportVO vo = new WeeklyReportVO();
		vo.setId(po.getId());
		vo.setProjectName(po.getProjectName());
		vo.setProjectId(po.getProjectId());
		vo.setThisWeekWork(po.getThisWeekWork());
		vo.setNextWeekWork(po.getNextWeekWork());
		vo.setWorkers(po.getWorkers());
		vo.set_time(po.get_time());
		vo.setSituation(po.getSituation());
		vo.setCreateTime(po.getCreateTime());
		return vo;
	}
}
