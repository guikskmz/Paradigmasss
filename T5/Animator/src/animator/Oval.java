/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;

/**
 *
 * @author kamisinha
 */
public class Oval{
    Point pos;
    int raio;
    int raio2;
    int vx = 10;
    int vy = 10;
    double ang = 0;
    Color cor;
    
    public Oval(Point pos, int raio, int raio2, Color c) {
        this.cor = c;
        this.pos = pos;
        this.raio = raio;
        this.raio2 = raio2;
        
    }

    public Point getPos() {
        return pos;
    }
    
    public void draw(Graphics g) {
        g.setColor(cor);
        g.fillOval(pos.x, pos.y, raio, raio2);
        
        
    }
    
    // Move a imagem de acordo segundo a trajetoria selecionada.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    public void move(String mov, int a, int l) {
        
        Movimento m = new Movimento(pos,raio2,raio,l,a,mov);
        m.move(pos,raio2,raio,l,a,mov);
        
        /*if("Horizontal".equals(mov)){
           if(pos.x+raio<l){
                pos.x+=10;
           }
            else pos.x=0;
        }
        
        if("Vertical".equals(mov)){
           if(pos.y-raio2<a){
                pos.y+=10;
           }
            else pos.x=0-raio2;
        }*/
        
            if("Aleatorio".equals(mov)){
                pos.x+=vx;
                
            
            if(pos.x<0){
               pos.x = 0;
               vx = -vx;
            }
            if(pos.x+raio>l){
               pos.x = l-raio;
               vx = -vx;
            }
            
            pos.y += vy;
            if(pos.y<0){
               pos.y = 0;
               vy = -vy;
            }
            if(pos.y+raio2>a){
               pos.y= a-raio2;
               vy = -vy;
            }
            
        }   
            
            
     if("Crescer".equals(mov)){
     
         raio+=vx;
         if(raio+vx>150)
             vx=-vx;
         if(raio+vx<10)
             vx=-vx;
         
         raio2+=vy;
         if(raio2+vy>150)
             vy=-vy;
         if(raio2+vy<10)
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
        
        if(pos.x+raio>l){
           pos.x=l-raio;
           vx=0;
           vy=10;
        }
        if(pos.x<0){
           pos.x=0;
           vy=-10;
           vx=0;
        }
        
        pos.y+=vy;
        
        if(pos.y+raio2>a){
           pos.y=a-raio2;
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
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
