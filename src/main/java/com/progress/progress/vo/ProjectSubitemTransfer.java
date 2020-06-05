package com.progress.progress.vo;

import com.progress.progress.domain.ProjectSubitem;
/**
 * <b>概述</b>：ProjectSubitemTransfer类<br>
 * TODO
 * <p>
 * <b>功能</b>：<br>
 * TODO
 *
 * @author ru3an
 */
public class ProjectSubitemTransfer {
	
	private ProjectSubitemTransfer(){}

	/**
	 * @toPO:vo转为po
	 * @param vo vo对象
	 * @return ProjectSubitem ProjectSubitem对象
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public static ProjectSubitem toPO(ProjectSubitemVO vo) {
		ProjectSubitem projectSubitem = new ProjectSubitem();
		if(vo != null){
			projectSubitem.setId(vo.getId());
			projectSubitem.setProjectId(vo.getProjectId());
			projectSubitem.setProjectName(vo.getProjectName());
			projectSubitem.setName(vo.getName());
			projectSubitem.setCreatePerson(vo.getCreatePerson());
			projectSubitem.setCreateTime(vo.getCreateTime());
			projectSubitem.setPhase(vo.getPhase());
			projectSubitem.setNodeLevel(vo.getNodeLevel());
			projectSubitem.setParentId(vo.getParentId());
			projectSubitem.set_status(vo.get_status());
			projectSubitem.setDeadlineTime(vo.getDeadlineTime());
			projectSubitem.setIsFinished(vo.getIsFinished());
			projectSubitem.setWeight(vo.getWeight());
        }
		return projectSubitem;
	}
	/**
	 * @toVO:po转为vo
	 * @param po po对象
	 * @return ProjectSubitemVO ProjectSubitemVO对象
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public static ProjectSubitemVO toVO(ProjectSubitem po) {
		ProjectSubitemVO vo = new ProjectSubitemVO();
		vo.setId(po.getId());
		vo.setProjectId(po.getProjectId());
		vo.setProjectName(po.getProjectName());
		vo.setName(po.getName());
		vo.setCreatePerson(po.getCreatePerson());
		vo.setCreateTime(po.getCreateTime());
		vo.setPhase(po.getPhase());
		vo.setNodeLevel(po.getNodeLevel());
		vo.setParentId(po.getParentId());
		vo.set_status(po.get_status());
		vo.setDeadlineTime(po.getDeadlineTime());
		vo.setIsFinished(po.getIsFinished());
		vo.setWeight(po.getWeight());
		return vo;
	}
}
