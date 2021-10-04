package uk.strings;//5. Print the entered input text in all lower case   use tolower() or toUpper()
//   and all in uppercase as well.
//
//    ex input:   This
//       output:    In Upper case : THIS
//                  In Lower case : this

public class LowerCaseUpperCase {


        public static void main(String args[])
        {
            String S1 = new String("This");

            System.out.println(S1.toUpperCase());
            System.out.println(S1.toLowerCase());

        }
    }

