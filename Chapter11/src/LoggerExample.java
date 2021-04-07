import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerExample {
    public static void main(String[] args) {
        // suppress the loggers

        Logger.getGlobal().setLevel(Level.OFF);
        Logger.getGlobal().setLevel(Level.INFO);
        Logger.getGlobal().info("Logger is initialized.");

        Logger.getGlobal().setLevel(Level.FINE);
        Logger.getGlobal().fine("Danger zone baby");
        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();
        if(value != null){
            Logger.getGlobal().log(Level.INFO,value);
        }
        try{
            FileHandler handler = new FileHandler();
            Logger logger = Logger.getGlobal();
            logger.setLevel(Level.WARNING);
            logger.setUseParentHandlers(false);
            logger.addHandler(handler);
        }catch(IOException e){
            Logger.getGlobal().log(Level.INFO,"Error",e);
        }

    }
}
