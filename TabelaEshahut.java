import java.awt.*;
import javax.swing.*;
public class TabelaEshahut extends JPanel {
	
	private int width;
	private int xpos;
	private int ypos;
	private int rows1;
	private int totalsize;
	
	public TabelaEshahut(int xposition,int yposition,int rows,int size )
	{
		xposition=xpos;
		yposition=ypos;
		rows1=rows;
		totalsize=size;
		
		
		JFrame k=new JFrame();
		k.getContentPane().add(this);
		k.setTitle("bullsEye");
		k.setSize(width,width);
		k.setVisible(true);
	}
	
	
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillRect(0, 0, width,width);
		paintBoard(240, 240, 8, 30,  g);
	}
	private void paintBoard(int startx, int starty,
			int totalrows, int squaresize, Graphics g)
	{ for ( int x = 0; x < totalrows; x = x + 1 )
			// invariant: have painted x rows so far
	{ // calculate position of row x:
			int xposition = startx + (x * squaresize);
			for ( int y = 0; y < totalrows; y = y + 1 )
			// invariant: have painted y squares of row x
			{ // calculate position of the y-th square:
			int yposition = starty + (y * squaresize);
			if ( ((x + y) % 2) == 0 ) // is square x,y a red one?
			{ g.setColor(Color.red); }
			else { g.setColor(Color.white); }
			g.fillRect(xposition, yposition, squaresize, squaresize);
			}
			}
	}
	public static void main(String[]args)
	{
		TabelaEshahut k=new TabelaEshahut(240,240,8,30);
		
		
	}

}