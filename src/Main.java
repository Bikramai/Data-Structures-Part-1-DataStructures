//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}

// What is Big-O?
// To describe the performance of an algorithm.

// What does this have to do with data structures?
// Certain, operations can be more or less costly depending on what data structure we use.

// For example,
// accessing an arrays element by it's index is Super fast. But arrays have a fixed length and
// if you want to constantly add or remove items, they have to get resized and this will get
// costly as the size of our input grows very large. So, if that's what we need to do.
// Then we have to use another data structure called a Link list. These data structures can grow
// or shrink very quickly but accessing a link list element by its index is slow. So that's
// why we need to learn about the Big-O Notation first, before we can talk about various data structures.

// Also, big companies like Google, Microsoft and Amazon, are always asking about Big-O, coz they want to
// know if you really understand how scalable an algorithm really is.

// And finally, knowing Big-O will make you a better developer or software engineer.
