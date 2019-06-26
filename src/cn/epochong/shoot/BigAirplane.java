package cn.epochong.shoot;

import java.util.Random;

/**
 * @author wangchong
 * @date 2019/6/25 10:02
 * @email 876459397@qq.com
 * @blog epochong.github.io
 * @describe 大敌机
 */
public class BigAirplane extends FlyingObject{

    /**
     * 移动速度
     */
    int speed;

    public BigAirplane() {
        super(66,99);
        speed = 2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * 大敌机移动
     */
    @Override
    void step() {
        System.out.println("大敌机y坐标向下移动了" + speed);
    }
}
