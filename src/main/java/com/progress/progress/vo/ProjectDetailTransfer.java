package com.progress.progress.vo;

import com.progress.progress.domain.ProjectDetail;
/**
 * <b>概述</b>：ProjectDetailTransfer类<br>
 * TODO
 * <p>
 * <b>功能</b>：<br>
 * TODO
 *
 * @author ru3an
 */
public class ProjectDetailTransfer {
	
	private ProjectDetailTransfer(){}

	/**
	 * @toPO:vo转为po
	 * @param vo vo对象
	 * @return ProjectDetail ProjectDetail对象
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public static ProjectDetail toPO(ProjectDetailVO vo) {
		ProjectDetail projectDetail = new ProjectDetail();
		if(vo != null){
			projectDetail.setId(vo.getId());
			projectDetail.setProjectName(vo.getProjectName());
			projectDetail.setProjectCode(vo.getProjectCode());
			projectDetail.setConstructionUnit(vo.getConstructionUnit());
			projectDetail.setVoltageLevel(vo.getVoltageLevel());
			projectDetail.setProjectDepartment(vo.getProjectDepartment());
			projectDetail.setWorkSituation(vo.getWorkSituation());
			projectDetail.setAllNodes(vo.getAllNodes());
			projectDetail.setAdvancedNode(vo.getAdvancedNode());
			projectDetail.setLagNode(vo.getLagNode());
			projectDetail.setAlertNode(vo.getAlertNode());
			projectDetail.setNormalCompletionNode(vo.getNormalCompletionNode());
			projectDetail.setTotalCompletionNode(vo.getTotalCompletionNode());
			projectDetail.setRelatedPerson(vo.getRelatedPerson());
			projectDetail.setProjectSignificance(vo.getProjectSignificance());
			projectDetail.setOverDeadline(vo.getOverDeadline());
			projectDetail.setAttachment(vo.getAttachment());
			projectDetail.set_status(vo.get_status());
			projectDetail.setCreateTime(vo.getCreateTime());
			projectDetail.setCompletionTime(vo.getCompletionTime());
			projectDetail.setProjectAttention(vo.getProjectAttention());
			projectDetail.setCompleteRate(vo.getCompleteRate());
        }
		return projectDetail;
	}
	/**
	 * @toVO:po转为vo
	 * @param po po对象
	 * @return ProjectDetailVO ProjectDetailVO对象
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public static ProjectDetailVO toVO(ProjectDetail po) {
		ProjectDetailVO vo = new ProjectDetailVO();
		vo.setId(po.getId());
		vo.setProjectName(po.getProjectName());
		vo.setProjectCode(po.getProjectCode());
		vo.setConstructionUnit(po.getConstructionUnit());
		vo.setVoltageLevel(po.getVoltageLevel());
		vo.setProjectDepartment(po.getProjectDepartment());
		vo.setWorkSituation(po.getWorkSituation());
		vo.setAllNodes(po.getAllNodes());
		vo.setAdvancedNode(po.getAdvancedNode());
		vo.setLagNode(po.getLagNode());
		vo.setAlertNode(po.getAlertNode());
		vo.setNormalCompletionNode(po.getNormalCompletionNode());
		vo.setTotalCompletionNode(po.getTotalCompletionNode());
		vo.setRelatedPerson(po.getRelatedPerson());
		vo.setProjectSignificance(po.getProjectSignificance());
		vo.setOverDeadline(po.getOverDeadline());
		vo.setAttachment(po.getAttachment());
		vo.set_status(po.get_status());
		vo.setCreateTime(po.getCreateTime());
		vo.setCompletionTime(po.getCompletionTime());
		vo.setProjectAttention(po.getProjectAttention());
		vo.setCompleteRate(po.getCompleteRate());
		return vo;
	}
}
