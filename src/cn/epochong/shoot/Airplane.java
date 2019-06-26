package cn.epochong.shoot;

import java.util.Random;

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
    int speed;

    public Airplane() {
        super(48,50);
        speed = 2;
    }

    /**
     * 小敌机移动
     */
    @Override
    void step() {
        System.out.println("小敌机的y坐标向下移动了," + speed);
    }
}
