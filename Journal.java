import java.util.ArrayList;
import java.util.List;

/**
 * Created by panasyuk on 26.07.2015.
 */
public class Journal implements Subscription {

    private int carrentNumber = 0;                  // создаем поле с текущим номером газеты
    private String np = "'Around the world'";
    private List<Subscriber> subscribers;           // объ€вл€ем сипсок подписчиков

    public Journal(){
        subscribers = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Subscriber o) {

        subscribers.add(o);


    }

    public void setCarrentNumber() {
        this.carrentNumber++;
        System.out.println("Journal: " + np + ", new Number! " + " #" + carrentNumber);
        notifySubscriber();
    }

    @Override
    public void removeSubscriber(Subscriber o) {
        subscribers.remove(o);

    }

    @Override
    public void notifySubscriber() {
        for (Subscriber s: subscribers){
            s.update();
        }

    }
}
