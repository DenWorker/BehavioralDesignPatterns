package DenWorker.ru.strategy.developer;

import DenWorker.ru.strategy.activities.Coding;
import DenWorker.ru.strategy.activities.Reading;
import DenWorker.ru.strategy.activities.Sleeping;
import DenWorker.ru.strategy.activities.Training;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new Sleeping());
        developer.executeActivity();

        developer.setActivity(new Training());
        developer.executeActivity();

        developer.setActivity(new Coding());
        developer.executeActivity();

        developer.setActivity(new Reading());
        developer.executeActivity();

        developer.setActivity(new Sleeping());
        developer.executeActivity();
    }
}
