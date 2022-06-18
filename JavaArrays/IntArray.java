package JavaArrays;

public class IntArray {

    public static void main(String[] args) {
        int numbers[] = {2,4,6,72,1,98};
        System.out.println("Total number of elements in Array: "+numbers.length);

        for (int i=0; i<numbers.length; i++){

            int number = numbers[i];

            System.out.println("index  "+ i+ " value:  "+ number);


        }

    }
}
