public class Character{
    protected String name;
    protected int level;

    //Constuctor
    public Character(String name, int level){
        this.name = name;
        this.level = level;
    }

    //Introduce
    public void introduce(){
        System.out.println("I am " + name + ", and I am level " + level + ".");

    }

    //Getters, Setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int level){
        this.level = level;
    }
}