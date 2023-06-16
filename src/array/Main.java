package array;

public class Main {

    public static void printArray(int[] myArray) {
        int n = myArray.length;
        for (int i = 0; i < n; i++) {
            System.out.println("my array: " + myArray[i]);
        }
    }

    public static void main(String[] args) {
        int myArray[] = new int[5];
        myArray[0] = 1;
        myArray[1] = 5;
        myArray[2] = 2;
        myArray[3] = 3;
        myArray[4] = 4;
        myArray[1] = 4;

        printArray(myArray);

    }
}
