package cn.epochong.shoot;

import java.awt.image.BufferedImage;

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
    private int speed;

    public BigAirplane() {
        super(66,99);
        speed = 2;
    }

    /**
     * 大敌机移动
     */
    @Override
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
}
