import org.json.JSONObject

object MetaData {
    fun getmetadata(responseBody: String?): String? {
        val json_object = JSONObject(responseBody)
        val queryResponse = json_object.getJSONObject("QueryResponse")
        val data = queryResponse.getJSONArray("Data")
        for (i in 0 until data.length()) {
            val getdata = data.getJSONObject(i)
            //Meta Data -------------------------------
            println("Meta Data Customer " + (i + 1))
            val metadata = getdata.getJSONObject("MetaData")
            print("Create Time :")
            println(metadata["CreateTime"])
            print("Last Update Time :")
            println(metadata["LastUpdatedTime"])
        }
        return null
    }
}