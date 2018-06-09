package pluto.dao;

import org.apache.ibatis.annotations.Param;
import pluto.entity.Province;

public interface ProvinceMapper {

    int deleteByPrimaryKey(Integer provinceid);

    int insert(Province record);

    Province selectByPrimaryKey(Integer provinceid);

    int updateByPrimaryKey(Province record);

    /*根据省名查省id*/
    public Province selectProvinceByProvinceName(@Param("provincename") String provincename);
}