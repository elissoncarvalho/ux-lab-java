package persistencia;

import entidade.Fezes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

/* Autor Déborah */

public class FezesDAO {
    
    private BaseDeDados bd;
    private PreparedStatement pstm;
    private ResultSet rs;
    private Fezes fezes;
    
    private String consultaFezes = "SELECT * FROM FEZES WHERE DELET = 0 AND ID_PEDIDO_FK = ?";
    
    private String alteraFezes= "UPDATE FEZES SET PARASITOLOGICO = ?, SANGUE_OCULTO = ? "
            + "WHERE ID_PEDIDO_FK = ?";
    
    public List<Fezes> listarFezes (String nome){
       List<Fezes> listaFezes = new ArrayList<Fezes>();
       try{
           bd = new BaseDeDados();
           pstm = bd.conecta().prepareStatement(consultaFezes);
           pstm.setString(1,nome);
           rs = pstm.executeQuery();
           while (rs.next()) {
               fezes.setCodigoF(rs.getInt("ID_PEDIDO_FK"));
               fezes.setParasitologico(rs.getString("PARASITOLOGICO"));
               fezes.setSangueOculto(rs.getString("SANGUE_OCULTO"));
               listaFezes.add(fezes);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        bd.desconecta();
        return listaFezes;
    }
    
    public void alteraFezes (Fezes fezes){
        try{
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(alteraFezes);
            pstm.setString(1, fezes.getParasitologico());
            pstm.setString(2, fezes.getSangueOculto());
            //Verificar linha de codigo abaixo
            pstm.setInt(3, fezes.getIdPedidoFk());
            pstm.executeUpdate();
            bd.desconecta();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}