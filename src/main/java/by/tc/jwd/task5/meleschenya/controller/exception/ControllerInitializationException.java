package by.tc.jwd.task5.meleschenya.controller.exception;

public class ControllerInitializationException extends RuntimeException {

    public ControllerInitializationException(){
        super();
    }

    public ControllerInitializationException(String message , Throwable cause){
        super(message,cause);
    }

    public ControllerInitializationException(String message){
        super(message);
    }

    public ControllerInitializationException(Throwable cause){
        super(cause);
    }
}
