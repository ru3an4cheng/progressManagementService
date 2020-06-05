package com.progress.progress.vo;

import com.progress.progress.domain.ConstructionTeam;
/**
 * <b>概述</b>：ConstructionTeamTransfer类<br>
 * TODO
 * <p>
 * <b>功能</b>：<br>
 * TODO
 *
 * @author ru3an
 */
public class ConstructionTeamTransfer {
	
	private ConstructionTeamTransfer(){}

	/**
	 * @toPO:vo转为po
	 * @param vo vo对象
	 * @return ConstructionTeam ConstructionTeam对象
	 * @date 2020-06-05 11:23:23
	 * @author ru3an
	 */
	public static ConstructionTeam toPO(ConstructionTeamVO vo) {
		ConstructionTeam constructionTeam = new ConstructionTeam();
		if(vo != null){
			constructionTeam.setId(vo.getId());
			constructionTeam.setCompanyName(vo.getCompanyName());
			constructionTeam.setCompanyId(vo.getCompanyId());
			constructionTeam.setTeamName(vo.getTeamName());
			constructionTeam.setTeamWokers(vo.getTeamWokers());
			constructionTeam.setPrincipal(vo.getPrincipal());
			constructionTeam.setProjectName(vo.getProjectName());
			constructionTeam.setCreateTime(vo.getCreateTime());
        }
		return constructionTeam;
	}
	/**
	 * @toVO:po转为vo
	 * @param po po对象
	 * @return ConstructionTeamVO ConstructionTeamVO对象
	 * @date 2020-06-05 11:23:23
	 * @author ru3an
	 */
	public static ConstructionTeamVO toVO(ConstructionTeam po) {
		ConstructionTeamVO vo = new ConstructionTeamVO();
		vo.setId(po.getId());
		vo.setCompanyName(po.getCompanyName());
		vo.setCompanyId(po.getCompanyId());
		vo.setTeamName(po.getTeamName());
		vo.setTeamWokers(po.getTeamWokers());
		vo.setPrincipal(po.getPrincipal());
		vo.setProjectName(po.getProjectName());
		vo.setCreateTime(po.getCreateTime());
		return vo;
	}
}
