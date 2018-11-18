package cn.binarywang.tools.generator;

import cn.binarywang.tools.generator.base.GenericGenerator;
import org.apache.commons.lang3.RandomUtils;


public class IMEINumberGenerator extends GenericGenerator {
    private static IMEINumberGenerator instance = new IMEINumberGenerator();

    private IMEINumberGenerator(){

    }

    public static IMEINumberGenerator getInstance() { return instance; }

    @Override
    public String generate() {
        String res = "";
        String num[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int check = 0;
        for(int i=0; i < 14; i++){
            int tmp = RandomUtils.nextInt(0, 10);
            if (i % 2 == 1) {
                check += tmp;
            } else {
                check += tmp * 2;
            }
            res += num[tmp];
        }
        return res += num[(10 - (check % 10)) % 10];
    }
}
