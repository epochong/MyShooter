package cn.epochong.shoot;
import javax.swing.JFrame;//相框
import javax.swing.JPanel;//相板,面板
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author wangchong
 * @date 2019/6/25 10:06
 * @email 876459397@qq.com
 * @blog epochong.github.io
 * @describe 整个窗口,继承相板
 */
public class World extends JPanel{
    Sky sky;
    Hero hero;
    FlyingObject[] enemies = new FlyingObject[0];
    Bullet[] bullet = {};

    void action() {
        enemies = new FlyingObject[6];
        enemies[0] = new Airplane();
        enemies[1] = new Airplane();
        enemies[2] = new BigAirplane();
        enemies[3] = new BigAirplane();
        enemies[4] = new Bee();
        enemies[5] = new Sky();
        Stream<FlyingObject> stream = Arrays.stream(enemies);
        stream.forEach(i -> i.step());
    }
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        World world = new World();
        jFrame.add(world);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400,700);
        //如果组件当前未显示,或者为null,则此窗口将会显示在屏幕的中央
        jFrame.setLocationRelativeTo(null);
        //是否可见
        jFrame.setVisible(true);
        world.action();
    }
}
