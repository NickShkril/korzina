package pro.sky.korzina;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class BucketController {

    private final BucketService bucketService;

    public BucketController(BucketService bucketService) {
        this.bucketService = bucketService;
    }

    @GetMapping(path = "/add")
    public List<Integer> add(@RequestParam List<Integer> id) {
        return bucketService.add(id);

    }

    @GetMapping(path = "/get")
    public List<Integer> get() {
        return bucketService.get();
    }
}





