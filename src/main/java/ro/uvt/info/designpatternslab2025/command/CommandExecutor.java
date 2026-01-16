package ro.uvt.info.designpatternslab2025.command;

import org.springframework.stereotype.Component;

@Component
public class CommandExecutor {
    public <T> T execute(Command<T> command) {
        return command.execute();
    }
}

