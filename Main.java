import java.util.Arrays;
import java.util.List;

public class Main {
        public static void main(String[] args) {

                // Criando fábricas
                FilmeFactory filmeFactory = new FilmeFactory();
                SerieFactory serieFactory = new SerieFactory();

                // Criando filmes
                Video filme1 = filmeFactory.criarVideo("Interestelar", "Christopher Nolan", 2014, "Ficção Científica",
                                Arrays.asList("Matthew McConaughey", "Anne Hathaway", "Jessica Chastain"));

                Video filme2 = filmeFactory.criarVideo("Cidade de Deus", "Fernando Meirelles", 2002, "Drama",
                                Arrays.asList("Alexandre Rodrigues", "Leandro Firmino", "Alice Braga"));

                Video filme3 = filmeFactory.criarVideo("Pantera Negra", "Ryan Coogler", 2018, "Ação",
                                Arrays.asList("Chadwick Boseman", "Michael B. Jordan", "Lupita Nyong'o"));

                // Criando séries
                Video serie1 = serieFactory.criarVideo("Stranger Things", "Irmãos Duffer", 2016, "Ficção Científica",
                                Arrays.asList("Millie Bobby Brown", "Finn Wolfhard", "Winona Ryder"));

                Video serie2 = serieFactory.criarVideo("Breaking Bad", "Vince Gilligan", 2008, "Drama",
                                Arrays.asList("Bryan Cranston", "Aaron Paul", "Anna Gunn"));

                Video serie3 = serieFactory.criarVideo("Friends", "David Crane", 1994, "Comédia",
                                Arrays.asList("Jennifer Aniston", "Courteney Cox", "Lisa Kudrow"));

                // Criando usuários
                Usuario usuario1 = new Usuario("João", "joao@example.com", "senha123");
                Usuario usuario2 = new Usuario("Maria", "maria@example.com", "senha456");

                // Adicionando filmes/séries aos favoritos dos usuários
                usuario1.adicionarFavorito(filme1);
                usuario1.adicionarFavorito(serie1);
                usuario1.adicionarFavorito(filme3);

                usuario2.adicionarFavorito(filme2);
                usuario2.adicionarFavorito(serie2);
                usuario2.adicionarFavorito(serie3);

                // Removendo um favorito do usuário 1
                usuario1.removerFavorito(filme3);

                // Exibindo filmes/séries favoritos dos usuários
                usuario1.listarFavoritos();
                usuario2.listarFavoritos();
        }
}