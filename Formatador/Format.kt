import java.util.Locale

fun Double.format(digits: Int): String {
    Locale.setDefault(Locale.US)
    return "%.${digits}f".format(this)
}