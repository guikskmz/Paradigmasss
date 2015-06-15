package animator;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;

// Uma imagem na animacao.
class Image {

    BufferedImage img;
    Point pos;
    int vx = 10;
    int vy = 10;
    double ang = 0;

    public Image(Point pos, BufferedImage img) {
        this.pos = pos;
        this.img = img;
    }

    public Point getPos() {
        return pos;
    }
    
    public void draw(Graphics g) {
        g.drawImage(img, (int) pos.getX(), (int) pos.getY(), null);
    }
    
    // Move a imagem de acordo segundo a trajetoria selecionada.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    public void move(String mov, int a, int l) {
        
        Movimento m = new Movimento(pos,img.getWidth(),img.getHeight(),l,a,mov);
        m.move(pos,img.getWidth(),img.getHeight(),l,a,mov);
       
        /*if("Horizontal".equals(mov)){
           if(pos.x+img.getWidth()<l){
                pos.x+=10;
           }
           else pos.x=0;
        }
        
        
        if("Vertical".equals(mov)){
           if(pos.y-img.getWidth()<a){
                pos.y+=10;
           }
           else pos.y=0-img.getWidth();
        }*/
        
            if("Aleatorio".equals(mov)){
                pos.x+=vx;
                
            
            if(pos.x<0){
               pos.x = 0;
               vx = -vx;
            }
            if(pos.x+img.getWidth()>l){
               pos.x = l-img.getWidth();
               vx = -vx;
            }
            
            pos.y += vy;
            if(pos.y<0){
               pos.y = 0;
               vy = -vy;
            }
            if(pos.y+img.getHeight()>a){
               pos.y= a-img.getHeight();
               vy = -vy;
            }
            
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
        
        if(pos.x+img.getWidth()>l){
           pos.x=l-img.getWidth();
           vx=0;
           vy=10;
        }
        if(pos.x<0){
           pos.x=0;
           vy=-10;
           vx=0;
        }
        
        pos.y+=vy;
        
        if(pos.y+img.getHeight()>a){
           pos.y=a-img.getHeight();
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
