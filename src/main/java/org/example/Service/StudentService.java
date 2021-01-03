package org.example.Service;

import org.example.entity.Student;

import java.util.List;

/**
 * @Author: MaiYu
 * @Date: Create in 19:09 2021/1/3
 */
public interface StudentService {
    public Student service();

    public Boolean insertService();

    public List<Student> selectIns();
}
