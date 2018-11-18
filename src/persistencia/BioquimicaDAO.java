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
    
    private final String buscarBio = "SELECT * FROM bioquimica WHERE id_pedido_fk = ? LIMIT 1";
    
    private final String salvarBio = "UPDATE bioquimica SET GLICOSE = ?, "
            + "ACIDO_URICO = ?, UREIA = ?, CREATININA = ?, COLESTEROL_TOTAL = ?, "
            + "COLESTEROL_HDL = ?, COLESTEROL_LDL = ?, COLESTEROL_VLDL = ?, "
            + "TRIGLICERIDES = ?, TGO = ?, TGP = ?, GAMA_GT = ?, BILIRRUBINA = ?"
            + " WHERE id_pedido_fk = ?";

    public List<Bioquimica> listarExame (Integer CodigoB){
        List<Bioquimica> listaBio = new ArrayList<>();
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(buscarBio);
            pstm.setInt(1, CodigoB);
            rs = pstm.executeQuery();
            if (rs.next()) {
                bio = new Bioquimica();
                bio.setGlicose(rs.getDouble("GLICOSE"));
                bio.setAcidoUrico(rs.getDouble("ACIDO_URICO"));
                bio.setUreia(rs.getDouble("UREIA"));
                bio.setCreatinina(rs.getDouble("CREATININA"));
                bio.setColesterolTotal(rs.getDouble("COLESTEROL_TOTAL"));
                bio.setColesterolHDL(rs.getDouble("COLESTEROL_HDL"));
                bio.setColesterolLDL(rs.getDouble("COLESTEROL_LDL"));
                bio.setColesterolVLDL(rs.getDouble("COLESTEROL_VLDL"));
                bio.setTriglicerides(rs.getDouble("TRIGLICERIDES"));
                bio.setTgo(rs.getInt("TGO"));
                bio.setTgp(rs.getInt("TGP"));
                bio.setGamaGT(rs.getInt("GAMA_GT"));
                bio.setBilirrubina(rs.getDouble("BILIRRUBINA"));
                listaBio.add(bio);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        bd.desconecta();
        return listaBio;
    }
    
    public boolean salvarExame(Bioquimica bio){
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
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
}
