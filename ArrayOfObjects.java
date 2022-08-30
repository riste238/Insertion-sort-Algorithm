public class ArrayOfObjects {
    private Person[] a;
    private int elements;
    public ArrayOfObjects(int lengthOfArr){
       a = new Person[lengthOfArr];
       elements = 0;
    }
    public void insert(String last,String first, int age){
       a[elements] = new Person(last,first,age);
       elements++;
    }
    public void display(){
        for (int j = 0; j<elements; j++)
            a[j].displayPerson();
            System.out.println("");
    }
        public void insertSort(){
        int out,in;
        for (out = 1; out<elements; out++){
            Person temp = a[out];
            in = out;
            while(in > 0 && a[in-1].getLastname().compareTo(temp.getLastname()) > 0){
                a[in] = a[in-1];
                --in;
            }
            a[in] = temp;
        }
        }
}
