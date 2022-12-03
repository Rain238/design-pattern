package design.patterns.行为型模式.中介者模式;

/**
 * @author LightRain
 * 具体同事角色类 租房者
 */
public class Tenant extends Person {

    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * 和中介沟通的方法
     *
     * @param message String
     */
    public void constact(String message) {
        mediator.constact(message, this);
    }

    /**
     * 获取信息
     *
     * @param message String
     */
    public void getMessage(String message) {
        System.out.println("租房者" + name + "获取到的信息是:" + message);
    }
}
