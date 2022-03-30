import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);
        ArrayList<Account> array = new ArrayList();
        
        while(true){
            Account account1 = new Account();
            
            System.out.println("Insira o login: ");
            String usuario = input.nextLine();
            account1.setLogin(usuario);
            
            System.out.println("Insira a senha: ");
            String senha = input.nextLine();
            account1.setPassword(senha);
            
            System.out.println("Insira o nome: ");
            String nome = input.nextLine();
            account1.setName(nome);

            array.add(account1);

        }
        
    }
}