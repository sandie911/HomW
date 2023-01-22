package homework8.logg;

public class Logger {
    public static final String ANSI_RESET = "\u001B[0m";
     public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";

    LogModes logMode;
    public Logger(LogModes logMode) {
        this.logMode = logMode;
    }
    public void Write(String message){
        switch (logMode){
            case Info:
                System.out.println(ANSI_GREEN_BACKGROUND + message + ANSI_RESET);
                break;
            case Debug:
                System.out.println(ANSI_YELLOW_BACKGROUND + message + ANSI_RESET);
                break;
            case Warn:
                System.out.println(ANSI_BLUE_BACKGROUND + message + ANSI_RESET);
                break;
            case Error:
                System.out.println(ANSI_PURPLE_BACKGROUND + message +ANSI_RESET);
                break;
        }
    }
}
