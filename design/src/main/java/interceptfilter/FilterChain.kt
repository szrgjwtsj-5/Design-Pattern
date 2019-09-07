package interceptfilter

class FilterChain {
    private val filters = arrayListOf<Filter>()
    private var target: Target? = null

    fun addFilter(filter: Filter) {
        filters.add(filter)
    }

    fun execute(request: String) {
        filters.takeIf { it.isNotEmpty() }?.forEach {
            it.execute(request)
        }
        target?.execute(request)
    }

    fun setTarget(target: Target) {
        this.target = target
    }
}