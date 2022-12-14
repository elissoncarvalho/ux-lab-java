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
    private Pedido pedido;
    
    private final String buscaIdPedido = "SELECT ID_N_PEDIDO FROM pedido ORDER BY ID_N_PEDIDO DESC LIMIT 1";
    private final String buscarCliente = "SELECT NOME FROM CLIENTE WHERE DELET = 0 AND ID_CLIENTE = ?";
    private final String geraPedido = "INSERT INTO pedido VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0)";
    private final String listaPedido = "SELECT PEDIDO.ID_N_PEDIDO, pedido.COD_CLIENTE_FK, cliente.NOME, cliente.CPF, "
            + "PEDIDO.CONVENIO, PEDIDO.DATA_PEDIDO FROM PEDIDO INNER JOIN cliente ON cliente.DELET = 0 AND "
            + "cliente.ID_CLIENTE = pedido.COD_CLIENTE_FK WHERE pedido.DELET = 0 ORDER BY PEDIDO.ID_N_PEDIDO";
    
    private final String buscaExame = "SELECT PEDIDO.ID_N_PEDIDO, pedido.COD_CLIENTE_FK, pedido.DATA_PEDIDO, "
            + "PEDIDO.CONVENIO, cliente.NOME , CASE WHEN pedido.ACTIVE_HEMOGRAMA = 1 THEN '1' END AS Hemo, "
            + "CASE WHEN pedido.ACTIVE_BIOQUIMICA = 1 THEN '1' END AS bioq, CASE WHEN pedido.ACTIVE_FEZES = 1 "
            + "THEN '1' END AS COCO, CASE WHEN pedido.ACTIVE_URINAROTINA = 1 THEN '1' END AS urina "
            + "FROM PEDIDO INNER JOIN cliente ON cliente.DELET = 0 AND cliente.ID_CLIENTE = pedido.COD_CLIENTE_FK "
            + "LEFT JOIN hemograma on hemograma.ID_PEDIDO_FK = pedido.ID_N_PEDIDO LEFT JOIN bioquimica on "
            + "bioquimica.ID_PEDIDO_FK = pedido.ID_N_PEDIDO LEFT JOIN fezes on fezes.ID_PEDIDO_FK = pedido.ID_N_PEDIDO "
            + "LEFT JOIN urina_rotina on urina_rotina.ID_PEDIDO_FK = pedido.ID_N_PEDIDO WHERE pedido.DELET = 0 AND "
            + "PEDIDO.ID_N_PEDIDO = ? GROUP BY pedido.ID_N_PEDIDO";
    
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
            pstm.setBoolean(4, pedido.isActiveHemograma());
            pstm.setBoolean(5, pedido.isActiveBioquimica());
            pstm.setBoolean(6, pedido.isActiveSangueOculto());
            pstm.setBoolean(7, pedido.isActiveUrinaRotina());
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
                pedido.setNome(rs.getString("NOME"));
                pedido.setCpf(rs.getString("CPF"));
                pedido.setStatus(true);
               
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
    public Pedido buscaPedidoExame (Pedido pedido){
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(buscaExame);
            pstm.setInt(1, pedido.getIdPedido());
            rs = pstm.executeQuery();
            if(rs.next()){
                        
                pedido.setIdCliente(rs.getInt("COD_CLIENTE_FK"));
                pedido.setDataPedido(rs.getDate("DATA_PEDIDO"));
                pedido.setConvenio(rs.getString("CONVENIO"));
                pedido.setNome(rs.getString("NOME"));
                pedido.setActiveHemograma(rs.getBoolean("Hemo"));
                pedido.setActiveBioquimica(rs.getBoolean("bioq"));
                pedido.setActiveSangueOculto(rs.getBoolean("COCO"));
                pedido.setActiveUrinaRotina(rs.getBoolean("urina"));
                pedido.setStatus(true);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        bd.desconecta();
        return pedido;
    }
}
