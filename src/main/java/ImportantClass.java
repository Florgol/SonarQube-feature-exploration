public class ImportantClass {

    private ExpensiveClass expensiveClass;

    public ImportantClass(ExpensiveClass expensiveClass) {
        this.expensiveClass = expensiveClass;
    }

    public String importantMethod() {
        // Here we're calling the expensiveMethod from the ExpensiveClass
        String data = expensiveClass.expensiveMethod();

        // Now we can perform some calculation or transformation on the data. 
        // In this simple example, I'm just appending a string.
        String result = data + ", but more important";

        return result;
    }

    
}