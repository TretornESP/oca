import java.io.File;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics2D;
public class Mapa
{
    public static boolean draw(Graphics2D g) {
        File f = new File("BG.jpg");
        if(f.exists() && !f.isDirectory()) {    
            Image img = new ImageIcon("BG.jpg").getImage();
            g.drawImage(img, 0, 0, null);
            return true;
        } else {
            System.out.println("Archivo "+ f.getName() + " no encontado");
            return false;
        }
    }
}
