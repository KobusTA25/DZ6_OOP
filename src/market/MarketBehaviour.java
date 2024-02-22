package market;

import actors.Actor;
import actors.Human;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Human> actorList);
    void update();
}