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
    private String consultaHemo = "SELECT * FROM HEMOGRAMA WHERE CODIGOH LIKE ?";
    private String cadastraHemo = "INSERT INTO HEMOGRAMA (CODIGOH, HEMACIAS, "
            + "HEMOGLOBINA, HEMATOCRITO, VCM, HCM, CHCM, RDW, LEUCOCITOS, "
            + "NEUTROFILOS, SEGMENTADOS, BASTONETES, EOSINOFILOS, BASOFILOS, "
            + "LINFOCITOS, MONOCITOS, CONTAGEMPLAQUETAS) VALUES ()"
