package by.tc.jwd.task5.meleschenya.service;

import by.tc.jwd.task5.meleschenya.controller.command.Command;
import by.tc.jwd.task5.meleschenya.service.exception.ServiceException;

import java.util.Map;

public interface CommandService {

    Map<String ,Command> getCommandMap() throws ServiceException;


}
