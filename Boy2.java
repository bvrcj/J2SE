package com.chaitu.core.day1;

class Human1
{
        String s1, s2;
        public Human1()
        {
              s1 ="Super class";
              s2 ="Parent class";
        }
        public Human1(String str)
        {
               s1= str;
               s2= str;
        }
}
public class Boy2 extends Human1
{
        public Boy2()
        {
            super("calling super one");
            s2 ="Child class";
        }
        public void disp()
        {
               System.out.println("String 1 is: "+s1);
               System.out.println("String 2 is: "+s2);
        }
        public static void main(String args[])
        {
                Boy obj = new Boy();
                obj.disp();
        }
}
