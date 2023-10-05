package projexer3oop;

import classe.Pessoa;
import java.util.Scanner;

/**
 * Author joao_g_cristovao
 */
public class ProjExer3OOP {

    public static void main(String[] args) {
        Pessoa aluno = new Pessoa();
        Pessoa professor = new Pessoa();
        Scanner sc = new Scanner(System.in);
        byte acesso = 0;

        String nrCpf = "", nome = "", email = "", telefone = "";

        System.out.println("Informe sua função: "
                + "1 - Aluno  2 - Professor");
        acesso = sc.nextByte();

        System.out.println("Informe seu nome:");
        nome = sc.next();

        System.out.println("Informe seu CPF:");
        nrCpf = sc.next();

        System.out.println("Informe seu e-mail:");
        email = sc.next();

        System.out.println("Informe seu telefone:");
        telefone = sc.next();

        if (acesso == 1) {

            aluno.setNrCpf(nrCpf);
            aluno.setNome(nome);
            aluno.setEmail(email);
            aluno.setTelefone(telefone);

            System.out.println("Exibindo os dados do aluno");
            System.out.println("");
            System.out.println(aluno.toString());
        } else if (acesso == 2) {

            professor.setNrCpf(nrCpf);
            professor.setNome(nome);
            professor.setEmail(email);
            professor.setTelefone(telefone);

            System.out.println("Exibindo os dados do professor");
            System.out.println("");
            System.out.println(professor.toString());
        }
        sc.close();
    }
}
