package by.tc.jwd.task5.meleschenya.service;

import by.tc.jwd.task5.meleschenya.entity.model.Employee;
import by.tc.jwd.task5.meleschenya.service.exception.ServiceException;

import java.util.List;

public interface ParserService {

    List<Employee> buildEmployeeList() throws ServiceException;
}
