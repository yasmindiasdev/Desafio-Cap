import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CadastrarSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Cadastre sua senha com:
                ►  no minimo 6 caracteres
                ►  no minimo 1 numero
                ►  no minimo 1 uma letra maiuscula
                ►  no minimo 1 uma letra minuscula
                ►  no minimo 1 um caractere especial( !@#$%^&*()-+)
                ►  sem espacos em branco""");
        System.out.println("------------------------------------------------------");

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();
        Pattern digito = Pattern.compile("[0-9]");
        Pattern letra = Pattern.compile("[a-zA-Z]");
        Pattern caractere = Pattern.compile("[!@#$%¨&*()-+=]");

        Matcher mDigito = digito.matcher(senha);
        Matcher mLetra = letra.matcher(senha);
        Matcher mCaractere = caractere.matcher(senha);

        if (senha.length() < 6) {
            int caracteres = 6 - senha.length();
            System.out.println("Sua senha precisa ter no  minimo 6 caracteres, você precisa adicionar " + caracteres + " caracteres");
        }
        else if (!mDigito.find()) {
            System.out.println("Sua senha precisa ter pelo menos um numero");
        }
        else if (!mLetra.find()) {
            System.out.println("Sua senha precisa ter pelo menos uma letra");
        }
        else if (!mCaractere.find()) {
            System.out.println("Sua senha precisa ter pelo menos um caractere especial");
        }
        else {
            System.out.println("Senha ok");
        }
    }
}
