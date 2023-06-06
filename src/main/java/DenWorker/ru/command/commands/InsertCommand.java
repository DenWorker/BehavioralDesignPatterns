package DenWorker.ru.command.commands;

import DenWorker.ru.command.DataBase;

public class InsertCommand implements Command {
    DataBase dataBase;

    public InsertCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.insert();
    }
}
