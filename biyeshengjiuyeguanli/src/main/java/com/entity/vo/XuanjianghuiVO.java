package com.entity.vo;

import com.entity.XuanjianghuiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 宣讲会
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-14
 */
@TableName("xuanjianghui")
public class XuanjianghuiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 宣讲会名称
     */

    @TableField(value = "xuanjianghui_name")
    private String xuanjianghuiName;


    /**
     * 宣讲会图片
     */

    @TableField(value = "xuanjianghui_photo")
    private String xuanjianghuiPhoto;


    /**
     * 宣讲会开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "xuanjianghui_start_time")
    private Date xuanjianghuiStartTime;


    /**
     * 宣讲会结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "xuanjianghui_end_time")
    private Date xuanjianghuiEndTime;


    /**
     * 宣讲会详情
     */

    @TableField(value = "xuanjianghui_content")
    private String xuanjianghuiContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：宣讲会名称
	 */
    public String getXuanjianghuiName() {
        return xuanjianghuiName;
    }


    /**
	 * 获取：宣讲会名称
	 */

    public void setXuanjianghuiName(String xuanjianghuiName) {
        this.xuanjianghuiName = xuanjianghuiName;
    }
    /**
	 * 设置：宣讲会图片
	 */
    public String getXuanjianghuiPhoto() {
        return xuanjianghuiPhoto;
    }


    /**
	 * 获取：宣讲会图片
	 */

    public void setXuanjianghuiPhoto(String xuanjianghuiPhoto) {
        this.xuanjianghuiPhoto = xuanjianghuiPhoto;
    }
    /**
	 * 设置：宣讲会开始时间
	 */
    public Date getXuanjianghuiStartTime() {
        return xuanjianghuiStartTime;
    }


    /**
	 * 获取：宣讲会开始时间
	 */

    public void setXuanjianghuiStartTime(Date xuanjianghuiStartTime) {
        this.xuanjianghuiStartTime = xuanjianghuiStartTime;
    }
    /**
	 * 设置：宣讲会结束时间
	 */
    public Date getXuanjianghuiEndTime() {
        return xuanjianghuiEndTime;
    }


    /**
	 * 获取：宣讲会结束时间
	 */

    public void setXuanjianghuiEndTime(Date xuanjianghuiEndTime) {
        this.xuanjianghuiEndTime = xuanjianghuiEndTime;
    }
    /**
	 * 设置：宣讲会详情
	 */
    public String getXuanjianghuiContent() {
        return xuanjianghuiContent;
    }


    /**
	 * 获取：宣讲会详情
	 */

    public void setXuanjianghuiContent(String xuanjianghuiContent) {
        this.xuanjianghuiContent = xuanjianghuiContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
