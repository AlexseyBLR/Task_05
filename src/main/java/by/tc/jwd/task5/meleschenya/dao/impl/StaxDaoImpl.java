package by.tc.jwd.task5.meleschenya.dao.impl;

import by.tc.jwd.task5.meleschenya.dao.XmlDAO;
import by.tc.jwd.task5.meleschenya.dao.exception.DAOException;
import by.tc.jwd.task5.meleschenya.entity.model.Employee;
import by.tc.jwd.task5.meleschenya.service.entityBuilder.EmployeeStaxBuilder;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class StaxDaoImpl implements XmlDAO {

    private final XMLInputFactory factory = XMLInputFactory.newInstance();
    private final String XML_FILE_NAME = "task.xml";

    public List<Employee> getEmployeeList() throws DAOException {

        try {
            XMLEventReader eventReader =
                    factory.createXMLEventReader(new FileReader(getPath(XML_FILE_NAME)));

            List<Employee> employees =
                    new  EmployeeStaxBuilder(eventReader).buildEmployeeList();

            return employees;
        } catch (XMLStreamException | FileNotFoundException e) {
            throw new DAOException("Exception from StaxDao in getEmployeeList method",e);
        }


    }
}
