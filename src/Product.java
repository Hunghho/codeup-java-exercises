public class Product {
    private String name;
    private double priceInCents;

    // Constructors
    public Product(String name, double priceInCents) {
        this.name = name;
        this.priceInCents = priceInCents;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", priceInCents=" + priceInCents +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(double priceInCents) {
        this.priceInCents = priceInCents;
    }

    public static double averagePrice(Product[] products){
        double average = 0.0;
        for(Product product : products){
            average += product.priceInCents;
        }
        return average / products.length;
    }

    public static void main(String[] args) {
        Product[] products = new Product[4];
        Product product1 = new Product("nails", 0.15);
        Product product2 = new Product("staples", 0.02);
        Product product3 = new Product("papers", 0.07);
        Product product4 = new Product("pencils", 0.58);

        products[0] = product1;
        products[1] = product2;
        products[2] = product3;
        products[3] = product4 ;

        System.out.printf("average of all products = $%.2f", averagePrice(products));
    }
}
