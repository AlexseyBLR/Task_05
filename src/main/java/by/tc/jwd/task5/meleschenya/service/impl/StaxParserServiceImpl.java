package by.tc.jwd.task5.meleschenya.service.impl;

import by.tc.jwd.task5.meleschenya.dao.XmlDAO;
import by.tc.jwd.task5.meleschenya.dao.exception.DAOException;
import by.tc.jwd.task5.meleschenya.dao.factory.DAOFactory;
import by.tc.jwd.task5.meleschenya.entity.model.Employee;
import by.tc.jwd.task5.meleschenya.service.ParserService;
import by.tc.jwd.task5.meleschenya.service.exception.ServiceException;

import java.util.List;

public class StaxParserServiceImpl implements ParserService {

    private DAOFactory factory = DAOFactory.getInstance();
    private XmlDAO xmlDAO = factory.getSaxDao();

    @Override
    public List<Employee> buildEmployeeList() throws ServiceException {
        try {
            return xmlDAO.getEmployeeList();
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }
}
