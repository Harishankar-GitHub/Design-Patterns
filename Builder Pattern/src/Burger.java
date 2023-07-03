public class Burger {
    private final String size;
    private final boolean egg;
    private final boolean extraCheese;
    private final boolean mayonnaise;
    private final boolean onion;
    private final boolean lettuce;

    private Burger(BurgerBuilder burgerBuilder) {
        // Initialize all fields and you can also add validations.

        this.size = burgerBuilder.size;
        this.egg = burgerBuilder.egg;
        this.extraCheese = burgerBuilder.extraCheese;
        this.mayonnaise = burgerBuilder.mayonnaise;
        this.onion = burgerBuilder.onion;
        this.lettuce = burgerBuilder.lettuce;
    }

    public String getSize() {
        return size;
    }

    public boolean isEgg() {
        return egg;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public boolean isMayonnaise() {
        return mayonnaise;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public static class BurgerBuilder {
        private String size;
        private boolean egg;
        private boolean extraCheese;
        private boolean mayonnaise;
        private boolean onion;
        private boolean lettuce;

        public BurgerBuilder withSize(String size) {
            this.size = size;
            return this;
        }

        public BurgerBuilder withEgg(boolean egg) {
            this.egg = egg;
            return this;
        }

        public BurgerBuilder extraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        public BurgerBuilder extraMayonnaise(boolean mayonnaise) {
            this.mayonnaise = mayonnaise;
            return this;
        }

        public BurgerBuilder withOnion(boolean onion) {
            this.onion = onion;
            return this;
        }

        public BurgerBuilder withLettuce(boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
