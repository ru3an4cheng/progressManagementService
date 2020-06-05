package com.progress.progress.vo;

import com.progress.progress.domain.TeamSubitem;
/**
 * <b>概述</b>：TeamSubitemTransfer类<br>
 * TODO
 * <p>
 * <b>功能</b>：<br>
 * TODO
 *
 * @author ru3an
 */
public class TeamSubitemTransfer {
	
	private TeamSubitemTransfer(){}

	/**
	 * @toPO:vo转为po
	 * @param vo vo对象
	 * @return TeamSubitem TeamSubitem对象
	 * @date 2020-06-05 11:23:23
	 * @author ru3an
	 */
	public static TeamSubitem toPO(TeamSubitemVO vo) {
		TeamSubitem teamSubitem = new TeamSubitem();
		if(vo != null){
			teamSubitem.setId(vo.getId());
			teamSubitem.setTeamName(vo.getTeamName());
			teamSubitem.setTeamId(vo.getTeamId());
			teamSubitem.setSubitemName(vo.getSubitemName());
			teamSubitem.setSubitemId(vo.getSubitemId());
			teamSubitem.setCreateTime(vo.getCreateTime());
        }
		return teamSubitem;
	}
	/**
	 * @toVO:po转为vo
	 * @param po po对象
	 * @return TeamSubitemVO TeamSubitemVO对象
	 * @date 2020-06-05 11:23:23
	 * @author ru3an
	 */
	public static TeamSubitemVO toVO(TeamSubitem po) {
		TeamSubitemVO vo = new TeamSubitemVO();
		vo.setId(po.getId());
		vo.setTeamName(po.getTeamName());
		vo.setTeamId(po.getTeamId());
		vo.setSubitemName(po.getSubitemName());
		vo.setSubitemId(po.getSubitemId());
		vo.setCreateTime(po.getCreateTime());
		return vo;
	}
}
