package DenWorker.ru.command;

import DenWorker.ru.command.commands.DeleteCommand;
import DenWorker.ru.command.commands.InsertCommand;
import DenWorker.ru.command.commands.SelectCommand;
import DenWorker.ru.command.commands.UpdateCommand;

public class DataBaseRunner {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        Developer developer = new Developer(
                new InsertCommand(dataBase),
                new UpdateCommand(dataBase),
                new SelectCommand(dataBase),
                new DeleteCommand(dataBase)
        );

        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();
    }
}
