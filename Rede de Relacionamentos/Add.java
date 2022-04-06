import java.util.Scanner;
import java.util.ArrayList;

public class Add{

    public static void main(String[] args) 
    {
        Account account1 = new Account();
        Interacao interacao = new Interacao();
        Scanner input = new Scanner(System.in);
        ArrayList<Account> info_perfil = new ArrayList();
        
        
            
        System.out.println("Insira o login: ");
        String usuario = input.nextLine();
        account1.setLogin(usuario);
            
        System.out.println("Insira a senha: ");
        String senha = input.nextLine();
        account1.setPassword(senha);
            
        System.out.println("Insira o nome: ");
        String nome = input.nextLine();
        account1.setName(nome);

        System.out.println("Deseja editar/criar atributos do seu perfil? Digite sim ou nao.");
        String resposta = input.nextLine();
        
        while(resposta.equals("sim")){
            System.out.println("Digite o que voce deseja editar ou se deseja criar um atributo: idade/genero/endereco/telefone/criar");

            String diretorio = input.nextLine();

            if(diretorio.equals("idade")){
                System.out.println("Digite sua idade: ");
                String idade = input.nextLine();
                account1.setAge(idade);

            }else if(diretorio.equals("genero")){
                System.out.println("Digite seu genero: ");
                String genero = input.nextLine();
                account1.setGender(genero);

            }else if(diretorio.equals("endereco")){
                System.out.println("Digite seu endereço: ");
                String endereco = input.nextLine();
                account1.setAddress(endereco);

            }else if(diretorio.equals("telefone")){
                System.out.println("Digite seu numero de telefone: ");
                String numero = input.nextLine();
                account1.setPhone(numero);

            }else if(diretorio.equals("criar")){
                System.out.println("Digite o nome do atributo que voce deseja criar: ");
                String nome_atributo = input.nextLine();
                System.out.println("Digite o atributo que voce deseja criar: ");
                String atributo = input.nextLine();
                account1.Criar(atributo, nome_atributo);
            }

            System.out.println("Deseja editar/criar atributos do seu perfil? Digite sim ou nao.");
            resposta = input.nextLine();
        }

        info_perfil.add(account1);

        int amigos = 0;
        System.out.println("Deseja adicionar algum usuario para sua lista de amigos? Digite sim ou nao.");
        String resposta_adicionar = input.nextLine();

        if(resposta_adicionar.equals("sim")){
            while(resposta_adicionar.equals("sim")){
                System.out.println("Digite o nome do usuario que voce deseja adicionar: ");
                String nome_usuario = input.nextLine();
                interacao.setFriend(nome_usuario, amigos);
                System.out.println("Deseja adicionar algum usuario para sua lista de amigos? Digite sim ou nao.");
                resposta_adicionar = input.nextLine();
                amigos++;
            }
        }

        int mensagens = 0;
        System.out.println("\nDeseja enviar uma mensagem para algum usuario ou comunidade? Digite sim ou nao.");
        String resposta_mensagem = input.nextLine();

        if(resposta_mensagem.equals("sim")){
            while(resposta_mensagem.equals("sim")){
                System.out.println("Digite o nome do usuario/comunidade que voce deseja enviar uma mensagem: ");
                String nome1 = input.nextLine();
                System.out.println("Digite a mensagem: ");
                String mensagem = input.nextLine();
                interacao.setMessage(mensagem, mensagens);
                System.out.println("Sua mensagem para " + nome1 + " foi enviada com sucesso!");
                System.out.println("\nDeseja enviar uma mensagem para algum usuario ou comunidade? Digite sim ou nao.");
                resposta_mensagem = input.nextLine();
                mensagens++;
            }
        }

        int comunidades = 0;
        System.out.println("\nDeseja criar uma comunidade? Digite sim ou nao.");
        String resposta_criacao = input.nextLine();

        if(resposta_criacao.equals("sim")){
            System.out.println("Digite o nome da comunidade que voce deseja criar: ");
            String nome2 = input.nextLine();
            interacao.setComunidade(nome2, comunidades);
            System.out.println("Digite a descrição dessa comunidade: ");
            String descricao = input.nextLine();
            System.out.println("Sua comunidade " + nome2 + " foi criada com sucesso!");
            comunidades++;
            
        }

        System.out.println("\nDeseja fazer parte de uma comunidade? Digite sim ou nao.");
        String resposta_participacao = input.nextLine();

        if(resposta_participacao.equals("sim")){
            while(resposta_participacao.equals("sim")){
                System.out.println("Digite o nome da comunidade que voce deseja participar: ");
                String nome3 = input.nextLine();
                interacao.setComunidade(nome3, comunidades);
                System.out.println("Voce agora faz parte da comunidade " + nome3 + "!");
                System.out.println("\nDeseja fazer parte de outra comunidade? Digite sim ou nao.");
                resposta_participacao = input.nextLine();
                comunidades++;
            }
        }

        System.out.println("Deseja recuperar informações sobre seu perfil, comunidades, amigos e mensagens? Digite sim ou nao.");
        String resposta_recuperar = input.nextLine();

        if(resposta_recuperar.equals("sim")){
            while(resposta_recuperar.equals("sim")){
                System.out.println("Digite o que voce deseja recuperar: perfil/comunidade/amigos/mensagens");
                String recuperar = input.nextLine();
                if(recuperar.equals("perfil")){
                    System.out.printf("Nome da conta: %s", account1.getName());
                    System.out.printf("\nSenha da conta: %s", account1.getPass());
                    System.out.printf("\nUsuario da conta: %s", account1.getUser());
                    System.out.printf("\nIdade do usuario: %s", account1.getAge());
                    System.out.printf("\nGenero do usuario: %s", account1.getGender());
                    System.out.printf("\nEndereco do usuario: %s", account1.getAddress());
                    System.out.printf("\nNumero de telefone do usuario: %s", account1.getPhone());
                    System.out.printf("\n%s do usuario: %s", account1.getAttributeName(), account1.getAttribute());
        
                }else if(recuperar.equals("comunidade")){
                    System.out.println("Comunidades: ");
                    interacao.getComunidade();
                }else if(recuperar.equals("amigos")){
                    System.out.println("Amigos: ");
                    interacao.getFriend();
                }else if(recuperar.equals("mensagens")){
                    System.out.println("Mensagens: ");
                    interacao.getMessage();
                }

                System.out.println("\nDeseja recuperar informações sobre seu perfil, comunidades, amigos e mensagens? Digite sim ou nao.");
                resposta_recuperar = input.nextLine();

            }     
        }

        System.out.println("\nDeseja enviar mensagens no feed de noticias? Digite sim ou nao.");
        String resposta_feed = input.nextLine();
        if(resposta_feed.equals("sim")){
            String post = input.nextLine();
            System.out.println("Sua mensagem " + post +" foi postada com sucesso!");
            
        }

        System.out.println("Voce deseja que todos os usuarios possam ver sua mensagens no feed ou somente amigos? Digite todos ou amigos.");
        String resposta_feed_publico = input.nextLine();
        if(resposta_feed_publico.equals("todos")){
            System.out.println("Sua mensagem foi postada no feed de todos os usuarios!");
        }else if(resposta_feed_publico.equals("amigos")){
            System.out.println("Sua mensagem foi postada no feed de seus amigos!");
            interacao.getFriend();
        }

        System.out.println("Voce deseja encerrar sua conta no iFace? Todas sua informacoes irao sumir do sistema: relacionamentos, mensagens enviadas, perfil. Digite sim ou nao.");
        String resposta_encerrar = input.nextLine();
        if(resposta_encerrar.equals("sim")){
            account1.encerrar();
            interacao.finish();
            System.out.println("Sua conta foi encerrada com sucesso! Obrigado por usar o iFace!");
        }
    }
}