import javax.swing.*;

/**
 * Created by huonf on 9/11/2017.
 */
public class Launcher {

    public static void main(){
        SwingUtilities.invokeLater(()->new View(new Model()));
    }
}
