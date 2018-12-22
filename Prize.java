//Written by Juan De Filippis
public class Prize {

    private String name;
    private int prize;

    public Prize()
    {
        this.name = "No name yet";
        this.prize= 0;
    }
    public Prize(String aName, int aPrize)
    {
        this.name=aName;
        this.prize=aPrize;
    }

    public String getName()
    {
        return name;
    }

    public int getPrize()
    {
        return prize;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPrize(int prize)
    { if(prize>=0)
        this.prize = prize;
    }

    public String toString()
    {
        return "Name: " + this.name + " \nPrize: " + this.prize;
    }
    public boolean equals(Prize aPrize)
    {
        return aPrize!= null && this.name.equals(aPrize.getName())&& this.prize==(aPrize.getPrize());
    }
}
