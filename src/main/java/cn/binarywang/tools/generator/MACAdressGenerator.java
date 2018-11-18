package cn.binarywang.tools.generator;

import cn.binarywang.tools.generator.base.GenericGenerator;
import org.apache.commons.lang3.RandomUtils;

public class MACAdressGenerator extends GenericGenerator {
    private static MACAdressGenerator instance = new MACAdressGenerator();
    private MACAdressGenerator(){

    }
    public static MACAdressGenerator getInstance() { return instance; }
    static String MAC_LETTER[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };

    @Override
    public String generate() {
        int now = 0;
        String result = "";
        for (int i=0; i<12 ; i++) {
            if (i == 1) {
                //第二位必须是偶数
                result += MAC_LETTER[RandomUtils.nextInt(0, 6) * 2];
            } else {
                result += MAC_LETTER[RandomUtils.nextInt(0, 12)];
            }

            if (i % 2 == 1 && i != 11) {
                result += '-';
            }
        }
        return result;
    }
}
