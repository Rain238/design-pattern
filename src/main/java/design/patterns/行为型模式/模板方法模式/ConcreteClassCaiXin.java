package design.patterns.行为型模式.模板方法模式;

public class ConcreteClassCaiXin extends AsbstractClass {
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是蒜蓉");
    }

}
