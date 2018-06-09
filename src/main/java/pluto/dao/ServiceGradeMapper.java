package pluto.dao;

import pluto.entity.ServiceGrade;

import java.util.List;

public interface ServiceGradeMapper {

   /*查询所有的服务等级*/
   public List<ServiceGrade> selectAllServiceGrade();

   /*根据档次名字查询服务折扣*/
   public ServiceGrade selectDiscountByServicegradename(String servicegradename);
}