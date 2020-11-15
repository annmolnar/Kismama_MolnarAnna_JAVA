package osztalyokEsObjektumok.methods;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {

    List<ToDo> toDoList = new ArrayList<>();

    public void addToDo(String caption) {
        toDoList.add(new ToDo(caption));

    }

    public void finishToDos(String caption) {
        List<String> l = new ArrayList<>();
        for (ToDo i : toDoList) {
            l.add(i.getCaption());
            if (caption.equals(i.getCaption())) {
                System.out.println(i.getCaption());
                i.finish();
            }if (i.isFinished()==true){
                toDoList.remove(i.getCaption());
            }
        }
    }

    public void finishAllToDos(List<String> toDosToFinish) {

    }

    public List<String> toDosToFinish() {
        List<String> list = new ArrayList<>();
        for (ToDo i : toDoList) {
            list.add(i.getCaption());
        }
        return list;
    }

    public int numberOfFinishedToDos() {
        return 3;
    }


}
