package audiovideo;

/**
 * Created by dominik on 28.05.2017.
 */
public class LightController implements Icommand {

    Light l = new Light();


    public void execute() {
        l.setOn(true);
    }
}
