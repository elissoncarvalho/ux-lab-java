
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
    
    private final String consultaUrinaRotina = "SELECT * FROM URINA_ROTINA WHERE ID_PEDIDO_FK = ?";
     
    private final String alteraUrinaRotina = "UPDATE URINA_ROTINA SET COR = ?, DENSIDADE = ?, "
            + "ASPECTO = ?, PH = ?, CEL_EPITELIAIS = ?, LEUCOCITOS = ?, HEMACIAS = ?, CILINDROS = ? "
            + "WHERE ID_PEDIDO_FK = ?";
    
    public List<UrinaRotina> listarExame (Integer CodigoR){
        List<UrinaRotina> listaUR = new ArrayList<>();
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(consultaUrinaRotina);
            pstm.setInt(1, CodigoR);
            rs = pstm.executeQuery();
            if (rs.next()) {
                urinaR = new UrinaRotina();
                urinaR.setCor(rs.getString("cor"));
                urinaR.setDensidade(rs.getString("densidade"));
                urinaR.setAspecto(rs.getString("aspecto"));
                urinaR.setPh(rs.getDouble("ph"));
                urinaR.setCelEpiteliais(rs.getString("CEL_EPITELIAIS"));
                urinaR.setLeucocitos(rs.getString("leucocitos"));
                urinaR.setHemacias(rs.getString("hemacias"));
                urinaR.setCilindros(rs.getString("cilindros"));
                listaUR.add(urinaR);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        bd.desconecta();
        return listaUR;
    }
    
     public boolean salvarExame( UrinaRotina urinaR){
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(alteraUrinaRotina);
            pstm.setString(1, urinaR.getCor());
            pstm.setString(2, urinaR.getDensidade());
            pstm.setString(3, urinaR.getAspecto());
            pstm.setDouble(4, urinaR.getPh());
            pstm.setString(5, urinaR.getCelEpiteliais());
            pstm.setString(6, urinaR.getLeucocitos());
            pstm.setString(7, urinaR.getHemacias());
            pstm.setString(8, urinaR.getCilindros());
            pstm.setInt(9, urinaR.getCodigoUR());
            pstm.executeUpdate();
            bd.desconecta();
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    
    
    
    
    
}
