import java.util.ArrayList;

public class MegaChicken implements Restaurant {
    private ArrayList<String> menu;
    public MegaChicken(){
        this.menu = new ArrayList<>();
        menu.add("Yamarita");
        menu.add("Asun");
        menu.add("Spaghetti");
    }

    @Override
    public void showLocation() {
        System.out.println("Location: MegaChicken");
    }

    @Override
    public ArrayList<String> getMenu() {
        return menu;
    }
}
