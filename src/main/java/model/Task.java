package model;

public class Task {

    static long idCounter = 0;

    private long id;
    private String name;
    private String description;
    private Status status = Status.NOTDONE;

    public Task() {
        this.id = idCounter;
        idCounter += 1;
    }

    public static long getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(long idCounter) {
        Task.idCounter = idCounter;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}



