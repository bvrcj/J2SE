package com.chaitu.core.day2;

class StaticDemoTest{
    static{
        System.out.println("static block of parent class");
    }
}
public class StaticBlocks extends StaticDemoTest{
    static{
        System.out.println("static block of child class");
    }
    public void display()
    {
        System.out.println("Just a method of child class");
    }
    public static void main(String args[])
    {
        StaticBlocks obj = new StaticBlocks();
        obj.display();
    }
}
