package persistencia;

/* Autor: Marcos APolinario */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import entidade.Bioquimica;

public class BioquimicaDAO {
    private BaseDeDados bd;
    private PreparedStatement pstm;
    private ResultSet rs;
    private Bioquimica bio;
    
    private String buscarBio = "SELECT * FROM bioquimica WHERE id_pedido_fk = ? LIMIT 1";
    
    private String salvarBio = "UPDATE bioquimica SET GLICOSE = ?, "
            + "ACIDOURICO = ?, UREIA = ?, CREATININA = ?, COLESTEROLTOTAL = ?, "
            + "COLESTEROLHDL = ?, COLESTEROLLDL = ?, COLESTEROLVLDL = ?, "
            + "TRIGLICERIDES = ?, TGO = ?, TGP = ?, GAMAGT = ?, BILIRRUBINA = ?,"
            + " WHERE id_pedido_fk = ?";

    public List<Bioquimica> listarBio (Integer CodigoB){
        List<Bioquimica> listaBio = new ArrayList<Bioquimica>();
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(buscarBio);
            pstm.setInt(1, CodigoB);
            rs = pstm.executeQuery();
            while (rs.next()) {
                bio = new Bioquimica();
                bio.setCodigoB(rs.getInt("codigob"));
                bio.setGlicose(rs.getDouble("glicose"));
                bio.setAcidoUrico(rs.getDouble("acidourico"));
                bio.setUreia(rs.getDouble("ureia"));
                bio.setCreatinina(rs.getDouble("creatinina"));
                bio.setColesterolTotal(rs.getDouble("colesteroltotal"));
                bio.setColesterolHDL(rs.getDouble("colesterolhdl"));
                bio.setColesterolLDL(rs.getDouble("colesterolldl"));
                bio.setColesterolVLDL(rs.getDouble("colesterolvldl"));
                bio.setTriglicerides(rs.getDouble("triglicerides"));
                bio.setTgo(rs.getInt("tgo"));
                bio.setTgp(rs.getInt("tgp"));
                bio.setGamaGT(rs.getInt("gamagt"));
                bio.setBilirrubina(rs.getDouble("bilirrubina"));
                listaBio.add(bio);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        bd.desconecta();
        return listaBio;
    }
    
    public void salvarBio(Bioquimica bio){
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(salvarBio);
            pstm.setDouble(1, bio.getGlicose());
            pstm.setDouble(2, bio.getAcidoUrico());
            pstm.setDouble(3, bio.getUreia());
            pstm.setDouble(4, bio.getCreatinina());
            pstm.setDouble(5, bio.getColesterolTotal());
            pstm.setDouble(6, bio.getColesterolHDL());
            pstm.setDouble(7, bio.getColesterolLDL());
            pstm.setDouble(8, bio.getColesterolVLDL());
            pstm.setDouble(9, bio.getTriglicerides());
            pstm.setDouble(10, bio.getTgo());
            pstm.setDouble(11, bio.getTgp());
            pstm.setDouble(12, bio.getGamaGT());
            pstm.setDouble(13, bio.getBilirrubina());
            pstm.setInt(14, bio.getCodigoB());
            pstm.executeUpdate();
            bd.desconecta();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
