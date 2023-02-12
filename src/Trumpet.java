public class Trumpet implements Tool{
    //№3
    int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба диаметром " + diameter);
    }
}
