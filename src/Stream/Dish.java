package Stream;

public class Dish {
    public String dishName;
    public boolean isVegetables;
    public Integer calories;

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public boolean isVegetables() {
        return isVegetables;
    }

    public void setVegetables(boolean vegetables) {
        isVegetables = vegetables;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Dish(String dishName, boolean isVegetables, Integer calories) {
        this.dishName = dishName;
        this.isVegetables = isVegetables;
        this.calories = calories;
    }

}
