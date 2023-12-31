# Scenario
## In this scenario, let's consider a stock market application where investors subscribe to receive updates about the stock prices. The Subject class represents the stock market, and ConcreteObserver instances represent individual investors. When the stock prices change, the stock market notifies all registered investors about the updates.
### //In this scenario, let's consider a stock market application where investors subscribe to receive updates about the stock prices. The Subject class represents the stock market, and ConcreteObserver instances represent individual investors. When the stock prices change, the stock market notifies all registered investors about the updates.

~~~
import java.util.ArrayList;
import java.util.List;

// Subject class
class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

// Observer interface
interface Observer {
    void update(String message);
}

// Concrete Observer class
class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}

public class ObserverPatternDemo {
    public static void main(String[] args) {
   ~     // Create stock market subject
        Subject stockMarket = new Subject();

        // Create concrete observers (investors)
        Observer investor1 = new ConcreteObserver("Investor 1");
        Observer investor2 = new ConcreteObserver("Investor 2");

        // Register observers to the stock market
        stockMarket.addObserver(investor1);
        stockMarket.addObserver(investor2);

        // Simulate stock price updates
        stockMarket.notifyObservers("Stock prices are up by 2%!");
        stockMarket.notifyObservers("Stock prices are down by 1.5%!");
    }
}
~~~
