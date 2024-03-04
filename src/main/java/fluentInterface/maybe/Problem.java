package fluentInterface.maybe;

class Problem {

    String findClientMiddleName1(int id) {
        // returns a value
        // or
        return null;
    }

    void usage1() {
        String middleName = findClientMiddleName1(42);
        if(middleName != null) {
            //do smth;
        }
    }

    String findClientMiddleName2(int id) {
        // returns a value
        // or
        return "";
    }


    void usage2() {
        String middleName = findClientMiddleName2(42);
        if(!middleName.isEmpty()) {
            //do smth;
        }
    }

    public static void main(String[] args) {
        new Problem().run();
    }

    void run(){}


}
