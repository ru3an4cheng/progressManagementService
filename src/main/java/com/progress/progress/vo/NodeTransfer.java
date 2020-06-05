package com.progress.progress.vo;

import com.progress.progress.domain.Node;
/**
 * <b>概述</b>：NodeTransfer类<br>
 * TODO
 * <p>
 * <b>功能</b>：<br>
 * TODO
 *
 * @author ru3an
 */
public class NodeTransfer {
	
	private NodeTransfer(){}

	/**
	 * @toPO:vo转为po
	 * @param vo vo对象
	 * @return Node Node对象
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public static Node toPO(NodeVO vo) {
		Node node = new Node();
		if(vo != null){
			node.setId(vo.getId());
			node.setName(vo.getName());
			node.setCreatePerson(vo.getCreatePerson());
			node.setCreateTime(vo.getCreateTime());
			node.setPhase(vo.getPhase());
			node.set_status(vo.get_status());
        }
		return node;
	}
	/**
	 * @toVO:po转为vo
	 * @param po po对象
	 * @return NodeVO NodeVO对象
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public static NodeVO toVO(Node po) {
		NodeVO vo = new NodeVO();
		vo.setId(po.getId());
		vo.setName(po.getName());
		vo.setCreatePerson(po.getCreatePerson());
		vo.setCreateTime(po.getCreateTime());
		vo.setPhase(po.getPhase());
		vo.set_status(po.get_status());
		return vo;
	}
}
