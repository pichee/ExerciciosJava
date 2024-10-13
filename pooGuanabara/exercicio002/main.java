public class Vizualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Vizualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
    }

    @Override
    public String toString() {
            return "Dados\n" +
                    " Espectador: " + espectador + ",\n" +
                    "  Filme: " + filme + "\n" +
                    '}';
        }
    
    }
