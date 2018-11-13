
package entidade;

import java.sql.Date;

/**
 *
 * @author elisson
 */
public class Pedido {
    private int idPedido;
    private int idCliente;
    private Date DataPedido;
    private String convenio;

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getDataPedido() {
        return DataPedido;
    }

    public void setDataPedido(Date DataPedido) {
        this.DataPedido = DataPedido;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }
    
            
}
