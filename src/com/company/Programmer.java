package com.company;

public class Programmer {
    private String name;
    private int age;

    void setName(String studentAty) {
        if (studentAty.length()>40){
            System.out.println("Adam aty 40 tamgadan kop boluwu mumkun emes");
        } else {
            name = studentAty;
        }
    }
    void setAge(int studentJashy) {
        if (studentJashy > 70) {
            System.out.println("Programmistin jashy 70ten chon bolboyt");
        }else
            age = studentJashy;
    }


    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }
}
