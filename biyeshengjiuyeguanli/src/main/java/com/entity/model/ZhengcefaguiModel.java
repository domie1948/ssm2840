package com.entity.model;

import com.entity.ZhengcefaguiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 政策法规
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-14
 */
public class ZhengcefaguiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 政策法规名称
     */
    private String zhengcefaguiName;


    /**
     * 政策法规类型
     */
    private Integer zhengcefaguiTypes;


    /**
     * 政策法规图片
     */
    private String zhengcefaguiPhoto;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 政策法规详情
     */
    private String zhengcefaguiContent;


    /**
     * 创建时间 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：政策法规名称
	 */
    public String getZhengcefaguiName() {
        return zhengcefaguiName;
    }


    /**
	 * 设置：政策法规名称
	 */
    public void setZhengcefaguiName(String zhengcefaguiName) {
        this.zhengcefaguiName = zhengcefaguiName;
    }
    /**
	 * 获取：政策法规类型
	 */
    public Integer getZhengcefaguiTypes() {
        return zhengcefaguiTypes;
    }


    /**
	 * 设置：政策法规类型
	 */
    public void setZhengcefaguiTypes(Integer zhengcefaguiTypes) {
        this.zhengcefaguiTypes = zhengcefaguiTypes;
    }
    /**
	 * 获取：政策法规图片
	 */
    public String getZhengcefaguiPhoto() {
        return zhengcefaguiPhoto;
    }


    /**
	 * 设置：政策法规图片
	 */
    public void setZhengcefaguiPhoto(String zhengcefaguiPhoto) {
        this.zhengcefaguiPhoto = zhengcefaguiPhoto;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：政策法规详情
	 */
    public String getZhengcefaguiContent() {
        return zhengcefaguiContent;
    }


    /**
	 * 设置：政策法规详情
	 */
    public void setZhengcefaguiContent(String zhengcefaguiContent) {
        this.zhengcefaguiContent = zhengcefaguiContent;
    }
    /**
	 * 获取：创建时间 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
