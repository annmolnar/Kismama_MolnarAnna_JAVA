package osztalyokEsObjektumok.methods;

public class ToDoMain {
    public static void main(String[] args) {
        ToDoList newToDoList = new ToDoList();
        //ToDo newToDo = new ToDo("cleaning");
        //System.out.println(newToDo.getCaption());
        newToDoList.addToDo("sweeping");
        newToDoList.addToDo("dusting");
        newToDoList.addToDo("cleaning");
        System.out.println(newToDoList.toDosToFinish());
        newToDoList.finishToDos("sweeping");
        System.out.println(newToDoList.toDosToFinish());

    }
}
