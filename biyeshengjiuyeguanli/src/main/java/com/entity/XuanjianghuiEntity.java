package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 宣讲会
 *
 * @author 
 * @email
 * @date 2021-04-14
 */
@TableName("xuanjianghui")
public class XuanjianghuiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XuanjianghuiEntity() {

	}

	public XuanjianghuiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @TableField(value = "xuanjianghui_start_time",fill = FieldFill.UPDATE)

    private Date xuanjianghuiStartTime;


    /**
     * 宣讲会结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "xuanjianghui_end_time",fill = FieldFill.UPDATE)

    private Date xuanjianghuiEndTime;


    /**
     * 宣讲会详情
     */
    @TableField(value = "xuanjianghui_content")

    private String xuanjianghuiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xuanjianghui{" +
            "id=" + id +
            ", xuanjianghuiName=" + xuanjianghuiName +
            ", xuanjianghuiPhoto=" + xuanjianghuiPhoto +
            ", xuanjianghuiStartTime=" + xuanjianghuiStartTime +
            ", xuanjianghuiEndTime=" + xuanjianghuiEndTime +
            ", xuanjianghuiContent=" + xuanjianghuiContent +
            ", createTime=" + createTime +
        "}";
    }
}
