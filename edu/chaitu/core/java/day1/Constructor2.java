package com.chaitu.core.day1;

public class Constructor2
{
      private int var;
      public Constructor2()
      {
             //code for default one
             var = 10;
      }
      public Constructor2(int num)
      {
             //code for parameterized one
             var = num;
      }
      public int getValue()
      {
              return var;
      }
      public static void main(String args[])
      {
              Constructor2 obj2 = new Constructor2(23);
              System.out.println("var is: "+obj2.getValue());
      }
}
