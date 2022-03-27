package pro.sky.korzina;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BucketServiceImpl implements BucketService {

    private final Cart cart;


    public BucketServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> add(List<Integer> idItems) {
        return cart.add(idItems);
    }

    @Override
    public List<Integer> get() {
        return cart.get();
    }


}

