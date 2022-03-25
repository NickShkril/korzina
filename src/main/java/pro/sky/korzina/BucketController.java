package pro.sky.korzina;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/store")
public class BucketController {
    private final BucketService bucketService;

    public BucketController(BucketService bucketService) {
        this.bucketService = bucketService;
    }

    @GetMapping(path = "/add")
    public String add(@RequestParam("id") int id) {
        Bucket result = bucketService.add(id);
        String message = "Объект " + result.getItem() + " " + " успешно добавлен";
        return message;
    }

    @GetMapping(path = "/get")
    public Collection<Bucket> get() {
        return bucketService.get();
    }
    }





