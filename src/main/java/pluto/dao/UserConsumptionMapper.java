package pluto.dao;

import pluto.entity.UserConsumption;

import java.util.List;

public interface UserConsumptionMapper {

    int deleteByPrimaryKey(Integer consumptionid);

    int insert(UserConsumption record);

    UserConsumption selectByPrimaryKey(Integer consumptionid);

    int updateByPrimaryKey(UserConsumption record);

    /*查所有的消费记录根据用户id*/
    public List<UserConsumption> selectAllUserConsumption(Integer userid);
}