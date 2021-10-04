package uk.strings;//8. Change comma separated value with $       , use replaceAll()
  //      for example a,b,c  should output   a$b$c






public class StringSeprate {
    public static void main(String args[]) {
        String str = "a,b,c";

        String str2 = str.replace(",", "$");
        System.out.println(str2);
    }}

