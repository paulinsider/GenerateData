package cn.binarywang.tools.generator;

import cn.binarywang.tools.generator.base.GenericGenerator;

import java.math.BigDecimal;
import java.util.Random;

public class JingWeiNumberGenerator extends GenericGenerator {
    private static JingWeiNumberGenerator instance = new JingWeiNumberGenerator();
    private JingWeiNumberGenerator(){

    }
    public static JingWeiNumberGenerator getInstance() { return instance; }
    int MinLon = 100, MaxLon = 115, MinLat = 25, MaxLat = 40;

    public String generate() {
        Random random = new Random();
        BigDecimal db = new BigDecimal(Math.random() * (MaxLon - MinLon) + MinLon);
        String lon = db.setScale(6, BigDecimal.ROUND_HALF_UP).toString();// 小数后6位
        db = new BigDecimal(Math.random() * (MaxLat - MinLat) + MinLat);
        String lat = db.setScale(6, BigDecimal.ROUND_HALF_UP).toString();
        return lon + ',' + lat;
    }
    public String generate(String type) {
        Random random = new Random();
        BigDecimal db = new BigDecimal(Math.random() * (MaxLon - MinLon) + MinLon);
        String lon = db.setScale(6, BigDecimal.ROUND_HALF_UP).toString();// 小数后6位
        db = new BigDecimal(Math.random() * (MaxLat - MinLat) + MinLat);
        String lat = db.setScale(6, BigDecimal.ROUND_HALF_UP).toString();
        if (type.equals("Lon")) {
            return lon;
        } else {
            return lat;
        }
    }
}
