Принципы SOLID - это набор пяти основных принципов, которые призваны сделать программный код более устойчивым к изменениям и улучшить его читаемость и поддерживаемость:

1. Принцип единственной ответственности (Single Responsibility Principle, SRP):
AbstractActor реализует и Actor, и ActorBehaviour. 

2. Принцип открытости/закрытости (Open/Closed Principle, OCP):
Классы AbstractActor, Human, и Market могут быть расширены новым функционалом без модификации существующего кода.

3.Принцип подстановки Барбары Лисков (Liskov Substitution Principle, LSP):
Класс Human является подтипом AbstractActor, поэтому код следует принципу подстановки Лисков.

4.Принцип разделения интерфейса (Interface Segregation Principle, ISP):
Интерфейсы Actor и ActorBehaviour разделены, что соответствует ISP.

5. Принцип инверсии зависимостей (Dependency Inversion Principle, DIP):
Класс Market зависит от абстракции Actor, что соответствует DIP.
