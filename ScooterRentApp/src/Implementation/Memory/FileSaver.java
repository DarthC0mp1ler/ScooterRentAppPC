package Implementation.Memory;

import Implementation.Main;

import java.io.File;


public class FileSaver {

    private ImageProcessor _imageProcessor;

    private static final String CACHE_DIR = "cache";


    public FileSaver(){

        File dir = new File(Main.DIR_PATH + CACHE_DIR);
        if(!dir.exists() || !dir.isDirectory()){
            try {
                dir.mkdir();
                Main._logger.info("Directory was created");
            }catch (Exception e) {
                Main._logger.info(e.getMessage());
            }
        }else{
            Main._logger.info("Directory was not created");
        }
    }

}
