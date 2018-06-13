import java.io.File;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics2D;
import java.util.concurrent.ThreadLocalRandom;

public class Dado
{
    private String tirada = "";
    private int tiradan;
    private Graphics2D animator;
    
    private String strings[] = {
        "1.png",
        "2.png",
        "3.png",
        "4.png",
        "5.png",
        "6.png"
    };
    
    public Dado() {
        tiradan = tirar();
    }
    
    public void config(Graphics2D g) {
        if (animator==null) {
            animator = g;
        }
    }
        
    public boolean draw(Graphics2D g) {
            File f = new File(tirada);
            if(f.exists() && !f.isDirectory()) {    
                Image img = new ImageIcon(tirada).getImage();
                g.drawImage(img, 805, 0, null);
                return false;
            } else {
                System.out.println("Archivo "+ f.getName() + " no encontado");
                return false;
            }
    }
    
    public int tirar() {
        Sonido.tirar();
        tiradan = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        switch (tiradan) {
            case 1: tirada = "1.png";
            break;
            case 2: tirada = "2.png";
            break;
            case 3: tirada = "3.png";
            break;
            case 4: tirada = "4.png";
            break;
            case 5: tirada = "5.png";
            break;
            case 6: tirada = "6.png";
            break;
            default: tirada = "1.png";
        }
        return tiradan;
    }
}