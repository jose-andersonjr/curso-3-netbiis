/******************************/
package sisrestaurante;

/******************************/
/**
 * <h1>IDAO</h1>
 * Esta interface define os métodos para gravação no banco de dados;
 * <p>
 * @author José Anderson
 * @version 1.0
 * @since 15-10-2022
 * </p>
 */
/****************************/

public interface IDAO<T> {
    /**
     * Grava um novo cliente no banco de dados
     * @param cliente
     */
    default void gravarCliente(T cliente){};

    /**
     * Grava um novo Produto no banco de dados
     * @param produto
     */
    default void gravarProduto(T produto){};

    /**
     * Grava um novo pedido no banco de dados
     * @param pedido
     */
    default void gravarPedido(T pedido){};


}
