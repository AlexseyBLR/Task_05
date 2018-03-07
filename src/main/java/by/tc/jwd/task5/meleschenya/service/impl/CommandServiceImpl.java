package by.tc.jwd.task5.meleschenya.service.impl;

import by.tc.jwd.task5.meleschenya.controller.command.Command;
import by.tc.jwd.task5.meleschenya.service.CommandService;
import by.tc.jwd.task5.meleschenya.service.exception.ServiceException;

import java.util.Map;

public class CommandServiceImpl implements CommandService {
    private CommandMapCreator mapCreator = new CommandMapCreator();

    @Override
    public Map<String, Command> getCommandMap() throws ServiceException {
        return mapCreator.buildCommandMap();
    }
}
