package multiple_Inheritence;

import org.jetbrains.annotations.NotNull;

public class GeoCloudDataSource implements DataSource<GeoData>{
    @Override
    public @NotNull GeoData data() {
        return new GeoData((long) 12.1, (long) 12.4);
    }
}
