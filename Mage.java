public class Mage extends Character{
    private String magicType;

    //Constructor
    public Mage(String name, int level, String magicType){
        super(name, level);
        this.magicType = magicType;
    }

    //Overrride introduce()
    @Override
    public void introduce(){
        System.out.println("I am " + name + ", a level " + level + " mage specialization in " + magicType + " magic.");   
    }

    //Getter and Setter
    public String getMagicType(){
        return magicType;
    }

    public void setMagicType(String magicType){
        this.magicType = magicType;
    }
}