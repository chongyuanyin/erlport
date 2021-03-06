package erlport.terms;

import java.util.*;
import java.lang.*;

public class Pid {
    public Atom node;
    public Long id;
    public Long serial;
    public Long creation;

    public Pid(Atom node, Long id, Long serial, Long creation) {
       this.node = node;
       this.id = id;
       this.serial = serial;
       this.creation = creation;
    }

    @Override
    public String toString() {
        return String.format("Pid(node: %s, id: %d, serial: %d, creation: %d)", node.toString(), id, serial, creation);
    }
}


