abstract class Product {
    protected String productName;
    protected double productPrice;
    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public double getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void  priceTaG(){
        System.out.println("Nome:"+this.productName);
        System.out.println("Produto:"+this.productPrice);
    }

}
d
