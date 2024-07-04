import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>("aa", 100);
        System.out.println(p.getFirst());
        System.out.println(p.getLast());
    }
}

class Pair<T, K> {
    private T first;
    private K last;

    public Pair(T first, K last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return this.first;
    }

    public K getLast() {
        return this.last;
    }
}