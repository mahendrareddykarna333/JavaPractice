package uk.strings;

//2. Print the reverse of a given String .      use chartAt() , length() and a
// for loop to prepare the reverse of a given string
//
//   ex:  input String value = "abcdef";
//   The output should be :   fedcba
//
public class StringReverse {

    public static void main(String[] args) {

        String input = "abcdef";
        String output = "";

        for(int i = input.length()-1; i>=0; i--){
            output = output + input.charAt(i);
        }

        System.out.print("The reversed string of the '"+input+"' is: " );
        System.out.println(output);


    }
}

