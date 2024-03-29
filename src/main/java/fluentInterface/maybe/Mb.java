package fluentInterface.maybe;

class Mb {

    final class Maybe<E> {
        private final E value;

        Maybe() {
            value = null;
        }

        Maybe(E value) {
            assert value != null;
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


    void usage() {
        Maybe<String> middleName = findClientMiddleName(42);

        if (!middleName.isEmpty()) {
            //do smth;
            middleName.get().equals("bla");
            char firstLetter = middleName.get().charAt(0);
        }
    }


    //  final class Either<Result, Error extends Exception> { }
}
