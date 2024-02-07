import java.util.Arrays;
import java.util.Collections;

public class Initializer {
    public static void main(String[] args) {
        Box box = new Box(
                Arrays.asList(
                        new Box(
                                Collections.emptyList(),
                                Arrays.asList(
                                        new Product("Book", 200.0),
                                        new Product("Toffee", 150.0),
                                        new Product("Ruler", 100.0)
                                )),
                        new Box(
                                Collections.emptyList(),
                                Arrays.asList(
                                        new Product("Phone", 200.0),
                                        new Product("Shirt", 150.0),
                                        new Product("Bag", 100.0)
                                )
                        ),
                        new Box(
                                Collections.emptyList(),
                                Collections.emptyList()
                        )
                ),
                Arrays.asList(
                        new Product("Mouse", 200.0),
                        new Product("Bottle", 150.0)
                )
        );
        double cost = box.calculateCost();
        System.out.println(cost);
    }
}
