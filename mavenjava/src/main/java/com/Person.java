package com;

public class Person {
    public String name;//private定义的变量只能在类里面访问，不能在其他类中new一个对象访问
    protected int age;//只能在同一个包中的其他类中new一个对象访问
    public String job;//public公有，在任何地方都能new一个对象访问
    //构造函数不能加void关键字
    public Person(){
        //默认构造函数
    }
    public Person(String name,int age,String job){
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setName(String name) {
        this.name = name;
    }

}
