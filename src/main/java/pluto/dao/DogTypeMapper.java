package pluto.dao;
import pluto.entity.DogType;

import java.util.List;

public interface DogTypeMapper {

    List<DogType> selectAllDogType();
    String selectDogTypeNameById(int dogtypeid);


}