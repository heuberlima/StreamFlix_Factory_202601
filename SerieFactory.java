import java.util.List;

public class SerieFactory extends VideoFactory {

    public Video criarVideo(String titulo, String diretor, int anoLancamento, String genero, List<String> atores) {

        int numTemporadas = 99;

        if (numTemporadas <= 0) {
            throw new IllegalArgumentException("O número de temporadas da série deve ser maior que zero.");
        }

        return new Serie(titulo, diretor, anoLancamento, genero, atores, numTemporadas);
    }

}
