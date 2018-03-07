package by.tc.jwd.task5.meleschenya.controller.command;

import by.tc.jwd.task5.meleschenya.entity.model.Employee;
import by.tc.jwd.task5.meleschenya.service.ParserService;
import by.tc.jwd.task5.meleschenya.service.exception.ServiceException;
import by.tc.jwd.task5.meleschenya.service.factory.ServiceFactory;

import java.util.List;

public class StAXParseCommand implements Command {

    private ServiceFactory factory = ServiceFactory.getInstance();
    private ParserService service = factory.getStaxParserService();


    @Override
    public List<Employee> execute() throws ServiceException {
        return service.buildEmployeeList();
    }
}
