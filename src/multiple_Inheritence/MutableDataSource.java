package multiple_Inheritence;

public interface MutableDataSource<T> extends DataSource<T> {
    void saveData(T data);
}
