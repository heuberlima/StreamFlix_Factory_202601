import java.util.List;

public class FilmeFactory extends VideoFactory {

    public Video criarVideo(String titulo, String diretor, int anoLancamento, String genero,
            List<String> atores) {

        int duracaoFilme = 99;

        if (duracaoFilme <= 0) {
            throw new IllegalArgumentException("A duração do filme deve ser maior que zero.");
        }

        return new Filme(titulo, diretor, anoLancamento, genero, atores, duracaoFilme);
    }

}
