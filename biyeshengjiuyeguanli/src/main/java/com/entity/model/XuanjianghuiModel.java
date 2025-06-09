package com.entity.model;

import com.entity.XuanjianghuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 宣讲会
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-14
 */
public class XuanjianghuiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：宣讲会名称
	 */
    public String getXuanjianghuiName() {
        return xuanjianghuiName;
    }


    /**
	 * 设置：宣讲会名称
	 */
    public void setXuanjianghuiName(String xuanjianghuiName) {
        this.xuanjianghuiName = xuanjianghuiName;
    }
    /**
	 * 获取：宣讲会图片
	 */
    public String getXuanjianghuiPhoto() {
        return xuanjianghuiPhoto;
    }


    /**
	 * 设置：宣讲会图片
	 */
    public void setXuanjianghuiPhoto(String xuanjianghuiPhoto) {
        this.xuanjianghuiPhoto = xuanjianghuiPhoto;
    }
    /**
	 * 获取：宣讲会开始时间
	 */
    public Date getXuanjianghuiStartTime() {
        return xuanjianghuiStartTime;
    }


    /**
	 * 设置：宣讲会开始时间
	 */
    public void setXuanjianghuiStartTime(Date xuanjianghuiStartTime) {
        this.xuanjianghuiStartTime = xuanjianghuiStartTime;
    }
    /**
	 * 获取：宣讲会结束时间
	 */
    public Date getXuanjianghuiEndTime() {
        return xuanjianghuiEndTime;
    }


    /**
	 * 设置：宣讲会结束时间
	 */
    public void setXuanjianghuiEndTime(Date xuanjianghuiEndTime) {
        this.xuanjianghuiEndTime = xuanjianghuiEndTime;
    }
    /**
	 * 获取：宣讲会详情
	 */
    public String getXuanjianghuiContent() {
        return xuanjianghuiContent;
    }


    /**
	 * 设置：宣讲会详情
	 */
    public void setXuanjianghuiContent(String xuanjianghuiContent) {
        this.xuanjianghuiContent = xuanjianghuiContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
