package cn.epochong.shoot;
/**
 * 存储图片
 */
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author wangchong
 * @date 2019/6/27 9:53
 * @email 876459397@qq.com
 * @blog epochong.github.io
 * @describe 封装图片工具类
 */
public class Images {
    /**
     * 背景图
     */
    public static BufferedImage background;
    /**
     * 子弹图
     */
    public static BufferedImage bullet;
    /**
     * 英雄机
     */
    public static BufferedImage[] heros;
    /**
     * 小敌机图
     */
    public static BufferedImage[] airplanes;
    /**
     * 大敌机图
     */
    public static BufferedImage[] bigAirplanes;
    /**
     * 小蜜蜂图
     */
    public static BufferedImage[] bees;

    /**
     * 初始静态资源
     */
    static {
        background=readImage("background.png");
        bullet=readImage("bullet.png");
        /**
         * 英雄机闪烁图
         * 长短火焰图片切换
         */
        heros=new BufferedImage[2];
        heros[0]=readImage("hero0.png");
        heros[1]=readImage("hero1.png");
        /**
         * 小敌机,大敌机,蜜蜂 原始及爆照图片
         * 4张爆照图 + 自己一张图
         */
        airplanes=new BufferedImage[5];
        bigAirplanes =new BufferedImage[5];
        bees=new BufferedImage[5];
        /**
         * 原始图片初始化
         */
        airplanes[0]=readImage("airplane0.png");
        bigAirplanes[0]=readImage("bigairplane0.png");
        bees[0]=readImage("bee0.png");
        /**
         * 存储公共的爆照图片
         */
        for (int i = 1; i < airplanes.length; i++) {
            airplanes[i]=readImage("bom"+i+".png");
            bigAirplanes[i]=readImage("bom"+i+".png");
            bees[i]=readImage("bom"+i+".png");
        }
    }
    /**
     * 读取图片的方法,因为读取图片的业务反复,会出现代码重发,所以封装成读取图片的方法
     */
    public static BufferedImage readImage(String fileName)  {
        /**
         * 同包下读取图片
         */
        try {
            BufferedImage img = ImageIO.read(FlyingObject.class.getResource(fileName));
            return img;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
