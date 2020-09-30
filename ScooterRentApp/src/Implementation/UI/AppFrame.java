package Implementation.UI;

import Implementation.Main;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AppFrame extends JFrame {

    private static final String _frameName = "ElectroLviv rent";

    public AppFrame(){
        super(_frameName);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        WindowListener exitListener = new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                Main._isWorking = false;
            }
        };
        addWindowListener(exitListener);
        setVisible(true);
        setContentPane(new MainPanel());
        pack();
    }

}
