package Implementation.Memory;

import Implementation.Main;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageProcessor {

    private static final String AGR_PATH = "src/Implementation/Resources/agreement.jpg";
    private BufferedImage _agreement;

    public ImageProcessor(){
        try {
            _agreement = ImageIO.read(new File(AGR_PATH));
            Main._logger.info("Agreement has been loaded successfully");
        } catch (IOException e) {
            e.printStackTrace();
            Main._logger.severe(e.getMessage() + "\n\t >>> Agreement could not be loaded");
        }
    }

    public boolean applySignature(){
        return true;
    }

}
