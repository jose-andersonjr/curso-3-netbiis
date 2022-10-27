/******************************/
package sisrestaurante;

/******************************/
/**
 * <h1>Cliente</h1>
 * Esta classe pode instanciar objeto do tipo Cliente para fazer Pedidos;
 * <p>
 * @author José Anderson
 * @version 1.0
 * @since 15-10-2022
 * </p>
 */
/****************************/


public class Cliente implements IDAO{
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private Cartao cartao;

    // Constructor

    /**
     * Método construtor de Cliente, cria um Cliente
     * @param nome nome do Cliente
     * @param cpf CPF do Cliente
     * @param telefone telefone do Cliente
     * @param endereco endereço do Cliente
     * @param cartao cartão do Cliente
     */

    public Cliente(String nome, String cpf, String telefone, String endereco, Cartao cartao) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cartao = cartao;
    }


    // Getters and Setters

    /**
     * Retorna o nome do Cliente
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     * Modifica o nome do Cliente
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Retorna o CPF do Cliente
     * @return
     */
    public String getCpf() {
        return cpf;
    }
    /**
     * Modifica o CPF do Cliente
     * @param cpf
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    /**
     * Retorna o telefone do Cliente
     * @return
     */
    public String getTelefone() {
        return telefone;
    }
    /**
     * Modifica o telefone do Cliente
     * @param telefone
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    /**
     * Retorna o endereco do Cliente
     * @return
     */
    public String getEndereco() {
        return endereco;
    }
    /**
     * Modifica o endereco do Cliente
     * @param endereco
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    /**
     * Retorna o Cartao do Cliente
     * @return
     */
    public Cartao getCartao() {
        return cartao;
    }
    /**
     * Modifica o Cartao do Cliente
     * @param cartao
     */
    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }


//methods

    /**
     * Grava no banco de dados um novo Cliente
     * @param cliente
     */
    @Override
    public void gravarCliente(Object cliente) {
        System.out.println("=================================");
        System.out.println("Cliente gravado no banco de dados");
        System.out.println(cliente);
    }

    /**
     * Faz o retorno adequado dos nomes do atributos do Cliente
     * @return
     */
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
