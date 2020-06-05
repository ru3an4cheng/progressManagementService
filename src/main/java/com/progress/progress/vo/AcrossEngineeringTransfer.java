package com.progress.progress.vo;

import com.progress.progress.domain.AcrossEngineering;
/**
 * <b>概述</b>：AcrossEngineeringTransfer类<br>
 * TODO
 * <p>
 * <b>功能</b>：<br>
 * TODO
 *
 * @author ru3an
 */
public class AcrossEngineeringTransfer {
	
	private AcrossEngineeringTransfer(){}

	/**
	 * @toPO:vo转为po
	 * @param vo vo对象
	 * @return AcrossEngineering AcrossEngineering对象
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public static AcrossEngineering toPO(AcrossEngineeringVO vo) {
		AcrossEngineering acrossEngineering = new AcrossEngineering();
		if(vo != null){
			acrossEngineering.setId(vo.getId());
			acrossEngineering.setConstructionManagementUnit(vo.getConstructionManagementUnit());
			acrossEngineering.setVoltageLevel(vo.getVoltageLevel());
			acrossEngineering.setProjectName(vo.getProjectName());
			acrossEngineering.setStartTime(vo.getStartTime());
			acrossEngineering.setProductionTime(vo.getProductionTime());
			acrossEngineering.setPlannedConstructionMonth(vo.getPlannedConstructionMonth());
			acrossEngineering.setComeLetterTime(vo.getComeLetterTime());
			acrossEngineering.setPassReviewActualTime(vo.getPassReviewActualTime());
			acrossEngineering.setPassReviewTheoryTime(vo.getPassReviewTheoryTime());
			acrossEngineering.setPlanStartTime(vo.getPlanStartTime());
			acrossEngineering.setConstructionUnit(vo.getConstructionUnit());
			acrossEngineering.setRemark(vo.getRemark());
        }
		return acrossEngineering;
	}
	/**
	 * @toVO:po转为vo
	 * @param po po对象
	 * @return AcrossEngineeringVO AcrossEngineeringVO对象
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public static AcrossEngineeringVO toVO(AcrossEngineering po) {
		AcrossEngineeringVO vo = new AcrossEngineeringVO();
		vo.setId(po.getId());
		vo.setConstructionManagementUnit(po.getConstructionManagementUnit());
		vo.setVoltageLevel(po.getVoltageLevel());
		vo.setProjectName(po.getProjectName());
		vo.setStartTime(po.getStartTime());
		vo.setProductionTime(po.getProductionTime());
		vo.setPlannedConstructionMonth(po.getPlannedConstructionMonth());
		vo.setComeLetterTime(po.getComeLetterTime());
		vo.setPassReviewActualTime(po.getPassReviewActualTime());
		vo.setPassReviewTheoryTime(po.getPassReviewTheoryTime());
		vo.setPlanStartTime(po.getPlanStartTime());
		vo.setConstructionUnit(po.getConstructionUnit());
		vo.setRemark(po.getRemark());
		return vo;
	}
}
