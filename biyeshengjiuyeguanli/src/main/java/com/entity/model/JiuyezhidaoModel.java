package com.entity.model;

import com.entity.JiuyezhidaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 就业指导
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-14
 */
public class JiuyezhidaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 就业指导名称
     */
    private String jiuyezhidaoName;


    /**
     * 就业指导类型
     */
    private Integer jiuyezhidaoTypes;


    /**
     * 就业指导图片
     */
    private String jiuyezhidaoPhoto;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 就业指导详情
     */
    private String jiuyezhidaoContent;


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
	 * 获取：就业指导名称
	 */
    public String getJiuyezhidaoName() {
        return jiuyezhidaoName;
    }


    /**
	 * 设置：就业指导名称
	 */
    public void setJiuyezhidaoName(String jiuyezhidaoName) {
        this.jiuyezhidaoName = jiuyezhidaoName;
    }
    /**
	 * 获取：就业指导类型
	 */
    public Integer getJiuyezhidaoTypes() {
        return jiuyezhidaoTypes;
    }


    /**
	 * 设置：就业指导类型
	 */
    public void setJiuyezhidaoTypes(Integer jiuyezhidaoTypes) {
        this.jiuyezhidaoTypes = jiuyezhidaoTypes;
    }
    /**
	 * 获取：就业指导图片
	 */
    public String getJiuyezhidaoPhoto() {
        return jiuyezhidaoPhoto;
    }


    /**
	 * 设置：就业指导图片
	 */
    public void setJiuyezhidaoPhoto(String jiuyezhidaoPhoto) {
        this.jiuyezhidaoPhoto = jiuyezhidaoPhoto;
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
	 * 获取：就业指导详情
	 */
    public String getJiuyezhidaoContent() {
        return jiuyezhidaoContent;
    }


    /**
	 * 设置：就业指导详情
	 */
    public void setJiuyezhidaoContent(String jiuyezhidaoContent) {
        this.jiuyezhidaoContent = jiuyezhidaoContent;
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
