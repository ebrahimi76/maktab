import java.util.List;
import java.util.Set;

public class ThreadEven implements Runnable{
    Set<Integer> list;
    List<Integer> evens;

    public ThreadEven(Set<Integer> list, List<Integer> evens) {
        this.list = list;
        this.evens = evens;
    }

    @Override
    public void run() {
        list.addAll(evens);
    }
}
