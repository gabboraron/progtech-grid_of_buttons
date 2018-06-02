package megoldasgriddel;

import java.awt.Color;

/**
 *
 * @author Sándor
 */
public class Megoldasgriddel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GridButtonPanel gpanel = new GridButtonPanel();
        gpanel.display();
        gpanel.getGridButton(1, 1).setBackground(Color.red);
    }   
}