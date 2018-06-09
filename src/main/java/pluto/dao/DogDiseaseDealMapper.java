package pluto.dao;

import pluto.entity.DogDiseaseDeal;

import java.util.List;

public interface DogDiseaseDealMapper {

   List<DogDiseaseDeal>selectAllDogDiseaseDeal();

    DogDiseaseDeal selectDogDiseaseDealById(Integer dogdiseasedealid);

    String selectDogDiseaseDealByCommonDiseaseId(Integer dogcommondiseaseid);
}