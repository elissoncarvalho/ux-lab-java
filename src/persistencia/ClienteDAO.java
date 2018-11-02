package persistencia;

import entidade.ClienteCadastra;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Elisson
 */
public class ClienteDAO {
    private BaseDeDados bd;
    private PreparedStatement pstm;
    private ResultSet rs;
    private ClienteCadastra cliente;
    
    private String cadastraCliente = "INSERT INTO CLIENTE (ID_CLIENTE, NOME, DATA_NASC, CPF, RG, SEXO, TELEFONE, "
            + "ENDERECO, CEP, BAIRRO, CIDADE, UF, DELET) "
            + "VALUES (null, ?, DATE_FORMAT(str_to_date('?', '%d/%m/%Y'), '%Y-%m-%d'), ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)";
    
    public void cadastra(ClienteCadastra cliente){
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(cadastraCliente);
            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getData_nasc());
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
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
