import java.util.Scanner;

public class ListaDeTarefasMain {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ListaDeTarefa lista = new ListaDeTarefa();
        int opcao = 0;

        System.out.println("Lista de Tarefas");

        while (opcao != 4) {
            exibirmenu();
            System.out.print("Digite uma opção (ou 'sair' para encerrar): ");
            String entradaUsuario = entrada.nextLine();

            if (entradaUsuario.equalsIgnoreCase("sair")) {
                opcao = 4;
            } else {
                try {
                    opcao = Integer.parseInt(entradaUsuario);
                } catch (NumberFormatException e) {
                    System.out.println("Opção inválida! Digite um número ou 'sair'.");
                    opcao = 0;
                }
            }

            switch (opcao) {
                case 1:
                    // adicionar tarefas
                    System.out.print("Digite a tarefa que deseja adicionar: ");
                    String tarefa = entrada.nextLine();
                    lista.adicionarTarefa(tarefa);
                    break;
                case 2:
                    //remover tarefa
                    if (lista.estaVazio()) {
                        System.out.println("Nenhuma tarefa cadastrada para remover.");
                    } else {
                        lista.listarTarefas();
                        System.out.println("Digite o número da tarefa que deseja remover: ");
                        String entradaRemover = entrada.nextLine();
                        try {
                            int numero = Integer.parseInt(entradaRemover);
                            lista.removerTarefa(numero);
                        } catch (NumberFormatException e) {
                            System.out.println("Número inválido!");
                        }
                    }
                    break;
                case 3:
                    // listar tarefas
                    lista.listarTarefas();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        entrada.close();
    }

    public static void exibirmenu() {
        System.out.println("""
                -----------------------
                Escolha uma opção:
                1 - Adicionar Tarefa
                2 - Remover Tarefa
                3 - Listar Tarefas
                4 - Sair
                -----------------------
                """);
    }
}