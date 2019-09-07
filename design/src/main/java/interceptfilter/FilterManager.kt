package interceptfilter

class FilterManager {
    private val filterChain: FilterChain = FilterChain()

    constructor(target: Target) {
        filterChain.setTarget(target)
    }

    fun setFilter(filter: Filter) {
        filterChain.addFilter(filter)
    }

    fun filterRequest(request: String) {
        filterChain.execute(request)
    }
}