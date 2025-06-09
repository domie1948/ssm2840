package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuEntity;

import java.util.List;
import java.util.Map;

/**
 * 学生 服务类
 * @author 
 * @since 2021-04-14
 */
public interface YonghuService extends IService<YonghuEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);

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