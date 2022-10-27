/******************************/
package sisrestaurante;
/******************************/
/**
 * <h1>WasabiApp</h1>
 * Esta classe pode instanciar objeto do tipo Cartao para que clients possam fazer suas compras nele;
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
    public Cartao(String numeroCartao, float limiteCartao) {
        this.numeroCartao = numeroCartao;
        this.limiteCartao = limiteCartao;
    }

    // Getters and Setters

    /**
     * Retorna o valor do número do cartão do cliente
     * @return numeroCartao
     */
    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public float getLimiteCartao() {
        return limiteCartao;
    }

    public void setLimiteCartao(float limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "numeroCartao='" + numeroCartao + '\'' +
                ", limiteCartao=" + limiteCartao +
                '}';
    }
}
