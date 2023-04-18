package exercicio.streaming;
import java.util.Scanner;

public class Testadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Deseja cadastrar um usuário?\n" +
                "Digite \"S\" para sim, e qualquer outra letra para não");
        String resposta = input.nextLine();

        while (resposta.equals("S")) {
            System.out.println("Digite o nome do usuário: ");
            String nome = input.nextLine();

            System.out.println("Digite a senha: ");
            String senha = input.nextLine();

            System.out.println("Digite o email: ");
            String email = input.nextLine();

            Usuario usuario = new Usuario(nome, senha, email);

            System.out.println("Usuário cadastrado com sucesso!");
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Senha: " + usuario.getSenha());
            System.out.println("Email: " + usuario.getEmail());

            System.out.println("Deseja cadastrar outro usuário?\n" +
                    "Digite \"S\" para sim, e qualquer outra letra para não");
            resposta = input.next();
        }

        input.close();
    }
}
