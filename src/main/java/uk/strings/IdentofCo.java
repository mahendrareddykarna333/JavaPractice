package uk.strings;// take the input of unique identification number and    Use either startsWith() ,
// subString() to get the first two letters and use if else to
//   prints the nationality.  take first two characters
//
//   ex :    input IN102034343, output   Indian
//                 GB343242344, output   British


public class IdentofCo {
    public static void main(String[] args) {
        String s1 = "IN102034343";
        String s2 = "GB102034343";

        System.out.println(print(s1));
        System.out.println(print(s2));
        System.out.println(print(null));
        System.out.println(print(""));
    }

    public static String print(String input) {

        String prefix = "";
        if (input != null && input.length() > 2) {
            prefix = input.substring(0, 2);
        }

        switch (prefix.toUpperCase()) {
            case "IN":
                return "Indian";
            case "GB":
                return "British";
            default:
                return "Invalid Input";
        }
    }
}




