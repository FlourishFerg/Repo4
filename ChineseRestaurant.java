import java.util.ArrayList;

public class ChineseRestaurant implements Restaurant{
    private ArrayList<String> menu;
    public ChineseRestaurant(){
        this.menu = new ArrayList<>();
        menu.add("Kung Pao Chicken");
        menu.add("Egg Fried Rice");
        menu.add("Hot and Sour Soup");
    }

    @Override
    public void showLocation() {
        System.out.println("Location: Chinese Restaurant");
    }

    @Override
    public ArrayList<String> getMenu() {
        return menu;
    }
}
