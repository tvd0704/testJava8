package learnjava8;

public interface Shape {
    void draw ();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("rectangle draw");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("circle draw");
    }
}
class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("square draw");
    }
}