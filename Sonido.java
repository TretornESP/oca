import javax.sound.sampled.*;
import java.io.File;

public class Sonido
{
   public Sonido() {}
   
   public static void oca() {play("oca.wav");}
   public static void puente() {play("puente.wav");}
   public static void dado() {play("dado.wav");}
   public static void pena() {play("pena.wav");}
   public static void muerte() {play("restart.wav");}
   public static void bien() {play("bien.wav");}
   public static void mover() {play("mover.wav");}
   public static void tirar() {play("dado_efecto.wav");}
   
    public static void play(String file)
    {
        try
        {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File(file)));
            clip.start();
        }
        catch (Exception exc)
        {
        }
    }
}
