package builder.solution2;

class NutritionFacts {

    final int servingSize;
    final int servings;
    final int calories;
    final int fat;
    final int sodium;
    final int carbohydrate;

    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    static Builder builder() {
        return new Builder();
    }

    static class Builder {
        // Required parameters
        private int servingSize;
        private int servings;
        // Optional parameters - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        private Builder(){}

        Builder servingSize(int servingSize) {
            this.servingSize = servingSize;
            return this;
        }

        Builder servings(int servings) {
            this.servings = servings;
            return this;
        }

        Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        Builder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        NutritionFacts build() {
            // assert required parameters if necessary
            return new NutritionFacts(this);
        }
    }

    static void main(String[] args) {
        NutritionFacts cocaCola = NutritionFacts.builder()
                .servingSize(240)
                .servings(8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();
    }
}
