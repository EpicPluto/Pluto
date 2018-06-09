package pluto.dao;

import org.apache.ibatis.annotations.Param;
import pluto.entity.HospitalInfo;

import java.util.List;

public interface HospitalInfoMapper {

   int deleteByPrimaryKey(Integer hospitalid);

    int insert(HospitalInfo record);

    HospitalInfo selectByPrimaryKey(Integer hospitalid);

    int updateByPrimaryKey(HospitalInfo record);

    /*根据用户的cityid来查询医院*/
    public List<HospitalInfo> selectHospitalInfoByUserCityId(@Param("cityid") Integer cityid);

    /*根据医院名查询医院*/
    public HospitalInfo selectHospitalInfoByHostipalName(@Param("hospitalname") String hospitalname);
}