import java.util.Scanner;
import java.util.ArrayList;

public class Add {

    public static void main(String[] args) {
        Account account1 = new Account();
        Interacao interacao = new Interacao();
        Scanner input = new Scanner(System.in);
        ArrayList<Account> info_perfil = new ArrayList();

        while (true) {
            System.out.println("Olá! Seja bem vindo(a) ao iFace! Digite a opção que deseja executar: criar conta/entrar.");
            String opcao = input.nextLine();

            if (opcao.equals("criar conta")) {
                System.out.println("Insira o login: ");
                String usuario = input.nextLine();
                account1.setLogin(usuario);

                System.out.println("Insira a senha: ");
                String senha = input.nextLine();
                account1.setPassword(senha);

                System.out.println("Insira seu nome de usuario: ");
                String nome = input.nextLine();
                account1.setName(nome);

            } else if (opcao.equals("entrar")) {
                System.out.println("Insira o login: ");
                String usuario = input.nextLine();
                account1.setLogin(usuario);

                System.out.println("Insira a senha: ");
                String senha = input.nextLine();
                account1.setPassword(senha);

            }

            int amigos = 0;
            int mensagens = 0;
            int comunidades = 0;

            System.out.println("Seja bem vindo(a) ao iFace! Digite a opcao que voce deseja executar: editar perfil, adicionar amigos, enviar mensagem, comunidades, recuperar informacoes, encerrar conta, privacidade, ou sair.");
            String opcao2 = input.nextLine();

            while (opcao2.equals("sair") == false) {
                if (opcao2.equals("editar perfil")) {
                    System.out.println(
                            "Digite o atributo que voce deseja editar ou se deseja criar um atributo: nome, idade, genero, endereco, telefone, criar atributo ou voltar.");
                    String opcao3 = input.nextLine();
                    while(opcao3.equals("voltar") == false){
                        if (opcao3.equals("nome")) {
                            System.out.println("Digite o novo nome: ");
                            String nome = input.nextLine();
                            account1.setName(nome);
                        } else if (opcao3.equals("idade")) {
                            System.out.println("Digite a nova idade: ");
                            String idade = input.nextLine();
                            account1.setAge(idade);
                        } else if (opcao3.equals("genero")) {
                            System.out.println("Digite o novo genero: ");
                            String genero = input.nextLine();
                            account1.setGender(genero);
                        } else if (opcao3.equals("endereco")) {
                            System.out.println("Digite o novo endereco: ");
                            String endereco = input.nextLine();
                            account1.setAddress(endereco);
                        } else if (opcao3.equals("telefone")) {
                            System.out.println("Digite o novo telefone: ");
                            String telefone = input.nextLine();
                            account1.setPhone(telefone);
                        } else if (opcao3.equals("criar atributo")) {
                            System.out.println("Digite o nome do atributo que voce deseja criar: ");
                            String nome_atributo = input.nextLine();
                            System.out.println("Digite o atributo que voce deseja criar: ");
                            String atributo = input.nextLine();
                            account1.Criar(atributo, nome_atributo);
                            System.out.println("Atributo criado com sucesso!");
                        }
                        System.out.println(
                            "Digite o atributo que voce deseja editar ou se deseja criar um atributo: nome, idade, genero, endereco, telefone, criar atributo ou voltar.");
                        opcao3 = input.nextLine();

                    }

                } else if (opcao2.equals("adicionar amigos")) {
                    System.out.println("Digite o nome do usuario que voce deseja adicionar: ");
                    String usuario_amigo = input.nextLine();
                    interacao.setFriend(usuario_amigo, amigos);
                    amigos++;
                    System.out.println("Solicitação de amizade enviada!");

                } else if (opcao2.equals("enviar mensagem")) {
                    System.out.println(
                            "Voce deseja enviar uma mensagem para um amigo, comunidade ou no feed de noticias? Digite a opcao que voce deseja executar: amigo, comunidade ou feed.");
                    String opcao4 = input.nextLine();
                    if (opcao4.equals("amigo")) {
                        System.out.println("Digite o nome do amigo que voce deseja enviar a mensagem: ");
                        String amigo = input.nextLine();
                        System.out.println("Digite a mensagem que voce deseja enviar: ");
                        String mensagem = input.nextLine();
                        interacao.setMessage(mensagem, mensagens);
                        mensagens++;
                        System.out.println("Mensagem enviada!");

                    } else if (opcao4.equals("comunidade")) {
                        System.out.println("Digite o nome da comunidade que voce deseja enviar a mensagem: ");
                        String comunidade = input.nextLine();
                        System.out.println("Digite a mensagem: ");
                        String mensagem = input.nextLine();
                        interacao.setMessage(mensagem, mensagens);
                        mensagens++;
                        System.out.println("Mensagem enviada!");

                    } else if (opcao4.equals("feed")) {
                        System.out.println("Digite a mensagem: ");
                        String mensagem = input.nextLine();
                        interacao.setMessage(mensagem, mensagens);
                        mensagens++;
                        System.out.println("Mensagem enviada!");
                    }
                } else if (opcao2.equals("comunidades")) {
                    System.out.println(
                            "Voce deseja criar ou entrar em uma comunidade? Digite a opcao que voce deseja executar: criar ou entrar.");
                    String opcao5 = input.nextLine();

                    if (opcao5.equals("criar")) {
                        System.out.println("Digite o nome da comunidade que voce deseja criar: ");
                        String comunidade = input.nextLine();
                        interacao.setMinhaComunidade(comunidade, comunidades, account1.getUser());
                        System.out.println("Digite a descrição dessa comunidade: ");
                        String descricao = input.nextLine();
                        System.out.println("Sua comunidade " + comunidade + " foi criada com sucesso!");
                        comunidades++;

                    } else if (opcao5.equals("entrar")) {
                        System.out.println("Digite o nome da comunidade que voce deseja entrar: ");
                        String comunidade = input.nextLine();
                        interacao.setComunidade(comunidade, comunidades);
                        System.out.println("Voce entrou na comunidade " + comunidade + " com sucesso!");
                        comunidades++;
                    }

                } else if (opcao2.equals("recuperar informacoes")) {
                    System.out.println(
                            "Digite a informação que voce deseja recuperar: perfil, amigos, mensagens ou comunidades.");
                    String opcao6 = input.nextLine();
                    if (opcao6.equals("perfil")) {
                        System.out.println("O nome do usuario é: " + account1.getName());
                        System.out.println("A idade do usuario é: " + account1.getAge());
                        System.out.println("O genero do usuario é: " + account1.getGender());
                        System.out.println("O endereco do usuario é: " + account1.getAddress());
                        System.out.println("O telefone do usuario é: " + account1.getPhone());
                        System.out.println("Digite o nome do atributo que voce deseja recuperar: ");
                        String nome_atributo = input.nextLine();
                        System.out.println("O atributo " + nome_atributo + " do usuario é: " + account1.getAttribute());

                    } else if (opcao6.equals("amigos")) {
                        System.out.println("Seus amigos são: ");
                        interacao.getFriend();

                    } else if (opcao6.equals("mensagens")) {
                        System.out.println("Suas mensagens são: ");
                        interacao.getMessage();

                    } else if (opcao6.equals("comunidades")) {
                        System.out.println("Suas comunidades são: ");
                        interacao.getComunidade();
                        System.out.println("Voce deseja saber os membros da sua comunidade? Digite sim ou nao: ");
                        String opcao7 = input.nextLine();
                        if (opcao7.equals("sim")) {
                            System.out.println("Os membros da sua comunidade são: ");
                            interacao.getMembros();
                        }

                    }
                } else if (opcao2.equals("encerrar conta")) {
                    System.out.println(
                            "Voce realmente deseja encerrar sua conta? Digite a opcao que voce deseja executar: sim ou nao");
                    String opcao7 = input.nextLine();
                    if (opcao7.equals("sim")) {
                        account1.encerrar();
                        interacao.finish();
                        System.out.println("Voce encerrou sua conta com sucesso!");
                        System.exit(0);
                    } else if (opcao7.equals("nao")) {
                        System.out.println("Eba! Voce nao encerrou sua conta!");
                    }
                } else if (opcao2.equals("privacidade")) {
                    System.out.println(
                            "Voce deseja que todos os usuarios possam ver suas mensagens no feed ou somente amigos? Digite todos ou amigos.");
                    String resposta_feed_publico = input.nextLine();
                    if (resposta_feed_publico.equals("todos")) {
                        System.out.println("Agora todos podem ver suas mensagens do feed!");
                    } else if (resposta_feed_publico.equals("amigos")) {
                        System.out.println("Agora somente seus amigos podem ver suas mensagens do feed!");
                    }

                }

                System.out.println(
                        "Digite a opcao que voce deseja executar: editar perfil, adicionar amigos, enviar mensagem, comunidades, recuperar informacoes, encerrar conta, privacidade, ou sair.");
                opcao2 = input.nextLine();
            }

            info_perfil.add(account1);

        }

    }
}