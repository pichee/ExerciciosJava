public class ProdutoImportado extends Product{
    private double taxa;

    public ProdutoImportado(String productName,double productPrice,int taxa) {
        super(productName, productPrice);
        this.taxa = taxa;
        this.taxa=(this.taxa/100*productPrice)+productPrice;
    }

    @Override
    public String toString() {
        return "ProdutoImportado{" +
                "productPrice=" + productPrice +
                ", productName='" + productName + '\'' +
                ", taxa=" + taxa +
                '}';
    }
}
