public class Initialize {
    public static void main(String[] args) {
        Service service= new Service();
        service.wrapUpOrder(
                new CompositeBox(
                        new Bottle("Title",250)
                ),
                new CompositeBox(
                        new CompositeBox(
                                new Bottle("Title2",500)
                        )
                ),
                new Bottle("Title 3",450)
        );
        double total = service.calculateTotal();
        System.out.println(total);
    }
}
