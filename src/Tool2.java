public class Tool2 {
    //№4
    public static void main (String[] args){
        Guitar guitar1 = new Guitar(5);
        Guitar guitar2 = new Guitar(6);
        Drum drum1 = new Drum(14);
        Drum drum2 = new Drum(22);
        Trumpet trumpet1 = new Trumpet(20);
        Trumpet trumpet2 = new Trumpet(40);
        //массив
        Tool[] tools = {guitar1, guitar2, drum1, drum2, trumpet1, trumpet2};
        //№5
        for (Tool printable : tools){
            printable.play();
        }
    }
}
