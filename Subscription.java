/**
 * Created by panasyuk on 26.07.2015.
 */
public interface Subscription {                     // ��������� "��������"
    public void addSubscriber(Subscriber o);
    public void removeSubscriber(Subscriber o);
    public void notifySubscriber();
}
