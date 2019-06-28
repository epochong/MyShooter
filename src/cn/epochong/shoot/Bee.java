package cn.epochong.shoot;

<<<<<<< HEAD
import java.awt.image.BufferedImage;
=======
>>>>>>> 39406e3236669481cae0bfa1cc325eb0f540c8dc
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
<<<<<<< HEAD
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
=======
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
>>>>>>> 39406e3236669481cae0bfa1cc325eb0f540c8dc
        xSpeed = 1;
        ySpeed = 2;
        Random random = new Random();
        /**
         * 0,1随机值
         */
        awardType = random.nextInt(2);
    }

<<<<<<< HEAD
=======
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

>>>>>>> 39406e3236669481cae0bfa1cc325eb0f540c8dc
    /**
     * 小蜜蜂移动
     */

    @Override
<<<<<<< HEAD
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
=======
    void step() {
        System.out.println("小蜜蜂的x坐标移动了" + xSpeed + ",小蜜蜂的y坐标移动了" + ySpeed);
    }
>>>>>>> 39406e3236669481cae0bfa1cc325eb0f540c8dc
}
