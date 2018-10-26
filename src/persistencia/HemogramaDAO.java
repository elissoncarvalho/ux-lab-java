package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import entidade.Hemograma;

public class HemogramaDAO {
    private BaseDeDados bd;
    private PreparedStatement pstm;
    private ResultSet rs;
    private Hemograma hemo;
    
    private String consultaHemo = "SELECT CODIGOH FROM HEMOGRAMA WHERE CODIGOH LIKE ?";
    
    private String cadastraHemo = "INSERT INTO HEMOGRAMA (CODIGOH, HEMACIAS, "
            + "HEMOGLOBINA, HEMATOCRITO, VCM, HCM, CHCM, RDW, LEUCOCITOS, "
            + "NEUTROFILOS, SEGMENTADOS, BASTONETES, EOSINOFILOS, BASOFILOS, "
            + "LINFOCITOS, MONOCITOS, CONTAGEMPLAQUETAS) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    private String alteraHemo = "UPDATE HEMOGRAMA SET CODIGOH = ?, HEMACIAS = ?, "
            + "HEMOGLOBINA = ?, HEMATOCRITO = ?, VCM = ?, HCM = ?, CHCM = ?, "
            + "RDW = ?, LEUCOCITOS = ?, NEUTROFILOS = ?, SEGMENTADOS = ?, "
            + "BASTONETES = ?, EOSINOFILOS = ?, BASOFILOS = ?, LINFOCITOS = ?, "
            + "MONOCITOS = ?, CONTAGEMPLAQUETAS = ? WHERE CODIGOH = ?";
    
    private String deleteHemo = "UPDATE HEMOGRAMA SET DELET = ? WHERE ID_PEDIDO_FK = ID_PEDIDO";

    public List<Hemograma> listarHemo (Integer CodigoH){
        List<Hemograma> listaHemo = new ArrayList<Hemograma>();
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(consultaHemo);
            pstm.setInt(1, CodigoH);
            rs = pstm.executeQuery();
            while (rs.next()) {
                hemo = new Hemograma();
                hemo.setCodigoH(rs.getInt("codigoh"));
                hemo.setHemacias(rs.getDouble("hemacias"));
                hemo.setHemoglobina(rs.getDouble("hemoglobina"));
                hemo.setHematocrito(rs.getDouble("hematocrito"));
                hemo.setVcm(rs.getDouble("vcm"));
                hemo.setHcm(rs.getDouble("hcm"));
                hemo.setChcm(rs.getDouble("chcm"));
                hemo.setRdw(rs.getDouble("rdw"));
                hemo.setLeucocitos(rs.getDouble("leucocitos"));
                hemo.setNeutrofilos(rs.getDouble("neutrofilos"));
                hemo.setSegmentados(rs.getDouble("segmentados"));
                hemo.setBastonetes(rs.getDouble("bastonetes"));
                hemo.setEosinofilos(rs.getDouble("eosinofilos"));
                hemo.setBasofilos(rs.getDouble("basofilos"));
                hemo.setLinfocitos(rs.getDouble("linfocitos"));
                hemo.setMonocitos(rs.getDouble("monocitos"));
                hemo.setContagemPlaquetas(rs.getDouble("contagemplaquetas"));
                listaHemo.add(hemo);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        bd.desconecta();
        return listaHemo;
    }
    
    public void cadastraHemo(Hemograma hemo){
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(cadastraHemo);
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
            pstm.setDouble(16, hemo.getContagemPlaquetas());
            pstm.executeUpdate();
            bd.desconecta();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void alteraHemo(Hemograma hemo){
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(alteraHemo);
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
            pstm.setDouble(16, hemo.getContagemPlaquetas());
            pstm.setInt(17, hemo.getCodigoH());
            pstm.executeUpdate();
            bd.desconecta();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void deleteHemo(Hemograma hemo){
        
    }
}