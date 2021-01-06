import org.python.core.*;
import org.python.util.PythonInterpreter;

public class Main {

    public static void main(String[] args) {
        PythonInterpreter pyInterp = new PythonInterpreter();
        pyInterp.exec("import os; print(os.getcwd())");
        pyInterp.exec("from jina219 import INA219");/*
        PyInstance ina = (PyInstance)pyInterp.eval("INA219(0.1)");
        ina.invoke("configure()");
        System.out.println(ina.invoke("current()").__tojava__(Float.class));*/
        pyInterp.exec("print('from jina219 import INA219')");

    }
}