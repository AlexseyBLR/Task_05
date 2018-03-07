package by.tc.jwd.task5.meleschenya.dao.factory;

import by.tc.jwd.task5.meleschenya.dao.CommandDAO;
import by.tc.jwd.task5.meleschenya.dao.XmlDAO;
import by.tc.jwd.task5.meleschenya.dao.impl.CommandDAOImpl;
import by.tc.jwd.task5.meleschenya.dao.impl.DomDaoImpl;
import by.tc.jwd.task5.meleschenya.dao.impl.SaxDaoImpl;
import by.tc.jwd.task5.meleschenya.dao.impl.StaxDaoImpl;

public class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private XmlDAO saxDao = new SaxDaoImpl();
    private XmlDAO domDao = new DomDaoImpl();
    private XmlDAO staxDao = new StaxDaoImpl();
    private CommandDAO commandDAO = new CommandDAOImpl();


    public XmlDAO getSaxDao() {
        return saxDao;
    }

    public XmlDAO getDomDao() {
        return domDao;
    }

    public XmlDAO getStaxDao() {
        return staxDao;
    }

    public CommandDAO getCommandDAO(){return commandDAO; }

    public static DAOFactory getInstance() {
        return instance;
    }
}
