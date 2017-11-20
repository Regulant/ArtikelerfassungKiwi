import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;




public class Erfassung extends JFrame {
	
	public HansLiebtWürstchen erfassungsInhalt;
	
	
	
	
	
    public void displayGUI() {
        JOptionPane.showMessageDialog(null,getPanel());
    }

    public JPanel getPanel() {
    	setLayout(new BorderLayout());
        JPanel erfassungsHauptPanel = new JPanel();
        erfassungsInhalt = new HansLiebtWürstchen();
        
    	erfassungsHauptPanel.add(erfassungsInhalt.getPanel(), BorderLayout.CENTER);
    	erfassungsHauptPanel.setBackground(Color.lightGray);

        erfassungsHauptPanel.setPreferredSize(new Dimension(1000, 700));
       
        
        
        return erfassungsHauptPanel;
    }
    
}
