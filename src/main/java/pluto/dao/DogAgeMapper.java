package pluto.dao;

import pluto.entity.DogAge;

import java.util.List;

public interface DogAgeMapper {

    List<DogAge> selectAllDogAge();
    String selectDogAgeById(Integer dogeageid);

}