package by.tc.jwd.task5.meleschenya.dao;

import by.tc.jwd.task5.meleschenya.dao.exception.DAOException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.util.Map;

public interface CommandDAO {
    Document getDocument() throws DAOException;
    Map<String , String> getCommandMap(NodeList nodeList);
}
