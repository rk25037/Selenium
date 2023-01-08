public class coreJavaBrushup3 {
    public static void main(String[] args){

        //String is an object //String literal
        String s0 = "Rohit Kumar learning Selenium";
        //String s1 = "Rohit Kumar learning Selenium";
        String s2 = "Rohit";

        // In the above code for s0 and s1 only one memory will be allocated as the value is same.
        // for s3 another memory will be created as value is different

        // using new keyword
        String s3 = new String("Welcome");
        String s4 = new String("Welcome");

        //Spliting string
        String[] splittedString = s0.split(" ");
        // Printing the words
        for(int i=0; i < splittedString.length; i++){
            System.out.println(splittedString[i].trim());
        }

        //Getting each letter of a word

        for(int i = 0; i < s0.length();i++ ){
            System.out.println(s0.charAt(i));
        }

        //Getting each letter of a word in reverse
        System.out.println("Getting each letter of a word in reverse");
        for(int i = s0.length() - 1; i >= 0;i-- ){
            System.out.println(s0.charAt(i));
        }
    }
}
