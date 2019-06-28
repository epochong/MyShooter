package cn.epochong.shoot;

import java.awt.image.BufferedImage;
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
    private int xSpeed;
    /**
     * y坐标移动速度
     */
    private int ySpeed;
    /**
     * 奖励类型
     */
    private int awardType;

    public Bee() {
        super(60,51);
        xSpeed = 1;
        ySpeed = 2;
        Random random = new Random();
        /**
         * 0,1随机值
         */
        awardType = random.nextInt(2);
    }

    /**
     * 小蜜蜂移动
     */

    @Override
    public void step() {
        System.out.println("小蜜蜂的x坐标移动了" + xSpeed + ",小蜜蜂的y坐标移动了" + ySpeed);
    }
    /**
     * 爆照图片的下标从1开始
     */
    int index = 1;
    @Override
    public BufferedImage getImage() {
        if (isAlive()) {
            return Images.bees[0];
        } else if (isDead()) {
            /**
             * 死亡状态
             */
            BufferedImage image = Images.bees[index++];
            /**
             * index达到最大值要删除对象
             */
            if (index == Images.bees.length) {
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
