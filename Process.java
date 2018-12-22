//Written by Juan De Filippis
public class Process {

    private String name;
    private int priority;
    private double time;


    public Process() {
        name = "";
        priority = 0;
        time = 0.0;

    }

    public Process(String aName, int aPriority, double aTime) {

        this.setName(aName);
        this.setPriority(aPriority);
        this.setTime(aTime);

    }

    public int getPriority() {

        return priority;
    }


    public void setPriority(int aPriority) {
        this.priority = aPriority;
    }

    public double getTime() {
        //    if (time > 0) {
        return time;
    }
    //}

    public void setTime(double aTime) {
        this.time = aTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    @Override
    public String toString() {
        return this.getName() + this.getPriority() + this.getTime();
    }
}