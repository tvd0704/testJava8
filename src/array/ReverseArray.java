package array;

public class ReverseArray {

    public static void reverseArray(int array[]) {

        int end = array.length;
        for (int i = 0; i < array.length; i++) {
            if (i>end -1 -i) {
                break;
            }
            int temp = array[i];
            array[i] = array[end - 1 - i];
            array[end - 1 - i] = temp;
        }

        for (int a = 0; a < array.length; a++) {
            System.out.println("array:" + array[a]);
        }

    }


    public static void main(String[] args) {

        int myArray[] = new int[5];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;

        reverseArray(myArray);


    }
}
