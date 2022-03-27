package pro.sky.korzina;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Cart {

    public final List<Integer> items;

    public Cart(List<Integer> items) {
        this.items = new ArrayList<>();
    }

    public List<Integer> add(List<Integer> idItems) {
        items.addAll(idItems);
        return idItems;
    }

    public List<Integer> get() {
        return Collections.unmodifiableList(items);
    }
}
