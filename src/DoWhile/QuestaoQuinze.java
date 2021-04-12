package DoWhile;

public class QuestaoQuinze {
        public static long fibonacci(int n){
            if(n<2){
                return n;
            }else{
                return fibonacci(n-1)+fibonacci(n-2);
            }
        }

    public static void main(String[] args) {
        for(int i=0; i<30;i++){
            System.out.print("(" + i + "):" + QuestaoQuinze.fibonacci(i) + "\t");
    }

        }
    }
/*
A série de Fibonacci é formada pela seqüência
1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série
até o n−ésimo termo.
 */