package persistencia;

import entidade.Fezes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class FezesDAO {
    
    private BaseDeDados bd;
    private PreparedStatement pstm;
    private ResultSet rs;
    private Fezes fezes;
    
    private String cadastraFezes = "Insert into fezes "
            + "(id_Fezes, id_Pedido_fk, Delet, Parasitologico, Sangue_Oculto) " +
                                "values (?, ?, ?, ?, ?, ";
    
    private String consultaFezes = "Select id_Fezes from fezes where id_Fezes "
                            + "id_fezes like ?";
    
    private String alteraFezes= "Update fezes set id_fezes = ?, id_pedido_fk = ?,"
            + "Delet = ?, Parasitologico = ?, Sangue_oculto = ? "
            + "where id_fezes = ?";
    
    private String excluiFezes = "Delete  from fezes where id_fezes = ?";
    
        public List<Fezes> listarFezes (String nome){
        List<Fezes> listaFezes = new ArrayList<Fezes>();
        try{
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(consultaFezes);
            pstm.setString(1,nome);
            rs = pstm.executeQuery();
            while (rs.next()) {
                fezes.setCodigoF(rs.getInt("codigof"));
                fezes.setParasitologico(rs.getString("parasitologico"));
                fezes.setSangueOculto(rs.getString("sangue_oculto"));
                listaFezes.add(fezes);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        bd.desconecta();
        return listaFezes;
    }
        
        public void cadastraFezes(Fezes fezes){
        try{
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(cadastraFezes);
            pstm.setString(1, fezes.getParasitologico().trim());
            pstm.setString(2, fezes.getSangueOculto().trim());
            pstm.executeUpdate();
            bd.desconecta();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void alteraFezes (Fezes fezes){
        try{
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(alteraFezes);
            pstm.setString(4, fezes.getParasitologico().trim());
            pstm.setString(5, fezes.getSangueOculto().trim());
            pstm.executeUpdate();
            bd.desconecta();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void excluirFezes(Fezes fezes){
        try{
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(excluiFezes);
            pstm.setInt(1, fezes.getCodigoF());
            pstm.executeUpdate();
            bd.desconecta();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
