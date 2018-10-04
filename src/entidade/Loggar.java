
package entidade;

public class Loggar 
{
    private String usuario;
    private String senha;
    private boolean logadoStatus = true;

    public boolean isLogadoStatus() {
        if(usuario == "admin")
        {
            logadoStatus = true;
        }
        return logadoStatus;
    }

    public void setLogadoStatus(boolean logadoStatus) {
        this.logadoStatus = logadoStatus;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
