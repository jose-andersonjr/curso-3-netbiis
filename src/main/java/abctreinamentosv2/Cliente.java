package abctreinamentosv2;

import java.util.HashSet;
import java.util.Set;

public class Cliente {

    private String cpf;
    private String nome;
    private String email;

    // Constructor

    public Cliente(String cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public static void main(String[] args) {

    }
}
