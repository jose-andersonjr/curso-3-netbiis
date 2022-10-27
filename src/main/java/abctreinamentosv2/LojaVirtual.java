package abctreinamentosv2;

import java.nio.file.Paths;
import java.util.*;
import java.util.HashMap;
import java.util.TreeMap;



public class LojaVirtual {
    private static Map<Cliente, Set<Curso>> pagamentos = new HashMap<>(); // Recebe um cliente e a lista de cursos desse cliente

    public static void mostrarOrdenado(Map<Cliente, Set<Curso>> pagamentos){
        for (Map.Entry<Cliente, Set<Curso>> entrada: pagamentos.entrySet()){
            System.out.println(entrada.getKey() +" == "+ entrada.getValue());
        }
    }

    public static void ordenarClientesNome(Map<Cliente, Set<Curso>> pagamentos){
        Map<Cliente, Set<Curso>> ordenadoNome = new TreeMap<Cliente, Set<Curso>>(pagamentos);
        mostrarOrdenado(ordenadoNome);
    }

    public static void menuOpcoes(Cliente cliente, Set<Curso> cursos){
        // Criar cursos disponíveis no site para venda
        Curso java8 = new Curso(1, "Java 8 para web", 2000f, Paths.get("/java8"));
        Curso oracle12c = new Curso(2, "Oracle 12C", 2500f, Paths.get("/oracle12c"));
        Curso php7 = new Curso(3, "PHP 7 para web", 2100f, Paths.get("/php7"));
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        int opcao2 = 0;
        while (opcao != 5) {
            System.out.println("=================================================================================");
            System.out.println("                              "+cliente.getNome()+"                              ");
            System.out.println("=================================================================================");
            System.out.println("[1]Adicionar curso [2]Remover curso [3]Encontrar curso [4]Atualizar curso [5]Sair");
            System.out.println("=================================================================================");
            opcao = teclado.nextInt();
            if (opcao == 1) {
                System.out.println("Qual curso deseja adquirir? [1-java][2-oracle][3-php][4-finalizar compra]");
                opcao2 = teclado.nextInt();
                switch (opcao2) {
                    case 1:
                        cursos.add(java8);
                        break;
                    case 2:
                        cursos.add(oracle12c);
                        break;
                    case 3:
                        cursos.add(php7);
                        break;
                }
            } else if (opcao == 2) {
                if (cursos.isEmpty()) {
                    System.out.println("Você não tem cursos para remover");
                } else {
                    System.out.println("Qual curso deseja remover? (Insira o código do curso)");
                    cursos.forEach(System.out::println);
                    int removerCurso = teclado.nextInt();
                    cursos.removeIf(curso -> (curso.getCdcurso() == removerCurso));
                }
            }else if (opcao == 3) {
                System.out.println("Seus cursos disponíveis");
                cursos.forEach(System.out::println);
            }else if (opcao == 4) {
                System.out.println("Qual curso deseja atualizar? (Insira o código do curso) ");
                cursos.forEach(System.out::println);
                int atualizarCurso = teclado.nextInt();
                cursos.forEach(curso -> {
                    if (curso.getCdcurso() == atualizarCurso){
                        System.out.println("Insira um novo nome para o curso: ");
                        String novoNome = teclado.next();
                        curso.setNome(novoNome);
                    }// Não vejo sentido no Cliente atualizar o valor, id ou a url
                });
            }
        }
        pagamentos.put(cliente, cursos);
        System.out.println("Cursos escolhidos: \n" + cursos);
    }


    public static void main(String[] args) {

        // Cadastrar o cliente
        Cliente anderson = new Cliente("2034802348", "José Anderson", "joseanderson@gmail.com");
        Cliente antonio = new Cliente("2345345234", "José Antônio", "feffe@gmail.com");
        Cliente wallace = new Cliente("2435453454", "Wallace", "joseaefeeenderson@gmail.com");


        // Criar a lista de cursos do cliente
        Set<Curso> cursosAnderson = new HashSet<>();
        Set<Curso> cursosAntonio = new HashSet<>();
        Set<Curso> cursosWallace = new HashSet<>();

        // Menu de opções
        menuOpcoes(anderson, cursosAnderson); // Inserindo os cursos em cada cliente
        menuOpcoes(antonio, cursosAntonio); // Inserindo os cursos em cada cliente
        menuOpcoes(wallace, cursosWallace); // Inserindo os cursos em cada cliente

        // Ordenações
        ordenarClientesNome(pagamentos);


    }
}
