package DenWorker.ru.visitor.developers;

import DenWorker.ru.visitor.projects.Database;
import DenWorker.ru.visitor.projects.ProjectClass;
import DenWorker.ru.visitor.projects.Test;

public class JuniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing poor class...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Drop database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating not reliable test...");
    }
}
