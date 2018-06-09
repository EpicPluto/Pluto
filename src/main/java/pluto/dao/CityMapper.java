package pluto.dao;

import org.apache.ibatis.annotations.Param;
import pluto.entity.City;

public interface CityMapper {

    int deleteByPrimaryKey(Integer cityid);

    int insert(City record);

    City selectByPrimaryKey(Integer cityid);

    int updateByPrimaryKey(City record);

    /*根据市名查市id*/
    public City selectCityByCityName(@Param("cityname") String cityname);
}