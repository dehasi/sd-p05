package fluentInterface.assets;

import java.util.List;

class Asserts {
    public static void main(String[] args) {

        Object o = null;
        String s = "32";

        if (Check.that(o).isNotNull()) {
            //do smth
        }

        Check.that(List.of())
                .hasSize(42)
                .onConditionFail(() -> {
                    throw new RuntimeException("HEre");
                });
    }
}
