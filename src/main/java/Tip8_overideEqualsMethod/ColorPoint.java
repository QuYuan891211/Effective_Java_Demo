package Tip8_overideEqualsMethod;

import java.awt.*;

public class ColorPoint {
    private Point point;
    private Color color;
    public ColorPoint(int x,int y,Color color){
        if(color==null){
            throw new NullPointerException();
        }
        Point point = new Point(x,y);
        this.color = color;
    }

    public Point getPoint(){
        return point;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ColorPoint)){
            return false;
        }
        ColorPoint colorPoint = (ColorPoint)obj;
        return colorPoint.point.equals(point) && colorPoint.color == color;
    }
}
