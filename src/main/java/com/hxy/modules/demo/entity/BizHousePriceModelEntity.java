package com.hxy.modules.demo.entity;

import com.hxy.modules.activiti.annotation.ActField;
import com.hxy.modules.activiti.annotation.ActTable;
import com.hxy.modules.common.entity.ActivitiBaseEntity;

import java.io.Serializable;
import java.util.Date;



/**
 * 服务任务流程测试
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-04-17 14:19:44
 */
@ActTable(tableName = "biz_house_price_model",pkName="id")
public class BizHousePriceModelEntity extends ActivitiBaseEntity {
	//
	private String id;
	//标题
	@ActField(name = "标题")
	private String title;
	//房屋面积
	@ActField(name = "房屋面积")
	private Integer houseMj;
	//房屋楼层
	@ActField(name = "房屋楼层")
	private String houseLc;

	/**
	 * 设置：
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：标题
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：房屋面积
	 */
	public void setHouseMj(Integer houseMj) {
		this.houseMj = houseMj;
	}
	/**
	 * 获取：房屋面积
	 */
	public Integer getHouseMj() {
		return houseMj;
	}
	/**
	 * 设置：房屋楼层
	 */
	public void setHouseLc(String houseLc) {
		this.houseLc = houseLc;
	}
	/**
	 * 获取：房屋楼层
	 */
	public String getHouseLc() {
		return houseLc;
	}

}
