package pluto.dao;

import pluto.entity.Order;

import java.util.List;

public interface OrderMapper {

    int deleteByPrimaryKey(Integer orderid);

    int insert(Order record);

    Order selectByPrimaryKey(Integer orderid);

    int updateByPrimaryKey(Order record);

    /*根据userid查询一个订单*/
    public Order selectOrderByUserId(Integer userid);

    /*根据userid查询所有用户的订单*/
    public List<Order> selectAllOrderByUserId(Integer userid);

}