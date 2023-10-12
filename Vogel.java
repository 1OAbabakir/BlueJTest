public abstract class Vogel implements VogelInterface{
    Boolean kannFliegen;
    Vogel() {
        kannFliegen = true;
    }
    
    Vogel(Boolean kf) {
        kannFliegen = kf;
    }
    
    void singe() {
        System.out.println(melodie());
    }
}