package by.tc.jwd.task5.meleschenya.dao;

import by.tc.jwd.task5.meleschenya.dao.exception.DAOException;
import by.tc.jwd.task5.meleschenya.entity.model.Employee;

import java.util.List;

public interface XmlDAO {

    List<Employee> getEmployeeList() throws DAOException;

   default String getPath(String fileName){
        ClassLoader classLoader = getClass().getClassLoader();
        String path = new String(classLoader.getResource(fileName).getPath());
        return path;
    }

}
