package A6_Thread;

import java.awt.geom.*;
import java.awt.geom.Ellipse2D.Double;

public class Ball {
	private static final int XSIZE=15;
	private static final int YSIZE=15;
	private double x=0;
	private double y=0;
	//移动量
	private double dx=1;
	private double dy=1;
	
	//移动方法,参数是描述组件位置的矩形
	public void move(Rectangle2D bounds){
		x+=dx;
		y+=dy;
		
		//超过组件的大小范围,就矫正球到边界,弹回来
		if(x<bounds.getMinX()){
			x=bounds.getMinX();
			dx=-dx;
		}
		if(x+XSIZE>=bounds.getMaxX()){
			x=bounds.getMaxX()-XSIZE;
			dx=-dx;
		}
		if(y<bounds.getMinY()){
			y=bounds.getMinY();
			dy=-dy;
		}
		if(y+YSIZE>bounds.getMaxY()){
			y=bounds.getMaxY()-YSIZE;
			dy=-dy;
		}
		
		
	}
	
	
	
	
	//返回这个球的形状
	public Ellipse2D getShape()
	{
		return new Ellipse2D.Double(x,y,XSIZE,YSIZE);
	}
	
	

}
