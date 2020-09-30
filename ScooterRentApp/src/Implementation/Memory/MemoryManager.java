package Implementation.Memory;

import Implementation.Logic.Models.Contract;
import Implementation.Logic.Models.LongTerm;
import Implementation.Main;
import Implementation.Memory.Queue.TSQueue;

public class MemoryManager extends Thread{

    //private static final ImageProcessor IMAGE_PROCESSOR;
    public static MemoryManager MEMORY_MANAGER;
    private FileSaver _fileSaver;
    private CacheManager _cacheManager;
    private GarbageCollector _garbageCollector;

    public static TSQueue<Contract> _saveCacheQueue;
    public static TSQueue<LongTerm> _saveContract;


    public MemoryManager(){

        MEMORY_MANAGER = this;

        _fileSaver = new FileSaver();
        Main._logger.info("FileSaver has been started");

        _cacheManager = new CacheManager();
        Main._logger.info("CacheManager has been started");

        _garbageCollector = new GarbageCollector();
        Main._logger.info("GarbageCollector has been started");

        _saveCacheQueue = new TSQueue<>();
        _saveContract = new TSQueue<>();
    }


    @Override
    public void run() {

        while(Main._isWorking){
            System.out.println("Working");


            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Main._logger.severe(e.getMessage());
            }
        }

        Main._logger.info("Memory manager has stopped");
    }
}
