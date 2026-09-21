import java.util.Arrays;

public class Warrior extends Character{
    private String weapon;
    private String[] inventory;

    //Constructor
    public Warrior(String name, int level, String weapon){
        super(name, level);
        this.weapon = weapon;
        this.inventory = new String[0];
    }

    //Override introduce
    @Override
    public void introduce(){
        System.out.println("I am " + name + ", a level " + level + " warrior wielding a " + weapon + ".");
    }

    //Add an item
    public void addItem(String item){
        String[] newInventory = new String[inventory.length + 1];
        System.arraycopy(inventory, 0, newInventory, 0, inventory.length);
        newInventory[inventory.length] = item;
        inventory = newInventory;
    }

    //Remove an item
    public void removeItem(String item){
        int targetIndex = -1;

        for(int i = 0; i < inventory.length; i++){
            if (inventory[i].equalsIgnoreCase(item)){
                targetIndex = i;
                break;
            }
        }

        //Handle case where the item doesn't exist
        if (targetIndex == -1){
            System.out.println("Item \"" + item + "\" was not found in inventory.");
            return;
        }

        //New array size reduced by 1
        String[] newInventory = new String[inventory.length - 1];

        //Copy elements before the target index
        System.arraycopy(inventory, 0, newInventory, 0, targetIndex);

        //Copy elements after target
        System.arraycopy(inventory, targetIndex + 1, newInventory, targetIndex, inventory.length - targetIndex - 1);

        inventory = newInventory;
        System.out.println("Removed \"" + item + "\" from inventory.");

    }

    public void printInventory(){
        System.out.println(name + "'s Inventory: " + Arrays.toString(inventory));
    }

    //Getter and Setter for Weapon
    public String getWeapon(){
        return weapon;
    }

    public void setWeapon(String weapon){
        this.weapon = weapon;
    }
}