package pluto.dao;

import org.apache.ibatis.annotations.Param;


public interface DefaultAddressMapper {


    /*查询用户默认收货的值的cityid*/
    public int selectUserCityId(@Param("userid") Integer userid);
}