package DenWorker.ru.visitor.projects;

import DenWorker.ru.visitor.developers.Developer;

public class Project implements ProjectElement {
    ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement iterator : projectElements) {
            iterator.beWritten(developer);
        }
    }
}
