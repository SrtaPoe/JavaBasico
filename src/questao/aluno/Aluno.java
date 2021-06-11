package questao.aluno;

public class Aluno {
    double nota1;
    double nota2;
    double nota3;
    String nome;
    int matricula;
    String curso;
    String disciplina ;

    Aluno(){
        this.nome = nome;
        this.curso = curso;
        this.disciplina = disciplina;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    double mediaAluno(){
        double media = (nota1+nota2+nota3)/3;
        return media;
    }

    void verificarSituacaoAluno(){
        if(mediaAluno()>=7){
            System.out.println("O aluno foi aprovado");
        }else{
            System.out.println("O aluno foi reprovado");
        }
    }

    void resultadoFinal(){
        System.out.println("O aluno " + this.nome + " portador da matricula n° " + this.matricula +
                " matriculado na disciplina de " + this.disciplina + " do curso de " + this.curso + " teve media de "
        + this.mediaAluno());
    }
}


/*
questao numero 3 da lista 25. Foi testada apenas com 1 aluno, porém a questao solicita
3 alunos, porém ainda estou aperfeiçoando meus conhecimentos com Array e Hash para
implementar que os dados solicitados para os usuarios sejam armazenados numa collection
 */