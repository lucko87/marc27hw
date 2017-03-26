package homework02;

public class CalculatorService {

    //Elindítottam a publikus osztályt
    public CalculatorService() {
    }
    // Deklaráltam a változót
    int partiy;
    //Megvizsgáltam, hogy a beírt szám páros-e vagy páratlan
    public boolean isItEvent(int parity) {
        if (parity % 2 != 0) {
            return false;
        } else return true;
    }
}
