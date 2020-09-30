package Implementation.Memory;

import Implementation.Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class CacheManager {

    private final String CACHE_DIR = "cache";
    private final String CACHE_FILE = System.currentTimeMillis()+"";
    private MappedByteBuffer _cacheBuffer;



    public CacheManager() {
        File dir = new File(Main.DIR_PATH + "/"+ CACHE_DIR);
        if(!dir.exists() || !dir.isDirectory()){
            try {
                dir.mkdir();
                Main._logger.info("\"cache\" directory was created");
            }catch (Exception e) {
                Main._logger.severe(e.getMessage());
                System.exit(-1);
            }
        }else{
            Main._logger.info("\"cache\" Directory was not created");
        }

        File file = new File(Main.DIR_PATH + "/"+ CACHE_DIR + "/" + CACHE_FILE);
        if(!file.exists()){
            try {
                file.createNewFile();
                Main._logger.info("\"cache\" file with name" + CACHE_FILE + " was created");
            }catch (Exception e) {
                Main._logger.severe(e.getMessage());
                System.exit(-1);
            }
        }else{
            Main._logger.info("\"cache\" file with name" + CACHE_FILE + "was not created");
        }


        try {
            RandomAccessFile cacheFile = new RandomAccessFile(file,"rw");
            FileChannel channel = cacheFile.getChannel();
            _cacheBuffer = channel.map(FileChannel.MapMode.READ_WRITE,0,-1);

        } catch (Exception e) {
            e.printStackTrace();
            Main._logger.info(e.getMessage());
        }

    }


    public boolean saveCache() {
        return true;
    }

}
