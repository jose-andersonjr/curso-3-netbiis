/******************************/
package sisrestaurante;

/******************************/
/**
 * <h1>Entrada</h1>
 * Esta classe pode instanciar objeto do tipo Entrada que herda os atributos de Produto;
 * <p>
 * @author José Anderson
 * @version 1.0
 * @since 15-10-2022
 * </p>
 */
/****************************/


public class Entrada extends Produto{
    /**
     * Método construtor de Entrada, cria uma Entrada com os atributos da superclasse Produto
     * @param nome nome da Entrada
     * @param preco preço da Entrada
     * @param idProduto Código de identificação da Entrada
     * @param descricao Descrição da Entrada
     * @param imagem Imagem da Entrada
     */
    public Entrada(String nome, float preco, int idProduto, String descricao, String imagem) {
        super(nome, preco, idProduto, descricao, imagem);
    }
}
