package com.liuyanzhao.summer.mapper;

import com.liuyanzhao.summer.entity.OrderMaster;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 完整订单
 */
@Mapper
@Component("orderMasterMapper")
public interface OrderMasterMapper {

    /**
     * 删除订单
     * @param orderId
     * @return
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * 添加订单
     * @param record
     * @return
     */
    @Deprecated
    int insert(OrderMaster record);

    /**
     * 添加订单
     * @param record
     * @return
     */
    int insertSelective(OrderMaster record);

    /**
     * 根据ID查询订单
     * @param orderId
     * @return
     */
    OrderMaster selectByPrimaryKey(String orderId);

    /**
     * 更新订单
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(OrderMaster record);

    /**
     * 更新订单
     * @param record
     * @return
     */
    @Deprecated
    int updateByPrimaryKey(OrderMaster record);
}