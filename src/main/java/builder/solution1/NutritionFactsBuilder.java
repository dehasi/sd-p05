package builder.solution1;

class NutritionFactsBuilder {

    // Parameters initialized to default values (if any)
    private int servingSize = -1; // Required; no default value
    private int servings = -1; // Required; no default value
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    void setServings(int servings) {
        this.servings = servings;
    }

    void setCalories(int calories) {
        this.calories = calories;
    }

    void setFat(int fat) {
        this. fat = fat;
    }

    void setSodium(int sodium) {
        this.sodium = sodium;
    }

    void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    NutritionFacts nutritionFacts() {
        assert servingSize != -1; // don't use this 'assert' keyword in prod
        assert servings != -1;    // don't use this 'assert' keyword in prod

        return new NutritionFacts(
                servingSize,
                servings,
                calories,
                fat,
                sodium,
                carbohydrate
        );
    }

    public static void main(String[] args) {
        NutritionFactsBuilder builder = new NutritionFactsBuilder();
        builder.setServingSize(240);
        builder.setServings(8);
        builder.setCalories(100);
        builder.setSodium(35);
        builder.setCarbohydrate(27);

        NutritionFacts cocaCola = builder.nutritionFacts();
    }
}
