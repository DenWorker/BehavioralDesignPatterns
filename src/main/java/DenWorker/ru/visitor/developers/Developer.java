package DenWorker.ru.visitor.developers;

import DenWorker.ru.visitor.projects.Database;
import DenWorker.ru.visitor.projects.ProjectClass;
import DenWorker.ru.visitor.projects.Test;

public interface Developer {
    public void create(ProjectClass projectClass);

    public void create(Database database);

    public void create(Test test);
}
