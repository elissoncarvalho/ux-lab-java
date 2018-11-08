
package persistencia;
import entidade.UrinaRotina;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/* Autor WESLEY JUNIO */

public class UrinaRotinaDAO {
    private BaseDeDados bd;
    private PreparedStatement pstm;
    private ResultSet rs;
    private UrinaRotina urinaR; 
    
    private String consultaUrinaRotina = "SELECT * FROM URINA_ROTINA WHERE DELET = 0 AND ID_PEDIDO_FK = ? LIMIT 1";
     
    private String alteraUrinaRotina = "UPDATE URINA_ROTINA SET ID_PEDIDO_FK = ?, COR = ?,"
            + "DENSIDADE = ?, ASPECTO = ?, PH = ?, CEL_EPITELIAIS = ?, LEUCOCITOS = ?, "
            + " HEMACIAS = ?, CILINDROS = ? WHERE ID_PEDIDO_FK = ?";
    
    public List<UrinaRotina> listarUrinaRotina (Integer CodigoR){
        List<UrinaRotina> listaUR = new ArrayList<UrinaRotina>();
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(consultaUrinaRotina);
            pstm.setInt(1, CodigoR);
            rs = pstm.executeQuery();
            while (rs.next()) {
                urinaR = new UrinaRotina();
                urinaR.setCodigoUR(rs.getInt("codigoUR"));
                urinaR.setCor(rs.getString("cor"));
                urinaR.setDensidade(rs.getString("densidade"));
                urinaR.setAspecto(rs.getString("aspecto"));
                urinaR.setPh(rs.getDouble("ph"));
                urinaR.setCelEpiteliais(rs.getString("celEpiteliais"));
                urinaR.setLeucocitos(rs.getString("leucocitos"));
                urinaR.setHemacias(rs.getString("hemacias"));
                urinaR.setCilindros(rs.getString("cilindros"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        bd.desconecta();
        return listaUR;
    }
    
     public void alteraUrinaRotina( UrinaRotina urinaR){
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(alteraUrinaRotina);
            pstm.setString(1, urinaR.getCor().trim());
            pstm.setString(2, urinaR.getDensidade().trim());
            pstm.setString(3, urinaR.getAspecto().trim());
            pstm.setDouble(4, urinaR.getPh());
            pstm.setString(5, urinaR.getCelEpiteliais());
            pstm.setString(6, urinaR.getLeucocitos());
            pstm.setString(7, urinaR.getHemacias());
            pstm.setString(8, urinaR.getCilindros());
            pstm.executeUpdate();
            bd.desconecta();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
    
    
    
}
