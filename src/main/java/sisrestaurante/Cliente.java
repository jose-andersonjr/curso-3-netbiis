package sisrestaurante;

import java.sql.SQLOutput;

public class Cliente implements IDAO{
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private Cartao cartao;

    // Constructor

    public Cliente(String nome, String cpf, String telefone, String endereco, Cartao cartao) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cartao = cartao;
    }


    // Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }


//methods

    @Override
    public void gravarCliente(Object cliente) {
        System.out.println("=================================");
        System.out.println("Cliente gravado no banco de dados");
        System.out.println(cliente);
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cartao=" + cartao +
                '}';
    }
}
