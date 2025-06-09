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
 * 就业指导
 *
 * @author 
 * @email
 * @date 2021-04-14
 */
@TableName("jiuyezhidao")
public class JiuyezhidaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiuyezhidaoEntity() {

	}

	public JiuyezhidaoEntity(T t) {
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
     * 就业指导名称
     */
    @TableField(value = "jiuyezhidao_name")

    private String jiuyezhidaoName;


    /**
     * 就业指导类型
     */
    @TableField(value = "jiuyezhidao_types")

    private Integer jiuyezhidaoTypes;


    /**
     * 就业指导图片
     */
    @TableField(value = "jiuyezhidao_photo")

    private String jiuyezhidaoPhoto;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 就业指导详情
     */
    @TableField(value = "jiuyezhidao_content")

    private String jiuyezhidaoContent;


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
	 * 设置：就业指导名称
	 */
    public String getJiuyezhidaoName() {
        return jiuyezhidaoName;
    }


    /**
	 * 获取：就业指导名称
	 */

    public void setJiuyezhidaoName(String jiuyezhidaoName) {
        this.jiuyezhidaoName = jiuyezhidaoName;
    }
    /**
	 * 设置：就业指导类型
	 */
    public Integer getJiuyezhidaoTypes() {
        return jiuyezhidaoTypes;
    }


    /**
	 * 获取：就业指导类型
	 */

    public void setJiuyezhidaoTypes(Integer jiuyezhidaoTypes) {
        this.jiuyezhidaoTypes = jiuyezhidaoTypes;
    }
    /**
	 * 设置：就业指导图片
	 */
    public String getJiuyezhidaoPhoto() {
        return jiuyezhidaoPhoto;
    }


    /**
	 * 获取：就业指导图片
	 */

    public void setJiuyezhidaoPhoto(String jiuyezhidaoPhoto) {
        this.jiuyezhidaoPhoto = jiuyezhidaoPhoto;
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
	 * 设置：就业指导详情
	 */
    public String getJiuyezhidaoContent() {
        return jiuyezhidaoContent;
    }


    /**
	 * 获取：就业指导详情
	 */

    public void setJiuyezhidaoContent(String jiuyezhidaoContent) {
        this.jiuyezhidaoContent = jiuyezhidaoContent;
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
        return "Jiuyezhidao{" +
            "id=" + id +
            ", jiuyezhidaoName=" + jiuyezhidaoName +
            ", jiuyezhidaoTypes=" + jiuyezhidaoTypes +
            ", jiuyezhidaoPhoto=" + jiuyezhidaoPhoto +
            ", insertTime=" + insertTime +
            ", jiuyezhidaoContent=" + jiuyezhidaoContent +
            ", createTime=" + createTime +
        "}";
    }
}
