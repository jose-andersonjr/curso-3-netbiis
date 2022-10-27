/******************************/
package sisrestaurante;

/******************************/
/**
 * <h1>Produto</h1>
 * Esta classe pode instanciar objeto do tipo Produto para que as categorias de produtos possam instanciá-la;
 * <p>
 * @author José Anderson
 * @version 1.0
 * @since 15-10-2022
 * </p>
 */
/****************************/
public abstract class Produto implements IDAO{
    private float preco;
    private String nome;
    private String descricao;

    private String imagem;

    private int idProduto;

    // Constructors

    /**
     * Construtor de Produto, cria uma objeto produto
     * @param nome
     * @param preco
     * @param idProduto
     * @param descricao
     * @param imagem
     */
    public Produto(String nome, float preco, int idProduto, String descricao, String imagem) {
        this.preco = preco;
        this.nome = nome;
        this.descricao = descricao;
        this.imagem = imagem;
        this.idProduto = idProduto;
    }


    //Getters and Setters

    /**
     *
     * @return
     */
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public int getIdProduto() {
        return idProduto;
    }


    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    // Methods

    @Override
    public String toString() {
        return "Produto{" +
                "preco=" + preco +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", imagem='" + imagem + '\'' +
                ", idProduto=" + idProduto +
                '}';
    }

    @Override
    public void gravarProduto(Object produto) {
        System.out.println("=================================");
        System.out.println("Produto gravado no banco de dados");
    }


}

