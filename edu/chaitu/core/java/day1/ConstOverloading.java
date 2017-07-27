package com.chaitu.core.day1;

public class ConstOverloading
{
   private int rollNum;
   ConstOverloading()
   {
      rollNum =100;
   }
   ConstOverloading(int rnum)
   {
      this();
      /*this() is used for calling the default  
       * constructor from parameterized constructor.
       * It should always be the first statement 
       * in constructor body.
       */
      rollNum = rollNum+ rnum;
   }
   public int getRollNum() {
      return rollNum;
   }
   public void setRollNum(int rollNum) {
      this.rollNum = rollNum;
   }
}
class TestDemo{
   public static void main(String args[])
   {
       ConstOverloading obj = new ConstOverloading(12);
       System.out.println(obj.getRollNum());
    }
}
