package com.progress.progress.vo;

import com.progress.progress.domain.ProjectNodes;
/**
 * <b>概述</b>：ProjectNodesTransfer类<br>
 * TODO
 * <p>
 * <b>功能</b>：<br>
 * TODO
 *
 * @author ru3an
 */
public class ProjectNodesTransfer {
	
	private ProjectNodesTransfer(){}

	/**
	 * @toPO:vo转为po
	 * @param vo vo对象
	 * @return ProjectNodes ProjectNodes对象
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public static ProjectNodes toPO(ProjectNodesVO vo) {
		ProjectNodes projectNodes = new ProjectNodes();
		if(vo != null){
			projectNodes.setId(vo.getId());
			projectNodes.setProjectName(vo.getProjectName());
			projectNodes.setProjectId(vo.getProjectId());
			projectNodes.setProjectDepartment(vo.getProjectDepartment());
			projectNodes.setNodeName(vo.getNodeName());
			projectNodes.setPlanStartTime(vo.getPlanStartTime());
			projectNodes.setPlanEndTime(vo.getPlanEndTime());
			projectNodes.setActualStartTime(vo.getActualStartTime());
			projectNodes.setActualEndTime(vo.getActualEndTime());
			projectNodes.setIsFinished(vo.getIsFinished());
			projectNodes.set_status(vo.get_status());
			projectNodes.setFillTime(vo.getFillTime());
			projectNodes.setFillPerson(vo.getFillPerson());
			projectNodes.setRelatedPerson(vo.getRelatedPerson());
			projectNodes.setCreateTime(vo.getCreateTime());
			projectNodes.setWeight(vo.getWeight());
			projectNodes.setFileCode(vo.getFileCode());
			projectNodes.setFilePath(vo.getFilePath());
			projectNodes.setPrecondition(vo.getPrecondition());
			projectNodes.setValidTime(vo.getValidTime());
        }
		return projectNodes;
	}
	/**
	 * @toVO:po转为vo
	 * @param po po对象
	 * @return ProjectNodesVO ProjectNodesVO对象
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public static ProjectNodesVO toVO(ProjectNodes po) {
		ProjectNodesVO vo = new ProjectNodesVO();
		vo.setId(po.getId());
		vo.setProjectName(po.getProjectName());
		vo.setProjectId(po.getProjectId());
		vo.setProjectDepartment(po.getProjectDepartment());
		vo.setNodeName(po.getNodeName());
		vo.setPlanStartTime(po.getPlanStartTime());
		vo.setPlanEndTime(po.getPlanEndTime());
		vo.setActualStartTime(po.getActualStartTime());
		vo.setActualEndTime(po.getActualEndTime());
		vo.setIsFinished(po.getIsFinished());
		vo.set_status(po.get_status());
		vo.setFillTime(po.getFillTime());
		vo.setFillPerson(po.getFillPerson());
		vo.setRelatedPerson(po.getRelatedPerson());
		vo.setCreateTime(po.getCreateTime());
		vo.setWeight(po.getWeight());
		vo.setFileCode(po.getFileCode());
		vo.setFilePath(po.getFilePath());
		vo.setPrecondition(po.getPrecondition());
		vo.setValidTime(po.getValidTime());
		return vo;
	}
}
