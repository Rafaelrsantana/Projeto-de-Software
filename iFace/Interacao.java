import java.util.Scanner;
import java.util.ArrayList;

public class Interacao {
    private String[] friends = new String[100]; 
    private String[] message = new String[10000];
    private String[] comunidade = new String[100];
    private String[] membros = new String[100];

    public void setFriend(String friends, int i) {
        this.friends[i] = friends;
    }

    public void setMessage(String message, int i) {
        this.message[i] = message;
    }

    public void setComunidade(String comunidade, int i) {
        this.comunidade[i] = comunidade;
        
    }

    public void setMinhaComunidade(String comunidade, int i, String membros) {
        this.comunidade[i] = comunidade;
        this.membros[i] = membros;
    }

    public void getFriend() {
        for (int i = 0; i < friends.length; i++) {
            if(friends[i] != null) {
                System.out.println(friends[i]);
            }
        }
    }

    public void getMessage() {
        for (int i = 0; i < message.length; i++) {
            if(message[i] != null) {
                System.out.println(message[i]);
            }
        }
    }
    
    public void getComunidade() {
        for (int i = 0; i < comunidade.length; i++) {
            if(comunidade[i] != null) {
                System.out.println(comunidade[i]);
            }
        }
    }

    public void getMembros() {
        for (int i = 0; i < membros.length; i++) {
            if(membros[i] != null) {
                System.out.println(membros[i]);
            }
        }
    }

    public void finish(){
        friends = null;
        message = null;
        comunidade = null;
    }
}