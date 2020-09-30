package Implementation.Memory;

import Implementation.Main;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;


public class FileSaver {

    private ImageProcessor _imageProcessor;

    private static final String SAVE_DIR = "saved";



    public FileSaver(){

        File dir = new File(Main.DIR_PATH + "/" + SAVE_DIR);
        if(!dir.exists() || !dir.isDirectory()){
            try {
                dir.mkdir();
                Main._logger.info("\"save\" directory was created");
            }catch (Exception e) {
                Main._logger.severe(e.getMessage());
                System.exit(-1);
            }
        }else{
            Main._logger.info("\"save\" Directory was not created");
        }

        _imageProcessor = new ImageProcessor();

    }

    public boolean save(String s, BufferedImage signature){

        return true;
    }


}
