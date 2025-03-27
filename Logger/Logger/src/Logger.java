public class Logger {
    //1º Passo
    private Logger () {}
    //2 Passo
    private static Logger instance;
    //3ºPasso
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void printLog(String msg) {
        System.out.println(msg);
    }

}