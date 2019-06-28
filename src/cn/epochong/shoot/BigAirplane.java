package cn.epochong.shoot;

<<<<<<< HEAD
import java.awt.image.BufferedImage;
=======
import java.util.Random;
>>>>>>> 39406e3236669481cae0bfa1cc325eb0f540c8dc

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
<<<<<<< HEAD
    private int speed;
=======
    int speed;
>>>>>>> 39406e3236669481cae0bfa1cc325eb0f540c8dc

    public BigAirplane() {
        super(66,99);
        speed = 2;
    }

<<<<<<< HEAD
=======
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

>>>>>>> 39406e3236669481cae0bfa1cc325eb0f540c8dc
    /**
     * 大敌机移动
     */
    @Override
<<<<<<< HEAD
    public void step() {
        System.out.println("大敌机y坐标向下移动了" + speed);
    }
    /**
     * 爆照图片的下标从1开始
     */
    int index = 1;
    @Override
    public BufferedImage getImage() {
        if (isAlive()) {
            return Images.bigAirplanes[0];
        } else if (isDead()) {
            /**
             * 死亡状态
             */
            BufferedImage image = Images.airplanes[index++];
            /**
             * index达到最大值要删除对象
             */
            if (index == Images.airplanes.length) {
                state = REMOVE;
            }
            return image;
        }
        /**
         * 删除状态,直接返回null
         */
        return null;
    }
=======
    void step() {
        System.out.println("大敌机y坐标向下移动了" + speed);
    }
>>>>>>> 39406e3236669481cae0bfa1cc325eb0f540c8dc
}
