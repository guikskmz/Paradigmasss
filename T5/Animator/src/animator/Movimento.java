/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;

import java.awt.Point;

/**
 *
 * @author kamisinha
 */
public class Movimento {
    
    int fl;
    int fa;
    int l;
    int a;
    String mov;
    
    
    
     public Movimento(Point pos, int fl, int fa,int l, int a, String mov ) {
        this.fl = fl;
        this.fa = fa;
        this.l = l;
        this.a = a;
        this.mov=mov;
    }
    
    public void move(Point pos, int fl, int fa,int l, int a, String mov){
       
        if("Horizontal".equals(mov)){
           if(pos.x+fl<l){
                pos.x+=10;
           }
            else pos.x=0;
        }
        
        if("Vertical".equals(mov)){
           if(pos.y-fa<a){
                pos.y+=10;
           }
            else pos.y=0-fa;
        }
        
    
    }
    
    
}
