package com.edu.java.part5.demo87;

/**
 * @description: 测试Person类
 * @author: CL
 * @time: 2019/11/8 19:30
 */
public class PersonTest {
    public static void main(String[] args) {
        PersonDo person1 = new PersonDo();
        PersonDo person2 = new PersonDo("明日科技", "男", 1);
        System.out.println("员工1的信息");
        System.out.println("员工姓名：" + person1.getName());
        System.out.println("员工性别：" + person1.getGender());
        System.out.println("员工年龄：" + person1.getAge());
        System.out.println("员工2的信息");
        System.out.println("员工姓名：" + person2.getName());
        System.out.println("员工性别：" + person2.getGender());
        System.out.println("员工年龄：" + person2.getAge());

    }
}
