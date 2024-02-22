package market;

import actors.Actor;
import actors.Human;

import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {
    private List<Actor> queue;

    @Override
    public void acceptToMarket(Actor actor) {
        // логика
    }

    @Override
    public void releaseFromMarket(List<Human> actorList) {
        // логика
    }

    @Override
    public void update() {
        // логика
    }

    @Override
    public void takeInQueue(Actor actor) {
        // логика
    }

    @Override
    public void takeOrders() {
        // логика
    }

    @Override
    public void releaseFromQueue() {
        // логика
    }
}