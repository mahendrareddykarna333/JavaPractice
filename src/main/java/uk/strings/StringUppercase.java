package uk.strings;//3. Print the first character in Uppercase
// use chartAt()< substring() and String concatenation
//   ex:  input "abcdef" ;
//   output :    Abcdef




public class StringUppercase {
    public static void main(String[]args){

        String name="abcdef";
        String remainingLetters = name.substring(1, name.length());
        name = Character.toUpperCase(name.charAt(0)) + remainingLetters;
        System.out.println("Name: " + name);

    }
}




