package cn.epochong.shoot;

import java.util.Random;

/**
 * @author wangchong
 * @date 2019/6/26 9:31
 * @email 876459397@qq.com
 * @blog epochong.github.io
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
        x = random.nextInt(400 - this.width);
        //负的敌人的高
        y = -this.height;
    }

    /**
     * 英雄机,子弹,天空的构造方法
     * @param height 高度
     * @param width 宽度
     * @param x x坐标
     * @param y y坐标
     */
    public FlyingObject(int height, int width, int x, int y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    /**
     * 移动速度
     */

    void step() {
        System.out.println("飞行物移动");
    }
}
