package house;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.QuadCurve2D;
import java.util.Random;

import javax.swing.JPanel;

public class Shape extends JPanel{

	public void paintComponent( Graphics g) {
		super.paintComponent(g);
		Random r = new Random();	
		
		this.setBackground(Color.black);
		Graphics2D g2d = ( Graphics2D ) g;
	
		//parallelogram roof
		g.setColor(new Color(90,88,39,255));
		int x1[] = { 100, 300, 400, 200}; 
		int y1[] = { 200, 200, 100, 100}; 
        g.fillPolygon (x1, y1, 4);
        
        //roof white line
        g.setColor(Color.white);
        g.drawLine(210, 110, 140, 180);
        g.drawLine(210+42, 110, 140+42, 180);
        g.drawLine(210+(42*2), 110, 140+(42*2), 180);
        g.drawLine(210+(42*3), 110, 140+(42*3), 180);
        
        //left small room
        g.setColor(new Color(228,214,153,255));
        g.fillRect(130, 200, 170, 80);
        g.setColor(Color.black);
        g.drawRect(130, 200, 170, 80);
        
        //triangle roof
        g.setColor(new Color(90,88,39,255));
        int x2[] = {450,300,600};
        int y2[] = {50,200,200};
        g.fillPolygon(x2, y2, 3);
        g.setColor(Color.black);
        g.drawPolygon(x2, y2, 3);
           
        //roof window
        g.setColor(new Color(255,236,170,255));
        g.fillRect(428, 120, 42, 40);
        g.setColor(Color.black);
        g.fillRect(385, 117, 130, 3);
        g.fillRect(340, 160, 220, 3);
        g.fillRect(425, 120, 3, 40);
        g.fillRect(470, 120, 3, 40);
        
        g.fillRect(370, 160, 3, 50);
        g.fillRect(425, 160, 3, 50);
        g.fillRect(470, 160, 3, 50);
        g.fillRect(525, 160, 3, 50);
        
        //main house body       
        g.setColor(new Color(187,175,153,255));
        g.fillRect(300, 200, 300, 81); 
           
        g.setColor(new Color(171,68,1,255));
        g.fillRect(300, 281, 280, 81);
        g.setColor(Color.black);
        g.drawRect(300, 200, 300, 81);
        g.drawRect(300, 281, 280, 81);
       
        //right window
        g.setColor(Color.black);
        g.drawRect(340, 225, 60, 30);
        g.setColor(new Color(255,236,170,255));
        g.fillRect(340, 225, 60, 30);
        g.setColor(Color.black);
        g.fillRect(337, 223, 67, 3);
        g.fillRect(337, 255, 67, 3);
        
        g.drawLine(355, 225, 355, 255);
        g.drawLine(370, 225, 370, 255);
        g.drawLine(385, 225, 385, 255);
        
        //left window       
        g.setColor(new Color(255,236,170,255)); 
        g.fillRect(500, 225, 60, 30);
        g.setColor(Color.black);
        g.drawRect(500, 225, 60, 30);
        g.fillRect(497, 223, 67, 3);
        g.fillRect(497, 255, 67, 3);
        
        g.drawLine(515, 225, 515, 255);
        g.drawLine(530, 225, 530, 255);
        g.drawLine(545, 225, 545, 255);
        
        //middle window 
        g.setColor(new Color(255,236,170,255)); 
        g.fillRect(420, 225, 60, 30);
        g.setColor(Color.black);
        g.drawRect(420, 225, 60, 30);
        g.fillRect(416, 223, 67, 3);
        g.fillRect(416, 255, 67, 3);       
        
   /*     g.setColor(Color.black); 
        g.fillRect(320, 212, 260, 55); 
        g.setColor(Color.white);
        g.fillRect(330, 222, 240, 35);  
        g.setColor(Color.black);
        g.fillRect(340, 232, 220, 15);
 */       
        //stick
        g.setColor(new Color(234,78,10,255));
        g.fillRect(130, 280, 15, 82);
        g.setColor(new Color(173,96,0,255));
        g.fillRect(200,280,15,82);
        g.setColor(new Color(110,68,13,255));
        g.fillRect(270,280,15,82);
        
        g.setColor(Color.black);
        g.drawLine(140, 285, 140, 350);
        
        //window on small building (RoundRect)
        g.setColor(Color.black);
        g.drawRoundRect(200, 220, 30, 35, 10, 10); 
        g.fillRoundRect(200, 220, 30, 35, 10, 10);
        g.setColor(new Color(110,68,13,255));
        g.fillRect(195, 255, 40, 5);
        g.drawRect(195,255,40,5);
        g.fillRect(195, 215, 40, 5);
        g.fillRect(195, 215, 5, 45);
        g.fillRect(230, 215, 5, 45);
   //   g.fillRect(195,255-45,40,10);
        
        //ground using rectangle
        g.setColor(new Color(36, 87, 67));
        g.fillRect(0,362,900,500);
        
        //door using arcs     
        g.setColor(new Color(47,69,92,255));
        g.fillArc(340, 312, 50, 100, 0, 180);
        
        g.setColor(Color.black);
        g.drawArc(340, 312, 50, 100, 0, 180);
        
        g.setColor(Color.white);
        g.drawLine(340, 365, 500, 365);
        g.drawLine(350, 375, 520, 375);
        
        g.setColor(Color.white);
        g.drawLine(365, 315, 365, 360); 
        g.drawOval(370, 338, 5, 5);
        
        //grass using QuadCurve2D
        g.setColor(new Color(r.nextInt(256),
        		r.nextInt(256),r.nextInt(256)));
        QuadCurve2D q = new QuadCurve2D.Double();
        q.setCurve(130, 362, 105, 355, 105, 340); //x,y and center segment of curve cX, cY and x2,y2
        g2d.draw(q);
        g.setColor(new Color(r.nextInt(256),
        		r.nextInt(256),r.nextInt(256)));
        q.setCurve(130, 362, 105-30, 355-10, 115, 345); 
        g2d.draw(q);
        g.setColor(new Color(r.nextInt(256),
        		r.nextInt(256),r.nextInt(256)));
        q.setCurve(130, 362, 105-20, 355-50, 120, 340); 
        g2d.draw(q);
        g.setColor(new Color(r.nextInt(256),
        		r.nextInt(256),r.nextInt(256)));
        q.setCurve(130, 362, 105-25, 360, 110, 335); 
        g2d.draw(q);
        g.setColor(new Color(r.nextInt(256),
        		r.nextInt(256),r.nextInt(256)));
        q.setCurve(130, 362, 105, 355-10, 115, 320); 
        g2d.draw(q);
        
/*      //grass using CubicCurve2D
        g.setColor(new Color(r.nextInt(256),
        		r.nextInt(256),r.nextInt(256)));
        CubicCurve2D c = new CubicCurve2D.Double();
        c.setCurve(580, 362, 640, 350, 635, 340, 635, 300); //x,y and center segment of curve cX, cY, cX2,cY2 and x2,y2
        g2d.draw(c);
        c.setCurve(585, 362, 645, 355, 612, 345, 640, 305); //x,y and center segment of curve cX, cY, cX2,cY2 and x2,y2
        g2d.draw(c);
        c.setCurve(583, 362, 640, 350, 605, 340, 600, 315); //x,y and center segment of curve cX, cY, cX2,cY2 and x2,y2
        g2d.draw(c);
        c.setCurve(581, 362, 620, 350, 620, 340, 610, 310); //x,y and center segment of curve cX, cY, cX2,cY2 and x2,y2
        g2d.draw(c);
        c.setCurve(585, 362, 640, 350, 618, 340, 620, 335); //x,y and center segment of curve cX, cY, cX2,cY2 and x2,y2
        g2d.draw(c);
        c.setCurve(581, 362, 600, 300, 600, 340, 615, 350); //x,y and center segment of curve cX, cY, cX2,cY2 and x2,y2
        g2d.draw(c);
        c.setCurve(590, 362, 605, 320, 618, 340, 620, 335); //x,y and center segment of curve cX, cY, cX2,cY2 and x2,y2
        g2d.draw(c);
 */    
        
        //tree?
        g.setColor(Color.white);
        g.drawString("<==Tree", 660, 360);
        for (int i = 0; i < 15; i++) {     	
        	 g2d.setColor(new Color(r.nextInt(256),
             		r.nextInt(256),r.nextInt(256))); 
        	 double cX = r.nextDouble() + 850;	 
        	 double cY = r.nextDouble() * 200;
        	 
        	 double cX2 = r.nextDouble() * 900;
        	 double cY2= r.nextDouble() * 60;
        	 
        	 double X = r.nextDouble() + 700;
        	 double Y = r.nextDouble() * 50;
        	 
             CubicCurve2D c = new CubicCurve2D.Double();
             c.setCurve(644, 362, cX, cY, cX2, cY2, X, Y); //x,y and center segment of curve cX, cY, cX2,cY2 and x2,y2
             g2d.draw(c);  
        }
        
        //button building window
        g.setColor(new Color(253,237,169,255));
        g.drawRect(450, 300, 100, 40);
        g.fillRect(450, 300, 100, 40);
        g.setColor(Color.black);
        g.fillRect(450, 300, 45, 40);
        g.drawLine(450, 345, 500, 345);
        
        //moon
        g.setColor(Color.white);
        g.fillOval(10, 10, 50, 50);
             
	}		
}
