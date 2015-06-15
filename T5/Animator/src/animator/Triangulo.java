/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author kamisinha
 */
public class Triangulo {
    
    
        
    Point pos;
    int tam;
    int vx = 10;
    int vy = 10;
    double ang = 0;
    Color cor;
   
    
    
    
    public Triangulo(Point pos, int tam, Color c) {
        this.cor = c;
        this.pos = pos;
        this.tam = tam;
        
    }

    public Point getPos() {
        return pos;
    }
    
    public void draw(Graphics g) {
        g.setColor(cor);
        Point a1 = new Point (pos.x,pos.y-tam);
        Point a2 = new Point (pos.x-tam/2,pos.y);
        Point a3 = new Point (pos.x+tam/2,pos.y);
        Polygon p = new Polygon();
        p.addPoint(a1.x, a1.y);
        p.addPoint(a2.x, a2.y);
        p.addPoint(a3.x, a3.y);
        g.fillPolygon(p);
        g.drawPolygon(p);
    }
    
    
    public void move(String mov,int a, int l) {
         Movimento m = new Movimento(pos,tam/2,tam,l,a,mov);
         m.move(pos,tam/2,tam,l,a,mov);
        
        
    
       
       /*if("Horizontal".equals(mov)){
           if(pos.x+tam/2<l){
                pos.x+=10;
           }
            else pos.x=0;
        }
       
       if("Vertical".equals(mov)){
           if(pos.y-tam<a){
                pos.y+=10;
           }
            else pos.y=0-tam;
        }*/
       
                   if("Aleatorio".equals(mov)){
                pos.x+=vx;
                
            
            if(pos.x-tam/2<0){
               pos.x = tam/2;
               vx = -vx;
            }
            if(pos.x+tam/2>l){
               pos.x = l-tam/2;
               vx = -vx;
            }
            
            pos.y += vy;
            
            if(pos.y-tam<0){
               pos.y = tam;
               vy = -vy;
            }
            if(pos.y>a){
               pos.y= a;
               vy = -vy;
            }
            
        }
                   
        if("Crescer".equals(mov)){
     
         tam+=vx;
         if(tam+vx>150)
             vx=-vx;
         if(tam+vx<10)
             vx=-vx;
         
         tam+=vy;
         if(tam+vy>150)
             vy=-vy;
         if(tam+vy<10)
             vy=-vy;
         
    }
                   
                   
       if("Circular".equals(mov)){
          pos.x+=(int)((l/90)*Math.sin(ang));
          pos.y+=(int)((l/90)*Math.cos(ang));
          ang+=0.2;
          if(ang>360)
              ang=0;
       
       }
       
       if("Borda".equals(mov)){
        pos.x+=vx;
        
        if(pos.x+tam/2>l){
           pos.x=l-tam/2;
           vx=0;
           vy=10;
        }
        if(pos.x-tam/2<0){
           pos.x=0+tam/2;
           vy=-10;
           vx=0;
        }
        
        pos.y+=vy;
        
        if(pos.y>a){
           pos.y=a;
           vy=0;
           vx=-10;
        }
        if(pos.y-tam<0){
           pos.y=0+tam;
           vy=0;
           vx=10;
        }
        
     
     }
       
       
       
     }
    
}
