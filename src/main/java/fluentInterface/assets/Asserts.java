package fluentInterface.assets;

import java.util.List;

class Asserts {
    public static void main(String[] args) {

        Object o = null;
        String s = "32";

        if (Check.that(o).isNotNull()) {
            //do smth
        }

        Check.that(List.of(1, 2, 3))
                .hasSize(42)
                .onConditionFail(new Runnable() {
                    @Override public void run() {
                        throw new RuntimeException("HEre");
                    }
                });
    }
}
