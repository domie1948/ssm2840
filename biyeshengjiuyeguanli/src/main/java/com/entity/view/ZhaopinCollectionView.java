package com.entity.view;

import com.entity.ZhaopinCollectionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 招聘收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-14
 */
@TableName("zhaopin_collection")
public class ZhaopinCollectionView extends ZhaopinCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 yonghu
			/**
			* 学生姓名
			*/
			private String yonghuName;
			/**
			* 学生手机号
			*/
			private String yonghuPhone;
			/**
			* 学生身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 学生头像
			*/
			private String yonghuPhoto;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 入学时间
			*/
			private String ruxueTime;
			/**
			* 是否就业
			*/
			private Integer jiuyeTypes;
				/**
				* 是否就业的值
				*/
				private String jiuyeValue;
			/**
			* 专业
			*/
			private Integer zhuanyeTypes;
				/**
				* 专业的值
				*/
				private String zhuanyeValue;
			/**
			* 就职公司
			*/
			private String yonghuGongsi;

		//级联表 zhaopin
			/**
			* 公司名称
			*/
			private String zhaopinName;
			/**
			* 公司图片
			*/
			private String zhaopinPhoto;
			/**
			* 招聘开始时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date zhaopinStartTime;
			/**
			* 招聘结束时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date zhaopinEndTime;
			/**
			* 招聘详情
			*/
			private String zhaopinContent;

	public ZhaopinCollectionView() {

	}

	public ZhaopinCollectionView(ZhaopinCollectionEntity zhaopinCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, zhaopinCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}























				//级联表的get和set yonghu
					/**
					* 获取： 学生姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 学生手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 学生手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 学生身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 学生身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 学生头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 学生头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 入学时间
					*/
					public String getRuxueTime() {
						return ruxueTime;
					}
					/**
					* 设置： 入学时间
					*/
					public void setRuxueTime(String ruxueTime) {
						this.ruxueTime = ruxueTime;
					}
					/**
					* 获取： 是否就业
					*/
					public Integer getJiuyeTypes() {
						return jiuyeTypes;
					}
					/**
					* 设置： 是否就业
					*/
					public void setJiuyeTypes(Integer jiuyeTypes) {
						this.jiuyeTypes = jiuyeTypes;
					}


						/**
						* 获取： 是否就业的值
						*/
						public String getJiuyeValue() {
							return jiuyeValue;
						}
						/**
						* 设置： 是否就业的值
						*/
						public void setJiuyeValue(String jiuyeValue) {
							this.jiuyeValue = jiuyeValue;
						}
					/**
					* 获取： 专业
					*/
					public Integer getZhuanyeTypes() {
						return zhuanyeTypes;
					}
					/**
					* 设置： 专业
					*/
					public void setZhuanyeTypes(Integer zhuanyeTypes) {
						this.zhuanyeTypes = zhuanyeTypes;
					}


						/**
						* 获取： 专业的值
						*/
						public String getZhuanyeValue() {
							return zhuanyeValue;
						}
						/**
						* 设置： 专业的值
						*/
						public void setZhuanyeValue(String zhuanyeValue) {
							this.zhuanyeValue = zhuanyeValue;
						}
					/**
					* 获取： 就职公司
					*/
					public String getYonghuGongsi() {
						return yonghuGongsi;
					}
					/**
					* 设置： 就职公司
					*/
					public void setYonghuGongsi(String yonghuGongsi) {
						this.yonghuGongsi = yonghuGongsi;
					}


				//级联表的get和set zhaopin
					/**
					* 获取： 公司名称
					*/
					public String getZhaopinName() {
						return zhaopinName;
					}
					/**
					* 设置： 公司名称
					*/
					public void setZhaopinName(String zhaopinName) {
						this.zhaopinName = zhaopinName;
					}
					/**
					* 获取： 公司图片
					*/
					public String getZhaopinPhoto() {
						return zhaopinPhoto;
					}
					/**
					* 设置： 公司图片
					*/
					public void setZhaopinPhoto(String zhaopinPhoto) {
						this.zhaopinPhoto = zhaopinPhoto;
					}
					/**
					* 获取： 招聘开始时间
					*/
					public Date getZhaopinStartTime() {
						return zhaopinStartTime;
					}
					/**
					* 设置： 招聘开始时间
					*/
					public void setZhaopinStartTime(Date zhaopinStartTime) {
						this.zhaopinStartTime = zhaopinStartTime;
					}
					/**
					* 获取： 招聘结束时间
					*/
					public Date getZhaopinEndTime() {
						return zhaopinEndTime;
					}
					/**
					* 设置： 招聘结束时间
					*/
					public void setZhaopinEndTime(Date zhaopinEndTime) {
						this.zhaopinEndTime = zhaopinEndTime;
					}
					/**
					* 获取： 招聘详情
					*/
					public String getZhaopinContent() {
						return zhaopinContent;
					}
					/**
					* 设置： 招聘详情
					*/
					public void setZhaopinContent(String zhaopinContent) {
						this.zhaopinContent = zhaopinContent;
					}













}
