import org.json.JSONArray;
import org.json.JSONObject;

public class BillAddress {
    public static String getBillAddress(String responseBody) {

        JSONObject json_object = new JSONObject(responseBody);
        JSONObject queryResponse = json_object.getJSONObject("QueryResponse");
        JSONArray data = queryResponse.getJSONArray("Data");

        for(int i = 0 ; i< data.length();i++) {
            JSONObject getdata = data.getJSONObject(i);

            //Billing Address-----------------------------
            System.out.println("Billing Address Customer"+(i+1));

            JSONObject pbilladdress = getdata.getJSONObject("BillAddr");
            System.out.print("City");
            System.out.println(pbilladdress.get("City"));
            System.out.print("Line1");
            System.out.println(pbilladdress.get("Line1"));

        }
        System.out.println("--------------------------------------------------");

        return  null;
    }
}
