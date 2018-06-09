package pluto.test;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.omg.CORBA.ServiceDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pluto.dao.*;
import pluto.entity.*;
import pluto.service.UserService;

import javax.xml.transform.Source;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext_service.xml")
public class usertest {


    @Autowired
    private  UserMapper userMapper;
    @Autowired
    private  AddressMapper addressMapper;
    @Autowired
    private CountryMapper countryMapper;
    @Autowired
    private ProvinceMapper provinceMapper;
    @Autowired
    private CityMapper cityMapper;
    @Autowired
    private DistrictMapper districtMapper;
    @Autowired
    private  StreetMapper streetMapper;
    @Autowired
    private DefaultAddressMapper defaultAddressMapper;
    @Autowired
    private HospitalInfoMapper hospitalInfoMapper;
    @Autowired
    private ServiceTypeMapper serviceTypeMapper;
    @Autowired
    private  DogWeightMapper dogWeightMapper;
    @Autowired
    private ServiceGradeMapper serviceGradeMapper;
    @Autowired
    private  ServiceDetailMapper serviceDetailMapper;
    @Autowired
    private  OrderMapper orderMapper;
    @Autowired
    private UserConsumptionMapper userConsumptionMapper;

    @Test/*插入用户信息*/
    public void testInsert(){
        User user=new User("admin","12345","123124112");
        userMapper.insertUser(user);
    }
    @Test/*根据用户id查询*/
    public void testSelectUser(){
        User user=userMapper.selectByUserId(1001);
        System.out.println(user.getPassword());
        System.out.println(user.getUsername());
        
    }

    @Test/*查看用户是否是vip*/
    public void testVip(){
        if(userMapper.checkUserVip(1001)==null){
            System.out.println("不是vip");
        }else{
            System.out.println("是vip");
        }
    }
    @Test/*用户修改信息*/
    public void testUpdateUserInfo(){
        User user=userMapper.selectByUserId(1001);
        user.setPassword("111111");
        user.setTel("4444444444444");
        userMapper.updateUserinfo(user);
    }
    @Test/*查询地址*/
     public void testSelectUserAddress(){
         List<Address> address=addressMapper.selectUserAddress(1001);
           for(Address add: address){
               System.out.println(add.getCountry().getCountryname());
               System.out.println(add.getProvince().getProvincename());
               System.out.println(add.getCity().getCityname());
               System.out.println(add.getDistrict().getDistrictname());
               System.out.println(add.getStreet().getStreetname());
           }
    }
    @Test/*查询用户默认收货的cityid*/
    public void testSelectUserCityId(){
        int cityid=defaultAddressMapper.selectUserCityId(1001);
        System.out.println(cityid);
    }

    @Test/*根据国家名查国家*/
    public void testSelectCountryName(){
        System.out.println(countryMapper.selectCountryByCountryName("中国"));
    }
    @Test/*根据省名查省*/
    public void testSelectProvinceName(){
        System.out.println( provinceMapper.selectProvinceByProvinceName("北京"));
    }
    @Test/*根据市名查市id*/
    public void testSelectCityName(){
        System.out.println(cityMapper.selectCityByCityName("南京市"));
    }
    @Test/*根据区名查区id*/
    public void testSelectDistrictName(){
        System.out.println(districtMapper.selectDistrictByDistricName("玄武区"));
    }
    @Test/*根据街道名查街道id*/
    public void testSelectStreetName(){
        System.out.println(streetMapper.selectStreetByStreetName("栖口街道"));
    }
    @Test  /*根据用户的cityid，查询医院*/
    public void testSelectHospitalByName() {
        int cityid = defaultAddressMapper.selectUserCityId(1001);
        List<HospitalInfo> hospitalInfo = hospitalInfoMapper.selectHospitalInfoByUserCityId(cityid);
        for (HospitalInfo hosp : hospitalInfo) {
            System.out.println(hosp.getHospitalname());
            System.out.println(hosp.getCity().getCityname());
            System.out.println(hosp.getDistrict().getDistrictname());
            System.out.println(hosp.getStreet().getStreetname());
            System.out.println(hosp.getHospitalintroduce());
        }
    }

    @Test/*g根据用户id用户进行增加地址*/
    public void testInsertUserAddress(){
        Country country=countryMapper.selectCountryByCountryName("中国");
        Province province=provinceMapper.selectProvinceByProvinceName("北京");
        City city=cityMapper.selectCityByCityName("南京市");
        District district=districtMapper.selectDistrictByDistricName("玄武区");
        Street street=streetMapper.selectStreetByStreetName("栖口街道");
        User user=userMapper.selectByUserId(1002);
        Address address=new Address(country,province,city,district,street,user);
        //System.out.println(address.getCountry().getCountryid());
        addressMapper.insertUserAddress(address);
    }

    @Test /*根据医院名，查询医院*/
    public void testSelectHospitalByHospitalName(){
        HospitalInfo hospitalInfo=hospitalInfoMapper.selectHospitalInfoByHostipalName("爱宠医院");
        System.out.println(hospitalInfo.getHospitalname());
        System.out.println(hospitalInfo.getCity().getCityname());
        System.out.println(hospitalInfo.getDistrict().getDistrictname());
        System.out.println(hospitalInfo.getStreet().getStreetname());
        System.out.println(hospitalInfo.getHospitalintroduce());
    }

    @Test/*查询所有的服务类型*/
    public void testSelectServiceType(){
      List<ServiceType> serviceTypes= serviceTypeMapper.selectAllServiceType();
        for (ServiceType ser : serviceTypes) {
            System.out.println(ser.getServicename());
            System.out.println(ser.getServiceinfo());
            System.out.println(ser.getNowprice());
            System.out.println(ser.getVipprice());
        }
    }

    @Test/*根据名字查服务类型*/
    public  void  testServiceTypeByServiceName(){
        ServiceType serviceType=serviceTypeMapper.selectServiceTypeByServiceName("理发");
        System.out.println(serviceType.getServicename());
        System.out.println(serviceType.getServiceinfo());
    }

    @Test/*查询所有狗狗重量*/
    public void testSelelctAllDogWeight(){
        List<DogWeight> dogWeights=dogWeightMapper.selectAllDogWeight();
        for(DogWeight dog: dogWeights){
            System.out.println(dog.getWeight());
            System.out.println(dog.getDogweightdiscount());
        }
    }

    @Test/*根据狗狗的重量查询折扣*/
    public void testSelectDogDiscountByDogWeight(){
        System.out.println(dogWeightMapper.selectDiscountByDogWeight(4,7));
    }

    @Test/*根据服务等级查询折扣*/
    public void testSelectServiceTypeByServiceName(){
        System.out.println(serviceGradeMapper.selectDiscountByServicegradename("初级档"));
    }
    @Test/*查询所有的服务等级*/
    public void testSelectAllServiceGrade(){
        List<ServiceGrade> serviceGrades=serviceGradeMapper.selectAllServiceGrade();
        for(ServiceGrade ser: serviceGrades){
            System.out.println(ser.getServicegradename());
            System.out.println(ser.getServicegradediscount());
        }
    }

    @Test/*根据用户id查询订单*/
    public void testSelectOrderByUserId(){
        System.out.println(orderMapper.selectOrderByUserId(1001));
    }
    @Test/*根据用户id查询所有的订单*/
    public void testSelectAllOrderByUserId(){
        System.out.println(orderMapper.selectAllOrderByUserId(1002));
    }
    @Test/*插入一条服务明细*/
    public void testInsertServiceDetail(){
        ServiceGrade serviceGrade=serviceGradeMapper.selectDiscountByServicegradename("中级档");
        ServiceType serviceType=serviceTypeMapper.selectServiceTypeByServiceName("理发");
        DogWeight dogWeight=dogWeightMapper.selectDiscountByDogWeight(4,7);
        Order order=orderMapper.selectOrderByUserId(1001);
        int servicecount=3;
        Double oneservicecountprice=servicecount*serviceGrade.getServicegradediscount()*serviceType.getNowprice()*dogWeight.getDogweightdiscount();
        pluto.entity.ServiceDetail servicedetail=new pluto.entity.ServiceDetail();
        servicedetail.setServicecount(servicecount);
        servicedetail.setOneservicecountprice(oneservicecountprice);
        servicedetail.setOrder(order);
        servicedetail.setServicegrade(serviceGrade);
        servicedetail.setServicetype(serviceType);
        servicedetail.setDogweight(dogWeight);
        serviceDetailMapper.insertServiceDetail(servicedetail);
    }

    @Test/*查询服务明细根据orderid*/
    public void selectServiceDetailByOrderId(){
        System.out.println(serviceDetailMapper.selectServiceDetailByOrderId(1001));
    }

    @Test/*查询服务明细根据服务明细id*/
    public void testServiceDetailByServiceDetailId(){
        System.out.println(serviceDetailMapper.selectServiceDetailByServiceDetailId(1001));
    }

    @Test /*修改服务明细中的天数*/
    public void testUpdateServiceCount(){
        System.out.println(serviceDetailMapper.updateServiceDetail(10));
    }
    @Test/*根据服务明细id删除服务明细*/
    public void testDeleteServiceDetailByServiceDetailid(){
        System.out.println(serviceDetailMapper.deleteServiceDetailByServiceDetailId(1002));
    }
    @Test/*根据订单id删除服务明细*/
    public void testDeleteServiceDetailByOrderId(){
        System.out.println(serviceDetailMapper.deleteServiceDetailByOrderId(1002));
    }
    @Test/*查询用户消费记录根据用户id*/
    public void testSelectUserConsumptionByUserId(){
        System.out.println(userConsumptionMapper.selectAllUserConsumption(1001));
    }
}          
