package animator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.Random;

// Conjunto de objetos da animacao.
class ObjectSet {
    
    private Image[] images;
    private Circle[] circles;
    private Rect[] rects;
    private Oval[] ovals;
    private Triangulo[] trials;
    private int forma;
    String movimento;
    String movimento2;
    int largu;
    int altu;
    // Adiciona objetos da classe Image ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addImages(int n, Dimension dim, BufferedImage image, String path) {
        Random rnd = new Random();
        altu=dim.height;
        largu=dim.width;
        movimento=path;
        images = new Image[n];
        for (int i = 0; i < images.length; i++) {
            Point p = new Point(rnd.nextInt((int)dim.getWidth()),rnd.nextInt((int)dim.getHeight()));
            images[i] = new Image(p, image);
            
        }
    }
    
    // Adiciona objetos da classe Star ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addOval(int n, Dimension dim, String path, Color c) {
        
        forma=3;
        altu=dim.height;
        largu=dim.width;
        movimento2=path;
        Random rnd = new Random();
        ovals = new Oval[n];
        for (int i = 0; i < ovals.length; i++) {
            Point p = new Point(rnd.nextInt((int)dim.getWidth()),rnd.nextInt((int)dim.getHeight()));
            ovals[i] = new Oval(p, rnd.nextInt(60)+30, rnd.nextInt(50)+20, c);
        }
        
    }
    
        void addTria(int n, Dimension dim, String path, Color c) {
        
        forma=4;
        altu=dim.height;
        largu=dim.width;
        movimento2=path;
        Random rnd = new Random();
        trials = new Triangulo[n];
        for (int i = 0; i < trials.length; i++) {
            Point p = new Point(rnd.nextInt((int)dim.getWidth()),rnd.nextInt((int)dim.getHeight()));
            trials[i] = new Triangulo(p, rnd.nextInt(60)+30, c);
        }
        
    }
    
    // Adiciona objetos da classe Star ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addRectangles(int n, Dimension dim, String path, Color c) {
        forma=1;
        altu=dim.height;
        largu=dim.width;
        movimento2=path;
        Random rnd = new Random();
        rects = new Rect[n];
        for (int i = 0; i < rects.length; i++) {
            Point p = new Point(rnd.nextInt((int)dim.getWidth()),rnd.nextInt((int)dim.getHeight()));
            rects[i] = new Rect(p, rnd.nextInt(60)+10, rnd.nextInt(60)+10, c);
        }
        
    }
    
    
    
    // Adiciona objetos da classe Star ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addCircles(int n, Dimension dim, String path, Color c) {
        forma=2;
        altu=dim.height;
        largu=dim.width;
        movimento2=path;
        Random rnd = new Random();
        circles = new Circle[n];
        for (int i = 0; i < circles.length; i++) {
            Point p = new Point(rnd.nextInt((int)dim.getWidth()),rnd.nextInt((int)dim.getHeight()));
            circles[i] = new Circle(p, rnd.nextInt(60)+20, c);
        }
    }
    
    // Desenha cada um dos objetos da animacao.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void drawAll(Graphics g) {
        drawImages(g);
        drawghost(g);
        if(forma==2)drawCircle(g);
        else if(forma==1)drawRect(g);
        else if(forma==3)drawOval(g);
        else if(forma==4)drawTria(g);
    }
    
    public void drawghost(Graphics g){
       Ghost x = new Ghost();
       x.paint(g);
       
    }
    
    public void drawImages(Graphics g){
        for(Image img : this.images){
           img.draw(g);
        }
    }
    

    
    public void drawOval(Graphics g){
       for(Oval img : this.ovals){
          img.draw(g);
       }
    }
    
    public void drawRect(Graphics g){
        for(Rect img : this.rects){
            img.draw(g);
        }
    
    }
    
    
    public void drawCircle(Graphics g){
        for(Circle img : this.circles){
            img.draw(g);
        }
    }
    
    
    public void drawTria(Graphics g){
       for(Triangulo img : this.trials){
           img.draw(g);
       }
    }
    
    
    
    // Move cada um dos objetos da animacao.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void moveAll() {
       for(int j=0 ; j<images.length; j++){
          images[j].move(movimento,altu,largu);
       }
       if(forma==1){
       for(int j=0; j<rects.length; j++){
          rects[j].move(movimento2,altu,largu);
       }
       }
       if(forma==2){
       for(int j=0 ; j<circles.length; j++){
          circles[j].move(movimento2,altu,largu);
       }
       }
       if(forma==3){
       for(int j=0 ; j<ovals.length; j++){
          ovals[j].move(movimento2,altu,largu);
       }
       }
       if(forma==4){
       for(int j=0 ; j<trials.length; j++)
           trials[j].move(movimento2,altu,largu);
       }
       
    }
}
