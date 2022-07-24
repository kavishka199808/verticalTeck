import org.json.JSONObject

object Phone {
    fun getphone(responseBody: String?): String? {
        val json_object = JSONObject(responseBody)
        val queryResponse = json_object.getJSONObject("QueryResponse")
        val data = queryResponse.getJSONArray("Data")
        for (i in 0 until data.length()) {
            println("--------------------------------------------------")
            val getdata = data.getJSONObject(i)


            //Phone Number--------------------------------
            println("Phone Number Customer" + (i + 1))
            val pnum = getdata.getJSONObject("PrimaryPhone")
            println(pnum["FreeFormNumber"])
        }
        println("--------------------------------------------------")
        return null
    }
}