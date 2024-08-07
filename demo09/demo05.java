import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        Pair<String> p = new Pair<String>("aa", "bb");
        System.out.println(p.getFirst());
        System.out.println(p.getLast());

        Pair<Integer> p2 = new Pair<Integer>(100, 200);
        System.out.println(p2.getFirst());
        System.out.println(p2.getLast());
    }
}

class Pair<T> {
    private T first;
    private T last;

    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return this.first;
    }

    public T getLast() {
        return this.last;
    }
}