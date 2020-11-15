package osztalyokEsObjektumok.methods;

public class ToDo {
    private String caption;
    private boolean finished;

    public ToDo(String caption){
        this.caption = caption;
    }

    public String getCaption() {
        return caption;
    }

    public boolean isFinished() {
        return finished;
    }

    public void finish(){
        finished = true;
    }
}
