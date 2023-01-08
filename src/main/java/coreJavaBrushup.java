public class coreJavaBrushup {
    public static void main(String[] args){
        int myNum = 5;
        String myName = "Rohit Kumar";
        char letter = 'r';
        double dec = 5.99;
        boolean myCard = true;

        System.out.println(myNum+" is the value stored in the myNum variable");

        // Declaring array
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int[] arr2 = {1,2,3,4,5,6,7,8,9};

        //accessing array
        //System.out.println(arr2[2]);

        //for loop
        for (int i = 0; i < arr.length; i++ ){
            System.out.println("The value at index "+i +" for arr is "+arr[i]);
        }

        for (int i =0; i < arr2.length; i++){
            System.out.println("The value at index "+i +" for arr2 is "+arr2[i]);
        }

        String[] name = {"Rohit", "Kumar", "Selenium"};
        for (int i =0; i < name.length; i++){
            System.out.println("The value at index "+i +" for name is "+name[i]);
        }

        //Enhansed For loop
        System.out.println("Enhansed For loop");
        for(String s: name){
            System.out.println(s);
        }

    }
}
