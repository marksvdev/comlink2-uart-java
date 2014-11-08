import decoding.Commands;
import decoding.Lib;

import static decoding.Commands.*;

/**
 * Created by marksv on 24/10/14.
 */
public class Main {

    public static final byte[] ProductInfo = {0x04, 0x00};
    public static final byte[] UsbStats = {0x05, 0x01};
    public static final byte[] SignalStrength = {0x06, 0x00};
    public static final byte[] RadioStats = {0x05, 0x00};
    public static final byte[] Status = {0x03, 0x00};

    public static void main(String[] args) {

//        //region productinfo
//        byte[] data_productInfo = { 1, 85, 0, 10, 15, 0, 0, 0, 1, 67, 111, 109, 76, 105, 110, 107, 32, 73, 73, 1, 16, 2, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
//
//
//
//        String result_productinfo = Commands.decodeProductInfo(data_productInfo).toString();
//
//        System.out.println(result_productinfo);
//        System.out.println("==============================");
//        //endregion
//
//        //region status
//        byte[] data_status = { 1, 85, 0, 0, 2, 0, 0, 0, 5, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
//
//        String result_status = Commands.decodeStatus(data_status).toString();
//
//        System.out.println(result_status);
//        System.out.println("==============================");
//        //endregion
//
//
////        byte[] foobar = {0x01, 0x02, 0x03, 0x04, 0x05, 0x06};
////        int result = Lib.CRC8(foobar);
////        System.out.println(result);

//        byte[] data_productInfo = {0x01, 0x55, 0x00, 0x0a, 0x0f, 0x00, 0x00, 0x00, 0x01, 0x43, 0x6f, 0x6d, 0x4c, 0x69, 0x6e, 0x6b, 20 49 49 01 10 02 00 01 01 03 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00}

        String data_productInfo = "01 55 00 0a 0f 00 00 00 01 43 6f 6d 4c 69 6e 6b 20 49 49 01 10 02 00 01 01 03 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00";
        System.out.println(Commands.decodeProductInfo(toByteArray(data_productInfo)));
        String data_usbStats = "01 55 00 00 00 00 00 00 00 00 0a 00 00 00 0a 00 0b 00 0c 00 0a 04 00 00 05 00 00 00 00 00 00 00 00 01 00 14 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00";
        System.out.println(Commands.decodeInterfaceStats(toByteArray(data_usbStats)));
        String data_signalStrength = "01 55 00 b6 00 00 00 00 00 00 0a 00 00 00 0a 00 0b 00 0c 00 0a 04 00 00 05 00 00 00 00 00 00 00 00 01 00 14 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00";
        System.out.println(Commands.decodeSignal(toByteArray(data_signalStrength)));
        String data_radioStats = "01 55 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 14 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00";
        System.out.println(Commands.decodeInterfaceStats(toByteArray(data_radioStats)));
        String data_status = "01 55 00 00 02 00 00 00 05 04 00 00 00 00 0a 00 0b 00 0c 00 0a 04 00 00 05 00 00 00 00 00 00 00 00 01 00 14 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00";
        System.out.println(Commands.decodeStatus(toByteArray(data_status)));


    }

    public static byte[] toByteArray(String str) {
//        String[] split = str.split(" ");
//        for (int i = 0; i < split.length; i++) {
//            split[i] = "0x"+split[i];
//        }
//        byte[] byteArray = new byte[split.length];

        return hexStringToByteArray(str.replaceAll("\\s+",""));
    }
    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }
}
