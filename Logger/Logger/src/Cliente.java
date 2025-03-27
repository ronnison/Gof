public class Cliente {
    public void testeCliente(){
        int result = 4 + 5;
        Logger log = Logger.getInstance();
        log.printLog(
            "Log do cliente: " + result);
        System.out.println(log);
    }
}
