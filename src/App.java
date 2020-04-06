import java.util.Arrays;

public class App {

    public static void main(String[]args){


        System.out.println("哈哈");


        int array[]={21,2,23,4,5};


        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j+1]>array[j]) {

                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }

        }

        System.out.println(Arrays.toString(array));
    }
}
