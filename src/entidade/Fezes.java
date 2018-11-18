
package entidade;

public class Fezes {
    
    private int codigoF;
    private String resutParasitologico;
    private String obsParasitologico;
    private boolean sangueOculto;
    private String obsSangueOculto;

    public String getResutParasitologico() {
        return resutParasitologico;
    }

    public void setResutParasitologico(String resutParasitologico) {
        this.resutParasitologico = resutParasitologico;
    }

    public String getObsParasitologico() {
        return obsParasitologico;
    }

    public void setObsParasitologico(String obsParasitologico) {
        this.obsParasitologico = obsParasitologico;
    }

    public boolean isSangueOculto() {
        return sangueOculto;
    }

    public void setSangueOculto(boolean sangueOculto) {
        this.sangueOculto = sangueOculto;
    }

    public String getObsSangueOculto() {
        return obsSangueOculto;
    }

    public void setObsSangueOculto(String obsSangueOculto) {
        this.obsSangueOculto = obsSangueOculto;
    }

    public int getCodigoF() {
        return codigoF;
    }

    public void setCodigoF(int codigoF) {
        this.codigoF = codigoF;
    }
}
