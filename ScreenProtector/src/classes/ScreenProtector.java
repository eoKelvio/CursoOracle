package classes;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;

@SuppressWarnings("serial")
public class ScreenProtector extends javax.swing.JFrame implements Runnable{

	// tamanho da tela
	private int whidth = 1920;
	private int height = 1080;	
	
	
	// teclas
	/*
	 * Funcionamento: quando a tecla é pressionada sua respectiva variável fica 
	 * com valor True. Quando solta a variável fica com valor False.
	 */
	private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;
	
    // Construtor
	public ScreenProtector() {
        // Chama o metodo que realiza todas as configurações iniciais necessárias
		initComponents();
		
		// Mecanismo de execução paralela
        createBufferStrategy(2);
        Thread t = new Thread(this);
        t.start();
    }
	

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Realiza todas as configurações iniciais necessárias
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        // Chama os métodos de Scaneamento de teclas (tecla pressionada / solta)
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        
        // Configura o layout da tela
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        // Largura
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, whidth, Short.MAX_VALUE)
        );
        // Altura
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, height, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Método que verifica se as teclas foram pressionadas
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // Verifica se a tecla seta para a esquerda foi pressiona
    	if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            // coloca o valor da variavel left em true enquanto a tecla estiver pressionada
    		left = true;
        }
    	// Verifica se a tecla seta para a direita foi pressiona
    	else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
        	// coloca o valor da variavel right em true enquanto a tecla estiver pressionada
        	right = true;
        }
    	// Verifica se a tecla seta para cima foi pressiona
        else if (evt.getKeyCode() == KeyEvent.VK_UP) 
        {
        	// coloca o valor da variavel up em true enquanto a tecla estiver pressionada
            up = true;
        }
    	// Verifica se a tecla seta para baixo foi pressiona
        else if (evt.getKeyCode() == KeyEvent.VK_DOWN) 
        {
        	// coloca o valor da variavel down em true enquanto a tecla estiver pressionada
            down = true;
        }
    }//GEN-LAST:event_formKeyPressed

    // Método que verifica se as teclas foram soltas
    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
    	// Verifica se a tecla seta para a esquerda foi solta
    	if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
    		// volta o valor da variavel left em false depois que a tecla for solta
    		left = false;
        } 
    	// Verifica se a tecla seta para a direita foi solta
    	else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
    		// volta o valor da variavel right em false depois que a tecla for solta
    		right = false;
        }
    	// Verifica se a tecla seta para cima foi solta
    	else if (evt.getKeyCode() == KeyEvent.VK_UP) {
    		// volta o valor da variavel up em false depois que a tecla for solta
    		up = false;
        }
    	// Verifica se a tecla seta para baixo foi solta
        else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
        	// volta o valor da variavel down em false depois que a tecla for solta
        	down = false;
        }
    }//GEN-LAST:event_formKeyReleased
	
	// Inicializa a janela
	public static void main(String[] args) {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ScreenProtector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenProtector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenProtector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenProtector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenProtector().setVisible(true);
            }
        });
	}
	
	
	// Implemente seu código aqui.
	public void run() {
		// A variável g recebe o objeto do tipo Graphics que permite gerar imagens na tela
		Graphics g = getBufferStrategy().getDrawGraphics();
		Random rand = new Random();
		
		SoundEffect backgroundSound = new SoundEffect("/sounds/background.wav", true);
		backgroundSound.play();
		
 		// Instancie suas formas geométricas aqui
		
		Image olha = new Image("/images/Manoel.jpg", 300, 200, "/sounds/impact.wav",false);
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		for(int i=0; i<5; i++) {
			shapes.add(new Rectangle(colorGenerate(), rand.nextInt(getWidth()-200),
												  rand.nextInt(getHeight()-200), 
												  rand.nextInt(90)+10, 
												  rand.nextInt(90)+10));
		
		
		
			shapes.add(new Square(colorGenerate(), rand.nextInt(getWidth()-200),
												  rand.nextInt(getHeight()-200), 
												  rand.nextInt(90)+10));
		
		
		
			shapes.add(new Ellipse(colorGenerate(), rand.nextInt(getWidth()-200),
												  rand.nextInt(getHeight()-200), 
												  rand.nextInt(90)+10, 
												  rand.nextInt(90)+10));
		
		
		
			shapes.add(new Circle(colorGenerate(), rand.nextInt(getWidth()-200),
												  rand.nextInt(getHeight()-200), 
												  rand.nextInt(90)+10));
		
		}
		
		for(Shape s : shapes) {
			if(rand.nextBoolean()) {
				s.setSpeedX(s.getSpeedX()*-1);
			}
			if(rand.nextBoolean()) {
				s.setSpeedY(s.getSpeedY()*-1);
			}
		}

		
		
		
		
		// Como num desenho animado, as animações são criadas a partir da sobreposição de frames
		while(true) {
			
			//Atualiza o g
			g = getBufferStrategy().getDrawGraphics();
			
			//limpa tela
			g.clearRect(0, 0, getWidth(), getHeight());
			
			
			// Implemente sua animação aqui.
			
			for(Shape s : shapes) {
				s.draw(g);
				s.move();
				s.changeDir(0, getWidth(), 0, getHeight());
			}
			
			olha.draw(g);
			olha.scale(1);
			
			if(right)
				olha.moveX(1);
			if(left)
				olha.moveX(-1);
			if(up)
				olha.moveY(-1);
			if(down)
				olha.moveY(1);
			
			olha.getColision(getWidth(), getHeight());

			
		  // Exibe a tela
	      getBufferStrategy().show();
	            
	      // Unidade de tempo da animação
	      try {
	        Thread.sleep(1);
	      }catch  (InterruptedException ex) {}
		}
	}


	public Color colorGenerate() {
		int r,g,b;
		Random rand = new Random();
		
		r = rand.nextInt(255);
		g = rand.nextInt(255);
		b = rand.nextInt(255);
		
		return new Color(r,g,b);
  }//Fim do run
}// Cabo a classe