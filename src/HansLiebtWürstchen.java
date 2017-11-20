import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class HansLiebtWürstchen extends JPanel {

	
	private JTextField txtFieldLabel;
	private JTextField txtFieldTitel;
	private TextArea txtArea;
	private JLabel labelTitel;
	private JLabel labelLabel;
	private JPanel topPanel;
	private JPanel midPanel;
	private JPanel mainPanel;
	private JButton saveButton;
	private JLabel label;
	//private ImageIcon bildd;
	
	
	

	
	
	
	private GridBagConstraints gc = new GridBagConstraints();
	
	public ImageIcon ResizeImage(String ImagePath) {
		
		ImageIcon MyImage = new ImageIcon(ImagePath);
		Image img = MyImage.getImage();
		Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(newImg);
		return image;
		
	}
	
	
	
	public JPanel getPanel() {
		return mainPanel;
	}
	
	
	public  HansLiebtWürstchen() {
		
		mainPanel = new JPanel();
		topPanel = new JPanel();
		midPanel = new JPanel();
		saveButton = new JButton("Save");
		txtFieldLabel = new JTextField(20);
		txtFieldTitel = new JTextField(20);
		txtArea = new TextArea("Hier könnte Ihre Werbung stehen ");
		labelTitel = new JLabel("Titel:");
		labelLabel = new JLabel("Label:");
		label = new JLabel("*********BILD**********");
		
	//	bildd = new ImageIcon("./Bilder/Bilder.jpg");
		
		
	
		
		
		
		
		saveButton.addActionListener(new ActionListener() {

		
			public void actionPerformed(ActionEvent arg0) {

			JFileChooser file = new JFileChooser();
			file.setCurrentDirectory(new File(System.getProperty("user.home")));
			FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
			file.addChoosableFileFilter(filter);
			int result = file.showSaveDialog(null);
			if(result == JFileChooser.APPROVE_OPTION) {
				File selectedFile = file.getSelectedFile();
				String path = selectedFile.getAbsolutePath();
				label.setIcon(ResizeImage(path));
			}
			
			else if(result == JFileChooser.CANCEL_OPTION) {
				System.out.println("Keine File ausgewählt!");
			}
		}
		
		});
		
	
		
		
		topPanel.setPreferredSize(new Dimension(800, 250));
		midPanel.setPreferredSize(new Dimension(800, 250));
		label.setPreferredSize(new Dimension(100, 100));
		
		label.setBackground(Color.black);
		mainPanel.setBackground(Color.lightGray);
		label.setBorder(BorderFactory.createLineBorder(Color.black));
		topPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		midPanel.setBorder(BorderFactory.createLineBorder(Color.black));
	
	
		topPanel.setLayout(new GridBagLayout());
		mainPanel.setLayout(new GridBagLayout());
		midPanel.setLayout(new GridBagLayout());
		
		
	
	
	//	gc.fill = GridBagConstraints.HORIZONTAL;
		//gc.anchor = GridBagConstraints.NORTH;
		
		
		// TOP PANEL
		
		mainPanel.add(topPanel, gc);
		
	
		//Label Text
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 1;
		gc.weighty = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		
		topPanel.add(labelLabel, gc);
		
		//Label Textspalte
		
		gc.gridx = 1;
		gc.gridy = 0;
		gc.weightx = 1;
		gc.weighty = 0;
		gc.anchor = GridBagConstraints.LINE_START;
		topPanel.add(txtFieldLabel, gc);
		
		//Titel Text
		gc.gridx = 2;
		gc.gridy = 0;
		gc.weightx = 1;
		gc.weighty = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		topPanel.add(labelTitel, gc);
		
		// Titel Textspalte
		gc.gridx = 3;
		gc.gridy = 0;
		gc.weightx = 1;
		gc.weighty = 0;
		gc.anchor = GridBagConstraints.LINE_START;
		
		topPanel.add(txtFieldTitel, gc);
		
		//Label
		gc.gridx = 1;
		gc.gridy = 1;
		gc.weightx = 4;
		gc.weighty = 1;
		gc.anchor = GridBagConstraints.CENTER;
		topPanel.add(label, gc);
		
		
	/*	gc.gridx = 4;
		gc.gridy = 0;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		topPanel.add(goExplorer, gc);
		*/
		
		//MID PANEL
		
		gc.gridx = 0;
		gc.gridy = 1;
		gc.weightx = 0;
		gc.weighty = 0;
		mainPanel.add(midPanel, gc);
		
		
		//TEXTAREA
		gc.gridx = 1;
		gc.gridy = 0;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.insets = new Insets(0, 10, 0, 0);
		midPanel.add(txtArea, gc);
		
		
		// SAVE BUTTON
		
		gc.gridx = 1;
		gc.gridy = 3;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 10);
		midPanel.add(saveButton, gc);
		
	
		
		

	}
}
