package array;

public class RemoteEvent {

    public static int countIndexOdd(int[] array) {
        int count =0;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 != 0) {
                count++;
            }
        }
        return  count;
    }

    public static void oddArray (int numberElement, int [] arrays) {
        int count = 0;
        int myOddArray[] = new int[numberElement];
        for (int i =0; i<arrays.length;i++) {
            if(arrays[i]%2!=0) {
                myOddArray[count] = arrays[i];
                count++;
            }
        }
        System.out.println(myOddArray[1]);
    }
    public static void main(String[] args) {
        int myArray[] = new int[5];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;

        oddArray(countIndexOdd(myArray), myArray);

    }

}
