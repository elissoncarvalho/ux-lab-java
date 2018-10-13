
package entidade;

public class Loggar 
{
    private String usuarioLogin;
    private String senha;
    private boolean logadoStatus = true;

    public boolean isLogadoStatus() {
        if(usuarioLogin == "admin")
        {
            logadoStatus = true;
        }
        return logadoStatus;
    }

    public void setLogadoStatus(boolean logadoStatus) {
        this.logadoStatus = logadoStatus;
    }

    public String getUsuario() {
        return usuarioLogin;
    }

    public void setUsuario(String usuario) {
        this.usuarioLogin = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
