import java.util.ArrayList;
import java.util.List;

/**
 * Created by panasyuk on 26.07.2015.
 */
public class Newspaper implements Subscription {      // ����� �������������� ��������� "��������"

    private int carrentNumber = 0;                  // ������� ���� � ������� ������� ������
    private String np = "'Times'";
    private List<Subscriber> subscribers;           // ��������� ������ �����������

    public Newspaper(){                             // �����������, ������� ������� ArrayList ��� �������� �����������
        subscribers = new ArrayList<>();
    }

    public void setCarrentNumber() {                // ����� "�����������" ����� ����� ������ + ����� ������ ����������� �����������
        carrentNumber++;
        System.out.println("NP: " + np + ", new Number! " + " #" + carrentNumber);
        notifySubscriber();
    }

    public int getCarrentNumber() {                 // ��� �������� �������� ������
        return carrentNumber;
    }

    @Override
    public void addSubscriber(Subscriber o) {       // ���������� ������ ���������� � ����
        subscribers.add(o);
    }

    @Override
    public void removeSubscriber(Subscriber o) {     // �������� ���������� �� �����
        subscribers.remove(o);
    }

    @Override
    public void notifySubscriber() {                // ������� ����� � ����� ��� ������� ������� ������ update
        for (Subscriber o : subscribers) {
            o.update();
        }

    }
}
