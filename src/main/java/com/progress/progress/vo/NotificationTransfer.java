package com.progress.progress.vo;

import com.progress.progress.domain.Notification;
/**
 * <b>概述</b>：NotificationTransfer类<br>
 * TODO
 * <p>
 * <b>功能</b>：<br>
 * TODO
 *
 * @author ru3an
 */
public class NotificationTransfer {
	
	private NotificationTransfer(){}

	/**
	 * @toPO:vo转为po
	 * @param vo vo对象
	 * @return Notification Notification对象
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public static Notification toPO(NotificationVO vo) {
		Notification notification = new Notification();
		if(vo != null){
			notification.setId(vo.getId());
			notification.setTitle(vo.getTitle());
			notification.set_date(vo.get_date());
        }
		return notification;
	}
	/**
	 * @toVO:po转为vo
	 * @param po po对象
	 * @return NotificationVO NotificationVO对象
	 * @date 2020-06-05 11:23:22
	 * @author ru3an
	 */
	public static NotificationVO toVO(Notification po) {
		NotificationVO vo = new NotificationVO();
		vo.setId(po.getId());
		vo.setTitle(po.getTitle());
		vo.set_date(po.get_date());
		return vo;
	}
}
