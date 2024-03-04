package fluentInterface.assets;

import java.util.Collection;

class Check {

    static ObjectChecker that(Object value) {
        return new ObjectChecker(value);
    }

    static CollectionChecker that(Collection<?> value) {
        return new CollectionChecker(value);
    }

    static class ObjectChecker {
        private final Object value;

        public ObjectChecker(Object value) {
            this.value = value;
        }
    }

    static class CollectionChecker {
        private final Collection<?> value;

        public CollectionChecker(Collection<?> value) {
            this.value = value;
        }
    }
}
