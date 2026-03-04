
import java.util.List;

class Filme extends Video {
    private int duracao;

    public Filme(String titulo, String diretor, int anoLancamento, String genero, List<String> atoresPrincipais,
            int duracao) {
        super(titulo, diretor, anoLancamento, genero, atoresPrincipais);
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Duração: " + duracao + " minutos\n";
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}