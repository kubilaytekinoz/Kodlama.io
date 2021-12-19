public class Main {
    public static void main(String[] args) {


        Product product1 = new Product(1,"lenovo v14",14000,"8 GB RAM",10,12600);
        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Lenovo v15");
        product2.setDetail("16 GB RAM");
        product2.setUnitPrice(16000);
        product2.setDiscount(10);

        System.out.println(product2.getUnitPriceAfterDiscount());

        ProductManager productManager = new ProductManager();

        Product[] products = {product1,product2};
        for (Product product : products){
            System.out.println(product.getName());

        }
        productManager.addToCart(product1);
        productManager.addToCart(product2);

    }

}
