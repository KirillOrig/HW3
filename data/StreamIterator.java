package data;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    private int counter;
    private final List<StudentGroup> groups;

    public StreamIterator(Stream groups) {
        this.groups = groups.getGroups();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < groups.size() - 1;
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return groups.get(counter);
    }
}
