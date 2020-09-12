package Implementation;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public static String _dirPath = "C:/ScooterRent";
    public static String _logFile = "LogFile.log";
    public static Logger _logger;

    private Main(){

        //starting logger
        if(!startLogger() || _logger == null){
            System.exit(-1);
        }

        //starting Memory manager

        //staring UI
        if(!startUI()){
            _logger.severe("UI has not been started");
            System.exit(-1);
        }
        _logger.info("UI has been started");


    }

    private boolean startLogger(){
        _logger = Logger.getLogger("AppLogger");
        FileHandler fileHandler = null;
        try{
            File directory = new File(_dirPath);
            if(!directory.exists()) directory.mkdir();

            Files.createDirectories(Paths.get(_dirPath));

            File logFile = new File(_dirPath + "/" + _logFile);
            System.out.println(logFile.getPath());
            if(!logFile.exists()) logFile.createNewFile();

            fileHandler = new FileHandler(_dirPath + "/" + _logFile);

            _logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        _logger.info("Logger started successfully");
        return true;
    }

    private boolean startUI(){
        return true;
    }


}
