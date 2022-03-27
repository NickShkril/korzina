package pro.sky.korzina;

import java.util.Objects;

public class Bucket {
    private int item;

    public int getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "item=" + item +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bucket bucket = (Bucket) o;
        return item == bucket.item;
    }

    @Override
    public int hashCode() {
        return Objects.hash(item);
    }

    public void setItem(int item) {
        this.item = item;
    }

    public Bucket(int item) {
        this.item = item;
    }
}
