package Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class base_arrayList_shradhha {
    public static void main(String[] args) {
        //implementation of arrayList and its various functions
        ArrayList<Integer> OGList = new ArrayList<>();
        //Adding elements
        OGList.add(0);
        OGList.add(45);
        System.out.println(OGList);
        //Getting elements
         int element= OGList.get(0);
        System.out.println(element);

        //Adding elements in between
        OGList.add(2,56);
        System.out.println(OGList);

        //Set elements--changing a current existing element
        OGList.set(0,34);
        System.out.println(OGList);

        //DELETE ELEMENT/remove --deleting an element from any particular index
        OGList.remove(1);
        System.out.println(OGList);

        //SIZE --getting the size of arraylist
         int finalSize=OGList.size();
        System.out.println(finalSize);

        //running loops in arrayList
        for(int i=0;i<OGList.size();i++) System.out.print(OGList.get(i)+ " ");


        //SORT - sorting the elements of an objects of collections class
        Collections.sort(OGList);

    }

}
