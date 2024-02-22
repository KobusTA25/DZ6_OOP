
import actors.Human;
import market.Market;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human actor1 = new Human("Вася");
        Human actor2 = new Human("Петя");
        Human actor3 = new Human("Миша");

        Market market = new Market();

        market.acceptToMarket(actor1);
        market.acceptToMarket(actor2);

        actor1.performAction();
        actor2.performAction();

        actor1.setMakeOrder(true);
        actor2.setMakeOrder(true);
        actor2.setMakeOrder(true);
        actor3.setMakeOrder(false);

        market.update();

        market.takeOrders();

        market.releaseFromQueue();

        List<Human> actorsToRelease = new ArrayList<>();
        actorsToRelease.add(actor1);
        actorsToRelease.add(actor2);
        market.releaseFromMarket(actorsToRelease);
    }
}