package builder.problem;

// Telescoping constructor pattern - does not scalewell!
// Example from Effective Java 3rd Edition
final class NutritionFacts {

    final int servingSize; // (mL) required
    final int servings; // (per container) required
    final int calories; // (per serving) optional
    final int fat; // (g/serving) optional
    final int sodium; // (mg/serving) optional
    final int carbohydrate; // (g/serving) optional

    NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    NutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFacts smallFact = new NutritionFacts(240, 8, 100);


        NutritionFacts cocaCola = new NutritionFacts(240, 8, 100, 0, 35, 27);


        NutritionFacts oldSchool = new NutritionFacts(
                /* servingSize*/240,
                /* servings*/8,
                /* calories*/100,
                /* fat*/0,
                /* sodium*/35,
                /* carbohydrate*/27);
    }
}
