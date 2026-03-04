import java.util.List;

abstract class VideoFactory {

    public abstract Video criarVideo(String titulo, String diretor, int anoLancamento, String genero,
            List<String> atores);

}