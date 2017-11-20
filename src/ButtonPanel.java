import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class ButtonPanel {

	private JButton buttonArr[];
    private JPanel buttonPanel;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JScrollPane scrollPane;
    private Border blackline;
    
    public ImageIcon redbull;
    
    public ButtonPanel()
    {
        //The ButtonGroup component manages the selected/unselected state for a set of buttons.
        //For the group, the ButtonGroup instance guarantees that only one button can be selected at a time.
        
        //blackline = BorderFactory.createLineBorder(Color.black);
        
        buttonArr = new JButton[10];
        
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.setBackground(Color.BLUE);
        scrollPane = new JScrollPane(buttonPanel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        redbull = new ImageIcon("./Bilder/redbull.png");
        //redbull = new ImageIcon(redbull.getImage());   wie mach ich das hier richtig?
        
        btn1 = new JButton("", redbull);
        btn2 = new JButton("test");
        btn3 = new JButton("wie");
        btn4 = new JButton("aussehen");
        btn5 = new JButton("wird");
        
        for (int i = 0; i <= buttonArr.length - 1; i++)
        {
            buttonArr[i] = new JButton(String.valueOf(i));
            System.out.println("Button " + i + " wurde erstellt");
        }
        
        buttonArr[0].setPreferredSize(new Dimension(100, 100)); 
        buttonArr[0].setMargin(new Insets(20, 20, 20, 20));
        buttonArr[0].setBorder(btn1.getBorder());;
        buttonArr[0].setHorizontalTextPosition(SwingConstants.CENTER);
        buttonPanel.add(buttonArr[0]);
        
        btn1.setPreferredSize(new Dimension(80,90));
        btn1.setMargin(new Insets(0, 0, 0, 0));
        //btn1.setBorder(blackline);
        btn1.setHorizontalTextPosition(SwingConstants.CENTER);
        buttonPanel.add(btn1);
        
        scrollPane.setPreferredSize(btn1.getPreferredSize());
        
        
        
        buttonPanel.add(btn2);
        btn2.setPreferredSize(btn1.getPreferredSize());
        
        buttonPanel.add(btn3);
        buttonPanel.add(btn4);
        buttonPanel.add(btn5);
        
    }

    public JScrollPane getPanel()
    {
        return scrollPane;
    }
    
	
}
