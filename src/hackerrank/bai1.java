package hackerrank;

import java.util.List;

public class bai1 {

    public static int sumOfArray (List<Integer> arr) {
        int result = arr.stream().reduce(0, (a,b)->a+b);
        return result;
    }

    public static void main(String[] args) {

    }
}
