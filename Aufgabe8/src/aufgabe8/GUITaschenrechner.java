package aufgabe8;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

public class GUITaschenrechner extends JFrame{
	
	public GUITaschenrechner ()
	{
		super(); //Konstruktor von JFrame
		this.setTitle("Taschenrechner");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel content = this.initContent();
		this.getContentPane().add(content);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setSize(350,500);
		this.setLocation(400, 100);
		this.setVisible(true);
	}
	
	private JPanel initContent()
	{
		JPanel mainPanel = new JPanel();
		
		mainPanel.setLayout(new BorderLayout());
		mainPanel.setBorder(BorderFactory.createLineBorder(Color.CYAN, 10));
		
		JPanel knoepfe = new JPanel();
		JPanel eingabe = new JPanel();
		knoepfe.setLayout(new GridLayout(6,3,10,10));
		eingabe.setLayout(new GridLayout(1,1));
		eingabe.setBorder(BorderFactory.createLineBorder(Color.CYAN, 10, true));

		
		JTextField input = new JTextField();
		JButton eins = new JButton("1");
		JButton zwei = new JButton("2");
		JButton drei = new JButton("3");
		JButton vier = new JButton("4");
		JButton fuenf = new JButton("5");
		JButton sechs = new JButton("6");
		JButton sieben = new JButton("7");
		JButton acht = new JButton("8");
		JButton neun = new JButton("9");
		JButton klammerAuf = new JButton ("(");
		JButton nnull = new JButton("0");
		JButton klammerZu = new JButton (")");
		JButton mal = new JButton("*");
		JButton geteilt = new JButton("/");
		JButton plus = new JButton("+");
		JButton minus = new JButton ("-");
		JButton punkt = new JButton(".");
		JButton gleich = new JButton ("=");
		
		eingabe.add(input);
		mainPanel.add(knoepfe, BorderLayout.CENTER);
		mainPanel.add(eingabe, BorderLayout.NORTH);
		knoepfe.add(eins);
		knoepfe.add(zwei);
		knoepfe.add(drei);
		knoepfe.add(vier);
		knoepfe.add(fuenf);
		knoepfe.add(sechs);
		knoepfe.add(sieben);
		knoepfe.add(acht);
		knoepfe.add(neun);
		knoepfe.add(klammerAuf);
		knoepfe.add(nnull);
		knoepfe.add(klammerZu);
		knoepfe.add(mal);
		knoepfe.add(geteilt);
		knoepfe.add(plus);
		knoepfe.add(minus);
		knoepfe.add(punkt);
		knoepfe.add(gleich);
		
		knoepfe.setBackground(Color.MAGENTA);
		
		eins.setBackground(Color.ORANGE);
		zwei.setBackground(Color.ORANGE);
		drei.setBackground(Color.ORANGE);
		vier.setBackground(Color.ORANGE);
		fuenf.setBackground(Color.ORANGE);
		sechs.setBackground(Color.ORANGE);
		sieben.setBackground(Color.ORANGE);
		acht.setBackground(Color.ORANGE);
		neun.setBackground(Color.ORANGE);
		klammerAuf.setBackground(Color.ORANGE);
		nnull.setBackground(Color.ORANGE);
		klammerZu.setBackground(Color.ORANGE);
		mal.setBackground(Color.ORANGE);
		geteilt.setBackground(Color.ORANGE);
		plus.setBackground(Color.ORANGE);
		minus.setBackground(Color.ORANGE);
		punkt.setBackground(Color.ORANGE);
		gleich.setBackground(Color.ORANGE);
		
		eins.setBorder(BorderFactory.createLineBorder(Color.CYAN, 3, true));
		zwei.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2, true));
		drei.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2, true));
		vier.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2, true));
		fuenf.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2, true));
		sechs.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2, true));
		sieben.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2, true));
		acht.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2, true));
		neun.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2, true));
		klammerAuf.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2, true));
		nnull.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2, true));
		klammerZu.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2, true));
		mal.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2, true));
		geteilt.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2, true));
		plus.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2, true));
		minus.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2, true));
		punkt.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2, true));
		gleich.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2, true));
		
		
		
		
		

		
		return mainPanel;
	}

	public static void main(String[] args) {
			new GUITaschenrechner();
	}

}
