package persistencia;

import entidade.ClienteCadastra;
import entidade.ClientePesquisa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    private ClientePesquisa clientePesquisa;
    private ClienteCadastra cliente;
    
    
    private String consultaCliente = "SELECT * FROM CLIENTE WHERE DELET = '0'";
    private String cadastraCliente = "INSERT INTO CLIENTE (ID_CLIENTE, NOME, DATA_NASC, CPF, RG, SEXO, TELEFONE, "
            + "ENDERECO, CEP, BAIRRO, CIDADE, UF, DELET) "
            + "VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)";
    
    public List<ClientePesquisa> listarClientes(){
        List<ClientePesquisa> listaCliente = new ArrayList<>();
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(consultaCliente);
            rs = pstm.executeQuery();
            while(rs.next()){
                clientePesquisa = new ClientePesquisa();
                        
                clientePesquisa.setIdCliente(rs.getInt("ID_CLIENTE"));
                clientePesquisa.setNome(rs.getString("NOME"));
                clientePesquisa.setData_nasc(rs.getDate("DATA_NASC"));
                clientePesquisa.setCpf(rs.getString("CPF"));
                clientePesquisa.setRg(rs.getString("RG"));
                clientePesquisa.setSexo(rs.getBoolean("SEXO"));
                clientePesquisa.setTelefone(rs.getString("TELEFONE"));
                clientePesquisa.setEndereco(rs.getString("ENDERECO"));
                clientePesquisa.setTelefone(rs.getString("CEP"));
                clientePesquisa.setBairro(rs.getString("BAIRRO"));
                clientePesquisa.setCidade(rs.getString("CIDADE"));
                clientePesquisa.setUf(rs.getString("UF"));
                listaCliente.add(clientePesquisa);
            }
        }
        catch(Exception e){
            e.printStackTrace();
            //return null;
        }
        bd.desconecta();
        return listaCliente;
    }
    
    public boolean cadastra(ClienteCadastra cliente){
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
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
