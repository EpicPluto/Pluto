package pluto.Test;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pluto.dao.*;
import pluto.entity.*;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext_service.xml")
public class DogTest {
    @Autowired
    DogDiseaseDealMapper dogDiseaseDealMapper;
    @Autowired
    DogAgeMapper dogAgeMapper;
    @Autowired
    DogDiseaseMapper dogDiseaseMapper;
    @Autowired
    DogIQMapper dogIQMapper;
    @Autowired
    DogMapper dogMapper;
    @Autowired
    DogWeightMapper dogWeightMapper;
    @Autowired
    DogCommonDiseaseMapper dogCommonDiseaseMapper;
    @Test
    public void testweight(){
        System.out.println(dogWeightMapper.selectDogWeightDiscountByWeight(15.0));
        System.out.println(dogWeightMapper.selectDogWeightById(1001));
        List<DogWeight>dogWeights=dogWeightMapper.selectAllDogWeight();
        for(DogWeight dogWeight:dogWeights){
            System.out.println(dogWeight.getDogweightid());
            System.out.println(dogWeight.getWeight());
            System.out.println(dogWeight.getDogweightdiscount());
        }
    }
    @Test
    public void testIQ(){
        System.out.println(dogIQMapper.selectAllDogIQ());
        System.out.println(dogIQMapper.selectDogIQById(1001));
    }
    @Test
    public void testdog(){
        List<Dog>dogs=dogMapper.selectAllDog();
        for(Dog dog:dogs){
            System.out.print(dog.getDogid()+" ");
            System.out.print(dog.getDogname()+" ");
            System.out.print(dog.getDogsize().getDogsize()+" ");
            System.out.print(dog.getDogtype().getDogtype()+" ");
            System.out.println(dog.getCountry().getCountryname());
        }
        System.out.println();
        System.out.println(dogMapper.selectDogByName("阿拉斯加雪橇犬"));
    }
    @Test
    public void diseasedeal(){
        List<DogDiseaseDeal>dogDiseaseDeals=dogDiseaseDealMapper.selectAllDogDiseaseDeal();
        for(DogDiseaseDeal dogDiseaseDeal:dogDiseaseDeals){
            System.out.print(dogDiseaseDeal.getDogdiseasedealid()+" ");
            System.out.print(dogDiseaseDeal.getDealmethod()+" ");
            System.out.println(dogDiseaseDeal.getDogcommondisease().getDiseasename());
        }
        System.out.println(dogDiseaseDealMapper.selectDogDiseaseDealByCommonDiseaseId(1001));
        System.out.println(dogDiseaseDealMapper.selectDogDiseaseDealById(1001));
    }
    @Test
    public void DogCommonDisease(){
        System.out.println(dogCommonDiseaseMapper.selectAllDogCommonDisease());
        System.out.println(dogCommonDiseaseMapper.selectDogCommonDiseaseById(1001));
    }
    @Test
    public void DogDisease(){

        System.out.println("查询所有疾病");
        List<DogDisease>dogDiseases=dogDiseaseMapper.selectAllDogDisease();
        for(DogDisease dogDisease:dogDiseases){
            System.out.print(dogDisease.getDogdiseaseid()+" ");
            System.out.print(dogDisease.getPet().getDogname()+" ");
            System.out.println(dogDisease.getDogcommondisease().getDiseasename());
        }
        System.out.println("根据id查询");
        DogDisease dogDisease=dogDiseaseMapper.selectDogDiseaseById(1004);
        System.out.print(dogDisease.getDogdiseaseid()+" ");
        System.out.print(dogDisease.getPet().getDogname()+" ");
        System.out.println(dogDisease.getDogcommondisease().getDiseasename());
        System.out.println();
        System.out.println("根据petid查询疾病");
        List<DogCommonDisease>dogCommonDiseases=dogDiseaseMapper.selectcommondieaseByPetId(4);
        for(DogCommonDisease dogCommonDisease:dogCommonDiseases){
            System.out.println(dogCommonDisease.getDiseasename());
        }
        System.out.println("根据疾病id查询pet名字");
        List<Pet> pets=dogDiseaseMapper.selectPetBycommondiseaseId(1002);
        for (Pet pet:pets){
            System.out.println(pet.getDogname());
        }
        /*

        boolean deleteDogDiseaseById(Integer dogdiseaseid);*/
        System.out.println("修改详情");
        System.out.println(dogDiseaseMapper.updateDogDisease(dogDisease));
        System.out.println("插入详情");
        dogDisease.setDogdiseaseid(13);
        System.out.println(dogDiseaseMapper.insertDogDisease(dogDisease));
        System.out.println("删除详情");
        System.out.println(dogDiseaseMapper.deleteDogDiseaseById(1001));
    }
    @Test
    public void DogAge(){
        List<DogAge>dogAges= dogAgeMapper.selectAllDogAge();
        for (DogAge dogAge:dogAges){
            System.out.print(dogAge.getDogageid()+" ");
            System.out.println(dogAge.getAge());
        }
      System.out.println(dogAgeMapper.selectDogAgeById(1001));
    }


}
