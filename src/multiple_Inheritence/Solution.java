package multiple_Inheritence;

public class Solution {
    public static void main(String[] args) {
        Repository<myData> repository = new Repository<>(new myDataCloudDataSource(),new CacheDataSource<>());
        myData data = repository.data();
        Repository<GeoData> newRepository =  new Repository<>(new GeoCloudDataSource(),new CacheDataSource<>());
        GeoData geo = newRepository.data();

    }
}
