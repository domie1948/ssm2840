package com.entity.vo;

import com.entity.ZhengcefaguiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 政策法规
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-14
 */
@TableName("zhengcefagui")
public class ZhengcefaguiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 政策法规名称
     */

    @TableField(value = "zhengcefagui_name")
    private String zhengcefaguiName;


    /**
     * 政策法规类型
     */

    @TableField(value = "zhengcefagui_types")
    private Integer zhengcefaguiTypes;


    /**
     * 政策法规图片
     */

    @TableField(value = "zhengcefagui_photo")
    private String zhengcefaguiPhoto;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 政策法规详情
     */

    @TableField(value = "zhengcefagui_content")
    private String zhengcefaguiContent;


    /**
     * 创建时间 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：政策法规名称
	 */
    public String getZhengcefaguiName() {
        return zhengcefaguiName;
    }


    /**
	 * 获取：政策法规名称
	 */

    public void setZhengcefaguiName(String zhengcefaguiName) {
        this.zhengcefaguiName = zhengcefaguiName;
    }
    /**
	 * 设置：政策法规类型
	 */
    public Integer getZhengcefaguiTypes() {
        return zhengcefaguiTypes;
    }


    /**
	 * 获取：政策法规类型
	 */

    public void setZhengcefaguiTypes(Integer zhengcefaguiTypes) {
        this.zhengcefaguiTypes = zhengcefaguiTypes;
    }
    /**
	 * 设置：政策法规图片
	 */
    public String getZhengcefaguiPhoto() {
        return zhengcefaguiPhoto;
    }


    /**
	 * 获取：政策法规图片
	 */

    public void setZhengcefaguiPhoto(String zhengcefaguiPhoto) {
        this.zhengcefaguiPhoto = zhengcefaguiPhoto;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：政策法规详情
	 */
    public String getZhengcefaguiContent() {
        return zhengcefaguiContent;
    }


    /**
	 * 获取：政策法规详情
	 */

    public void setZhengcefaguiContent(String zhengcefaguiContent) {
        this.zhengcefaguiContent = zhengcefaguiContent;
    }
    /**
	 * 设置：创建时间 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
