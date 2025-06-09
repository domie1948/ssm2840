package com.dao;

import com.entity.JiuyezhidaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiuyezhidaoView;

/**
 * 就业指导 Dao 接口
 *
 * @author 
 * @since 2021-04-14
 */
public interface JiuyezhidaoDao extends BaseMapper<JiuyezhidaoEntity> {

   List<JiuyezhidaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
