import java.util.List;

class Video {
    private String titulo;
    private String diretor;
    private int anoLancamento;
    private String genero;
    private List<String> atoresPrincipais;

    public Video(String titulo, String diretor, int anoLancamento, String genero, List<String> atoresPrincipais) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
        this.atoresPrincipais = atoresPrincipais;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<String> getAtoresPrincipais() {
        return atoresPrincipais;
    }

    public void setAtoresPrincipais(List<String> atoresPrincipais) {
        this.atoresPrincipais = atoresPrincipais;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\n" +
                "Diretor: " + diretor + "\n" +
                "Ano de Lançamento: " + anoLancamento + "\n" +
                "Gênero: " + genero + "\n" +
                "Atores Principais: " + atoresPrincipais + "\n";
    }
}
