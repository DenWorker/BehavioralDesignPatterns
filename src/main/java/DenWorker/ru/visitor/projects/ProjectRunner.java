package DenWorker.ru.visitor.projects;

import DenWorker.ru.visitor.developers.Developer;
import DenWorker.ru.visitor.developers.JuniorDeveloper;
import DenWorker.ru.visitor.developers.SeniorDeveloper;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior in Action");
        project.beWritten(junior);

        System.out.println("====================");

        System.out.println("Senior in Action");
        project.beWritten(senior);
    }
}
