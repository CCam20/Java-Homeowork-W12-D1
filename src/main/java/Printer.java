public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }
    public int print(int copies){
        if (this.paper >= copies){
            return this.paper - copies;
        }
            return 0;
    }
    public int reduceToner(int copies){
        if (this.paper >= copies){
            return this.toner - copies;
        }
        return 0;
    }

}
