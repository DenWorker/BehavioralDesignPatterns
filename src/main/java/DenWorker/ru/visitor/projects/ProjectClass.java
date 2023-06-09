package DenWorker.ru.visitor.projects;

import DenWorker.ru.visitor.developers.Developer;

public class ProjectClass implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
