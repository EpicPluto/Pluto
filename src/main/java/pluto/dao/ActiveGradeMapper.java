package pluto.dao;

import java.util.List;

public interface ActiveGradeMapper {
    //查询所有等级
    List<String> selectAllActiveGrade();
    //根据等级查询对应价格
    Double selectPriceByActiveGrade(String activeGrade);
}