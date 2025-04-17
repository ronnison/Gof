public class TermometroCelsius implements Observer{

    public void update (Subject s) {
        double temp = ((Temperatura) s).getTemp();
        System.out.println("A temperatura em graus celsius é: " + temp);
    }

}