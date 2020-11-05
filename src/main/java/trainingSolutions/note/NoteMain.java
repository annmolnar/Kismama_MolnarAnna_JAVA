package trainingSolutions.note;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        note.setName("Anna");
        note.setTopic("JAVA");
        note.setText("JAVA is great");
        System.out.println(note.getNoteText());
    }
}
