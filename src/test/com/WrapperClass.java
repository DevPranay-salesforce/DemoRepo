package test.com;

public class WrapperClass {
 public static void main(String args[]) {
        int x = 5;
        float y = 3.14f;
        long z=6000;
 
        // autoboxing
        Integer intobj = x;
        Float floatobj=y;
        Long longobj=z;
        // print
        System.out.println(intobj);
        System.out.println(floatobj);
        System.out.println(longobj);
    }
    }
