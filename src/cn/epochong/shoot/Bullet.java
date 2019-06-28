package cn.epochong.shoot;

import java.awt.image.BufferedImage;

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
    private int speed;

    public Bullet(int x, int y) {
        super(8,20,x,y);
        speed = 3;

    }
    /**
     * 子弹移动
     */

    @Override
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

}
