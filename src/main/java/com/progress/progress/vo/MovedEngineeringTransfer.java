package com.progress.progress.vo;

import com.progress.progress.domain.MovedEngineering;
/**
 * <b>概述</b>：MovedEngineeringTransfer类<br>
 * TODO
 * <p>
 * <b>功能</b>：<br>
 * TODO
 *
 * @author ru3an
 */
public class MovedEngineeringTransfer {
	
	private MovedEngineeringTransfer(){}

	/**
	 * @toPO:vo转为po
	 * @param vo vo对象
	 * @return MovedEngineering MovedEngineering对象
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public static MovedEngineering toPO(MovedEngineeringVO vo) {
		MovedEngineering movedEngineering = new MovedEngineering();
		if(vo != null){
			movedEngineering.setId(vo.getId());
			movedEngineering.setOperationsManagementUnit(vo.getOperationsManagementUnit());
			movedEngineering.setExternalUnit(vo.getExternalUnit());
			movedEngineering.setProjectName(vo.getProjectName());
			movedEngineering.setComeLetterTime(vo.getComeLetterTime());
			movedEngineering.setRepeatLetterTime(vo.getRepeatLetterTime());
			movedEngineering.setReviewCommentsTime(vo.getReviewCommentsTime());
			movedEngineering.setChangeAgreementTime(vo.getChangeAgreementTime());
			movedEngineering.setBiddingCompleteTime(vo.getBiddingCompleteTime());
			movedEngineering.setDesignerUnit(vo.getDesignerUnit());
			movedEngineering.setConstructionUnit(vo.getConstructionUnit());
			movedEngineering.setSupervisionUnit(vo.getSupervisionUnit());
			movedEngineering.setProvincialCompanyApproval(vo.getProvincialCompanyApproval());
			movedEngineering.setConstructionPlanSchedule(vo.getConstructionPlanSchedule());
			movedEngineering.setMajorProjectScale(vo.getMajorProjectScale());
			movedEngineering.setConstructionProgress(vo.getConstructionProgress());
			movedEngineering.setSecurityRegulatoryUnit(vo.getSecurityRegulatoryUnit());
			movedEngineering.setCompletionTime(vo.getCompletionTime());
			movedEngineering.setOther(vo.getOther());
        }
		return movedEngineering;
	}
	/**
	 * @toVO:po转为vo
	 * @param po po对象
	 * @return MovedEngineeringVO MovedEngineeringVO对象
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public static MovedEngineeringVO toVO(MovedEngineering po) {
		MovedEngineeringVO vo = new MovedEngineeringVO();
		vo.setId(po.getId());
		vo.setOperationsManagementUnit(po.getOperationsManagementUnit());
		vo.setExternalUnit(po.getExternalUnit());
		vo.setProjectName(po.getProjectName());
		vo.setComeLetterTime(po.getComeLetterTime());
		vo.setRepeatLetterTime(po.getRepeatLetterTime());
		vo.setReviewCommentsTime(po.getReviewCommentsTime());
		vo.setChangeAgreementTime(po.getChangeAgreementTime());
		vo.setBiddingCompleteTime(po.getBiddingCompleteTime());
		vo.setDesignerUnit(po.getDesignerUnit());
		vo.setConstructionUnit(po.getConstructionUnit());
		vo.setSupervisionUnit(po.getSupervisionUnit());
		vo.setProvincialCompanyApproval(po.getProvincialCompanyApproval());
		vo.setConstructionPlanSchedule(po.getConstructionPlanSchedule());
		vo.setMajorProjectScale(po.getMajorProjectScale());
		vo.setConstructionProgress(po.getConstructionProgress());
		vo.setSecurityRegulatoryUnit(po.getSecurityRegulatoryUnit());
		vo.setCompletionTime(po.getCompletionTime());
		vo.setOther(po.getOther());
		return vo;
	}
}
