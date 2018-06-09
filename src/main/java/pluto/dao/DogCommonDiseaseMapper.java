package pluto.dao;

import pluto.entity.DogCommonDisease;

import java.util.List;

public interface DogCommonDiseaseMapper {
    List<DogCommonDisease> selectAllDogCommonDisease();
    String selectDogCommonDiseaseById(Integer dogcommondiseaseid);

}