package cn.binarywang.tools.generator;

import cn.binarywang.tools.generator.base.GenericGenerator;
import org.apache.commons.lang3.RandomUtils;

import java.util.Date;


public class TimestampGenerator extends GenericGenerator {
    private static TimestampGenerator instance = new TimestampGenerator();

    private TimestampGenerator(){

    }
    public static TimestampGenerator getInstance() { return instance; }

    long MinTime = 1447744702;
    long MaxTime = (long)(new Date().getTime() / 1000);
    public String generate() {
        return Long.toString(RandomUtils.nextLong(MinTime, MaxTime));
    }
}
