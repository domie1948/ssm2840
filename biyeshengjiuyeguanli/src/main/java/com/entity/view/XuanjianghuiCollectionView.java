package com.entity.view;

import com.entity.XuanjianghuiCollectionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 宣讲会收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-14
 */
@TableName("xuanjianghui_collection")
public class XuanjianghuiCollectionView extends XuanjianghuiCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 xuanjianghui
			/**
			* 宣讲会名称
			*/
			private String xuanjianghuiName;
			/**
			* 宣讲会图片
			*/
			private String xuanjianghuiPhoto;
			/**
			* 宣讲会开始时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date xuanjianghuiStartTime;
			/**
			* 宣讲会结束时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date xuanjianghuiEndTime;
			/**
			* 宣讲会详情
			*/
			private String xuanjianghuiContent;

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

	public XuanjianghuiCollectionView() {

	}

	public XuanjianghuiCollectionView(XuanjianghuiCollectionEntity xuanjianghuiCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, xuanjianghuiCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
















				//级联表的get和set xuanjianghui
					/**
					* 获取： 宣讲会名称
					*/
					public String getXuanjianghuiName() {
						return xuanjianghuiName;
					}
					/**
					* 设置： 宣讲会名称
					*/
					public void setXuanjianghuiName(String xuanjianghuiName) {
						this.xuanjianghuiName = xuanjianghuiName;
					}
					/**
					* 获取： 宣讲会图片
					*/
					public String getXuanjianghuiPhoto() {
						return xuanjianghuiPhoto;
					}
					/**
					* 设置： 宣讲会图片
					*/
					public void setXuanjianghuiPhoto(String xuanjianghuiPhoto) {
						this.xuanjianghuiPhoto = xuanjianghuiPhoto;
					}
					/**
					* 获取： 宣讲会开始时间
					*/
					public Date getXuanjianghuiStartTime() {
						return xuanjianghuiStartTime;
					}
					/**
					* 设置： 宣讲会开始时间
					*/
					public void setXuanjianghuiStartTime(Date xuanjianghuiStartTime) {
						this.xuanjianghuiStartTime = xuanjianghuiStartTime;
					}
					/**
					* 获取： 宣讲会结束时间
					*/
					public Date getXuanjianghuiEndTime() {
						return xuanjianghuiEndTime;
					}
					/**
					* 设置： 宣讲会结束时间
					*/
					public void setXuanjianghuiEndTime(Date xuanjianghuiEndTime) {
						this.xuanjianghuiEndTime = xuanjianghuiEndTime;
					}
					/**
					* 获取： 宣讲会详情
					*/
					public String getXuanjianghuiContent() {
						return xuanjianghuiContent;
					}
					/**
					* 设置： 宣讲会详情
					*/
					public void setXuanjianghuiContent(String xuanjianghuiContent) {
						this.xuanjianghuiContent = xuanjianghuiContent;
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















}
