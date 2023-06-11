package learnjava8;

import java.util.function.Function;

class FunctionIml implements Function<String, Integer> {

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}


public class FunctionDemo {
    public static void main(String[] args) {

    Function<String,Integer> function = (String s) -> {
            return s.length();
        };
        System.out.println(function.apply("duc tran van"));

    }
}
