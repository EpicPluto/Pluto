package pluto.dao;

import org.apache.ibatis.annotations.Param;
import pluto.entity.ServiceDetail;

import java.util.List;

public interface ServiceDetailMapper {
    /*插入服务明细*/
    public boolean insertServiceDetail(@Param("servicedetail") ServiceDetail servicedetail);
    /*查询服务明细根据订单id查询*/
    public List<ServiceDetail> selectServiceDetailByOrderId(Integer orderid);
    /*查询服务明细根据服务明细id*/
    public ServiceDetail selectServiceDetailByServiceDetailId(Integer servicedetailid);
    /*修改服务明细*/
    public boolean updateServiceDetail(Integer servicecount);
    /*删除服务明细根据服务明细id*/
    public boolean deleteServiceDetailByServiceDetailId(Integer servicedetailid);
    /*删除服务明细根据订单id*/
    public boolean deleteServiceDetailByOrderId(Integer orderid);
}