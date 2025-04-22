final class Logger {
    public void logMessage(String message) {
        System.out.println("Log: " + message);
    }
}

/*
// This will cause a compile-time error because Logger is a final class
class ExtendedLogger extends Logger {
    public void anotherLog() {
        System.out.println("Trying to extend Logger");
    }
}
*/

public class Exp64 {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.logMessage("System started successfully.");
    }
}

