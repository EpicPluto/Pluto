package pluto.Test;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pluto.dao.ActiveGradeMapper;
import pluto.dao.ActiveSignUpMapper;
import pluto.dao.ActiveTypeMapper;
import pluto.dao.UserMapper;
import pluto.entity.ActiveGrade;
import pluto.entity.ActiveSignUp;
import pluto.entity.ActiveType;
import pluto.entity.User;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext_service.xml")
public class ActiveTest {

    @Autowired
    private ActiveGradeMapper activeGradeMapper;
    @Autowired
    private ActiveSignUpMapper activeSignUpMapper;
    @Autowired
    private ActiveTypeMapper activeTypeMapper;
    @Test
    public void testGrade(){
        System.out.println("等级分别是："+activeGradeMapper.selectAllActiveGrade());
        System.out.println("小型活动的价格是："+activeGradeMapper.selectPriceByActiveGrade("小型"));
    }
    @Test
    public void testSignUp(){
        List<ActiveSignUp> activeSignUpList=activeSignUpMapper.selectSignUpByUserId(1);
        System.out.println("按照id查询");
        for(ActiveSignUp activeSignUp:activeSignUpList) {
            System.out.print(activeSignUp.getSignupid()+ "\t");
            System.out.print(activeSignUp.getUser().getUsername()+ "\t");
            System.out.print(activeSignUp.getActivedate() + "\t");
            System.out.print(activeSignUp.getActivegrade().getActicegrade()+ "\t");
            System.out.print(activeSignUp.getActivetype().getActivename()+ "\t");
            System.out.println(" ");
        }
        System.out.println("按日期查询");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yy-MM-dd");
        try {
            Date date=sdf2.parse("2018-6-6");
            List<ActiveSignUp> activeSignUp1=activeSignUpMapper.selectSignUpByActivedate(date);
            for(ActiveSignUp activeSignUp:activeSignUp1) {
                System.out.print(activeSignUp.getSignupid()+ "\t");
                System.out.print(activeSignUp.getUser().getUsername()+ "\t");
                System.out.print(activeSignUp.getActivedate() + "\t");
                System.out.print(activeSignUp.getActivegrade().getActicegrade()+ "\t");
                System.out.print(activeSignUp.getActivetype().getActivename()+ "\t");
                System.out.println(" ");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }



       /* System.out.println("按日期查询："+activeSignUpMapper.selectSignUpByActivedate(new Date("2018-05-09")));*/
    }
    @Test
    public void testinsert() throws ParseException {
        SimpleDateFormat sdf2 = new SimpleDateFormat("yy-MM-dd");
        Date date=sdf2.parse("2018-6-6");
        ActiveSignUp activeSignUp=new ActiveSignUp(new User(),date,new ActiveType(),new ActiveGrade());

        System.out.println("插入测试："+activeSignUpMapper.insertActiveSignUp(activeSignUp));
    }
    @Test
    public void testupdate() throws ParseException {
        SimpleDateFormat sdf2 = new SimpleDateFormat("yy-MM-dd");
        Date date=sdf2.parse("2018-6-7");
        User user=new User();
        user.setUserid(1);
        ActiveSignUp activeSignUp=new ActiveSignUp(1,user,date,new ActiveType(),new ActiveGrade());

        System.out.println("更新测试："+activeSignUpMapper.updateActiveSignUp(activeSignUp));
    }
    @Test
    public void testdelete(){
        System.out.println("删除测试："+activeSignUpMapper.deleteActiveSignUp(2));
    }
    @Test
    public void testType(){
        System.out.println("活动类别有："+activeTypeMapper.selectActiveTypeName());
    }
}
