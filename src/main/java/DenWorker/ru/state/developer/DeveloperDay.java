package DenWorker.ru.state.developer;

import DenWorker.ru.state.activities.Activity;
import DenWorker.ru.state.activities.Sleeping;

public class DeveloperDay {
    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Developer developer = new Developer();

        developer.setActivity(activity);

        for (int i = 0; i < 10; i++) {
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
