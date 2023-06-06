package DenWorker.ru.command.commands;

import DenWorker.ru.command.DataBase;

public class UpdateCommand implements Command {
    DataBase dataBase;

    public UpdateCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.update();
    }
}
