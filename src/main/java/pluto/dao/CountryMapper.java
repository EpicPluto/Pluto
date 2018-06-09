package pluto.dao;
import org.apache.ibatis.annotations.Param;
import pluto.entity.Country;

public interface CountryMapper {

    int deleteByPrimaryKey(Integer countryid);

    int insert(Country record);

    Country selectByPrimaryKey(Integer countryid);

    int updateByPrimaryKey(Country record);

    /*根据国家名查国家id*/
    public Country selectCountryByCountryName(@Param("countryname") String countryname);
}