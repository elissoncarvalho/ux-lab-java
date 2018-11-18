package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import entidade.Hemograma;
import java.util.ArrayList;
import java.util.List;

/* Autor Isabelle */

public class HemogramaDAO {
    private BaseDeDados bd;
    private PreparedStatement pstm;
    private ResultSet rs;
    private Hemograma hemo;
    
    private final String buscarHemo = "SELECT * FROM hemograma WHERE id_pedido_fk = ? LIMIT 1";
    
    private final String salvarHemo = "UPDATE hemograma SET HEMACIAS = ?, "
            + "HEMOGLOBINA = ?, HEMATOCRITO = ?, VCM = ?, HCM = ?, CHCM = ?, "
            + "RDW = ?, LEUCOCITOS = ?, NEUTROFILOS = ?, SEGMENTADOS = ?, "
            + "BASTONETES = ?, EOSINOFILOS = ?, BASOFILOS = ?, LINFOCITOS = ?, "
            + "MONOCITOS = ?, LEUCOCITOS1 = ?, NEUTROFILOS1 = ?, "
            + "SEGMENTADOS1 = ?, BASTONETES1 = ?, EOSINOFILOS1 = ?, "
            + "BASOFILOS1 = ?, LINFOCITOS1 = ?, MONOCITOS1 = ?, "
            + "CONTAGEM_PLAQUETAS = ? WHERE id_pedido_fk = ?";

    public List<Hemograma> listarHemo (int id){
        List<Hemograma> listaExame = new ArrayList<>();
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(buscarHemo);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            if (rs.next()) {
                hemo = new Hemograma();
                
                hemo.setHemacias(rs.getDouble("HEMACIAS"));
                hemo.setHemoglobina(rs.getDouble("HEMOGLOBINA"));
                hemo.setHematocrito(rs.getDouble("HEMATOCRITO"));
                hemo.setVcm(rs.getDouble("VCM"));
                hemo.setHcm(rs.getDouble("HCM"));
                hemo.setChcm(rs.getDouble("CHCM"));
                hemo.setRdw(rs.getDouble("RDW"));
                hemo.setLeucocitos(rs.getDouble("LEUCOCITOS"));
                hemo.setNeutrofilos(rs.getDouble("NEUTROFILOS"));
                hemo.setSegmentados(rs.getDouble("SEGMENTADOS"));
                hemo.setBastonetes(rs.getDouble("BASTONETES"));
                hemo.setEosinofilos(rs.getDouble("EOSINOFILOS"));
                hemo.setBasofilos(rs.getDouble("BASOFILOS"));
                hemo.setLinfocitos(rs.getDouble("LINFOCITOS"));
                hemo.setMonocitos(rs.getDouble("MONOCITOS"));
                hemo.setLeucocitos1(rs.getDouble("LEUCOCITOS1"));
                hemo.setNeutrofilos1(rs.getDouble("NEUTROFILOS1"));
                hemo.setSegmentados1(rs.getDouble("SEGMENTADOS1"));
                hemo.setBastonetes1(rs.getDouble("BASTONETES1"));
                hemo.setEosinofilos1(rs.getDouble("EOSINOFILOS1"));
                hemo.setBasofilos1(rs.getDouble("BASOFILOS1"));
                hemo.setLinfocitos1(rs.getDouble("LINFOCITOS1"));
                hemo.setMonocitos1(rs.getDouble("MONOCITOS1"));
                hemo.setContagemPlaquetas(rs.getDouble("CONTAGEM_PLAQUETAS"));
                listaExame.add(hemo);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        bd.desconecta();
        return listaExame;
    }
    
    public boolean salvarHemo(Hemograma hemo){
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(salvarHemo);
            pstm.setDouble(1, hemo.getHemacias());
            pstm.setDouble(2, hemo.getHemoglobina());
            pstm.setDouble(3, hemo.getHematocrito());
            pstm.setDouble(4, hemo.getVcm());
            pstm.setDouble(5, hemo.getHcm());
            pstm.setDouble(6, hemo.getChcm());
            pstm.setDouble(7, hemo.getRdw());
            pstm.setDouble(8, hemo.getLeucocitos());
            pstm.setDouble(9, hemo.getNeutrofilos());
            pstm.setDouble(10, hemo.getSegmentados());
            pstm.setDouble(11, hemo.getBastonetes());
            pstm.setDouble(12, hemo.getEosinofilos());
            pstm.setDouble(13, hemo.getBasofilos());
            pstm.setDouble(14, hemo.getLinfocitos());
            pstm.setDouble(15, hemo.getMonocitos());
            pstm.setDouble(16, hemo.getLeucocitos1());
            pstm.setDouble(17, hemo.getNeutrofilos1());
            pstm.setDouble(18, hemo.getSegmentados1());
            pstm.setDouble(19, hemo.getBastonetes1());
            pstm.setDouble(20, hemo.getEosinofilos1());
            pstm.setDouble(21, hemo.getBasofilos1());
            pstm.setDouble(22, hemo.getLinfocitos1());
            pstm.setDouble(23, hemo.getMonocitos1());
            pstm.setDouble(24, hemo.getContagemPlaquetas());
            pstm.setInt(25, hemo.getCodigoH());
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