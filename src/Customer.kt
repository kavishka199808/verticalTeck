import org.json.JSONObject

object Customer {
    fun getcusdetails(responseBody: String?): String? {
        val json_object = JSONObject(responseBody)
        val queryResponse = json_object.getJSONObject("QueryResponse")
        val data = queryResponse.getJSONArray("Data")
        for (i in 0 until data.length()) {
            val getdata = data.getJSONObject(i)

            //Customer Details------------------------------
            println("-------------------------------")
            println("Customer Details" + (i + 1))
            print("Title : ")
            val title = getdata.getString("Title")
            println(title)
            print("Given Name : ")
            val givenname = getdata.getString("GivenName")
            println(givenname)
            print("Middle Name : ")
            val middleame = getdata.getString("MiddleName")
            println(middleame)
            print("Family Name : ")
            val familyname = getdata.getString("FamilyName")
            println(familyname)
            print("Id : ")
            val id = getdata.getString("Id")
            println(id)
            print("Acive : ")
            val active = getdata.getBoolean("Active")
            println(active)
            print("Sysnc Token : ")
            val synctoken = getdata.getInt("SyncToken")
            println(synctoken)
            print("Full Name : ")
            val fullname = getdata.getString("FullName")
            println(fullname)
        }
        return null
    }
}