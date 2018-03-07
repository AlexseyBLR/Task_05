package by.tc.jwd.task5.meleschenya.service.factory;

import by.tc.jwd.task5.meleschenya.service.CommandService;
import by.tc.jwd.task5.meleschenya.service.ParserService;
import by.tc.jwd.task5.meleschenya.service.impl.CommandServiceImpl;
import by.tc.jwd.task5.meleschenya.service.impl.DomParserServiceImpl;
import by.tc.jwd.task5.meleschenya.service.impl.SaxParserServiceImpl;
import by.tc.jwd.task5.meleschenya.service.impl.StaxParserServiceImpl;

public final class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();

    private CommandService commandService = new CommandServiceImpl();

    private ParserService saxParserService = new SaxParserServiceImpl();

    private ParserService domParserService = new DomParserServiceImpl();

    private ParserService staxParserService = new StaxParserServiceImpl();

    private ServiceFactory(){

    }

    public ParserService getDomParserService() {
        return domParserService;
    }

    public ParserService getSaxParserService() {
        return saxParserService;
    }

    public CommandService getCommandService() {
        return commandService;
    }

    public ParserService getStaxParserService() {
        return staxParserService;
    }

    public static ServiceFactory getInstance(){
        return instance;
    }
}
