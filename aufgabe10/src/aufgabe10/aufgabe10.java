package aufgabe10;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class aufgabe10 extends JFrame{

    public aufgabe10()
    {
        super();
        this.setTitle("Berechne PI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    

        this.getContentPane().add(new Canvas());

        this.setSize(400, 430);
        this.setLocation(300,200);
        this.setVisible(true);
    }

    private class Canvas extends JPanel
    {
    	@Override
        protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);  // Implementierung von JPanel aufrufen
            Graphics2D g2 = (Graphics2D)g;  // Methoden von Graphics2D nutzbar
            
            g2.setStroke(new BasicStroke(4.0f));  
            g2.drawRect(10, 10, 370, 370 );
            
            Shape arc1 = new Arc2D.Double(10.0, 10.0, 740.0, 740.0, 180.0, -90.0, Arc2D.OPEN);
            g2.draw(arc1);
        }

    }

    public static void main(String[] args) 
    {
        new aufgabe10();
    }
}
