package solutions.solution_341;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {

    private List<Integer> list;
    private int index = 0;
    public NestedIterator(List<NestedInteger> nestedList) {
        this.list = new ArrayList<>();
        this.expandNestedInteger(nestedList);
    }

    @Override
    public Integer next() {
        return this.list.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < this.list.size();
    }

    public void expandNestedInteger(List<NestedInteger> nestedList) {
        for (NestedInteger nestedInteger: nestedList) {
            if (nestedInteger.isInteger()) {
                this.list.add(nestedInteger.getInteger());
            } else if (nestedInteger.getList() != null) {
                this.expandNestedInteger(nestedInteger.getList());
            }
        }
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */