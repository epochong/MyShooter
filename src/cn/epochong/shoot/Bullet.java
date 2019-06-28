package cn.epochong.shoot;

<<<<<<< HEAD
import java.awt.image.BufferedImage;

=======
>>>>>>> 39406e3236669481cae0bfa1cc325eb0f540c8dc
/**
 * @author wangchong
 * @date 2019/6/25 10:02
 * @email 876459397@qq.com
 * @blog epochong.github.io
 * @describe 子弹
 */
public class Bullet extends FlyingObject{

    /**
     * 移动速度
     */
<<<<<<< HEAD
    private int speed;
=======
    int speed;
>>>>>>> 39406e3236669481cae0bfa1cc325eb0f540c8dc

    public Bullet(int x, int y) {
        super(8,20,x,y);
        speed = 3;

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
     * 子弹移动
     */

    @Override
<<<<<<< HEAD
    public void step() {

    }

    @Override
    public BufferedImage getImage() {
        if (isAlive()) {
            return Images.bullet;
        } else if (isDead()) {
            state = REMOVE;
        }
        /**
         * 死了和删除都没有图片
         */
        return null;
    }

=======
    void step() {

    }
>>>>>>> 39406e3236669481cae0bfa1cc325eb0f540c8dc
}
