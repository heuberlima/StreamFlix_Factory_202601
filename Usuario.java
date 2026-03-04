import java.util.ArrayList;
import java.util.List;

class Usuario {
    private String nome;
    private String email;
    private String senha;
    private List<Video> favoritos;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.favoritos = new ArrayList<>();
    }

    // Getters e Setters omitidos para brevidade
    public void adicionarFavorito(Video video) {
        favoritos.add(video);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Video> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(List<Video> favoritos) {
        this.favoritos = favoritos;
    }

    public void removerFavorito(Video video) {
        favoritos.remove(video);
    }

    public void listarFavoritos() {
        System.out.println("Filmes/Séries Favoritos de " + nome + ":");
        for (Video video : favoritos) {
            System.out.println(video);
        }
    }
}
