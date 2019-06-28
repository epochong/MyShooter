package cn.epochong.shoot;

<<<<<<< HEAD
import java.awt.image.BufferedImage;

=======
>>>>>>> 39406e3236669481cae0bfa1cc325eb0f540c8dc
/**
 * @author wangchong
 * @date 2019/6/25 10:01
 * @email 876459397@qq.com
 * @blog epochong.github.io
 * @describe
 */
public class Hero extends FlyingObject{

    /**
     * 生命
     */
<<<<<<< HEAD
    private int life;
    /**
     * 火力值
     */
    private int doubleFire;
=======
    int life;
    /**
     * 火力值
     */
    int doubleFire;
>>>>>>> 39406e3236669481cae0bfa1cc325eb0f540c8dc

    public Hero() {
        super(97,139,140,400);
        /**
         * 初始值3条命
         */
        life = 3;
        doubleFire = 0;
    }

    /**
     * 英雄机随之鼠标移动
     * @param x x坐标
     * @param y y坐标
     */
    void moveTo(int x, int y) {
        System.out.println("英雄机随着鼠标移动");
    }


    /**
     * 英雄机切换图片
     */
    @Override
<<<<<<< HEAD
    public void step() {
        System.out.println("英雄机切换了图片");
    }
    /**
     * 英雄机下标从0开始
     */
    int index = 0;
    @Override
    public BufferedImage getImage() {

        if (isAlive()) {
            /**
             * 取余划分
             */
            return Images.heros[index++ % Images.heros.length];
        }
        return null;

=======
    void step() {
        System.out.println("英雄机切换了图片");
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getDoubleFire() {
        return doubleFire;
    }

    public void setDoubleFire(int doubleFire) {
        this.doubleFire = doubleFire;
>>>>>>> 39406e3236669481cae0bfa1cc325eb0f540c8dc
    }
}
