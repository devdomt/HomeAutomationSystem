package audiovideo;

/**
 * Created by dominik on 28.05.2017.
 */
public class DoorController implements Icommand {

    Door d = new Door();

    public DoorController(Door d) {
        this.d = d;
    }


    public void execute() {
        d.setClosed(true);
    }
}
