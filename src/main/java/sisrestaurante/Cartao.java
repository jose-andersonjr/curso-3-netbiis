/******************************/
package sisrestaurante;
/******************************/
/**
 * <h1>Cartao</h1>
 * Esta classe pode instanciar objeto do tipo Cartao para que clientes possam fazer suas compras nele;
 * <p>
 * @author José Anderson
 * @version 1.0
 * @since 15-10-2022
 * </p>
 */
/****************************/
public class Cartao
/****************************/
{
    private String numeroCartao;
    private float limiteCartao;

    // Constructors

    /**
     * Método construtor de Cartao, cria um Cartao
     * @param numeroCartao número do cartão do Cliente
     * @param limiteCartao o limite do cartão do Cliente
     */
    public Cartao(String numeroCartao, float limiteCartao) {
        this.numeroCartao = numeroCartao;
        this.limiteCartao = limiteCartao;
    }

    // Getters and Setters

    /**
     * Retorna o valor do número do cartão do Cliente
     * @return numeroCartao
     */
    public String getNumeroCartao() {
        return numeroCartao;
    }

    /**
     * Modifica o número do cartão do Cliente
     * @param numeroCartao
     */

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    /**
     * Retorna o limite do cartão do Cliente
     * @return
     */
    public float getLimiteCartao() {
        return limiteCartao;
    }

    /**
     * Modifica o limite do cartão do Cliente
     * @param limiteCartao
     */
    public void setLimiteCartao(float limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    /**
     * Faz o retorno adequado dos nomes do atributos do Cartao
     * @return
     */
    @Override
    public String toString() {
        return "Cartao{" +
                "numeroCartao='" + numeroCartao + '\'' +
                ", limiteCartao=" + limiteCartao +
                '}';
    }
}
