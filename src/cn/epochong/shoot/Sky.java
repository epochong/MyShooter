package cn.epochong.shoot;

/**
 * @author wangchong
 * @date 2019/6/25 10:02
 * @email 876459397@qq.com
 * @blog epochong.github.io
 * @describe 天空
 */
public class Sky extends FlyingObject{

    int speed;
    /**
     * 第二章张图片的y坐标
     */
    int y1;
    public Sky() {
        super(400,700,0,0);
        speed = 1;
        y1 = -700;

    }

    /**
     * 天空移动
     */
    @Override
    void step() {
        System.out.println("天空的y坐标向下移动了" + speed);
    }
}
