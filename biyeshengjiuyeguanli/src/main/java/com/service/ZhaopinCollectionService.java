package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhaopinCollectionEntity;
import java.util.Map;

/**
 * 招聘收藏 服务类
 * @author 
 * @since 2021-04-14
 */
public interface ZhaopinCollectionService extends IService<ZhaopinCollectionEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}