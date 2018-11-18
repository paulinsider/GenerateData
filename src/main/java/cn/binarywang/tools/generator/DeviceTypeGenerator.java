package cn.binarywang.tools.generator;

import cn.binarywang.tools.generator.base.GenericGenerator;
import org.apache.commons.lang3.RandomUtils;

public class DeviceTypeGenerator extends GenericGenerator {
    private static DeviceTypeGenerator instance = new DeviceTypeGenerator();

    private DeviceTypeGenerator() {

    }

    public static DeviceTypeGenerator getInstance() { return instance; }

    private String DEVICE_LIST[] = {"Phone", "PC", "Android", "iphone", "Laptop", "NS", "TV", "IOT"};

    private String BRAND_LIST[] = {"OPPO", "VIVO", "HUAWEI", "SAMSUNG", "ONEPLUS", "APPLE", "XIAOMI", "HONOR", "LENOVO", "MOTO", "ZTE", "NUBIA", "Smartisan", "360", "Sharp", "Meitu", "NOKIA", "8848", "GOOGLE", "LG", "SONY", "RAZER", "ZUK", "ROG", "HTC", "GNOME", "MEIZU"};

    private String OS_LIST[] = {"Android1.0", "Android1.1", "Android1.5", "Android1.6", "Android2.0", "Android2.1", "Android2.2", "Android2.3", "Android3.0", "Android3.1", "Android3.2", "Android4.0", "Android4.1", "Android4.2", "Android4.3", "Android4.4", "Android5.0", "Android5.1", "Android6.0", "Android7.0", "Android8.0", "Android9.0", "IOS3.0", "IOS4.0", "IOS5.0", "IOS6.0", "IOS7", "IOS8", "IOS9", "IOS10", "IOS11", "IOS12", "WP7.5", "WP8", "WP9", "Firefox", "BBOS", "Symbian"};

    private String MODEL_LIST[] = {"iphone3G", "iphone3Gs", "iphone4", "iphone4s", "iphone5", "iphone5s", "iphone6", "iphone6sp", "iphone7", "iphone7p", "iphone8", "iphone8p", "iphoneX", "iphone5c", "iphoneSE", "iphoneXS", "iphoneXR", "iphoneXS MAX", "MI1", "MI1S", "MI2", "MI2S", "MI3", "MI4", "MI5", "MI6", "MI8", "MI5S", "MI6A", "MI6X", "MI8SE", "MIX1", "MIX2", "MIX3", "MIX2S"};
    @Override
    public String generate(){
        int length = DEVICE_LIST.length;
        return DEVICE_LIST[RandomUtils.nextInt(0, length)];
    }

    public String generateBrand() {
        int length = BRAND_LIST.length;
        return BRAND_LIST[RandomUtils.nextInt(0, length)];
    }

    public String generateOS() {
        int length = OS_LIST.length;
        return OS_LIST[RandomUtils.nextInt(0, length)];
    }

    public String generateModel() {
        int length = MODEL_LIST.length;
        return MODEL_LIST[RandomUtils.nextInt(0, length)];
    }
}
