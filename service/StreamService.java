package service;

import data.Stream;
import data.StreamComparator;

import java.util.ArrayList;
import java.util.List;

public class StreamService {
    private List<Stream> streams;

    public void createStream(List<Stream> streams) {
        this.streams = streams;
    }

    public List<Stream> getStream() {
        return streams;
    }

    public List<Stream> getSortedStream() {
        List<Stream> sortedStreams = new ArrayList<>(streams);
        sortedStreams.sort(new StreamComparator());
        return sortedStreams;
    }
}