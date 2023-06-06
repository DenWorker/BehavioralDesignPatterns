package DenWorker.ru.command.commands;

import DenWorker.ru.command.DataBase;

public class SelectCommand implements Command {
    DataBase dataBase;

    public SelectCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.select();
    }
}
