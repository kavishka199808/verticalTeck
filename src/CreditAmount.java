import org.json.JSONArray;
import org.json.JSONObject;

public class CreditAmount {
    public static String getcreditamount(String responseBody) {


        JSONObject json_object = new JSONObject(responseBody);
        JSONObject queryResponse = json_object.getJSONObject("QueryResponse");
        JSONArray data = queryResponse.getJSONArray("Data");

        for(int i = 0 ; i< data.length();i++) {
            JSONObject getdata = data.getJSONObject(i);

            //Credit Amount-------------------------------
            System.out.println("Credit Amount Customer"+(i+1));

            System.out.print("Current CreditAmount : ");
            JSONObject camount = getdata.getJSONObject("CreditAmount");
            System.out.println(camount.get("Current"));
        }
        System.out.println("--------------------------------------------------");

        return  null;
    }
}
