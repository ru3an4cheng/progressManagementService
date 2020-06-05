package com.progress.progress.vo;

import com.progress.progress.domain.Subitem;
/**
 * <b>概述</b>：SubitemTransfer类<br>
 * TODO
 * <p>
 * <b>功能</b>：<br>
 * TODO
 *
 * @author ru3an
 */
public class SubitemTransfer {
	
	private SubitemTransfer(){}

	/**
	 * @toPO:vo转为po
	 * @param vo vo对象
	 * @return Subitem Subitem对象
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public static Subitem toPO(SubitemVO vo) {
		Subitem subitem = new Subitem();
		if(vo != null){
			subitem.setId(vo.getId());
			subitem.setName(vo.getName());
			subitem.setCreatePerson(vo.getCreatePerson());
			subitem.setCreateTime(vo.getCreateTime());
			subitem.setPhase(vo.getPhase());
			subitem.setNodeLevel(vo.getNodeLevel());
			subitem.setParentId(vo.getParentId());
			subitem.set_status(vo.get_status());
        }
		return subitem;
	}
	/**
	 * @toVO:po转为vo
	 * @param po po对象
	 * @return SubitemVO SubitemVO对象
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public static SubitemVO toVO(Subitem po) {
		SubitemVO vo = new SubitemVO();
		vo.setId(po.getId());
		vo.setName(po.getName());
		vo.setCreatePerson(po.getCreatePerson());
		vo.setCreateTime(po.getCreateTime());
		vo.setPhase(po.getPhase());
		vo.setNodeLevel(po.getNodeLevel());
		vo.setParentId(po.getParentId());
		vo.set_status(po.get_status());
		return vo;
	}
}
