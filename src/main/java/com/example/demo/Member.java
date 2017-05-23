package com.example.demo;

/**
 * Created by tsengeagle on 2017/05/18.
 */
public class Member {

    private String Prop1;
    private String Prop2;

    public Member(String prop1, String prop2) {
        Prop1 = prop1;
        Prop2 = prop2;
    }

    public void printValue() {
        System.out.println(this.Prop1);
        System.out.println(this.Prop2);

    }
}
