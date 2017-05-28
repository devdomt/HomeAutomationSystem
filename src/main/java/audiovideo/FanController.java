package audiovideo;

/**
 * Created by dominik on 28.05.2017.
 */
public class FanController implements Icommand {

    Fan f = new Fan();

    public FanController(Fan nFan) {
        f = nFan;
    }

    public void execute() {
        f.setTurnFrequency(3.4f);
        f.setWindForce(10);
        f.run();
    }
}
