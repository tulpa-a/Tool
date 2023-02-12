public class Drum implements Tool{
    //№3
    int size;

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан " + size +" размера");

    }
}
