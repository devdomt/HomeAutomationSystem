package audiovideo;

/**
 * Created by dominik on 28.05.2017.
 */
public class Door {

    private boolean isClosed;



    private int openingAmount = 0;

    public void setClosed(boolean closed) {
        isClosed = closed;
        openingAmount++;
    }

    public int getOpeningAmount() {
        return openingAmount;
    }

}
