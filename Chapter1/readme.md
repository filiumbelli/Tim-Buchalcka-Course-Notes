# Stream

- There are two types of streams in java.
- Sequential
    * Sequential stream runs on the thread it is assigned. I.e main thread
    * Synchronized event action
- Parallel
    * Parallel runs on multiple threads.
    * Asynchronized (concurrent)
    * Parallel streams create ForkJoinPool instance via static ForkJoinPool.commonPool() method
- A stream seems superficially similar to a collection, allowing you to transform and retrieve data
- Streams doesnot store its elements. They can be stored in an underlying collections.
- Stream operations don't mutate their source. Filter method will not mutate anything of the source.
- Stream operations are lazy when possible. This means they are not executed until their result is needed. If a condition is attached to a filter method, it will stop filtering when it matches the condition.
- filter method returns another stream with matching conditions. count method reduces that stream to a result.

# Workflow of Streams
- Create a stream.
- Specify intermediate operations for transformating the initial stream into others. It is possible to have multiple steps.
- Apply a terminal operation to produce a result.

# Stream Creation
- If you have an array, Stream.of method is usefull
- .of -> yields a stream whose elements are the given values
- .empty -> yields a stream with no elements
- .generate(Supplier< T >s) -> yields an inifinite stream whose elements are constructed by repeatedly invoking the function s->Supplier.
- iterate-> yield an inifinite stream whose elements are seed....
- lines-> yields a stream whose elements are the lines of the specified file
- get -> supplies a value

# Filter,map & flatMap Methods
- filter -> yields a stream containing the elements of this stream that fulfill the predicate
- map -> yields a stream containing the results of applying mapper to the elements of this stream
- flatMap -> yields a stream obtained by concatenating the results of applying mapper to the elements of this stream



# Stream methods that returns Optional

- Optional<T> max(Comparator<? super T> comparator)
- Optional<T> min(Comparator<? super T> comparator)
yields a maximum or minimum element of this stream, using the ordering defined
by the given comparator, or an empty Optional if this stream is empty. These are
terminal operations.
- Optional<T> findFirst()
- Optional<T> findAny()
yields the first, or any, element of this stream, or an empty Optional if this stream is
empty. These are terminal operations.
- boolean anyMatch(Predicate<? super T> predicate)
- boolean allMatch(Predicate<? super T> predicate)
- boolean noneMatch(Predicate<? super T> predicate)
returns true if any, all, or none of the elements of this stream match the given
predicate. These are terminal operations.

# How to work with Optional
- T orElse(T other)
yields the value of this Optional, or other if this Optional is empty.
- T orElseGet(Supplier<? extends T> other)
yields the value of this Optional, or the result of invoking other if this Optional is empty.
- <X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier)
yields the value of this Optional, or throws the result of invoking exceptionSupplier if
this Optional is empty.
- void ifPresent(Consumer<? super T> consumer)
if this Optional is nonempty, passes its value to consumer.
- <U> Optional<U> map(Function<? super T,? extends U> mapper)
yields the result of passing the value of this Optional to mapper, provided this Optional
is nonempty and the result is not null, or an empty Optional otherwise.
