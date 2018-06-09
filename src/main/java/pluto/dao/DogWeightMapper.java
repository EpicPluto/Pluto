package pluto.dao;


import pluto.entity.DogWeight;

import java.util.List;


public interface DogWeightMapper {

    /*查询所有狗狗重量*/
    List<DogWeight>selectAllDogWeight();

    /*根据狗狗重量查询折扣*/
    public DogWeight selectDiscountByDogWeight( Integer maxdogweight,Integer mindogweight);

    DogWeight selectDogWeightById(Integer dogweightid);
}