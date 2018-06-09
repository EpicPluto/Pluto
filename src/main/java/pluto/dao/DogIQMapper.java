package pluto.dao;

import pluto.entity.DogIQ;

import java.util.List;

public interface DogIQMapper {

    List<DogIQ>selectAllDogIQ();
    String selectDogIQById(Integer dogiqid);
}