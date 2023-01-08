import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class coreJavaBrushup2 {
    public static void main(String[] args){
        int[] arr = {1,4,34,56,76,85,70,89,75,81,90};

        //use for loop with if-else

        for(int i=0; i < arr.length; i++){
            if (arr[i]%2 == 0){
                System.out.println(arr[i]+" is even number");
            }
            else{
                System.out.println(arr[i]+" is odd number");
            }
        }

        ArrayList<String> a = new ArrayList<String>();
        a.add("Rohit");
        a.add("Kumar");
        a.add("Learning");
        a.add("Selenium");
        //a.remove(2);
        System.out.println(a.get(3));
        System.out.println(" ");

        for(int i = 0; i < a.size(); i++ ){
            System.out.println(a.get(i));
        }
        System.out.println("**************************************");
        for (String s: a){
            System.out.println(s);
        }
        System.out.println("**************************************");
        System.out.println(a.contains("Selenium"));
        //Converting array to ArrayList
        System.out.println("**************************************");
        //System.out.println("Converting array to ArrayList");
        List<int[]> convertedArrayList = Arrays.asList(arr);

    }
}
