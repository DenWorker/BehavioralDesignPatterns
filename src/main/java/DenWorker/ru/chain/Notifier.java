package DenWorker.ru.chain;

public abstract class Notifier {
    private final int priority;
    private Notifier nextNotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    // Рекурсивный обход цепочки.
    public void notifyManager(String message, int level) {
        if (level >= priority) {
            write(message);
        }
        if (nextNotifier != null) {
            nextNotifier.notifyManager(message, level);
        }
    }

    // Все элементы, которые выше будут одинаковы для всех уведомителей.
    // Нижний же будет отличаться.
    public abstract void write(String message);
}
