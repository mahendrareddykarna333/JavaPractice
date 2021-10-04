package uk.strings;//. Print all comma separated values in a new line .  ( Use Spring.split() method )
//   Given the input String value = "a,b,c";
//   The output should be :
//   a
//   b
//   c

public class SpringSpilt {

    public static void main(String args[]){
        String s1="a,b,c";
        String[] letters=s1.split(",");

        for(String w:letters){
            System.out.println(w);
        }
    }}


