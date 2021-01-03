package org.example.Service;

import org.example.entity.Student;
import org.example.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: MaiYu
 * @Date: Create in 16:58 2021/1/3
 */
@Service
public class StudentServiceImpl implements StudentService{

    @Resource
    StudentMapper studentMapper;

    @Override
    public Student service(){
        return studentMapper.selectStudentByHobby("alex",null);
    }

    @Override
    public Boolean insertService() {
        Student student = new Student(null, "tom", "play", "chinese");
        System.out.println(student.getId());
        boolean b = studentMapper.insert(student);
        System.out.println(student.getId());
        return b;
    }

    @Override
    public List<Student> selectIns() {
        List<String> ans=new ArrayList<>();
        ans.add("alex");
        ans.add("tom");
        List<Student> select = studentMapper.selectIn(ans);
        return select;
    }
}
