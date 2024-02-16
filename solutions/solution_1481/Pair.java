package solutions.solution_1481;

public class Pair<X, Y> {
    private final Integer key;
    private final Integer value;
    public Pair(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public Integer getValue() {
        return value;
    }
}
