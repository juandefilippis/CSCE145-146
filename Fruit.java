//Written by Juan De Filippis
public class Fruit implements Comparable{

    private String type;
    private double weight;

    public Fruit(){
        type = "none";
        weight = 0.0;
    }

    public Fruit(String aType, double aWeight){
        setType(aType);
        setWeight(aWeight);
    }

    public String getType(){
        return this.type;
    }

    public double getWeight(){
        return this.weight;
    }

    public void setType(String aType){

        this.type = aType;
    }

    public void setWeight(double aWeight){
        if(aWeight > 0.0)
        {

            this.weight = aWeight;
        }
    }

    public String toString(){
        return this.type+" "+this.weight+"\n";
    }

    public int compareTo(Object aFruit){
        Fruit aFruit2 = (Fruit)aFruit;
        if(this.weight < aFruit2.getWeight())
        {
            return -1;
        }

        else if(this.weight > aFruit2.getWeight()){
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public boolean equals(Fruit aFruit, Fruit aFruit2){
        if(aFruit.getType().equalsIgnoreCase(aFruit2.getType()) && aFruit.getWeight() == aFruit2.getWeight())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}



