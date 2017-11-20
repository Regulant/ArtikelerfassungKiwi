import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

	public class MainFrame extends JFrame implements ActionListener

	{
	    private String text;
	    private JFrame frame;
	    private JPanel mainPanel;
	    private JButton newBtn;
	    private GridBagLayout mainLayout;
	    private GridBagConstraints c;
	    private ContentPanel contentPanel;
	    private ButtonPanel btnPanel;
	    private Erfassung juhu;
	    

	    public MainFrame()
	    {
	        
	        // top level Komponenten
	        
	        frame = new JFrame();
	        mainPanel = new JPanel();
	        contentPanel = new ContentPanel();
	        btnPanel = new ButtonPanel(contentPanel);
	        
	        
	        mainPanel.setLayout(new GridBagLayout());
	        GridBagConstraints c = new GridBagConstraints();
	        
	        frame.setSize(1500, 1000);
	    //    frame.setResizable(false);
	    //    frame.pack();
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        //mainPanel.setSize(frame.getSize());
	        
	        frame.add(mainPanel);
	        
	        // darin eingeordnete Komponenten
	        
	        // ButtonPanel 1. Zeile
	        c.gridx = 0;
	        c.gridy = 0;
	        c.weightx = 1;
	        c.weighty = 1;
	        c.fill = GridBagConstraints.HORIZONTAL;
	        c.anchor = GridBagConstraints.FIRST_LINE_START;
	        c.ipady = 50;
	        c.insets = new Insets(10, 0, 40, 0); 
	        
	        mainPanel.add(btnPanel.getPanel(), c);
	        
	        // Content Panel mit Textarea und Image 2.Zeile
	        
	        c.gridx = 0;
	        c.gridy = 1;
	        c.weightx = 1;
	        c.weighty = 1;
	    
	        mainPanel.add(contentPanel.getContentPanel(), c);
	        
	        
	        // neu Button 3. Zeile
	        newBtn = new JButton("neu");
	        c.gridx = 0;
	        c.gridy = 2;
	        c.weightx = 0;
	        c.weighty = 0;
	        newBtn.setPreferredSize(new Dimension(60, 1));
	        c.fill = GridBagConstraints.NONE;
	        c.anchor = GridBagConstraints.LAST_LINE_START;
	        
	        mainPanel.add(newBtn, c);
	        
	        
	      // Kiwi 
	        
	      
	        
	        
	        //Action Listener für das Popup
	        newBtn.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
				
				juhu = new Erfassung();
				juhu.displayGUI();
				
				
				
				btnPanel.addToBtnArray("./Bilder/redbull.png");
				
				
				
					
		/*		JOptionPane.showMessageDialog(null,getPanel() );
					
						public JPanel getPanel() {
						JPanel pudel = new JPanel();
						JLabel testLabel = new JLabel("chiquito Test");
						
						
						
						return pudel;
					}
					*/

					
				}
	        	
	        	
	        	
	        });

	        
	        
	    }
	    
	    // action listener für Buttonpanel appending
	    
		@Override
		public void actionPerformed(ActionEvent e)
		{
			System.out.println("button has been pressed");
			btnPanel.addToBtnArray("./Bilder/rebull.png");
			
		}
	    
	    
	}
	
	
	

