package market;

import actors.Actor;

public interface QueueBehaviour {
    void takeInQueue(Actor actor);
    void takeOrders();
    void releaseFromQueue();
}