package animator;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;

public class Ghost {
	private static final Ellipse2D eyeWhite = new Ellipse2D.Float(0, 0, 20, 25);
	private static final Ellipse2D eyeBall = new Ellipse2D.Float(0, 5, 8, 15);
        
	
	private Color color = Color.RED;

	public void paint(Graphics g) {	
		Graphics2D g2d = (Graphics2D) g.create();
		
		//Sim, queremos anti-aliasing! \o/
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		//Desenho do corpo e dos olhos
		drawBody(g2d);			
		drawEyes(g2d);
		
		g2d.dispose();
	}
	
	public void setColor(Color color)
	{
		this.color = color;
	}
	
	public Color getColor()
	{
		return color;
	}
	
	/**
	 * Desenhamos aqui os dois olhos do fantasma, através de transformações 
	 * de coordenadas e chamadas ao método {@link #drawEye(Graphics2D)}.
	 * @param g Contexto gráfico a ser utilizado.
	 */
	private void drawEyes(Graphics2D g)
	{				
		Graphics2D g2d = (Graphics2D) g.create();
		
		//Afastamos nosso sistema de coordenadas (em 0,0) 
		//para a posição 10,25 e pintamos o olho
		g2d.translate(10, 25);
		drawEye(g2d);
		
		//Afastamos mais 25 pixels em x
		//Ou seja, a posição agora é (35,35).
		//Pintamos o olho novamente.
		g2d.translate(25, 0);
		drawEye(g2d);
		
		g2d.dispose();
	}

	/**
	 * Desenha um olho na coordenada 0,0.
	 * @param g2d Contexto gráfico a ser utilizado para o desenho
	 */
	private void drawEye(Graphics2D g2d) {		
		g2d.setColor(Color.WHITE);		
		g2d.fill(eyeWhite);
		g2d.setColor(Color.BLUE);
		g2d.fill(eyeBall);
	}

	/**
	 * Desenha o corpo na coordenada 0,0.
	 * @param g2d Contexto gráfico a ser utilizado para o desenho.
	 */
	private void drawBody(Graphics2D g2d) {		
		GeneralPath gp = new GeneralPath();
		
		//Lateral esquerda
		gp.moveTo(0, 35);
		gp.lineTo(0, 80);
		
		//Base
		gp.quadTo(10, 95, 20, 80);
		gp.quadTo(25, 75, 30, 80);
		gp.quadTo(40, 95, 50, 80);
		gp.quadTo(55, 75, 60, 80);
		gp.quadTo(70, 95, 80, 80);
		
		//Lateral direita
		gp.lineTo(80, 35);
		
		//Topo
		gp.curveTo(70, -5, 8, -5, 0, 30);

		/* Iremos definir a pintura do corpo do fantasma. 
		 * Será uma pintura gradiente, para dar o efeito arredondado.
		 * 
		 * Como não queremos que isso bagunce futuras pinturas, 
		 * iremos salvar o Paint antigo e restura-lo ao final. 
		 * Essa é uma forma de manter o estado de g2d, sem usar o create().
		 * 
		 * Entretanto, note que se fossemos alterar diversas propriedades, seria uma 
		 * forma bem trabalhosa.
		 */
		Paint oldPaint = g2d.getPaint(); 
		
		GradientPaint paint = new GradientPaint(
				0, 40, color, 				//Da cor definida pelo usuário 
				70, 40, color.darker());	//Até um tom um pouco mais escuro
		g2d.setPaint(paint);
		
		//Pintura do fantasma			
		g2d.fill(gp);
		
		//Restauramos o paint original
		g2d.setPaint(oldPaint); 
	}
}
