package cn.epochong.shoot;

<<<<<<< HEAD
import java.awt.*;
import java.awt.image.BufferedImage;

=======
>>>>>>> 39406e3236669481cae0bfa1cc325eb0f540c8dc
/**
 * @author wangchong
 * @date 2019/6/25 10:02
 * @email 876459397@qq.com
 * @blog epochong.github.io
 * @describe 天空
 */
public class Sky extends FlyingObject{

<<<<<<< HEAD
    private int speed;
    /**
     * 第二章张图片的y坐标
     */
    private int y1;
    public Sky() {
        super(World.FRAME_WIDTH, World.FRAME_HEIGHT,0,0);
        speed = 1;
        y1 = -700;
    }

    /**
     * &#x5929;&#x7a7a;&#x79fb;&#x52a8;
     */
    @Override
    public void step() {
        System.out.println("天空的y坐标向下移动了" + speed);
    }

    @Override
    public BufferedImage getImage() {
        return Images.background;
    }

    @Override
    public void paintObject(Graphics graphics) {
        graphics.drawImage(this.getImage(),this.x,this.y,null);
        graphics.drawImage(this.getImage(),this.x,this.y1,null);
    }
=======
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
>>>>>>> 39406e3236669481cae0bfa1cc325eb0f540c8dc
}
