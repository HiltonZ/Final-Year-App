
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import org.apache.commons.io.FileUtils;
import project.Frame;
import static project.Frame.Thumb_SaveLoc_TextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author zak
 */
public class Main_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame MainFrame = new Frame();
        
        
        MainFrame.setVisible(true);
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MainFrame.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent we) {
                File Save_Loc = new File(Thumb_SaveLoc_TextField.getText() + "/Temp");
                Path Save = Paths.get(Thumb_SaveLoc_TextField.getText());

                if (Files.exists(Save)) {
                    try {
                        FileUtils.deleteDirectory(Save_Loc);
                    } catch (IOException ex) {
                        Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });

    }

}
