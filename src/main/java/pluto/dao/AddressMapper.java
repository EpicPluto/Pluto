package pluto.dao;

import org.apache.ibatis.annotations.Param;
import pluto.entity.Address;

import java.util.List;

public interface AddressMapper {
    int deleteByPrimaryKey(Integer addressid);

    int insert(Address record);

    Address selectByPrimaryKey(Integer addressid);

    int updateByPrimaryKey(Address record);

    /*根据用户id来查询用户地址*/
    public List<Address> selectUserAddress(@Param("userid") Integer userid);

    /*用户插入地址*/
    public boolean insertUserAddress(@Param("address") Address address);

}