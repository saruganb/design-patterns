public class Singleton {
    // used to indicate that a variable's value can be modified by different threads.
    // Used with the syntax, volatile dataType variableName = x;
    // It ensures that changes made to a volatile variable by one thread are immediately visible to other threads.
    private static volatile Singleton instance;
    private String data;

    private Singleton(String data){
        this.data = data;
    }

    // This code will prevent multi-threads to not create multiple instance by forcing the creation
    // to be synchronized. And the extra check for instance == null, assures that a waiting thread first
    // checks if some other thread hasn't created the instance while it waited.
    public static Singleton getInstance(String data) {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton(data);
                }
            }
        }

        return instance;
    }
}
