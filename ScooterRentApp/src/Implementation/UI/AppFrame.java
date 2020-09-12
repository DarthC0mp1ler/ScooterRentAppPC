package Implementation.UI;

import javax.swing.*;

public class AppFrame extends JFrame {

    private static final String _frameName = "ElectroLviv rent";

    public AppFrame(){
        super(_frameName);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(new MainPanel());
        pack();
    }

}
