package observer.example2;


interface RadioStation {

    void register(Listener listener);

    void delete(Listener listener);

    void notifyListeners(String message);
}
