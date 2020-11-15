package bonyolultabbTipusok.task;

import java.time.LocalDateTime;

public class Task {
    String title;
    String description;
    LocalDateTime startDateTime;
    int duration;

    public Task(String title, String description){
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void start(){
        startDateTime= LocalDateTime.now();
    }

    public static void main(String[] args) {
        Task task = new Task("programming", "creating a program");
        task.setDuration(60);
        task.start();
        System.out.println(task.getStartDateTime());
        System.out.println(task.getDescription());
        System.out.println(task.getTitle());
        System.out.println(task.getDuration());
    }
}
