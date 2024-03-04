package decorator.example;

class CoffeeMenu {

    public interface SmthWithPrice {
        int price();
    }

    static class CupOfCoffee implements SmthWithPrice {
        @Override public int price() {
            return 10;
        }
    }

    static class PortionOfMilk implements SmthWithPrice {
        private final SmthWithPrice smthWithPrice;

        public PortionOfMilk(SmthWithPrice smthWithPrice) {
            this.smthWithPrice = smthWithPrice;
        }

        @Override public int price() {
            return 3 + smthWithPrice.price();
        }
    }

    static class Sugar implements SmthWithPrice {
        private final SmthWithPrice smthWithPrice;

        Sugar(SmthWithPrice smthWithPrice) {
            this.smthWithPrice = smthWithPrice;
        }

        @Override public int price() {
            return 1 + smthWithPrice.price();
        }
    }

    public static void main(String[] args) {

        var standardCoffee = new Sugar(new PortionOfMilk(new CupOfCoffee()));
        System.out.println(standardCoffee.price());


        var lotsOfSugarCoffee = new Sugar(new Sugar(new Sugar(new CupOfCoffee())));
        System.out.println(lotsOfSugarCoffee.price());


        var doubleMilkCoffee = new PortionOfMilk(new PortionOfMilk(new CupOfCoffee()));
        System.out.println(doubleMilkCoffee.price());
    }

}
