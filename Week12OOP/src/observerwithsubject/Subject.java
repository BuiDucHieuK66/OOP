package observerwithsubject;

import java.util.LinkedList;
import java.util.List;

public class Subject {
    private List<Observer> observers;
    private int state;

    public Subject() {
        observers = new LinkedList<Observer>();
    }

    public void setState(int state) {
        if (this.state == state) {
            return;
        }

        this.state = state;
        stateChange();
    }

    public int getState() {
        return state;
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    private void stateChange() {
        notifyAllObservers();
    }
}
