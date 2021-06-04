package AtividadesPOO.aula24;

public class LivroDeBiblioteca {
    public static void main(String[] args) {

        Livro orgulhoEPreconceito = new Livro();
        orgulhoEPreconceito.titulo = "Orgulho e preconceito";
        orgulhoEPreconceito.autor = "Jane Austen";
        orgulhoEPreconceito.editora = "Nova Fronteira";
        orgulhoEPreconceito.numeroDePaginas = 320;
        orgulhoEPreconceito.genero = "Romance de época";
        orgulhoEPreconceito.anoPublicacao = 2018;
    }
}

/*
usando o resultado do modelo Livro como base, crie uma classe "LivroDeBiblioteca" que representa
os dados básicos de um livro de uma biblioteca, que pode ser emprestado a leitores.
 */
