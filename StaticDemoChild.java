package com.chaitu.core.day2;

class StaticDemo
{
     public StaticDemo()
     {
         /*Constructor of this class*/
         System.out.println("StaticDemo");
     }
}
public class StaticDemoChild extends StaticDemo
{
     public StaticDemoChild()
     {
          /*By default this() is hidden here */
          System.out.println("StaticDemoChild");
     }
     public void display()
     {
          System.out.println("Just a method of child class");
     }
     public static void main(String args[])
     {
          StaticDemoChild obj = new StaticDemoChild();
          obj.display();
     }
}
