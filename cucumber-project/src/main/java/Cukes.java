public class Cukes {
    int cukes;

    public int getCukes() {
        return cukes;
    }

    public void setCukes(int cukes) {
        this.cukes = cukes;
    }

    public void eat(int eated) {
        this.cukes -= eated;
    }

    public void 吃饭(){
        System.out.println("吃饭啦");
    }
}
