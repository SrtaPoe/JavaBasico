package AtividadesPOO.aula24;

public class LivroSkoob {
    public static void main(String[] args) {

        Livro oneDay = new Livro();
        oneDay.titulo = "Um dia";
        oneDay.autor = "David Nicholls";
        oneDay.anoPublicacao = 2012;
        oneDay.editora = "Intrínseca";
        oneDay.genero = "romance";
        oneDay.numeroDePaginas = 220;

        System.out.println("O livro " + oneDay.titulo + " do autor inglês " + oneDay.autor
        + " tem " + oneDay.numeroDePaginas + " páginas " + "e foi publicado no ano de " +
                oneDay.anoPublicacao + " pela editora " + oneDay.editora);
    }
}

/* teste da classe Livros */