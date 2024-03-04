package fluentInterface.maybe;

class OneElementList {

    class Maybe<E> {
        private final E value;

        Maybe() {
            this(null);
        }

        Maybe(E value) {
            this.value = value;
        }

        boolean isEmpty() {
            return value == null;
        }

        E get() {
            if (value != null) return value;
            throw new IllegalStateException("value does not exist");
        }
    }

    Maybe<String> findClientMiddleName(int id) {
        // returns a value
        // or
        return new Maybe<>();
    }


    void usage2() {
        Maybe<String> middleName = findClientMiddleName(42);
        if(!middleName.isEmpty()) {
            //do smth;
        }
    }

}
