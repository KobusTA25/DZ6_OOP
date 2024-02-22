package actors;

public abstract class AbstractActor implements Actor, ActorBehaviour {
    protected boolean isTakeOrder;
    protected int numberOfOrders;
    protected final String name;

    public AbstractActor(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void performAction() {
        System.out.println(name + ": совершает покупки");
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        if (makeOrder) {
            numberOfOrders++;
            System.out.println(name + ": сделал заказ. Общее количество заказов: " + numberOfOrders);
            if (isTakeOrder) {
                System.out.println(name + ": заказ принят и находится в работе.");
            }
        } else {
            System.out.println(name + ": отказался от заказа.");
        }
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        isTakeOrder = takeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return numberOfOrders > 0;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}

