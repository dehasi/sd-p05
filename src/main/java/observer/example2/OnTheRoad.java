package observer.example2;

class OnTheRoad {


    static class TruckDriver implements Listener {
        @Override public void receive(String message) {
            System.out.println("Such a good piece of news: " + message);
        }
    }

    static class TaxiDriver implements Listener {
        @Override public void receive(String message) {
            System.out.println("I'm driving a taxi and receiving: " + message);
        }
    }

    public static void main(String[] args) {
        RadioStation station = new RoadRadio();

        var truckDriver = new TruckDriver();
        var taxiDriver = new TaxiDriver();

        station.register(truckDriver);
        station.register(taxiDriver);

        station.notifyListeners("A big traffic jam ahead!");

        station.delete(truckDriver);

        System.out.println();
        station.notifyListeners("No more traffic jam!");
    }
}
