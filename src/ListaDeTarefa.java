import java.util.ArrayList;

public class ListaDeTarefa {
    private final ArrayList<String> tarefas;

    public ListaDeTarefa() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String tarefa){
        if(tarefa == null || tarefa.trim().isEmpty()){
            System.out.println("Tarefa inválida! Não é permitido adicionar tarefas vazias.");
            return; //irá sair do metodo sem adicionar
        }

        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public void removerTarefa(int numero){
        int index = numero - 1; //converte para índice real
        if (index >= 0 && index < tarefas.size()) {
            String removida = tarefas.remove(index);
            System.out.println("Tarefa removida: " + removida);
        } else {
            System.out.println("Número inválido!");
        }
    }

    public void listarTarefas(){
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa adicionada!");
            return;
        }

        System.out.println("Essas são todas as tarefas: ");

        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println(i + 1 + " - " + tarefas.get(i));
        }
    }

    public boolean estaVazio(){
        return tarefas.isEmpty();
    }
}

