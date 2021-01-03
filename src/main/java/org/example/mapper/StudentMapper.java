package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: MaiYu
 * @Date: Create in 16:25 2021/1/3
 */

public interface StudentMapper {


    public Student selectStudentByHobby(@Param("name") String name,@Param("hobby") String hobby);

    public boolean insert(Student student);

    public List<Student> selectIn(List<String> names);

}
