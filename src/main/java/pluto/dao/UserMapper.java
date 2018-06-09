package pluto.dao;

import org.apache.ibatis.annotations.Param;
import pluto.entity.Address;
import pluto.entity.User;

import java.util.List;

public interface UserMapper {

    int deleteByPrimaryKey(Integer userid);

    int updateByPrimaryKeyWithBLOBs(User record);

    int updateByPrimaryKey(User record);

    /*用户插入信息*/
    public boolean insertUser(User user);
    /*根据用户id查询用户*/
    public User selectByUserId(Integer userid);
    /*查看用户是否是vip*/
    public String checkUserVip(Integer userid);
    /*用户修改信息*/
    public boolean updateUserinfo(@Param("user") User user);

}