package JavaArrays;

public class FindTheLargestDegit {

    public static void main (String[] args) {

        double[] myList = {1.9, 2.9, 3.4, 3.5};

        for (int i = 0; i < myList.length; i++) {

            // Print all the array elements
            System.out.println(myList[i]);
        }

        //sum of all double values
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total = total + myList[i];

        }
        System.out.println("sum of the double values: " + total);

        // Finding the largest element


    }
}

