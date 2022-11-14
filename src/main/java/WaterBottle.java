public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }
    public int getVolume(){
        return this.volume;
    }
    public int drink(){
        int sum = this.volume - 10;
        return sum;
    }
    public int empty(){
       return this.volume = 0;
    }
    public int fill(){
        return this.volume = 100;
    }
}
