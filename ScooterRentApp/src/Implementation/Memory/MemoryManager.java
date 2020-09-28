package Implementation.Memory;

import Implementation.Main;

public class MemoryManager implements Runnable{

    //private static final ImageProcessor IMAGE_PROCESSOR;
    private FileSaver _fileSaver;
    private CacheManager _cacheManager;
    private GarbageCollector _garbageCollector;



    public MemoryManager(){

        _fileSaver = new FileSaver();
        Main._logger.info("FileSaver has been started");

        _cacheManager = new CacheManager();
        Main._logger.info("CacheManager has been started");

        _garbageCollector = new GarbageCollector();
        Main._logger.info("GarbageCollector has been started");
    }


    @Override
    public void run() {

    }
}
