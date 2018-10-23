package entidade;

import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
/**
 *
 * @author elisson
 */
public class Helper {
    /*
    Analizar a viabilidade d implementação
    
    private boolean statusMasq = true;

    public boolean isStatusMasq() {
        return statusMasq;
    }

    public void setStatusMasq(boolean statusMasq){
        this.statusMasq = statusMasq;
    }

    public void showMasq(JPanel panelA, JPanel panelB){   // Efeito Mascara Branca
        panelA.setVisible(!true);
        panelB.setVisible(true);
        this.statusMasq = !true;
    }
    private void resetMasq(JPanel panelA, JPanel panelB){   // Volta ao estado anterior da Mascara
        
        statusMasq = true;
    }
    */
    VerifExaRult        verifExaRult    = new VerifExaRult();
    
    // Transicoes de cor ao passar o mouse por cima
    public void setMouseBtnSMMoved(JToggleButton btn){
        btn.setBackground(new java.awt.Color(229, 229, 229));
    }
    public void resMouseBtnSMMoved(JToggleButton btn){
        btn.setBackground(new java.awt.Color(255, 255, 255));
    }
    
    public void setMouseBtnMoved(JToggleButton btn, String iconsBg){
        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconsBg)));
        btn.setForeground(new java.awt.Color(0,167,230));
        btn.setBorder(javax.swing.BorderFactory.createCompoundBorder
                        (javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0,167,230)), 
                        javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20)));
    }
    public void resMouseBtnMoved(JToggleButton btn, String iconsBg){
        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconsBg)));
        btn.setForeground(new java.awt.Color(35,59,77));
        btn.setBorder(javax.swing.BorderFactory.createCompoundBorder
                        (javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35,59,77)), 
                        javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20)));
    }
    public void setMouseCbxMoved(JCheckBox cbx){
        if(!cbx.isSelected()){
            cbx.setForeground(new java.awt.Color(0,167,230));
            cbx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px_1.png")));
            cbx.setBorder(javax.swing.BorderFactory.createCompoundBorder
                            (javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new 
                            java.awt.Color(0,167,230)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        }
    }
    public void resMouseCbxMoved(JCheckBox cbx){   
        if(!cbx.isSelected()){
            cbx.setForeground(new java.awt.Color(35,59,77));
            cbx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png")));
            cbx.setBorder(javax.swing.BorderFactory.createCompoundBorder
                            (javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new 
                            java.awt.Color(35,59,77)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        } else {
            cbx.setForeground(new java.awt.Color(255, 255, 255));
            cbx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png")));
            cbx.setBorder(javax.swing.BorderFactory.createCompoundBorder
                            (javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new 
                            java.awt.Color(75, 190, 73)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        }
    }
    public void setMouseBtnFormMoved(JToggleButton btn, int borderColor, String lblText){
        switch (borderColor) {
            case 1:
                btn.setForeground(new java.awt.Color(255,255,255));
                btn.setBackground(new java.awt.Color(0,128,200));//azul
                break;
            case 2:
                btn.setForeground(new java.awt.Color(255,255,255));
                btn.setBackground(new java.awt.Color(190,75,73));//vermelho
                break;
            case 3:
                btn.setText("<html><p style='text-decoration: underline'>"+lblText+"</p>");
                break;
            default:
                break;
        }
    }
    public void resMouseBtnFormMoved(JToggleButton btn, int borderColor, String lblText){
        switch (borderColor) {
            case 1:
                btn.setForeground(new java.awt.Color(0,128,200));//azul
                btn.setBackground(new java.awt.Color(255,255,255));
                break;
            case 2:
                btn.setForeground(new java.awt.Color(190,75,73));//vermelho
                btn.setBackground(new java.awt.Color(255,255,255));
                break;
            case 3:
                btn.setText(lblText);
                break;
            default:
                break;
        }
    }
    // Fim Transisções
    
    // Verifica se o Exame esta Ativado
    public void verificaActive(JToggleButton btn1,JToggleButton btn2,JToggleButton btn3, JToggleButton btn4){   
        // ExameHemograma
        if(verifExaRult.isActiveHemograma() == true){
            btn1.setEnabled(true);
        }
        // ExameBioquimica
        if(verifExaRult.isActiveBioquimica() == true){
            btn2.setEnabled(true);
        }
        // Urina Rotina
        if(verifExaRult.isActiveUrinaRotina() == true){
            btn3.setEnabled(true);
        }
        // Sangue Oculto
        if(verifExaRult.isActiveSangueOculto() == true){
            btn4.setEnabled(true);
        }
    }
    // Verifica se o Exame esta Concluido
    public void verificaStatus(JToggleButton btn1,JToggleButton btn2,JToggleButton btn3, JToggleButton btn4){   
        // ExameHemograma
        if(verifExaRult.isStatusHemograma() == true){
            setColorBtnExameCadReslt(btn1);
        } else {
            restColorBtnExameCadReslt(btn1);
        }
        // ExameBioquimica
        if(verifExaRult.isStatusBioquimica() == true){
            setColorBtnExameCadReslt(btn2);
        } else {
            restColorBtnExameCadReslt(btn2);
        }
        // Urina Rotina
        if(verifExaRult.isStatusUrinaRotina() == true){
            setColorBtnExameCadReslt(btn3);
        } else {
            restColorBtnExameCadReslt(btn3);
        }
        // Sangue Oculto
        if(verifExaRult.isStatusSangueOculto() == true){
            setColorBtnExameCadReslt(btn4);
        } else {
            restColorBtnExameCadReslt(btn4);
        }
    }
    
    
    // Btn Colors; Transições de Cores
    public void setBtnColor(JToggleButton btn){
        btn.setBackground(new Color(0,128,200));
    }
    public void resetBtnColor(JToggleButton btn){
        btn.setBackground(new Color(0,167,230));
    }
    
    public void setCbxColor(JCheckBox check){   // Exame > CadastraExame > CheckBoxColors
        check.setBackground(new Color(75,190,73));
        check.setForeground(Color.white);
        check.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(75, 190, 73)), 
                javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
    }
    public void restCbxColor(JCheckBox check){
        check.setBackground(Color.white);
        check.setForeground(new Color(35,59,77));
        check.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35,59,77)), 
                javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
    }
    
    public void setColorBtnExameCadReslt(JToggleButton check){
        check.setBackground(new Color(75,190,73));
        check.setForeground(Color.white);
        check.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(75, 190, 73)), 
                javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
    }
    public void restColorBtnExameCadReslt(JToggleButton check){
        check.setBackground(Color.white);
        check.setForeground(new Color(35,59,77));
        check.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35,59,77)), 
                javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
    }
    // Fim Colors
}
