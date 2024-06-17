package data;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>, Comparable<Stream>{
    private List<StudentGroup> groups;

    public Stream(List<StudentGroup> groups) {
        this.groups = groups;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Stream{" +
                "groups=" + groups +
                '}';
    }

    @Override
    public StreamIterator iterator() {
        return new StreamIterator(this);
    }

    @Override
    public int compareTo(Stream o) {return Integer.compare(this.getGroups().size(), o.getGroups().size());
    }
}
