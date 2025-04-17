public class TermometroFareinheit implements Observer{

    public void update (Subject s) {
        double temp = (((Temperatura) s).getTemp() * 1.8) + 32;
        System.out.println("A temperatura em graus fareinheit é: " + temp);
    }

}