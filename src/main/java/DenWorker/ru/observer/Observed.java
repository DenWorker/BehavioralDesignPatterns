package DenWorker.ru.observer;

public interface Observed {
    public void addObserver(Observer observer);

    public void deleteObserver(Observer observer);

    public void notifyObservers();
}
