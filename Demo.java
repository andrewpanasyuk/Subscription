/**
 * Created by panasyuk on 26.07.2015.
 */
public class Demo {
    public static void main(String[] args) {
        Newspaper np = new Newspaper();
        Journal j = new Journal();
        Subscriber s1 = new Subscriber("s1");
        Subscriber s2 = new Subscriber("s2");
        Subscriber s3 = new Subscriber("s3");
        Subscriber s4 = new Subscriber("s4");
        np.addSubscriber(s1);
        np.addSubscriber(s2);
        np.addSubscriber(s3);
        np.addSubscriber(s4);
        j.addSubscriber(s3);
        j.addSubscriber(s2);

        np.setCarrentNumber();
        np.removeSubscriber(s3);
        np.setCarrentNumber();
        j.setCarrentNumber();


    }
}
