package pluto.dao;

import org.apache.ibatis.annotations.Param;
import pluto.entity.District;

public interface DistrictMapper {

    int deleteByPrimaryKey(Integer districtid);

    int insert(District record);

    District selectByPrimaryKey(Integer districtid);

    int updateByPrimaryKey(District record);

    /*根据区名查区id*/
    public District selectDistrictByDistricName(@Param("districtname") String districtname);
}