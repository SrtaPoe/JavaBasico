package DoWhile;

import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        String usuario;
        String senha;

        System.out.println("Digite seu usuário: ");
        usuario=dadosEntrada.next();
        System.out.println("Digite sua senha: ");
        senha=dadosEntrada.next();

        if (senha.equalsIgnoreCase(usuario)) {
            System.out.println("Digite seu usuário: ");
            while (usuario.equalsIgnoreCase(dadosEntrada.next())) {
                System.out.println("Digite sua senha: ");
            }
        }else{
            System.out.println("Acesso Liberado!");
        }
    }
}
