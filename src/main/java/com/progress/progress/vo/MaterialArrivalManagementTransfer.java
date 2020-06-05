package com.progress.progress.vo;

import com.progress.progress.domain.MaterialArrivalManagement;
/**
 * <b>概述</b>：MaterialArrivalManagementTransfer类<br>
 * TODO
 * <p>
 * <b>功能</b>：<br>
 * TODO
 *
 * @author ru3an
 */
public class MaterialArrivalManagementTransfer {
	
	private MaterialArrivalManagementTransfer(){}

	/**
	 * @toPO:vo转为po
	 * @param vo vo对象
	 * @return MaterialArrivalManagement MaterialArrivalManagement对象
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public static MaterialArrivalManagement toPO(MaterialArrivalManagementVO vo) {
		MaterialArrivalManagement materialArrivalManagement = new MaterialArrivalManagement();
		if(vo != null){
			materialArrivalManagement.setId(vo.getId());
			materialArrivalManagement.setProjectName(vo.getProjectName());
			materialArrivalManagement.setProjectId(vo.getProjectId());
			materialArrivalManagement.setSuppliesName(vo.getSuppliesName());
			materialArrivalManagement.set_status(vo.get_status());
			materialArrivalManagement.setManufacturer(vo.getManufacturer());
			materialArrivalManagement.setContactPerson(vo.getContactPerson());
			materialArrivalManagement.setPlannedArrivalTime(vo.getPlannedArrivalTime());
			materialArrivalManagement.setCreateTime(vo.getCreateTime());
        }
		return materialArrivalManagement;
	}
	/**
	 * @toVO:po转为vo
	 * @param po po对象
	 * @return MaterialArrivalManagementVO MaterialArrivalManagementVO对象
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public static MaterialArrivalManagementVO toVO(MaterialArrivalManagement po) {
		MaterialArrivalManagementVO vo = new MaterialArrivalManagementVO();
		vo.setId(po.getId());
		vo.setProjectName(po.getProjectName());
		vo.setProjectId(po.getProjectId());
		vo.setSuppliesName(po.getSuppliesName());
		vo.set_status(po.get_status());
		vo.setManufacturer(po.getManufacturer());
		vo.setContactPerson(po.getContactPerson());
		vo.setPlannedArrivalTime(po.getPlannedArrivalTime());
		vo.setCreateTime(po.getCreateTime());
		return vo;
	}
}
