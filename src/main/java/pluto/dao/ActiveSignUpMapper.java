package pluto.dao;

import org.apache.ibatis.annotations.Param;
import pluto.entity.ActiveSignUp;

import java.util.Date;
import java.util.List;

public interface ActiveSignUpMapper {
    List<ActiveSignUp> selectSignUpByUserId(int userId);
    List<ActiveSignUp>selectSignUpByActivedate(@Param(value="activedate")Date activedate);
    //由于每个活动都有大中小型、故不写按等级查询方法

    boolean insertActiveSignUp(ActiveSignUp activeSignUp);
    boolean updateActiveSignUp(ActiveSignUp activeSignUp);
    boolean deleteActiveSignUp(int signupid);
}
