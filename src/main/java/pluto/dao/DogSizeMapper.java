package pluto.dao;

import pluto.entity.DogSize;


import java.util.List;

public interface DogSizeMapper {

    List<DogSize> selectAllDogSize();
    String selectDogSizeNameById(int dogsizeid);
}