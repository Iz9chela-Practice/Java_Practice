package multiple_Inheritence;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CacheDataSource<T> implements MutableDataSource<T>{

    @Nullable
    private T data;
    @Override
    @NotNull
    public T data() {
        return data;
    }

    @Override
    public void saveData(T data) {
        this.data = data;
    }
}
