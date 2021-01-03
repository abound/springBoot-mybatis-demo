package org.example.Comtroller;

import org.example.Service.StudentServiceImpl;
import org.example.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: MaiYu
 * @Date: Create in 16:59 2021/1/3
 */
@RestController
public class StudentController {

    @Autowired
    StudentServiceImpl studentService;
    @GetMapping("/alex")
    public String controller(){
        return studentService.service().toString();
    }

    @GetMapping("/set")
    public boolean insertService(){
        return studentService.insertService();
    }
    @GetMapping("/ins")
    public List<Student> ins(){
        return studentService.selectIns();
    }
}
