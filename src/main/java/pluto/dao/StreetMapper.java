package pluto.dao;

import org.apache.ibatis.annotations.Param;
import pluto.entity.Street;

public interface StreetMapper {

    int deleteByPrimaryKey(Integer streetid);

    int insert(Street record);

    Street selectByPrimaryKey(Integer streetid);

    int updateByPrimaryKey(Street record);

    /*根据街道名查街道id*/
    public Street selectStreetByStreetName(@Param("streetname") String streetname);
}