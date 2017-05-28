package pilots;
import audiovideo.Icommand;

/**
 * Created by dominik on 28.05.2017.
 */
public class SingleSlotPilot {

    Icommand comm;


    public SingleSlotPilot(Icommand comm) {
        this.comm = comm;
    }

    public void executeCommand(Icommand comm) {
        comm.execute();
    }
}
