package dev.omedia.Interface;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> data);
}
