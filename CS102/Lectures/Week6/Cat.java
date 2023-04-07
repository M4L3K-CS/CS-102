package CS102.Lectures.Week6;

public class Cat extends Animal {

    public Cat (String name) {
        setName(name);
        setColor ("Grey");
    }
    public String toString () {
        return "Cat";
    }
    public String speak(){
        return "Meow";
    }
    
}
