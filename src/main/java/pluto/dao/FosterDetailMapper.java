package pluto.dao;

import pluto.entity.FosterDetail;

import java.util.List;

public interface FosterDetailMapper {
    //按照fosterdetailid查询
    FosterDetail selectFosterDetailById(Integer fosterdetailid);
    //按照petid查询
    List<FosterDetail> selectFosterDetailByPetId(Integer petid);

    boolean insertFosterDetail(FosterDetail fosterDetail);

    boolean updateFosterDetail(FosterDetail fosterDetail);

    boolean deleteFosterDetailById(Integer fosterdetailid);

    boolean deleteFosterDetailByPetId(Integer petid);

}