import Customer.getcusdetails
import MetaData.getmetadata
import Phone.getphone
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val client = HttpClient.newHttpClient()
        val request = HttpRequest.newBuilder()
            .uri(URI.create("https://90a18ddb-9760-4e3b-ab69-fa92c977a4b5.mock.pstmn.io/customer/all")).build()
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
            .thenApply { obj: HttpResponse<String?> -> obj.body() }
            .thenApply { obj: String? -> Parse(responseBody = obj) }
            .join()
    }

    fun Parse(responseBody: String?): String? {
        getcusdetails(responseBody)
        getphone(responseBody)
        BillAddress.getBillAddress(responseBody)
        CreditAmount.getcreditamount(responseBody)
        getmetadata(responseBody)
        return null
    }
}