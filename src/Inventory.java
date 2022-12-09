import java.util.ArrayList;

public class PetInventory {

    private ArrayList<Inventory> inventory;

    public PetInventory()
    {
        inventory = new ArrayList<Inventory>();
    }

    public void addInventory(Inventory i)
    {
        inventory.add(i);
    }

    public void removeInventory(Inventory i)
    {
        inventory.remove(i);
    }


}
