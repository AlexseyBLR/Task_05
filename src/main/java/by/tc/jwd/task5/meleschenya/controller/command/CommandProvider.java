package by.tc.jwd.task5.meleschenya.controller.command;
import java.util.HashMap;
import java.util.Map;

public class CommandProvider {

   private Map<String,Command> commandMap = new HashMap<>();

   public CommandProvider(){

   }

    public Map<String, Command> getCommandMap() {
        return commandMap;
    }



}
