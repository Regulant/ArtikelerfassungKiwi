import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	private ContentPanel contentPanel;
	private JPanel buttonPanel;
	private JScrollPane scrollPane;
	private Border blackline;
	private ImageIcon copyRedbull;
	private JButton repaint;
	

	public ButtonPanel(ContentPanel contentPanel)
	{
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.setBackground(Color.WHITE);
		scrollPane = new JScrollPane(buttonPanel);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setPreferredSize(new Dimension(0, 80));
		
		repaint = new JButton("repaint");
		repaint.setPreferredSize(new Dimension(80,90));
		repaint.setMargin(new Insets(0, 0, 0, 0));
		buttonPanel.add(repaint);
		
		repaint.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent clickRepaint)
			{
				System.out.println("repaint wurde geclickt");
			//	contentPanel.setImageLabel(contentPanel.getImageLabel2());
				
			}
		});
		
	}

	public JScrollPane getPanel()
	{
		return scrollPane;
	}
	
	
	public void addToBtnArray(String path)
	{
		ImageIcon icon = new ImageIcon(path);
		JButton appendBtn = new JButton("does this work?", icon);
		
		System.out.println("groesse vorher = " + buttons.size());
		appendBtn.setPreferredSize(new Dimension(80,90));
		appendBtn.setMargin(new Insets(0, 0, 0, 0));
		appendBtn.setVisible(true);
		buttons.add(appendBtn);
		buttonPanel.add(appendBtn);
		System.out.println("groesse nachher = " + buttons.size());
		buttonPanel.revalidate();
		buttonPanel.repaint();
	}
	
	
	
	
}