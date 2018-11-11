package persistencia;

import entidade.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Elisson
 */
public class ClienteDAO {
    private BaseDeDados bd;
    private PreparedStatement pstm;
    private ResultSet rs;
    private Cliente cliente;
    
    
    private final String listarCliente = "SELECT * FROM CLIENTE WHERE DELET = '0'";
    private final String cadastraCliente = "INSERT INTO CLIENTE VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)";
    private final String upDateCliente = "UPDATE CLIENTE SET NOME = ?, DATA_NASC = ?, CPF = ?, RG = ?, SEXO = ?, "
            + "TELEFONE = ?, ENDERECO = ?, CEP = ?, BAIRRO = ?, CIDADE = ?, UF = ?, DELET = 0 WHERE ID_CLIENTE = ?";
    private final String deletCliente = "UPDATE CLIENTE SET DELET = 1 WHERE ID_CLIENTE = ?";
    
    public List<Cliente> listarClientes(){
        List<Cliente> listaCliente = new ArrayList<>();
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(listarCliente);
            rs = pstm.executeQuery();
            while(rs.next()){
                cliente = new Cliente();
                        
                cliente.setIdCliente(rs.getInt("ID_CLIENTE"));
                cliente.setNome(rs.getString("NOME"));
                cliente.setData_nasc(rs.getDate("DATA_NASC"));
                cliente.setCpf(rs.getString("CPF"));
                cliente.setRg(rs.getString("RG"));
                cliente.setSexo(rs.getBoolean("SEXO"));
                cliente.setTelefone(rs.getString("TELEFONE"));
                cliente.setEndereco(rs.getString("ENDERECO"));
                cliente.setCep(rs.getString("CEP"));
                cliente.setBairro(rs.getString("BAIRRO"));
                cliente.setCidade(rs.getString("CIDADE"));
                cliente.setUf(rs.getString("UF"));
                listaCliente.add(cliente);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
            //return null;
        }
        bd.desconecta();
        return listaCliente;
    }
    public boolean cadastra(Cliente cliente){
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(cadastraCliente);
            pstm.setString(1, cliente.getNome());
            pstm.setDate(2, cliente.getData_nasc());
            pstm.setString(3, cliente.getCpf());
            pstm.setString(4, cliente.getRg());
            pstm.setBoolean(5, cliente.isSexo());
            pstm.setString(6, cliente.getTelefone());
            pstm.setString(7, cliente.getEndereco());
            pstm.setString(8, cliente.getCep());
            pstm.setString(9, cliente.getBairro());
            pstm.setString(10, cliente.getCidade());
            pstm.setString(11, cliente.getUf());
            
            pstm.executeUpdate();
            bd.desconecta();
            return true;
        }
        catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean upDate(Cliente cliente){
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(upDateCliente);
            pstm.setString(1, cliente.getNome());
            pstm.setDate(2, cliente.getData_nasc());
            pstm.setString(3, cliente.getCpf());
            pstm.setString(4, cliente.getRg());
            pstm.setBoolean(5, cliente.isSexo());
            pstm.setString(6, cliente.getTelefone());
            pstm.setString(7, cliente.getEndereco());
            pstm.setString(8, cliente.getCep());
            pstm.setString(9, cliente.getBairro());
            pstm.setString(10, cliente.getCidade());
            pstm.setString(11, cliente.getUf());
            pstm.setInt(12, cliente.getIdCliente());
            
            pstm.executeUpdate();
            bd.desconecta();
            return true;
        }
        catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean delet(Cliente cliente){
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(deletCliente);
            pstm.setInt(1, cliente.getIdCliente());
            
            pstm.executeUpdate();
            bd.desconecta();
            return true;
        }
        catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
