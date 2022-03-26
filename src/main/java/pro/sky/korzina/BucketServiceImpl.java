package pro.sky.korzina;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


@Service

public class BucketServiceImpl implements BucketService {

    private final Map<String, Bucket> bucketList;

    public BucketServiceImpl() {
        bucketList = new HashMap<>();
        bucketList.put("one", new Bucket(1));
        bucketList.put("two", new Bucket(2));
        bucketList.put("three", new Bucket(3));
    }

    @Override
    public Bucket add(int id) {
        Bucket newBucket = new Bucket(id);
        bucketList.put("AnyKey", newBucket);
        return newBucket;
    }


    @Override
    public Collection<Bucket> get() {
        return Collections.unmodifiableCollection(bucketList.values());
    }


}

