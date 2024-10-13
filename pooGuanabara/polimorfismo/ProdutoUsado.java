import java.util.Date;
public class ProdutoUsado extends Product{
    private String dataDeFabricacao;
    public ProdutoUsado(String productName, double productPrice, String dataDeFabricacao) {
        super(productName, productPrice);
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public String getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(String dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    @Override
    public void priceTaG() {
        System.out.println("Nome:"+this.productName);
        System.out.println("Produto:"+this.productPrice);
        System.out.println("Data de Fabricacao:"+this.dataDeFabricacao);
    }

    @Override
    public String toString() {
        return "ProdutoUsado{" +
                "dataDeFabricacao='" + dataDeFabricacao + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}

