import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Subject {

    private List<Observer> observadores;

    public Subject () {
        observadores = new ArrayList<Observer>();
    }

    public void addObserver(Observer ob) {
        observadores.add(ob);
    }

    public void removeObserver (Observer ob) {
        observadores.remove(ob);
    }

    public void notifyObservers(){
        Iterator<Observer> it = observadores.iterator();
        while(it.hasNext()) {
            Observer ob = it.next();
            ob.update(this);
        }
    }
}