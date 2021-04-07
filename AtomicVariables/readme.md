# Atomic values

- They helps to manage multi threads without suspending.
- Alternative of lock/unlock method.
- They have main methods such as:

    * get() -> Gets the value from the memory
    * set() ->Writes the value to memory,
    * lazySet() -> One use case is nullifying references, for the sake of garbage collection, which is never going to be accessed again.
    * compareAndSet() -> returns true when it succeeds, else false.
    * weakCompareAndSet()
