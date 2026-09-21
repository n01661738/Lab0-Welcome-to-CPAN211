public class Tester{
    public static void main(String[] args){

       //Warrior Object
       Warrior Joshua = new Warrior("Joshua", 12, "Sword");

       //Add 6 items to warriors inventory
       Joshua.addItem("Heatlth Potion");
       Joshua.addItem("Iron Shield");
       Joshua.addItem("Stamina Elixir");
       Joshua.addItem("Map");
       Joshua.addItem("Torch");
       Joshua.addItem("Gold Key");

       //Print inventory
       System.out.println("---Initial Inventory---");
       Joshua.printInventory();
       System.out.println();

        //Remove an item
        System.out.println("--- Removing an item---");
         Joshua.removeItem("Map");  
        System.out.println();

        //Print updated inventory
        System.out.println("--- Updated Inventory ---");
        Joshua.printInventory();  
        System.out.println();

        //Demonstrate polymorphism with Joshua the Warrior
        System.out.println("--- Polymorphism Demonstration (Warrior) ---");
        Character polyWarrior = new Warrior("Joshua", 12, "Sword");
        polyWarrior.introduce();
        System.out.println();

        //Create Mage Object
        Mage David = new Mage("David", 99, "Divine");

        //Demonstrate polymorphism with Mage
        System.out.println("--- Polymorphism Demonstration (Mage) ---");
        Character polyMage = new Mage("David", 99, "Divine");
        polyMage.introduce();
        
    }
}