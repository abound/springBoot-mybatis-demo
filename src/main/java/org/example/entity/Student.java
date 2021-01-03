package org.example.entity;

import lombok.*;
import org.junit.jupiter.api.Test;

/**
 * @Author: MaiYu
 * @Date: Create in 16:23 2021/1/3
 */
@Setter
@Getter
@ToString
@AllArgsConstructor
public class Student {


    private Integer id;

    private String name;
    private String hobby;
    private String major;

    public Student(Integer id, String name, String hobby) {
        this.id = id;
        this.name = name;
        this.hobby = hobby;
    }
}
