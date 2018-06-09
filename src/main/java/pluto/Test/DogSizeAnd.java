package pluto.Test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pluto.dao.*;
import pluto.entity.DogSize;
import pluto.entity.Pet;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext_dao.xml")
public class DogSizeAnd {
    @Autowired
    DogSizeMapper dogSizeMapper;
    @Autowired
    DogTypeMapper dogTypeMapper;
    @Autowired
    PetMapper petMapper;

    @Test
    public void testDog() {
       /* System.out.println(dogSizeMapper.selectAllDogSize());
        System.out.println(dogSizeMapper.selectDogSizeNameById(1001));*/
        System.out.println(dogTypeMapper.selectAllDogType());
        System.out.println(dogTypeMapper.selectDogTypeNameById(1001));

    }
    @Test
    public void testPet(){
        /*Pet pet=petMapper.selectPetByDogNameAndUserId("阿拉",1);*//*
        System.out.println(pet.getDogtype().getDogtype()+"--"+pet.getDogbirthday()+"--"+pet.getDogname()+"--"+pet.getUser().getUsername());
       pet.setPetid(4);
        System.out.println(petMapper.insertPet(pet));*/
      /*  pet.setDogname("乔智");
        System.out.println(petMapper.updatePet(pet));*/
        /*System.out.println(petMapper.deletePetByName("乔智"));*/
        List<Pet>pets=petMapper.selectAllPet();
        for(Pet pet:pets){
            System.out.println(pet.getDogtype().getDogtype()+"--"+pet.getDogbirthday()+"--"+pet.getDogname()+"--"+pet.getUser().getUsername());
        }


    }
}
