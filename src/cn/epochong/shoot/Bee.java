package cn.epochong.shoot;

import java.util.Random;

/**
 * @author wangchong
 * @date 2019/6/25 10:02
 * @email 876459397@qq.com
 * @blog epochong.github.io
 * @describe
 */
public class Bee extends FlyingObject{

    /**
     * x坐标移动速度
     */
    int xSpeed;
    /**
     * y坐标移动速度
     */
    int ySpeed;
    /**
     * 奖励类型
     */
    int awardType;

    public Bee() {
        super(60,511);
        xSpeed = 1;
        ySpeed = 2;
        Random random = new Random();
        /**
         * 0,1随机值
         */
        awardType = random.nextInt(2);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public int getAwardType() {
        return awardType;
    }

    public void setAwardType(int awardType) {
        this.awardType = awardType;
    }

    /**
     * 小蜜蜂移动
     */

    @Override
    void step() {
        System.out.println("小蜜蜂的x坐标移动了" + xSpeed + ",小蜜蜂的y坐标移动了" + ySpeed);
    }
}
