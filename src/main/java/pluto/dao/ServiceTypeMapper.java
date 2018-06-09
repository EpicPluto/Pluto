package pluto.dao;

import org.apache.ibatis.annotations.Param;
import pluto.entity.ServiceType;

import java.util.List;

public interface ServiceTypeMapper {

    /*查询所有的服务类型*/
    public List<ServiceType> selectAllServiceType();

    /*根据服务名字查询服务类型*/
    public ServiceType selectServiceTypeByServiceName(@Param("servicename") String servicename);

}