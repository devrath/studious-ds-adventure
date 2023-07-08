package arrays;

public class Demo {

    public static void main(String[] args){

        CustomArray array = new CustomArray(5);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);
        array.insert(60);

        array.printElements();
        array.reverseArray();
        array.printElements();

    }


}
