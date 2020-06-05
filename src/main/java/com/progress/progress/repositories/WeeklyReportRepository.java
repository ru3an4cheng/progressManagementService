package com.progress.progress.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.progress.progress.domain.WeeklyReport;

/**
 * <b>概述</b>：<br>
 *	TODO
 * <p>
 * <b>功能</b>：<br>
 *	TODO
 *	
 * @author ru3an
 */
public interface WeeklyReportRepository extends JpaRepository<WeeklyReport,Long>,JpaSpecificationExecutor<WeeklyReport> {

	
}
