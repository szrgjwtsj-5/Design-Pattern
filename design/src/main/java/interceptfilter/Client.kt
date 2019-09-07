package interceptfilter

class Client {
    private var filterManager: FilterManager? = null

    fun setFilterManager(filterManager: FilterManager) {
        this.filterManager = filterManager
    }

    fun sendRequest(request: String) {
        filterManager?.filterRequest(request)
    }
}

fun main() {
    val filterManager = FilterManager(Target()).apply {
        setFilter(AuthenticationFilter())
        setFilter(DebugFilter())
    }

    val client = Client().apply { setFilterManager(filterManager) }

    client.sendRequest("what the fuck")
}