package java_8features;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Stream_Api {

    public static void main(String[] args) {

        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Hello All";
            }
        };

     
        Stream<String> lambdaSupplier = Stream.generate(supplier);

       
        System.out.println(lambdaSupplier);
//        System.out.println(((Supplier<String>) lambdaSupplier).get()); 
    }
}
