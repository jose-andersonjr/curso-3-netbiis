/******************************/
package sisrestaurante;

/******************************/
/**
 * <h1>WasabiApp</h1>
 * Esta classe pode instanciar objeto do tipo Entrada que herda os atributos de Produto;
 * <p>
 * @author José Anderson
 * @version 1.0
 * @since 15-10-2022
 * </p>
 */
/****************************/
public class TemakiEspecial extends Produto{

    public TemakiEspecial(String nome, float preco, int idProduto, String descricao, String imagem) {
        super(nome, preco, idProduto, descricao, imagem);
    }
}
