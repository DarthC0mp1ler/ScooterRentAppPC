package Implementation;

import Implementation.Memory.MemoryManager;
import Implementation.UI.AppFrame;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public static final String DIR_PATH = "C:/ScooterRent";
    private static final String LOG_FILE = "LogFile.log";
    public static boolean _isWorking;
    public static Logger _logger;
    private Thread _memoryManager;

    private Main(){

        //starting logger
        if(startLogger() != null || _logger == null){
            System.exit(-1);
        }

        _isWorking = true;

        //starting Memory manager
        _memoryManager = new MemoryManager();
        _memoryManager.start();

        //staring UI
        if(startUI() != null){
            _logger.severe("UI has not been started");
            System.exit(-1);
        }
        _logger.info("UI has been started");


    }

    private String startLogger(){
        _logger = Logger.getLogger("AppLogger");
        FileHandler fileHandler = null;
        try{

            Files.createDirectories(Paths.get(DIR_PATH));

            File logFile = new File(DIR_PATH + "/" + LOG_FILE);
            if(!logFile.exists()) logFile.createNewFile();

            fileHandler = new FileHandler(DIR_PATH + "/" + LOG_FILE);

            _logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
        _logger.info("Logger started successfully");
        return null;
    }

    private String startUI(){
        AppFrame appFrame = new AppFrame();
        return null;
    }


}
