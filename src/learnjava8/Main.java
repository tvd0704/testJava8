package learnjava8;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = () -> {
            System.out.println("rectangle class is draw ");
        };
        Shape square = () -> {
            System.out.println("square class is draw");
        };

        Shape circle = () -> {
            System.out.println("circle class is draw");
        };
        print(rectangle);
        print(square);
        print(circle);

        Addable addable = (a,b) -> {
            return a + b;
        };
      int result =   addable.addition(4,5);
        System.out.println(result);
    }

    public static void print (Shape shape) {
        shape.draw();
    }

}

