package agenda;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Agenda {
    
    public static String lerString() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }

    public static void main(String[] args) {

        //input*/
        Scanner teclado = new Scanner(System.in);

        //controladores de while e opções*/
        int controlador = 0;
        int menu = 0;
        int id = 0;
        //banco de dados*/
        ArrayList<Evento> myArrayList = new ArrayList<>();

        //ola*/
        System.out.println("----------Ola----------");
        System.out.println("Digite o nome:");
        String nome = lerString();

        System.out.println("Ola " + nome + ", essa e sua agenda.");

        //inicio do while*/
        do {
            System.out.println("----------menu----------");
            System.out.println("1 - Ver lista de eventos.");
            System.out.println("2 - Pesquisar evento.");
            System.out.println("3 - Adicionar evento");
            System.out.println("4 - Excuir evento.");
            System.out.println("0 - Sair");

            menu = teclado.nextInt();

            switch (menu) {
                //sair*/
                case 0 -> {
                    System.out.println("Adeus, " + nome + ".");
                    controlador = 1;

                }
                //ver lista*/
                case 1 -> {

                    System.out.println("Ver lista de eventos:\n");

                    boolean ans = myArrayList.isEmpty();

                    if (ans == true) {
                        System.out.println("Agenda nao possui eventos.");
                    } else {
                        for (Evento i : myArrayList) {
                            System.out.println(i.getNomeEvento());
                            System.out.println("id:"+i.getId());
                            System.out.println(i.toString() + "\n-----------------------");
                        }
                    }
                }

                //pesquisar evento*/
                case 2 -> {
                    System.out.println("---------Pesquisar Evento---------");

                    System.out.println("Digite o id do evento:");
                    int idObj = teclado.nextInt();
                    int e = 0;
                    for (Evento i : myArrayList) {
                        int a = i.getId();
                        if (idObj == a) { 
                            System.out.println("Evento encontrado.");
                            System.out.println(i.toString() + "\n-----------------------");
                            e += 1;
                        }
                    }
                    if (e==0){
                        System.out.println("Evento nao encontrado.");
                    }
                    
                        
                    }
                   

                //add evento*/
                case 3 -> {
                    //carac event*o/
                    System.out.println("Adicionar um evento");

                    System.out.println("Digite o nome do evento:");
                    String nomeEvento = lerString();

                    System.out.println("Digite a categoria do evento:");
                    String categoria = lerString();

                    System.out.println("Digite a quantidade de pessoas:");
                    int quantPessoas = teclado.nextInt();

                    System.out.println("Digite o assunto do evento:");
                    String assunto = lerString();

                    //carac agendar*/
                    System.out.println("Digite a dataInicio:");
                    String dataInicio =lerString();

                    System.out.println("Digite a horaInicio:");
                    String horaInicio = lerString();

                    System.out.println("Digite a horaEncerramento:");
                    String horaEncerramento = lerString();

                    System.out.println("Digite o local:");
                    String local = lerString();
                    id += 1;
                    
                    Evento obj = new Evento(nomeEvento, categoria, quantPessoas, assunto, dataInicio, horaInicio, horaEncerramento, local, id);
                    
                    //isEmpty retorna se a lista esta vazia.
                    boolean ans = myArrayList.isEmpty();
                    
                    //caso a lista esteja vazia, add obj.
                    if (ans == true) {
                        myArrayList.add(obj);
                        System.out.println("Evento adicionado.");
                        
                    } else { //caso a lista já possui eventos, comparar eventos.
                        
                        boolean temVaga = true;
                        for (Evento i : myArrayList) {
                            if (obj.getDataInicio().equals(i.getDataInicio())) { 
                                temVaga = false;
                            }
                        }
                        //caso temVaga seja verdadeiro, add evento
                        if(temVaga) {
                            myArrayList.add(obj);
                            
                            System.out.println("Evento adicionado.");                                
                        } else {   //caso temVaga seja false, 
                            System.out.println("Conflito de data com outro evento.");
                        }
                    }
                }
                case 4 -> {
                    System.out.println("-- Excluir evento --");
                    System.out.println("Digite o id da Evento:");
                    int idnew = teclado.nextInt();
                    
                    //ta dando erro.
                    if (myArrayList.isEmpty()){
                        System.out.println("id nao encontrado");
                        continue;
                    }
                            
                    for (Evento i : myArrayList) {
                        int b = i.getId();
                        if (idnew==b) { 
                            System.out.println("Confirmar evento.");
                            System.out.println(i.toString() + "\n-----------------------");
                            
                            System.out.println("----digite---\n0 - sim\n1 - nao");
                            int num = teclado.nextInt();
                            if (num == 0){
                                myArrayList.remove(i);
                                System.out.println("Evento excluido");
                                break;
                                
                            }else{
                                System.out.println("voltando...");
                                
                            }
                            
                            
                        }
                    }
                    
                  }
                default -> {
                    System.out.println("-- Comando nao encontrado --");
                }

            }//chave dos casos

        } while (controlador == 0);

    }

}