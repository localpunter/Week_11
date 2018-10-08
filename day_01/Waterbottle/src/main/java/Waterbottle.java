public class Waterbottle {

    public int volume;

    public Waterbottle(int volume){
        this.volume = volume;
    }

    public int volume(){
        return this.volume;
    }

    public int drink() {
        return this.volume - 10;
    }

    public int empty() {
        return this.volume - this.volume;
    }

    public int full() {
        this.volume = 100;
        return this.volume;
    }
}
