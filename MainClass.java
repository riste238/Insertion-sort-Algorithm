public class MainClass {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayOfObjects arr;
        arr = new ArrayOfObjects(maxSize);

        arr.insert("Dragic","Dragi", 29);
        arr.insert("Boshev","Riste", 29);
        arr.insert("Mitrev","Viktor", 27);
        arr.insert("Milev","Nikola", 39);
        arr.insert("Simeonovic","Kire", 45);
        arr.insert("Drenov","Miki", 29);
        arr.insert("Simic","Sime", 29);
        arr.insert("Krstev","Dragi", 29);
        arr.insert("Spasev","Spasen", 29);
        arr.insert("Simeonov","Sime", 29);

        System.out.println("Before sorting our list of objects is looking like this");
        arr.display();

        System.out.println("After sorting our list of objects is looking like this");
        arr.insertSort();
        arr.display();

    }
}
