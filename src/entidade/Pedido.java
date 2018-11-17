
package entidade;

import java.sql.Date;

/**
 *
 * @author elisson
 */
public class Pedido {
    private int idPedido;
    private int idCliente;
    private String nome;
    private Date DataPedido;
    private String cpf;
    private String convenio;
    private boolean status;
    
    private boolean activeHemograma;
    private boolean activeBioquimica;
    private boolean activeUrinaRotina;
    private boolean activeSangueOculto;
    
    private boolean statusHemograma;
    private boolean statusBioquimica;
    private boolean statusUrinaRotina;
    private boolean statusSangueOculto;

    public boolean isStatusHemograma() {
        return statusHemograma;
    }

    public void setStatusHemograma(boolean statusHemograma) {
        this.statusHemograma = statusHemograma;
    }

    public boolean isStatusBioquimica() {
        return statusBioquimica;
    }

    public void setStatusBioquimica(boolean statusBioquimica) {
        this.statusBioquimica = statusBioquimica;
    }

    public boolean isStatusUrinaRotina() {
        return statusUrinaRotina;
    }

    public void setStatusUrinaRotina(boolean statusUrinaRotina) {
        this.statusUrinaRotina = statusUrinaRotina;
    }

    public boolean isStatusSangueOculto() {
        return statusSangueOculto;
    }

    public void setStatusSangueOculto(boolean statusSangueOculto) {
        this.statusSangueOculto = statusSangueOculto;
    }

    public boolean isActiveHemograma() {
        return activeHemograma;
    }

    public void setActiveHemograma(boolean activeHemograma) {
        this.activeHemograma = activeHemograma;
    }

    public boolean isActiveBioquimica() {
        return activeBioquimica;
    }

    public void setActiveBioquimica(boolean activeBioquimica) {
        this.activeBioquimica = activeBioquimica;
    }

    public boolean isActiveUrinaRotina() {
        return activeUrinaRotina;
    }

    public void setActiveUrinaRotina(boolean activeUrinaRotina) {
        this.activeUrinaRotina = activeUrinaRotina;
    }

    public boolean isActiveSangueOculto() {
        return activeSangueOculto;
    }

    public void setActiveSangueOculto(boolean activeSangueOculto) {
        this.activeSangueOculto = activeSangueOculto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

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
