package observer.example1;

import java.util.function.Function;

class VarPull {
    private final Function<Integer, Integer> transformation;
    private final VarPull bound;
    private int value;

    private VarPull(int value) {
        this(value, null, null);
    }

    public VarPull(int value, VarPull bound, Function<Integer, Integer> transformation) {
        this.value = value;
        this.transformation = transformation;
        this.bound = bound;
    }

    int value() {
        if (bound != null) return transformation.apply(bound.value());
        else return this.value;
    }

    VarPull setValue(int value) {
        //
        this.value = value;
        return this;
    }

    private void update(VarPull var) {
        this.value = transformation.apply(var.value());
    }

    static VarPull of(int value) {
        return new VarPull(value);
    }

    public static VarPull bind(VarPull var, Function<Integer, Integer> transformation) {
        var bound = new VarPull(var.value(), var, transformation);
        return bound;
    }
}
