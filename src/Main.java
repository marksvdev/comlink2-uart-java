import decoding.Commands;
import decoding.Lib;

/**
 * Created by marksv on 24/10/14.
 */
public class Main {

    public static void main(String[] args) {

        //region productinfo
        byte[] data_productInfo = { 1, 85, 0, 10, 15, 0, 0, 0, 1, 67, 111, 109, 76, 105, 110, 107, 32, 73, 73, 1, 16, 2, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };



        String result_productinfo = Commands.decodeProductInfo(data_productInfo).toString();

        System.out.println(result_productinfo);
        System.out.println("==============================");
        //endregion

        //region status
        byte[] data_status = { 1, 85, 0, 0, 2, 0, 0, 0, 5, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        String result_status = Commands.decodeStatus(data_status).toString();

        System.out.println(result_status);
        System.out.println("==============================");
        //endregion


//        byte[] foobar = {0x01, 0x02, 0x03, 0x04, 0x05, 0x06};
//        int result = Lib.CRC8(foobar);
//        System.out.println(result);

    }
}
