package persistencia;

import entidade.Cliente;
import entidade.Exame;
import entidade.Pedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/* Autor Elisson */

public class PedidoDAO {
    private BaseDeDados bd;
    private PreparedStatement pstm;
    private ResultSet rs;
    private Cliente cliente;
    private Pedido pedido;
    
    private final String buscaIdPedido = "SELECT ID_N_PEDIDO FROM pedido ORDER BY ID_N_PEDIDO DESC LIMIT 1";
    private final String buscarCliente = "SELECT NOME FROM CLIENTE WHERE DELET = 0 AND ID_CLIENTE = ?";
    private final String geraPedido = "INSERT INTO pedido VALUES (NULL, ?, ?, ?, 0, 0, 0, 0, 0, 0, 0, 0, 0)";
    private final String geraHemogr = "INSERT INTO hemograma VALUES (NULL, ?, NULL, NULL, NULL, NULL, NULL, "
                                        + "NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0)";
    private final String geraBioqui = "INSERT INTO bioquimica VALUES (NULL, ?, NULL, NULL, NULL, NULL, NULL,"
                                        + " NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL,  0)";
    private final String geraUriRot = "INSERT INTO urina_rotina VALUES (NULL, ?, NULL, NULL, NULL, NULL, "
                                        + "NULL, NULL, NULL, NULL, 0)";
    private final String geraSangOc = "INSERT INTO fezes VALUES (NULL, ?, NULL, NULL, NULL, NULL, 0)";
    private final String listaPedido = "SELECT PEDIDO.ID_N_PEDIDO, pedido.COD_CLIENTE_FK, cliente.NOME, cliente.CPF, "
            + "PEDIDO.CONVENIO, PEDIDO.DATA_PEDIDO FROM PEDIDO INNER JOIN cliente ON cliente.DELET = 0 AND "
            + "cliente.ID_CLIENTE = pedido.COD_CLIENTE_FK WHERE pedido.DELET = 0";
    
    public int buscaNumeroPedido() {
        int nome = 0;
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(buscaIdPedido);
            rs = pstm.executeQuery();
            if(rs.next()){
                nome =  rs.getInt("ID_N_PEDIDO");
            }
            bd.desconecta();
            return nome;
        }
        catch(SQLException e){
            e.printStackTrace();
            return 0;
        }
    }
    public boolean geraPedido(Pedido pedido){
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(geraPedido);
            //pstm.setInt(1, pedido.getIdPedido());
            pstm.setInt(1, pedido.getIdCliente());
            pstm.setDate(2, pedido.getDataPedido());
            pstm.setString(3, pedido.getConvenio());
            
            pstm.executeUpdate();
            bd.desconecta();
            return true;
        }
        catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean geraHemogr(int pedido){
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(geraHemogr);
            pstm.setInt(1, pedido);
            
            pstm.executeUpdate();
            bd.desconecta();
            return true;
        }
        catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean geraBioqui(int pedido){
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(geraBioqui);
            pstm.setInt(1, pedido);
            
            pstm.executeUpdate();
            bd.desconecta();
            return true;
        }
        catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean geraUriRot(int pedido){
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(geraUriRot);
            pstm.setInt(1, pedido);
            
            pstm.executeUpdate();
            bd.desconecta();
            return true;
        }
        catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean geraSangOc(int pedido){
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(geraSangOc);
            pstm.setInt(1, pedido);
            
            pstm.executeUpdate();
            bd.desconecta();
            return true;
        }
        catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public String buscaCliente(int idCliente){
        String nome = null;
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(buscarCliente);
            pstm.setInt(1, idCliente);
            rs = pstm.executeQuery();
            if(rs.next()){
                nome =  rs.getString("NOME");
            }
            bd.desconecta();
            return nome;
        }
        catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    public List<Pedido> listarPedidos(){
        List<Pedido> listarPedido = new ArrayList<>();
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(listaPedido);
            rs = pstm.executeQuery();
            while(rs.next()){
                pedido = new Pedido();
                        
                pedido.setIdPedido(rs.getInt("ID_N_PEDIDO"));
                pedido.setIdCliente(rs.getInt("COD_CLIENTE_FK"));
                pedido.setDataPedido(rs.getDate("DATA_PEDIDO"));
                pedido.setConvenio(rs.getString("CONVENIO"));
               
                listarPedido.add(pedido);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
            //return null;
        }
        bd.desconecta();
        return listarPedido;
    }
}
