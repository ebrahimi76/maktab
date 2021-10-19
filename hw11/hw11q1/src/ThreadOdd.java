import java.util.List;
import java.util.Set;

public class ThreadOdd implements Runnable {
    Set<Integer> list;
    List<Integer> odds;

    public ThreadOdd(Set<Integer> list, List<Integer> odds) {
        this.list = list;
        this.odds = odds;
    }

    @Override
    public void run() {
        list.addAll(odds);
    }
}
