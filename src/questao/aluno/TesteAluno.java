package questao.aluno;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Paolo";
        aluno1.matricula = 123456;
        aluno1.curso = "Ciência da Computação";
        aluno1.disciplina = "Algoritmos 1";
        aluno1.nota1 = 7;
        aluno1.nota2 = 7;
        aluno1.nota3 = 7;

        aluno1.mediaAluno();
        aluno1.verificarSituacaoAluno();
        aluno1.resultadoFinal();
    }
}
