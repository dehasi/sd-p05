package observer.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Var {

    private final List<Var> bounds = new ArrayList<>();
    private final Function<Integer, Integer> transformation;
    private int value;

    private Var(int value) {
        this(value, null);
    }

    private Var(int value, Function<Integer, Integer> transformation) {
        this.value = value;
        this.transformation = transformation;
    }

    static Var of(int value) {
        return new Var(value);
    }

    static Var bind(Var var, Function<Integer, Integer> transformation) {
        // var bound = new Var(transformation.apply(var.value), transformation);
        var bound = new Var(var.value, transformation);
        var.subscribe(bound);
        return bound;
    }

    int value() {
        return this.value;
    }

    Var setValue(int value) {
        this.value = value;
        bounds.forEach(v -> v.update(this));
        return this;
    }

    private void update(Var var) {
        this.value = transformation.apply(var.value());
    }


    private void subscribe(Var bound) {
        bounds.add(bound);
    }
}
