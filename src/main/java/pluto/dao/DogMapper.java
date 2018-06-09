package pluto.dao;

import pluto.entity.Dog;

import java.util.List;

public interface DogMapper {
    List<Dog>selectAllDog();
    Dog selectDogByName(String dogname);
}