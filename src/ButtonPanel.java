import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class ButtonPanel  // Bildet die erste Reihe
{

	private ArrayList<JButton> buttons = new ArrayList<JButton>();	
//	private Map<String, JButton> mapButtonName2Button = new HashMap<>();	Christian Code
	private List<JButton> listButtons = new ArrayList<>();
	private ContentPanel contentPanel;
	private JPanel buttonPanel;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JScrollPane scrollPane;
	private Border blackline;
	
	public ImageIcon imageIcon;
	private ImageIcon copyRedbull;

	public ButtonPanel(ContentPanel contentPanel)
	{
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.setBackground(Color.BLUE);
		scrollPane = new JScrollPane(buttonPanel);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
//		contentPanel.setImageIcon(ImageIconRedbull);
		
		btn1 = new JButton("");
		btn2 = new JButton("test");
		btn3 = new JButton("wie");
		btn4 = new JButton("aussehen");
		btn5 = new JButton("wird");
		btn6 = new JButton("list");
		
		buttons.add(btn6);
		System.out.println(buttons.size());
		
		btn1.setPreferredSize(new Dimension(80,90));
		btn1.setMargin(new Insets(0, 0, 0, 0));
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
	
	
	// Kevin Code
	
	public void addToBtnArray(String path)
	{
		ImageIcon icon = new ImageIcon(path);
		JButton appendBtn = new JButton("does this work", icon);
		
		System.out.println("groesse vorher = " + buttons.size());
		appendBtn.setPreferredSize(new Dimension(80,90));
		appendBtn.setMargin(new Insets(0, 0, 0, 0));
		appendBtn.setVisible(true);
		buttons.add(appendBtn);
		buttonPanel.add(appendBtn);
		System.out.println("groesse nachher = " + buttons.size());		
	}
	
	

	
}