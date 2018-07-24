package com.liuyanzhao.summer.mapper;

import com.liuyanzhao.summer.entity.ProductInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 产品
 */
@Mapper
@Component("productInfoMapper")
public interface ProductInfoMapper {


    /**
     * 根据ID删除产品
     * @param productId
     * @return
     */
    int deleteByPrimaryKey(String productId);

    /**
     * 添加产品(不建议用)
     * @param record
     * @return
     */
    @Deprecated
    int insert(ProductInfo record);

    /**
     * 添加产品(建议使用)
     * @param record
     * @return
     */
    int insertSelective(ProductInfo record);

    /**
     * 根据ID查询产品
     * @param productId
     * @return
     */
    ProductInfo selectByPrimaryKey(String productId);

    /**
     * 更新产品(建议使用）
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(ProductInfo record);

    /**
     * 更新产品(不建议使用)
     * @param record
     * @return
     */
    @Deprecated
    int updateByPrimaryKey(ProductInfo record);
}