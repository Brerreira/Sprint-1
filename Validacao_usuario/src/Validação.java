import java.util.ArrayList;
import java.time.LocalTime;
import java.util.Scanner;

//TODAS AS STRINGS DE SAÍDA ESTÃO SEM ACETUAÇÃO POIS NÃO CONSEGUI COLOCAR ACENTUAÇÃO.

public class Validação {
    public static void main(String[] args) {
        //método para ler dados do usuário
        Scanner ler = new Scanner(System.in);

        //variáveis comuns

        LocalTime horaLocal = LocalTime.now();

        //usuarios
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(new Usuario("bruno ferreira", "2314"));

        //informe o usuario
        System.out.println("Digite o seu usuario: ");
        String nome = ler.nextLine();

        //informe a senha
        System.out.println("Digite a senha: ");
        String senha = ler.nextLine();


        for(Usuario usuario : usuarios){
            if(usuario.getNome().equals(nome)&&(usuario.getSenha().equals(senha))){
                System.out.printf(" AUTORIZADO " + horaLocal + " bom dia, voce logou no nosso sistema");

            }else{
                System.out.printf("NAO AUTORIZADO");
            }
        }
    }
}
