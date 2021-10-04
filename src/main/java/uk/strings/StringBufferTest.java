package uk.strings;



public class StringBufferTest {


    /**
     * Dispaly following text to the user
     * Dear Reader,
     *     You have completed reading all the book
     *
     *     Thanks for returning the book
     *
     * Thanks
     * Your Librarian;
     */


    public static void main(String args[]) {


        StringBuffer instance = new StringBuffer("Initial text");
        String initialValue = "Dear Reader";
        String finalText = initialValue+"\n      You have completed reading all the book"+"\n"
                   +"      "+"Thanks for returning the book\n"
                   + "Thanks\n"+
                   "Your Librarian";

        System.out.println(finalText);
        useStringBuffer();


    }

    public static void useStringBuffer() {
        StringBuffer instance = new StringBuffer("Dear Reader\n")
                .append("\n      You have completed reading all the book")
                .append("\n      Thanks for returning the book\n")
                .append("Thanks\n")
                .append("Your Librarian");

        System.out.println(instance.toString());
    }
}
