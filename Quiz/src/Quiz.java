import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        int errosUsuario = 0;
        int pontosUsuario = 0;
        String[] respostasCorretas = new String[]{"a", "a", "c"};
        String respostasUsuario;
        String usuario;
        String[] perguntas = new String[]{" 1. Qual o nome do maior país da américa latina ?" , "2. Quantas estrelas tem a bandeira do Brasil ? ", "3. Qual nome do fundador da Apple ? "};
        String[] opcoes = new String[]{" A. Brasil ", " B. Argentina ", " C. Uruguai "};
        String[] opcoes2 = new String[]{" A. 27 ", " B. 32 ", " C. 11"};
        String[] opcoes3 = new String[]{" A. Bill Gates ", " B. Jeff Benzos ", " C. Steve Jobs " };

        //perguntando o usuario
        System.out.println("Informe o seu usuario:");
        usuario = ler.next();

        //primeira pergunta
        System.out.println(perguntas[0]);


        for (String resposta : opcoes){
            System.out.println(resposta);
        }
        //recebendo a reposta do usuario
        respostasUsuario = ler.next();

        //if ternário para comparação e incremento
        if(respostasUsuario.equals(respostasCorretas[0])){
            pontosUsuario++;
        }else{
            errosUsuario++;
        }

        //segunda pergunta
        System.out.println("proxima pergunta");
        System.out.println(perguntas[1]);

        for (String resposta : opcoes2){
            System.out.println(resposta);
        }

        respostasUsuario = ler.next();

        if(respostasUsuario.equals(respostasCorretas[1])){
            pontosUsuario++;
        }else{
            errosUsuario++;
        }

        //terceira pergunta
        System.out.println("proxima pergunta");
        System.out.println(perguntas[2]);


        for (String resposta : opcoes3){
            System.out.println(resposta);
        }

        respostasUsuario = ler.next();

        if(respostasUsuario.equals(respostasCorretas[2])){
            pontosUsuario++;
        }else {
            errosUsuario++;
        }

        System.out.println( usuario + " Voce fez " + pontosUsuario + " acertos " + " e errou " + errosUsuario + " vezes ");

    }
}
