
package proyecto1;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Personaje {
    public int posper=0;
    //public int posper2=0;
    public ImageIcon imgper;
    
    public ImageIcon obtenerImagen(int tamx,int tamy){
        ImageIcon per=new ImageIcon(getClass().getResource("/Imagenes/mago1.png"));
        
        Image per1=per.getImage();
        Image imgtam=per1.getScaledInstance(tamx, tamy, Image.SCALE_SMOOTH);
        per=new ImageIcon(imgtam);
        
        return per;
    }
    
    
    
}
