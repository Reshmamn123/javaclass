package demo1;

import java.awt.desktop.SystemSleepEvent;

public class StringMethod {
    public static void main(String[] args) {

        //String s = "welcome";
        //System.out.println(s);  //welcome

        //length()
        //String s ="welcome";
        //System.out.println(s.length());  // 7

        //concat()
        //String s1 = "reshma";
        //String s2 = "nagenahalli";
       // System.out.println(s1.concat (s2));   //reshma nagenahalli

        //trim()
        //String s = "   welcome   ";
       // System.out.println(s.trim());  //its remove the space
        //System.out.println("before trimming:" +s.length());  //13
        //System.out.println("after trimming:" +s.length());   //7

        //CharAt()
       // String s ="Reshma";
        //System.out.println(s.charAt(3));   //h

        //equal()
         String s1 = "reshma";
         String s2 = "reshma";
        // System.out.println(s1.equals(s2));   //true
          //String s2 = "Reshma";
        System.out.println(s1.equals("Reshma"));   //false because its case sensitive

        //contains()
         //String s = "Reshma";
        // System.out.println(s.contains("resh"));  //false
       // System.out.println(s.contains("Resh"));   //true

        //replace()
        //String s = "Reshma";
        //System.out.println(s.replace('R','N'));   //Neshma

        //substring()
        //String s = "Nagenahalli";
       // System.out.println(s.substring(0,5));   //nagen
        //System.out.println(s.substring(4,6));   //na

        //toUpperCase() and toLowerCase
         //String s = "reshma";
         //System.out.println(s.toUpperCase());  //RESHMA
          String s = "RESHMA";
        System.out.println(s.toLowerCase());      //reshma



    }

}
