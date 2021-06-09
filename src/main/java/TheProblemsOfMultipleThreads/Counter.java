package TheProblemsOfMultipleThreads;

/*The code in the add() method is not executed as a single atomic instruction
by the Java virtual machine. Rather it is executed as a set of smaller instructions,
similar to this:
1 Read this.count from memory into a register.
2 Add value to register.
3 Write register to memory.*/
public class Counter {
    protected long count = 0;

    public void add(long value) {
        this.count = this.count + value;
    }

}
