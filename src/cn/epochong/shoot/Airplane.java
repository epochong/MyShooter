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
 * @describe
 */
public class Airplane extends FlyingObject{

    /**
     * 移动速度
     */
<<<<<<< HEAD
    private int speed;
=======
    int speed;
>>>>>>> 39406e3236669481cae0bfa1cc325eb0f540c8dc

    public Airplane() {
        super(48,50);
        speed = 2;
    }

    /**
     * 小敌机移动
     */
    @Override
<<<<<<< HEAD
    public void step() {
        System.out.println("小敌机的y坐标向下移动了," + speed);
    }

    /**
     * 爆照图片的下标从1开始
     */
    int index = 1;
    @Override
    public BufferedImage getImage() {
        if (isAlive()) {
            return Images.airplanes[0];
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
        System.out.println("小敌机的y坐标向下移动了," + speed);
    }
>>>>>>> 39406e3236669481cae0bfa1cc325eb0f540c8dc
}
