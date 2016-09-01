import java.applet.*;
import java.awt.*;

/**
 * La clase HolaMundoApplet implementa un applet que
 * solo desplega "Hola Mundo Java en Applet!".
 */
public class HolaMundoApplet extends Applet {
    public void paint(Graphics g) {
        // Despliega en un entorno grafico "Hola Mundo Java en Applet!"
        g.drawString( "Hola Mundo Java en Applet!", 50, 25 );
    }
}
