package pluto.Test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pluto.dao.DogHouseGradeMapper;
import pluto.dao.DogHouseMapper;
import pluto.dao.FosterDetailMapper;
import pluto.entity.FosterDetail;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext_dao.xml")
public class DogHomeTest {
    @Autowired
    DogHouseGradeMapper dogHouseGradeMapper;
    @Autowired
    DogHouseMapper dogHouseMapper;
    @Autowired
    FosterDetailMapper fosterDetailMapper;

    @Test
    public void testDogHouseGrade() {
        System.out.println(dogHouseGradeMapper.selectAllDogHouseGrade());
        System.out.println(dogHouseGradeMapper.selectDogHouseGradeByName("经济型"));

    }
    @Test
    public void DogHouse(){
        //System.out.println(dogHouseMapper.selectAllHouse());
        System.out.println(dogHouseMapper.selectDogHouseNameBySize(1001));
        System.out.println(dogHouseMapper.selectDogHouseNameByGrade(1001));
        System.out.println(dogHouseMapper.selectDogHouseNameByGradeAndSize(1001,1001));
    }
    @Test
    public void fosterDetail() {
        System.out.println(fosterDetailMapper.deleteFosterDetailByPetId(1));
      /* FosterDetail fosterDetail=fosterDetailMapper.selectFosterDetailById(1);
       fosterDetail.setFosterday(3);
        System.out.println(fosterDetailMapper.updateFosterDetail(fosterDetail));*/
       /*
        System.out.println(fosterDetail.getPet().getUser().getUsername());
        System.out.println(fosterDetail.getFosterdetailid()+"  "+fosterDetail.getFosterday()+"  "+fosterDetail.getFostertotalprice()+"  "+fosterDetail.getDoghousegrade().getDoghousegrade()+"  "+fosterDetail.getPet().getDogname());
        fosterDetail.setFosterdetailid(3);
        System.out.println(fosterDetailMapper.insertFosterDetail(fosterDetail));*/
       /* List<FosterDetail> fosterDetails = fosterDetailMapper.selectFosterDetailByPetId(2);
        for (FosterDetail fosterDetail: fosterDetails) {
            System.out.println(fosterDetail.getFosterdetailid() + "  " + fosterDetail.getFosterday() + "  " + fosterDetail.getFostertotalprice() + "  " + fosterDetail.getDoghousegrade().getDoghousegrade() + "  " + fosterDetail.getPet().getDogname());
        }*/

    }
}
