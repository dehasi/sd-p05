package observer.example2;

import java.util.ArrayList;
import java.util.List;

class RoadRadio implements RadioStation {

    private final List<Listener> listeners = new ArrayList<>();

    @Override public void register(Listener listener) {
        listeners.add(listener);
    }

    @Override public void delete(Listener listener) {
        listeners.remove(listener);
    }

    @Override public void notifyListeners(String message) {
        listeners.forEach(listener -> listener.receive(message));
    }
}
