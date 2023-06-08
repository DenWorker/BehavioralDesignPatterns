package DenWorker.ru.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUserToChat(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User iterator : users) {
            if (iterator != user) {
                iterator.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
