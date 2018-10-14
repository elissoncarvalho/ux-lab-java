package entidade;

/**
 *
 * @author Elisson
 *  A classe faz a verificação se os exames estaão habilitados ou concluidos
 *  passando para Fronteira verdade ou falso.
 */
public class VerifExaRult 
{   
            
    // Variaveis de verificação de Status no Cadastro do Resultado de Exame 
    private boolean activeHemograma     = !false;
    private boolean activeBioquimica    = false;
    private boolean activeUrinaRotina   = false;
    private boolean activeSangueOculto  = false;
    
    private boolean statusHemograma     = false;
    private boolean statusBioquimica    = false;
    private boolean statusUrinaRotina   = false;
    private boolean statusSangueOculto  = false;

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
    
    
}
