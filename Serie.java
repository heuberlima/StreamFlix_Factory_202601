import java.util.List;

class Serie extends Video {
    private int numTemporadas;

    public Serie(String titulo, String diretor, int anoLancamento, String genero, List<String> atoresPrincipais,
            int numTemporadas) {
        super(titulo, diretor, anoLancamento, genero, atoresPrincipais);
        this.numTemporadas = numTemporadas;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Número de Temporadas: " + numTemporadas + "\n";
    }
}