package design.patterns.行为型模式.状态模式.after;

/**
 * @author LightRain
 * 电梯停止状态类
 */
public class StopingState extends LifeState {
    /**
     * 停止状态，开门，那是要的!
     */
    @Override
    public void open() {
        //状态修改
        super.context.setLifeState(Context.OPENING_STATE);
        //动作委托为CloseState来执行，也就是委托给了ClosingState子类执行这个动作
        super.context.open();
    }

    @Override
    public void close() {
        //虽然可以关门，但这个动作不归我执行
        //状态修改
        super.context.setLifeState(Context.CLOSEING_STATE);
        //动作委托为CloseState来执行，也就是委托给了ClosingState子类执行这个动作
        super.context.close();
    }


    /**
     * 停止状态再跑起来，正常的很
     */
    @Override
    public void run() {
        //状态修改
        super.context.setLifeState(Context.RUNING_STATE);
        //动作委托为CloseState来执行，也就是委托给了ClosingState子类执行这个动作
        super.context.run();
    }


    /**
     * 停止状态是怎么发生的呢?当然是停止方法执行了
     */
    @Override
    public void stop() {
        System.out.println("电梯停止了... ");
    }

}
