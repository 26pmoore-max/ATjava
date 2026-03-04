
public class PartB {
    public static void main(String[] args) {
        Item myItem = new Item();
        System.out.println("Before: " + myItem.getValue());
        myItem.setValue(13);
        System.out.println("After: " + myItem.getValue());
    }
}

class Item {
    private int value;

    public void setValue(int value) {
        this.value = value; 
    }
    public int getValue() {
        return value;
    }
}

// original output Before: 0. After: 0

// modified output would Before: 0. After: 13
// Change the setValue method to use this.value = value; so that the instance variable is updated instead of assigning the parameter to itself.