package fluentInterface.assets;

import java.util.Collection;

class Check {

    static ObjectChecker that(Object value) {
        return new ObjectChecker(value);
    }

    static CollectionChecker that(Collection<?> collection) {
        return new CollectionChecker(collection);
    }

    static class ObjectChecker {
        private final Object value;

        public ObjectChecker(Object value) {
            this.value = value;
        }


        boolean isNotNull() {
            return value != null;
        }

        boolean isNull() {
            return value == null;
        }
    }

    static class CollectionChecker {
        private final Collection<?> collection;

        public CollectionChecker(Collection<?> collection) {
            this.collection = collection;
        }

        CollectionCheckerResult hasSize(int size) {
            return new CollectionCheckerResult(collection.size() == size);
        }

        static class CollectionCheckerResult {
            private final boolean result;

            public CollectionCheckerResult(boolean result) {
                this.result = result;
            }

            void onConditionFail(Runnable command) {
                if (!result) command.run();
            }
        }
    }
}
