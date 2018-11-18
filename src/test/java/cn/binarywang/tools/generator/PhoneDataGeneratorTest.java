package cn.binarywang.tools.generator;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.RandomUtils;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

public class PhoneDataGeneratorTest {

    @Test
    public void testGenerate(){
        String fileName1 = "phone1.csv";
        String fileName2 = "phone2.csv";
        String fileName3 = "phone3.csv";
        List<HashMap<String, Object>> data1 = Lists.newArrayList();
        List<HashMap<String, Object>> data2 = Lists.newArrayList();
        List<HashMap<String, Object>> data3 = Lists.newArrayList();
        for (int i = 0; i < 100; i++) {
            String MacAdress = MACAdressGenerator.getInstance().generate();
            String DeviceLon = JingWeiNumberGenerator.getInstance().generate("Lon");
            String DeviceLat = JingWeiNumberGenerator.getInstance().generate("Lat");
            String StartTime = TimestampGenerator.getInstance().generate();
            String EndTime = Long.toString(Long.parseLong(StartTime) + RandomUtils.nextLong(10, 10000));
            String CaptureTime = Long.toString(RandomUtils.nextLong(Long.parseLong(StartTime), Long.parseLong(EndTime)));
            String DeviceType = DeviceTypeGenerator.getInstance().generate();
            String Name = ChineseNameGenerator.getInstance().generate();
            String ID = ChineseIDCardNumberGenerator.getInstance().generate();
            String PhoneNumber = ChineseMobileNumberGenerator.getInstance().generate();
            String IMEI = IMEINumberGenerator.getInstance().generate();
            String IMSI = IMEINumberGenerator.getInstance().generate();
            String Brand = DeviceTypeGenerator.getInstance().generateBrand();
            String OS = DeviceTypeGenerator.getInstance().generateOS();
            String Model = DeviceTypeGenerator.getInstance().generateModel();
            data1.add(i, new HashMap<>(ImmutableMap.<String, Object> of("1", PhoneNumber, "2", MacAdress, "3", Name, "4", ID, "5", DeviceLon)));
            data2.add(i, new HashMap<>(ImmutableMap.<String, Object> of("1", DeviceLat, "2", IMEI, "3", IMSI, "4", Brand, "5", Model)));
            data3.add(i, new HashMap<>(ImmutableMap.<String, Object> of("1", OS)));
        }
        CSVFileGenerator.generate(data1, new String[] { "1", "2", "3", "4", "5" },
            fileName1);
        CSVFileGenerator.generate(data2, new String[] { "1", "2", "3", "4", "5" },
            fileName2);
        CSVFileGenerator.generate(data3, new String[] { "1" },
            fileName3);
    }
}
