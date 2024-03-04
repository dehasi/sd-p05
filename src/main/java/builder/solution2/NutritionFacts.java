package builder.solution2;

class NutritionFacts {

    // Parameters initialized to default values (if any)
    private int servingSize = -1; // Required; no default value
    private int servings = -1; // Required; no default value
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    void setServingSize(int val) {
        servingSize = val;
    }

    void setServings(int val) {
        servings = val;
    }

    void setCalories(int val) {
        calories = val;
    }

    void setFat(int val) {
        fat = val;
    }

    void setSodium(int val) {
        sodium = val;
    }

    void setCarbohydrate(int val) {
        carbohydrate = val;
    }

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts();
        cocaCola.setServingSize(240);
        cocaCola.setServings(8);
        cocaCola.setCalories(100);
        cocaCola.setSodium(35);
        cocaCola.setCarbohydrate(27);
    }
}
