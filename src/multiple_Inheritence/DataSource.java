package multiple_Inheritence;

import org.jetbrains.annotations.NotNull;

public interface DataSource<T> {
    @NotNull
    T data();
}
