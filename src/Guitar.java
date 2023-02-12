public class Guitar implements Tool{
    //№3
    int strings;

    public Guitar(int strings) {
        this.strings = strings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с " + strings +" струнами");

    }
}
