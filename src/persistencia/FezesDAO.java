package persistencia;

import entidade.Fezes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

/* Autor Doborah */

public class FezesDAO {
    
    private BaseDeDados bd;
    private PreparedStatement pstm;
    private ResultSet rs;
    private Fezes fezes;
    
    private final String consultaFezes = "SELECT * FROM FEZES WHERE ID_PEDIDO_FK = ?";
    
    private final String alteraFezes = "UPDATE FEZES SET Resut_Parasitologico = ?, Obs_Parasitologico = ?,"
            + "SANGUE_OCULTO = ?, Obs_SANGUE_OCULTO = ? WHERE ID_PEDIDO_FK = ?";
    
    public List<Fezes> listarExame (int id){
       List<Fezes> listaFezes = new ArrayList<>();
       try{
           bd = new BaseDeDados();
           pstm = bd.conecta().prepareStatement(consultaFezes);
           pstm.setInt(1, id);
           rs = pstm.executeQuery();
           if (rs.next()) {
               fezes = new Fezes();
               fezes.setResutParasitologico(rs.getString("Resut_Parasitologico"));
               fezes.setObsParasitologico(rs.getString("Obs_Parasitologico"));
               fezes.setSangueOculto(rs.getBoolean("SANGUE_OCULTO"));
               fezes.setObsSangueOculto(rs.getString("Obs_SANGUE_OCULTO"));
               listaFezes.add(fezes);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        bd.desconecta();
        return listaFezes;
    }
    
    public boolean salvarExame (Fezes fezes){
        try{
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(alteraFezes);
            pstm.setString(1, fezes.getResutParasitologico());
            pstm.setString(2, fezes.getObsParasitologico());
            pstm.setBoolean(3, fezes.isSangueOculto());
            pstm.setString(4, fezes.getObsSangueOculto());
            pstm.setInt(5, fezes.getCodigoF());
            pstm.executeUpdate();
            bd.desconecta();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}