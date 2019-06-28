package cn.epochong.shoot;
import javax.swing.JFrame;//相框
import javax.swing.JPanel;//相板,面板
import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author wangchong
 * @date 2019/6/25 10:06
 * @email 876459397@qq.com
 * @blog epochong.github.io
 * @describe 整个窗口,继承相板
 */
public class World extends JPanel{
    /**
     * 窗口宽度
     */
    public static final int FRAME_WIDTH = 400;
    /**
     * 窗口高度
     */
    public static final int FRAME_HEIGHT = 700;
    private Sky sky = new Sky();
    private Hero hero = new Hero();
    private FlyingObject[] enemies = {

    };
    private Bullet[] bullets = {
            new Bullet(180,300)
    };

    /**
     * 生成敌人
     * 控制小蜜蜂的数量比其他少，不然英雄机不那么容易死
     * @return 小敌机、大敌机、蜜蜂对象
     */
    public FlyingObject nextOne() {
        Random random = new Random();
        /*
         * 用于判断产生什么飞行物产生随机数
         */
        int type = random.nextInt(20);
        /*
         * 0 - 4成成小蜜蜂对象
         * 5 - 11生成小敌机
         * 12 - 19生成大敌机
         */
        if (type < 5 ) {
            return new Bee();
        } else if (type < 12) {
            return new Airplane();
        } else {
            return new BigAirplane();
        }
    }

    /**
     * 敌人入场计数器
     */
    int enterindex = 0;

    /**
     * 每10毫秒走一次
     */
    public void enterAction() {
        enterindex++;
        /**
         * 每400（40 * 10）毫秒调用下一个敌机
         */
        if (enterindex % 40 == 0) {
            FlyingObject flyingObject = nextOne();
            /**
             * 每增加一个对象扩容一个
             */
            enemies = Arrays.copyOf(this.enemies, this.enemies.length + 1);
            enemies[enemies.length - 1] = flyingObject;

        }
    }
    /**
     * 画图像
     * @param graphics 画笔
     */
    @Override
    public void paint(Graphics graphics){
        sky.paintObject(graphics);
        hero.paintObject(graphics);
        for(int i = 0;i < enemies.length; i++){
            enemies[i].paintObject(graphics);
        }
        for(int i = 0;i < bullets.length; i++){
            bullets[i].paintObject(graphics);
        }
    }

    private void action() {
        Timer timer = new Timer();
        int intervel = 10;
        /**
         * 一个类的只使用一次，则可以实现一个匿名内部类
         */
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                enterAction();
                repaint();
            }
        }, intervel, intervel);
    }
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        World world = new World();
        jFrame.add(world);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        //如果组件当前未显示,或者为null,则此窗口将会显示在屏幕的中央
        jFrame.setLocationRelativeTo(null);
        //是否可见、调用paint方法(上面重写的方法)
        jFrame.setVisible(true);
        world.action();
    }
}
