/******************************/
package sisrestaurante;

/******************************/
/**
 * <h1>HollWassabi</h1>
 * Esta classe pode instanciar objeto do tipo HollWassabi que herda os atributos de Produto;
 * <p>
 * @author José Anderson
 * @version 1.0
 * @since 15-10-2022
 * </p>
 */
/****************************/

public class HollWassabi extends Produto{
    /**
     * Método construtor do objeto, cria um HollWassabi com os atributos da superclasse Produto
     * @param nome
     * @param preco
     * @param idProduto
     * @param descricao
     * @param imagem
     */
    public HollWassabi(String nome, float preco, int idProduto, String descricao, String imagem) {
        super(nome, preco, idProduto, descricao, imagem);
    }
}
