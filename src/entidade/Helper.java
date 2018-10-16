package entidade;

import javax.swing.JPanel;

import fronteira.Principal;
/**
 *
 * @author elisson
 */
public class Helper 
{
    private boolean statusMasq = true;

    public boolean isStatusMasq() {
        return statusMasq;
    }

    public void setStatusMasq(boolean statusMasq)
    {
        this.statusMasq = statusMasq;
    }

    public void showMasq(JPanel panelA, JPanel panelB)
    {   // Efeito Mascara Branca
        panelA.setVisible(!true);
        panelB.setVisible(true);
        this.statusMasq = !true;
    }
    private void resetMasq(JPanel panelA, JPanel panelB)
    {   // Volta ao estado anterior da Mascara
        
        statusMasq = true;
    }
    
}
