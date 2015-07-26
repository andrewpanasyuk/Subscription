/**
 * Created by panasyuk on 26.07.2015.
 */
public class Subscriber implements ControlNamber{
    private String name;
    public Subscriber(String name){
        this.name = name;
    }
    @Override
    public void update() {
        System.out.println(name + ": 'I know about new number!'");
    }
}
