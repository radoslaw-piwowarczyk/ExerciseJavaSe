package Practice;

public class Drink {
    private Ingredients ingredient1;
    private Ingredients ingredient2;
    private Ingredients ingredient3;

    public Drink(Ingredients ingredient1, Ingredients ingredient2, Ingredients ingredient3) {
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.ingredient3 = ingredient3;
    }

    public Ingredients getIngredient1() {
        return ingredient1;
    }

    public void setIngredient1(Ingredients ingredient1) {
        this.ingredient1 = ingredient1;
    }

    public Ingredients getIngredient2() {
        return ingredient2;
    }

    public void setIngredient2(Ingredients ingredient2) {
        this.ingredient2 = ingredient2;
    }

    public Ingredients getIngredient3() {
        return ingredient3;
    }

    public void setIngredient3(Ingredients ingredient3) {
        this.ingredient3 = ingredient3;
    }
}

