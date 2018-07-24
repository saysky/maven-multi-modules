package com.liuyanzhao.summer.mapper;

import com.liuyanzhao.summer.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 订单内容(商品)
 */
@Mapper
@Component("orderDetailMapper")
public interface OrderDetailMapper {

    /**
     * 删除一件商品
     * @param detailId
     * @return
     */
    int deleteByPrimaryKey(String detailId);

    /**
     * 添加商品
     * @param record
     * @return
     */
    @Deprecated
    int insert(OrderDetail record);

    /**
     * 添加商品
     * @param record
     * @return
     */
    int insertSelective(OrderDetail record);

    /**
     * 查询商品
     * @param detailId
     * @return
     */
    OrderDetail selectByPrimaryKey(String detailId);

    /**
     * 更新商品
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(OrderDetail record);

    /**
     * 更新商品
     * @param record
     * @return
     */
    @Deprecated
    int updateByPrimaryKey(OrderDetail record);
}