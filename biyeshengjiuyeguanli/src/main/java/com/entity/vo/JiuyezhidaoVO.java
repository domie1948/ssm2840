package com.entity.vo;

import com.entity.JiuyezhidaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 就业指导
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-14
 */
@TableName("jiuyezhidao")
public class JiuyezhidaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 就业指导详情
     */

    @TableField(value = "jiuyezhidao_content")
    private String jiuyezhidaoContent;


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
