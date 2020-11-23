package osztalyokEsObjektumok.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToDoMain {
    public static void main(String[] args) {
        ToDoList newToDoList = new ToDoList();
        newToDoList.addToDo("sweeping");
        newToDoList.addToDo("dusting");
        newToDoList.addToDo("cleaning");
        System.out.println(newToDoList);
        newToDoList.finishToDos("cleaning");
        System.out.println(newToDoList);
        List<String> list = Arrays.asList("dusting", "sweeping");
        newToDoList.finishAllToDos(list);
        System.out.println(newToDoList);
        System.out.println(newToDoList.numberOfFinishedToDos());
    }
}
