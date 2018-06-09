package pluto.dao;

import pluto.entity.Pet;

import java.util.List;

public interface PetMapper {
    boolean insertPet(Pet pet);

    boolean updatePet(Pet pet);

    boolean deletePetByName(String dogname);

    List<Pet>selectAllPet();

    Pet selectPetByDogNameAndUserId(String dogname,Integer userid);
}