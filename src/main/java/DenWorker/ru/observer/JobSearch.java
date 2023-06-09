package DenWorker.ru.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        Observer firstSubscriber = new Subscriber("Ivanov Denis");
        Observer secondSubscriber = new Subscriber("Miha Galvas");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Java Position");
        jobSite.removeVacancy("First Java Position");
    }
}
