import java.awt.event.ActionListener;
public class Video implements AcoesVideo{
    private String title;
    private String avaliacao;
    private int vizualizacao;
    private boolean reproducao;
    private int curtidas;
    public Video(String title, String avaliacao, int vizualizacao, boolean reproducao, int curtidas) {
        this.title = title;
        this.avaliacao = avaliacao;
        this.vizualizacao = vizualizacao;
        this.reproducao = reproducao;
        this.curtidas = curtidas;
    }

    //METODOS:
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isReproducao() {
        return reproducao;
    }

    public void setReproducao(boolean reproducao) {
        this.reproducao = reproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getVizualizacao() {
        return vizualizacao;
    }

    public void setVizualizacao(int vizualizacao) {
        this.vizualizacao = vizualizacao;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public void play() {
        this.reproducao = true;
        this.vizualizacao = this.vizualizacao+1;
    }

    @Override
    public void pause() {
        this.reproducao = false;
    }
    @Override
    public void like(){
        this.curtidas=this.curtidas+1;
    }

    @Override
    public String toString() {
        return "Video{" +
                "avaliacao='" + avaliacao + '\'' +
                ", title='" + title + '\'' +
                ", vizualizacao=" + vizualizacao +
                ", reproducao=" + reproducao +
                ", curtidas=" + curtidas +
                '}';
    }
}

