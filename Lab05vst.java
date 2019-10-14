// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet
{
	public void paint(Graphics g)
	{
		int width = 980;
		int height = 630;
		int x1 = 10;
		int y1 = 10;
		int x2 = 20;
		int y2 = 640;
		g.drawRect(10,10,width,height);

// Draw bottem-left corner
	for (int b = 1; b<=63; b++)
	{
		g.drawLine(x1,y1,x2,y2);
		y1 += 10;
		x2 += 10;

	}
	// Draw bottom-right corner
	x2 = 980;
	y1 = 10;
	y2 = 640;
	x1 = 990;
	for (int b = 1; b<=63; b++)
	{
		g.drawLine(x1,y1,x2,y2);
		y1 += 10;
		x2 -= 10;
	}
	//Draw top-left corner
	x1 = 10;
	y1 = 640;
	x2 = 20;
	y2 = 10;
	for (int b = 1; b<=63; b++)
	{
		g.drawLine(x1,y1,x2,y2);
		y1 -= 10;
		x2 += 10;
	}
	//Draw top-right corner
	x1 = 990;
	y1 = 640;
	x2 = 980;
	y2 = 10;
	for (int b = 1; b<=63; b++)
	{
		g.drawLine(x1,y1,x2,y2);
		y1 -= 10;
		x2 -= 10;
	}
	/* inside bottom left
	x1 = 245;
	y1 = 220;
	x2 = 255;
	y2 = 430;
	for (int b = 1; b<=20; b++)
	{
		g.drawLine(x1,y1,x2,y2);
		y1 += 10;
		x2 += 10;
	}
//inside top right
x1 = 125;
y1 = 430;
x2 = 135;
y2 = 220;
for (int b = 1; b<=20; b++)
{
	g.drawLine(x1,y1,x2,y2);
	y1 -= 10;
	x2 += 10;
}
//inside bottom right
x1 = 125;
y1 = 220;
x2 = 135;
y2 = 430;
for (int b = 1; b<=20; b++)
{
	g.drawLine(x1,y1,x2,y2);
	y1 += 10;
	x2 += 10;
} */


}
}
