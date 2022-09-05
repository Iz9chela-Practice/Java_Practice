package multiple_Inheritence;

public class myData {
    private final int id;
    private final String description;

    public myData(int id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public String toString() {
        return "myData{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
