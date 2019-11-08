package com.edu.java.part5.demo87;

/**
 * @description: 人实体类
 * @author: CL
 * @time: 2019/11/8 19:26
 */
public class PersonDo {

    /**
     * 名称
     */
    private String name;
    /**
     * 性别
     */
    private String gender;
    /**
     * 年龄
     */
    private int age;

    public PersonDo() {
        System.out.println("使用无参构造方法创建对象！");
    }

    public PersonDo(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        System.out.println("使用有参构造方法创建对象！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
