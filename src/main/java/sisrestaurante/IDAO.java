package sisrestaurante;

public interface IDAO<T> {
    default void gravarCliente(T cliente){};

    default void gravarProduto(T produto){};

    default void gravarPedido(T pedido){};


}
