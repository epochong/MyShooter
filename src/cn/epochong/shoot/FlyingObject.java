package cn.epochong.shoot;

<<<<<<< HEAD
import java.awt.*;
import java.awt.image.BufferedImage;
=======
>>>>>>> 39406e3236669481cae0bfa1cc325eb0f540c8dc
import java.util.Random;

/**
 * @author wangchong
 * @date 2019/6/26 9:31
 * @email 876459397@qq.com
 * @blog epochong.github.io
<<<<<<< HEAD
 * @describe 飞行抽象类
 */
public abstract class FlyingObject {

    /**
     * 活着的状态
     */
    public static final int ALIVE = 0;
    /**
     * 死亡状态
     */
    public static final int DEAD = 1;
    /**
     * 删除的状态
     */
    public static final int REMOVE = 2;
    /**
     * 当前状态 默认为活着的状态
     */
    protected int state = ALIVE;

    /**
     * 对象图片像素的高
     */
    protected int height;

    /**
     * 对象图片像素的宽
     */
    protected int width;
    /**
     * 对象在窗口的横坐标
     */
    protected int x;
    /**
     * 对象在窗口的纵坐标
     */
    protected int y;
=======
 * @describe
 */
public class FlyingObject {

    /**
     * 高
     */
    int height;

    /**
     * 宽
     */
    int width;
    /**
     * 横坐标
     */
    int x;
    /**
     * 纵坐标
     */
    int y;
>>>>>>> 39406e3236669481cae0bfa1cc325eb0f540c8dc

    /**
     * 敌机的构造方法
     * @param width 宽度
     * @param height 高度
     */
    public FlyingObject(int width, int height) {
        this.width = width;
        this.height = height;
        Random random = new Random();
        /**
         * x坐标为(窗口宽度 - 敌人的的宽度)之间的随机数
         */
<<<<<<< HEAD
        x = random.nextInt(World.FRAME_WIDTH - this.width);
        //负的敌人的高
        y = this.height;
        y = 0;
=======
        x = random.nextInt(400 - this.width);
        //负的敌人的高
        y = -this.height;
>>>>>>> 39406e3236669481cae0bfa1cc325eb0f540c8dc
    }

    /**
     * 英雄机,子弹,天空的构造方法
     * @param height 高度
     * @param width 宽度
     * @param x x坐标
     * @param y y坐标
     */
<<<<<<< HEAD
    public FlyingObject(int width, int height, int x, int y) {
=======
    public FlyingObject(int height, int width, int x, int y) {
>>>>>>> 39406e3236669481cae0bfa1cc325eb0f540c8dc
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    /**
     * 移动速度
<<<<<<< HEAD
     * 此处写public访问权限后,子类访问权限必须大于超类的访问权限
     * 默认为default
     */
    public abstract void step();

    /**
     * 获取对象图片
     * @return 对象的图片
     */
    public abstract BufferedImage getImage();
    public boolean isAlive() {
        /**
         * 当前状态为ALIVE表示当前对象是活着的
         */
        return state == ALIVE;
    }
    public boolean isDead() {
        /**
         * 当前状态为DEAD表示当前对象是死亡的
         */
        return state == DEAD;
    }
    public boolean isRemove() {
        /**
         * 当前状态为ALIVE表示当前对象是删除的
         */
        return state == REMOVE;
    }

    /**
     * 画笔、画对象
     * @param graphics 画笔
     */
    public void paintObject(Graphics graphics) {
        graphics.drawImage(this.getImage(),this.x,this.y,null);
    }

=======
     */

    void step() {
        System.out.println("飞行物移动");
    }
>>>>>>> 39406e3236669481cae0bfa1cc325eb0f540c8dc
}
