package osztalyokEsObjektumok.methods;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {

    List<ToDo> toDoList = new ArrayList<>();

    public void addToDo(String caption) {
        toDoList.add(new ToDo(caption));

    }

    public void finishToDos(String caption) {
        for (ToDo i : toDoList) {
            if (caption.equals(i.getCaption())) {
                i.finish();
            }
        }
    }

    public void finishAllToDos(List<String> toDosToFinish) {
        List<String> listOfTodos = new ArrayList<>();
        for(String s : toDosToFinish){
            //listOfTodos.add(s.getCaption());
            finishToDos(s);
            //System.out.println(listOfTodos);
            /*for(String s:toDosToFinish){
                if(t.getCaption().equals(s)){
                    t.finish();
                    System.out.println(t.getCaption());
                    System.out.println(t.isFinished());
                }
            }*/
        }

    }

    public List<String> toDosToFinish() {
        List<String> list = new ArrayList<>();
        for (ToDo i : toDoList) {
            if(!i.isFinished()) {
                list.add(i.getCaption());
            }
        }
        return list;
    }

    public int numberOfFinishedToDos() {
        int count = 0;
        for(ToDo todo: toDoList){
            if(todo.isFinished()){
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString(){
        return toDoList.toString();
    }


}
