import java.util.ArrayList;
import java.util.List;

/**
 * Created by panasyuk on 26.07.2015.
 */
public class Newspaper implements Subscription {      // класс имплементирует интерфейс "Подписка"

    private int carrentNumber = 0;                  // создаем поле с текущим номером газеты
    private String np = "'Times'";
    private List<Subscriber> subscribers;           // объявляем сипсок подписчиков

    public Newspaper(){                             // конструктор, корорый создает ArrayList для хранения подписчиков
        subscribers = new ArrayList<>();
    }

    public void setCarrentNumber() {                // метод "выпускающий" новый номер газеты + вызов метода уведомления подписчиков
        carrentNumber++;
        System.out.println("NP: " + np + ", new Number! " + " #" + carrentNumber);
        notifySubscriber();
    }

    public int getCarrentNumber() {                 // для проверки текущего номера
        return carrentNumber;
    }

    @Override
    public void addSubscriber(Subscriber o) {       // добавление нового подписчика в лист
        subscribers.add(o);
    }

    @Override
    public void removeSubscriber(Subscriber o) {     // удаления подписчика из листа
        subscribers.remove(o);
    }

    @Override
    public void notifySubscriber() {                // перебор листа и вызов для каждого объекта метода update
        for (Subscriber o : subscribers) {
            o.update();
        }

    }
}
