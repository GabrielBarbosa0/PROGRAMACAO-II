import java.util.HashMap;
import java.util.Map;

public class NotasDeAlunos {
    public static void main(String[] args) {
        // Cria um HashMap para armazenar as notas dos alunos
        HashMap<String, Double> notasAlunos = new HashMap<>();

        // Adiciona cinco pares de nomes e notas ao HashMap
        notasAlunos.put("Ana", 8.5);
        notasAlunos.put("Bruno", 7.3);
        notasAlunos.put("Carlos", 9.0);
        notasAlunos.put("Daniela", 6.8);
        notasAlunos.put("Eduardo", 7.9);

        // Imprime todos os pares de nomes e notas usando um loop for-each
        for (Map.Entry<String, Double> entry : notasAlunos.entrySet()) {
            System.out.println("Aluno: " + entry.getKey() + " - Nota: " + entry.getValue());
        }
    }
}
