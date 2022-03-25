package pro.sky.korzina;

import java.util.Collection;

public interface BucketService {
    Bucket add(int id);

    Collection<Bucket> get();
}
