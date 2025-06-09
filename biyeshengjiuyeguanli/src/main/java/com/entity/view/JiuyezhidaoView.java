package com.entity.view;

import com.entity.JiuyezhidaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 就业指导
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-14
 */
@TableName("jiuyezhidao")
public class JiuyezhidaoView extends JiuyezhidaoEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 就业指导类型的值
		*/
		private String jiuyezhidaoValue;



	public JiuyezhidaoView() {

	}

	public JiuyezhidaoView(JiuyezhidaoEntity jiuyezhidaoEntity) {
		try {
			BeanUtils.copyProperties(this, jiuyezhidaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 就业指导类型的值
			*/
			public String getJiuyezhidaoValue() {
				return jiuyezhidaoValue;
			}
			/**
			* 设置： 就业指导类型的值
			*/
			public void setJiuyezhidaoValue(String jiuyezhidaoValue) {
				this.jiuyezhidaoValue = jiuyezhidaoValue;
			}













}
