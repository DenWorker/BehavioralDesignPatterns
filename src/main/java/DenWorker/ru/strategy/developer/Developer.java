package DenWorker.ru.strategy.developer;

import DenWorker.ru.strategy.activities.Activity;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.justDoIt();
    }
}
