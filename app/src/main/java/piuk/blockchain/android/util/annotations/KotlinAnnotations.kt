package piuk.blockchain.android.util.annotations

/**
 * This annotation is used both to "open" a class that is otherwise final by default (as is the case
 * with all Kotlin classes) and signify that the class is able to be mocked for testing classes
 * which depend on the annotated class.
 */
annotation class Mockable