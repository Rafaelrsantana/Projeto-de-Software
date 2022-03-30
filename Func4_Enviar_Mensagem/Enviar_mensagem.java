import java.util.Scanner;
import java.util.ArrayList;

public class Enviar_mensagem {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Deseja enviar uma mensagem para algum usuario ou comunidade? Digite 1 para sim ou 2 para nao.");
        int resposta = input.nextInt();

        if(resposta == 1){
            System.out.println("Digite o nome do usuario/comunidade que voce deseja enviar a mensagem: ");

            String diretorio = input.next();

            System.out.println("Digite a mensagem: ");

            String mensagem = input.next();
        }else return;

    }


    
}