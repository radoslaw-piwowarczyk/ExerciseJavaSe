package Practice;

/**
 * Define a Bartender class that has a createDrink method that takes names as arguments and the amount
 * of 3 ingredients needed to prepare a drink. As a result, the method should return an object of the
 * Drink type with information about the ingredients of the drink. Each ingredient in the Drink class
 * should be represented by the Ingredient class, which stores the name and amount of the ingredient.
 * The Bartender class should also have a printDrink method, which takes an object of the Drink type
 * as a parameter and displays information about it as:
 * The ingredients of the drink are AAA, BBB, CCC in the proportions aaa, bbb, ccc, its capacity is zzz1
 * where AAA, aaa, etc. represent the arguments passed to the method.
 **/

public class Bartender {
    public static Drink createDrink(String ingredient1, double amount1,
                                    String ingredient2, double amount2,
                                    String ingredient3, double amount3) {
        Ingredients ing1 = new Ingredients(ingredient1, amount1);
        Ingredients ing2 = new Ingredients(ingredient2, amount2);
        Ingredients ing3 = new Ingredients(ingredient3, amount3);
        return new Drink(ing1, ing2, ing3);
    }

    public static void printDrink(Drink drink) {
        double ingredientSum = drink.getIngredient1().getAmount() +
                drink.getIngredient2().getAmount() +
                drink.getIngredient3().getAmount();
        double ing1Part = drink.getIngredient1().getAmount() / ingredientSum;
        double ing2Part = drink.getIngredient2().getAmount() / ingredientSum;
        double ing3Part = drink.getIngredient3().getAmount() / ingredientSum;
        System.out.printf("Ingredients of drink are: %s, %s, %s " +
                        "in proportions %.2f, %.2f, %.2f." +
                        "It's volume is %.0fml\n",
                drink.getIngredient1().getName(), drink.getIngredient2().getName(), drink.getIngredient3().getName(),
                ing1Part, ing2Part, ing3Part,
                ingredientSum);

    }
}

