package pluto.dao;

import pluto.entity.DogHouseGrade;

import java.util.List;

public interface DogHouseGradeMapper {

    List<DogHouseGrade> selectAllDogHouseGrade();
    DogHouseGrade selectDogHouseGradeByName(String doghousegrade);

}