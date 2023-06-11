package learnjava8;

public interface Addable {
    int addition (int a , int b);
}

class AddableIml implements Addable {

    @Override
    public int addition(int a, int b) {
       return a + b;
    }
}