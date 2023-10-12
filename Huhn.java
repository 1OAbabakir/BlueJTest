public class Huhn extends Vogel {
    Huhn(){
        kannFliegen = false;
    }
    @Override
    public String melodie(){
        return "Boooook";
    }
    @Override
    public Boolean hunger() {
        return true;
    }
}