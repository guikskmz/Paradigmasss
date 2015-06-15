/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author kamisinha
 */
public class Rect {
    
    Point pos;
    
    int larg;
    int alt;
    int vx = 10;
    int vy = 10;
    double ang = 0;
    Color cor;
    
    public Rect(Point pos, int larg, int alt, Color c) {
        this.cor = c;
        this.pos = pos;
        this.alt = alt;
        this.larg = larg;
    }

    public Point getPos() {
        return pos;
    }
    
    public void draw(Graphics g) {
        g.setColor(cor);
        g.fillRect(pos.x, pos.y, larg, alt);
    }
    
    // Move a imagem de acordo segundo a trajetoria selecionada.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    public void move(String mov,int a, int l) {
        
        Movimento m = new Movimento(pos,larg,alt,l,a,mov);
        m.move(pos,larg,alt,l,a,mov);
       
      /* if("Horizontal".equals(mov)){
           if(pos.x+larg<l){
                pos.x+=10;
           }
            else pos.x=0;
        }
        
       if("Vertical".equals(mov)){
           if(pos.x-alt<a){
                pos.x+=10;
           }
            else pos.x=0-alt;
        }*/
       
            if("Aleatorio".equals(mov)){
                pos.x+=vx;
                
            
            if(pos.x<0){
               pos.x = 0;
               vx = -vx;
            }
            if(pos.x+larg>l){
               pos.x = l-larg;
               vx = -vx;
            }
            
            pos.y += vy;
            
            if(pos.y<0){
               pos.y = 0;
               vy = -vy;
            }
            if(pos.y+alt>a){
               pos.y= a-alt;
               vy = -vy;
            }
            
        }    
        
    if( "Crescer".equals(mov)){
     
         larg+=vx;
         if(larg+vx>150)
             vx=-vx;
         if(larg+vx<10)
             vx=-vx;
         
         alt+=vy;
         if(alt+vy>150)
             vy=-vy;
         if(alt+vy<10)
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
        
        if(pos.x+larg>l){
           pos.x=l-larg;
           vx=0;
           vy=10;
        }
        if(pos.x<0){
           pos.x=0;
           vy=-10;
           vx=0;
        }
        
        pos.y+=vy;
        
        if(pos.y+alt>a){
           pos.y=a-alt;
           vy=0;
           vx=-10;
        }
        if(pos.y<0){
           pos.y=0;
           vy=0;
           vx=10;
        }
        
     
     }
    
    
    }
    
}
