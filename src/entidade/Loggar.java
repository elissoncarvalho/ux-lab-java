
package entidade;

import persistencia.*;

public class Loggar 
{
    private String usuario;
    private String senha;
    private boolean logadoStatus = false;
    
    public String getUsuario() 
    {
        return usuario;
    }
    public String getSenha() 
    {
        return senha;
    }
    public boolean isLogadoStatus() 
    {
        return logadoStatus;
    }

    public void setUsuario(String usuario) 
    {
        this.usuario = usuario;
    }
    public void setSenha(String senha) 
    {
        this.senha = senha;
    }
    // Chamar a Persistencia que irar fazer a autenticação do usuario
    public void setLogadoStatus() 
    {
        //Somente para teste temporario
        this.logadoStatus = true;
        
        /*
        if(percistenciaX == true)
        {
            this.logadoStatus = true;
        }
        */
    }
}
