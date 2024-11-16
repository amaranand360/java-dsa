import java.util.ArrayList;
import java.util.Collections;

public class ArrList {
    public static void main(String agrs[]){
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<Datatype_obj> variable_name = new ArrayList<Datatype_obj>();

        list.add(56); //Appends the specified element to the end of this list.
        list.add(89);
        list.add(90);
       
        //Inserts the specified element at the specified position in this list.
        System.out.println(list);
        list.add(0, 78); 
        
        //Replaces the element at the specified position in this list with the specified element.
        list.set(2, 99); 
        System.out.println(list);
        
        list.remove(2);     //Removes the element at the specified position in this list.
        System.out.println(list);

           //Removes the first occurrence of the specified element from this list, if it is present.
        list.remove(Integer.valueOf(78));

           //Removes the first occurrence of the specified element from this list, if it is present.
        list.remove(0);

        list.removeAll(list); //Removes from this list all of its elements that are contained in the specified collection.

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)); //Returns the element at the specified position in this list.
        }

        //Returns the number of elements in this list.
        System.out.println(list.size());
        System.out.println(list.isEmpty()); //Returns true if this list contains no elements.

        //Returns true if this list contains no elements.
        System.out.println(list.isEmpty());

        //Returns an array containing all of the elements in this list in proper sequence (from first to last element).
        Object[] arr = list.toArray();
        for(Object i: arr){
            System.out.println(i);
        }

        //Returns a list iterator over the elements in this list in proper sequence.
        // ListIterator<Integer> itr = list.listIterator();
        // while(itr.hasNext()){    //Returns true if this list iterator has more elements when traversing the list in the forward direction.
        //     System.out.println(itr.next());
        // }

        list.clear(); //Removes all of the elements from this list.

        list.trimToSize(); //Trims the capacity of this ArrayList instance to be the list's current size.

        //Removes all of the elements from this list.
        // list.clear();

        // list.sort(null); //Sorts this list according to the order induced by the specified Comparator.
        // Collections.sort(null); //Sorts this list according to the order induced by the specified Comparator.
        System.out.println(list);

        //Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
        System.out.println(list.indexOf(78));
        System.out.println(list.contains(78)); //Returns true if this list contains the specified element.

          //Swapping 1st(index 0) element with the 3rd(index 2) element
          Collections.swap(list, 0, 2);
          System.out.println("Array list after swap:");
          System.out.println(list);

            // Reversing the elements
            Collections.reverse(list);

            // Displaying the list after reverse
            System.out.println("List after reverse : " + list);

            //Shuffling the list
            Collections.shuffle(list);
            System.out.println("List after shuffling : " + list);
    }
}


// ArrayList<String> str = new ArrayList<>();
// ArrayList<String> str2 = new ArrayList<>();
// ArrayList<Boolean> str3 = new ArrayList<>();
// str.add("red");
// str.add("blue");
// str.add("orange");
// str.add("black");
// str.add("White");

// // str2.add("red");
// // str2.add("black");
// // str2.add("orange");
// // str2.add("White");
// // str2.add("blue");

// // for(int i=0;i<str.size();i++){
// //   System.out.println("item at index "+ i +" ->"+str.get(i) +" "+str2.get(i));
// //   str3.add(str2.contains(str.get(i)) ? true:false);
  
// // }
// // for(String e:str){
// //   str3.add(str2.indexOf(e) ==str.indexOf(e) ?true:false);
// // }

// System.out.println(str);