//Written by Juan De Filippis
public class Player {

    private int name;
    private int wins;
    private int loses;
    private int ties;
    private String hand;

    public Player(String format) {
        name = 0;
        wins = 0;
        loses = 0;
        ties = 0;
        hand = "";

    }

    public Player(int aName, int aWins, int aLoses, int aTies, String aHand) {
        this.name = aName;
        this.wins = aWins;
        this.loses = aLoses;
        this.ties = aTies;
        this.hand = aHand;

    }

    public int getName() {
        return this.name;
    }

    public void setName(int aName) {
        this.name = aName;
    }


    public void setWins(int aWins) {
        this.wins = aWins;
    }


    public void setLoses(int aLoses) {
        this.loses = aLoses;
    }


    public void setTies(int ties) {
        this.ties = ties;
    }

    public void setHand(int id) { // sets the parameter of which is wins or losses or ties

        switch(id) {
            case 0: {
                this.hand = "rock";
                break;
            }
            case 1: {
                this.hand = "paper";
                break;
            }
            case 2: {
                this.hand = "scissors";
                break;
            }
            default: {
                System.out.println("Weird error with the hands");
                break;
            }
        }
    }

    public String getHand() {
        return this.hand;
    }
    public void addWin() {
        this.wins++;
    }
    public void addLoss() {
        this.loses++;
    }
    public void addTie() {
        this.ties++;
    }
    public int getWins() {
        return this.wins;
    }
    public int getLoses() {
        return this.loses;
    }
    public int getTies() {
        return this.ties;
    }

    public String toString() {
        return this.getName()+" Wins "+
                this.getWins()+" Ties "+ this.getTies()+ " Losses "+
                this.getLoses();
    }

}




