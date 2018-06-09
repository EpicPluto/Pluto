package pluto.dao;

import pluto.entity.DogCommonDisease;
import pluto.entity.DogDisease;
import pluto.entity.Pet;

import java.util.List;

public interface DogDiseaseMapper {
    List<DogDisease> selectAllDogDisease();

    DogDisease selectDogDiseaseById(Integer dogdiseaseid);

    List<DogCommonDisease> selectcommondieaseByPetId(Integer petid);

    List<Pet> selectPetBycommondiseaseId(Integer dogcommondiseaseid);

    boolean insertDogDisease(DogDisease dogDisease);

    boolean updateDogDisease(DogDisease dogDisease);

    boolean deleteDogDiseaseById(Integer dogdiseaseid);


}