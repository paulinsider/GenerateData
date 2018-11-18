package cn.binarywang.tools.generator;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.RandomUtils;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

public class NetbarDataGeneratorTest {

    @Test
    public void testGenerate(){
        String fileName = "netbar2.csv";
        List<HashMap<String, Object>> data = Lists.newArrayList();
        for (int i = 0; i < 100; i++) {
            String MacAdress = MACAdressGenerator.getInstance().generate();
            String DeviceLon = JingWeiNumberGenerator.getInstance().generate("Lon");
            String DeviceLat = JingWeiNumberGenerator.getInstance().generate("Lat");
            String StartTime = TimestampGenerator.getInstance().generate();
            String EndTime = Long.toString(Long.parseLong(StartTime) + RandomUtils.nextLong(10, 10000));
            String Name = ChineseNameGenerator.getInstance().generate();
            String ID = ChineseIDCardNumberGenerator.getInstance().generate();
            String PhoneNumber = ChineseMobileNumberGenerator.getInstance().generate();
            data.add(i, new HashMap<>(ImmutableMap.<String, Object> of("1", MacAdress, "2", DeviceLon, "3", DeviceLat)));
            //data.add(i, new HashMap<>(ImmutableMap.<String, Object> of("1", CaptureTime, "2", StartTime, "3", EndTime)));
        }
        CSVFileGenerator.generate(data, new String[] { "1", "2", "3" },
            fileName);
    }
}
