package DenWorker.ru.visitor.developers;

import DenWorker.ru.visitor.projects.Database;
import DenWorker.ru.visitor.projects.ProjectClass;
import DenWorker.ru.visitor.projects.Test;

public class SeniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting class after junior...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Fixing database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating reliable test...");
    }
}
