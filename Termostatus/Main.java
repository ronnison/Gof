public class Main {
    public static void main(String[] args) {

        Temperatura t = new Temperatura();
        TermometroCelsius tc = new TermometroCelsius();
        TermometroFareinheit tf = new TermometroFareinheit();
        t.addObserver(tc);
        t.addObserver(tf);
        t.setTemp(100.0);
        t.setTemp(54.9);

    }
}