package cn.epochong.shoot;

import java.awt.image.BufferedImage;

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
    private int life;
    /**
     * 火力值
     */
    private int doubleFire;

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

    }
}
