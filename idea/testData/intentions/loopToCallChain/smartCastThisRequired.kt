// WITH_RUNTIME
// IS_APPLICABLE: false
fun Any.foo(list: List<String>): Int? {
    <caret>for (s in list) {
        if (s.length > 0 && this is String) {
            val result = s.length + length
            return result
        }
    }
    return null
}