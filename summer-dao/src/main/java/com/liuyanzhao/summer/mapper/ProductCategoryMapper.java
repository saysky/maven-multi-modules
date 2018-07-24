package com.liuyanzhao.summer.mapper;

import com.liuyanzhao.summer.entity.ProductCategory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 产品分类
 */
@Mapper
@Component("productCategoryMapper")
public interface ProductCategoryMapper {

    /**
     * 删除产品分类
     * @param categoryId
     * @return
     */
    int deleteByPrimaryKey(Integer categoryId);

    /**
     * 添加产品分类
     * @param record
     * @return
     */
    @Deprecated
    int insert(ProductCategory record);

    /**
     * 添加产品分类
     * @param record
     * @return
     */
    int insertSelective(ProductCategory record);

    /**
     * 根据ID查询产品分类
     * @param categoryId
     * @return
     */
    ProductCategory selectByPrimaryKey(Integer categoryId);

    /**
     * 更新产品分类
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(ProductCategory record);

    /**
     * 更新产品分类
     * @param record
     * @return
     */
    @Deprecated
    int updateByPrimaryKey(ProductCategory record);
}