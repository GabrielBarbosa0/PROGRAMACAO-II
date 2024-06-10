import java.util.ArrayList;

public class ListaDeEstudantes {
    public static void main(String[] args) {
        // Cria um ArrayList para armazenar os nomes dos estudantes
        ArrayList<String> nomesEstudantes = new ArrayList<>();

        // Adiciona cinco nomes ao ArrayList
        nomesEstudantes.add("Ana");
        nomesEstudantes.add("Bruno");
        nomesEstudantes.add("Carlos");
        nomesEstudantes.add("Daniela");
        nomesEstudantes.add("Eduardo");

        // Imprime todos os nomes usando um loop for-each
        for (String nome : nomesEstudantes) {
            System.out.println(nome);
        }
    }
}
