package com.progress.progress.vo;

import com.progress.progress.domain.ConstructionCompany;
/**
 * <b>概述</b>：ConstructionCompanyTransfer类<br>
 * TODO
 * <p>
 * <b>功能</b>：<br>
 * TODO
 *
 * @author ru3an
 */
public class ConstructionCompanyTransfer {
	
	private ConstructionCompanyTransfer(){}

	/**
	 * @toPO:vo转为po
	 * @param vo vo对象
	 * @return ConstructionCompany ConstructionCompany对象
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public static ConstructionCompany toPO(ConstructionCompanyVO vo) {
		ConstructionCompany constructionCompany = new ConstructionCompany();
		if(vo != null){
			constructionCompany.setId(vo.getId());
			constructionCompany.setName(vo.getName());
			constructionCompany.setPrincipal(vo.getPrincipal());
			constructionCompany.setWokers(vo.getWokers());
			constructionCompany.setCreateTime(vo.getCreateTime());
        }
		return constructionCompany;
	}
	/**
	 * @toVO:po转为vo
	 * @param po po对象
	 * @return ConstructionCompanyVO ConstructionCompanyVO对象
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public static ConstructionCompanyVO toVO(ConstructionCompany po) {
		ConstructionCompanyVO vo = new ConstructionCompanyVO();
		vo.setId(po.getId());
		vo.setName(po.getName());
		vo.setPrincipal(po.getPrincipal());
		vo.setWokers(po.getWokers());
		vo.setCreateTime(po.getCreateTime());
		return vo;
	}
}
