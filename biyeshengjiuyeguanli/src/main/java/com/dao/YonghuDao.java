package com.dao;

import com.entity.YonghuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuView;

/**
 * 学生 Dao 接口
 *
 * @author 
 * @since 2021-04-14
 */
public interface YonghuDao extends BaseMapper<YonghuEntity> {

   List<YonghuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

   /**
    * 就业统计
    * @param params
    * @return
    */
   List<Map<String, Object>> graphJiuye(Map<String, Object> params);

   /**
    * 性别统计(统计的是全部的,包含未就业)
    * @param params
    * @return
    */
   List<Map<String, Object>> graphSex(Map<String, Object> params);

   /**
    * 专业统计(统计的是已经就业的)
    * @param params
    * @return
    */
   List<Map<String, Object>> graphZhuanye(Map<String, Object> params);

}
