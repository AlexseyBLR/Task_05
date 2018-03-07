package by.tc.jwd.task5.meleschenya.controller.command;

import by.tc.jwd.task5.meleschenya.entity.model.Employee;
import by.tc.jwd.task5.meleschenya.service.exception.ServiceException;

import java.util.List;

public interface Command {

    List<Employee> execute() throws ServiceException;


}
