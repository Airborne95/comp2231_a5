package jsjf.hashing;

/**
 * @author Mohammad Chaudhry
 * T00554758
 */
public class HashTableTests {
  public static void main(String[] args){

    //Test - create an empty hashTable
    HashTable hashTable = new HashTable();
    System.out.println("\nCreated an empty hash table");

    emptyHashTableTests(hashTable);
    notEmptyHashtableTests(hashTable);
    resizeHashTabletest();





  }

  public static void emptyHashTableTests(HashTable hashTable){
    //Test - check if its empty
    System.out.println("\nCheck if the hash table is empty");
    System.out.println(hashTable.isEmpty());

    //Test - delete an element using SIN on an empty hash table
    System.out.println("\nDelete on an empty hash table by SIN 188895120");
    try{
      hashTable.deleteElement(188895120);
    }catch(Exception e){
      System.out.println(e);
    }

    //Test - delete an element by passing in a HashTableElement on an empty hash table
    System.out.println("\nDelete on an empty hash table by element");
    HashTableElement temp = new HashTableElement("Name", 188895120);
    System.out.println("Created a HashTableElement with the name: 'Name' and SIN: '188895120'");
    try{
      hashTable.deleteElement(temp);
    }catch(Exception e){
      System.out.println(e);
    }

    //Test - use method contains() on an empty hash table by SIN
    System.out.println("\nContain on an empty hash table by SIN 188895120");
    System.out.println(hashTable.contains(188895120));

    //Test - use method contains() on an empty hash table by element
    System.out.println("\nContain on an empty hash table by element");
    System.out.println(hashTable.contains(temp));

    //Test - size of an empty hash table
    System.out.println("\nSize of an empty hash table");
    System.out.println(hashTable.size());
  }

  public static void notEmptyHashtableTests(HashTable hashTable){
    //Test - add an element using an incorrect SIN
    System.out.println("\nAdd an element using an incorrect SIN (SIN = 44)");
    try{
      hashTable.addElement("Name", 44);
    }catch (Exception e){
      System.out.println(e);
    }

    //Test - add an element using a correct SIN
    System.out.println("\nAdd an element using an incorrect SIN (SIN = 188895120)");
    try{
      hashTable.addElement("Name", 188895120);
    }catch (Exception e){
      System.out.println(e);
    }
    System.out.println("Successfully added element to hashTable");

    //Test - size of hash table with one element
    System.out.println("\nSize of hash table with one element.");
    System.out.println(hashTable.size());

    //Test - isEmpty function on non empty hash table
    System.out.println("\nisEmpty method on non empty hash table");
    System.out.println(hashTable.isEmpty());

    //Test - add an element using a HashTableElement
    System.out.println("\nAdd an element using a HashTableElement)");
    HashTableElement temp = new HashTableElement("Name", 456075554);
    System.out.println("Created a HashTableElement with the name: 'Name' and SIN: '188895120'");
    try{
      hashTable.addElement("Name", 456075554);
    }catch (Exception e){
      System.out.println(e);
    }
    System.out.println("Successfully added element to hashTable");

    //Test - size of hash table with two elements
    System.out.println("\nSize of hash table with two elements.");
    System.out.println(hashTable.size());

    //Test - contain method using SIN
    System.out.println("\ncontain method using SIN: 188895120");
    System.out.println(hashTable.contains(188895120));

    //Test - contain method using HashTableElement
    System.out.println("\ncontain method using HashTableElement temp (name='Name', SIN='456075554')");
    System.out.println(hashTable.contains(temp));

    //Test - delete element not in hash table by SIN
    System.out.println("\nDelete an element by SIN not in the hash table");
    hashTable.deleteElement(675241122);

    //Test - delete element not in hash table by element
    System.out.println("\nDelete an element by passing in HashTableElement that is not in the hash table");
    HashTableElement notInTable = new HashTableElement("Fame",997364163);
    System.out.println("Create an element with name='Fame', SIN='997364163'");
    hashTable.deleteElement(notInTable);

    //Test - delete an element in the hash table by SIN
    System.out.println("\nDelete an element in the hash table by SIN = 188895120");
    hashTable.deleteElement(188895120);
    System.out.println("Successfully deleted");

    //Test - delete an element in the hash table by passing in a HashTableElement
    System.out.println("\nDelete method using HashTableElement temp (name='Name', SIN='456075554')");
    hashTable.deleteElement(temp);
    System.out.println("Successfully deleted");

  }

  public static void resizeHashTabletest(){
    System.out.println("For a hash table capable of holding 31 elements with a load factor of 0.8, 24 elements for dynamic resizing to take palce.");
    System.out.println("This test will add 24 elements");
    HashTable hashTable = new HashTable();
    try{
      hashTable.addElement("Name",997364163);
      hashTable.addElement("Name",173951108);
      hashTable.addElement("Name",194901387);
      hashTable.addElement("Name",593792381);
      hashTable.addElement("Name",857613138);
      hashTable.addElement("Name",467357084);
      hashTable.addElement("Name",702800306);
      hashTable.addElement("Name",961774681);
      hashTable.addElement("Name",554150222);
      hashTable.addElement("Name",833281359);
      hashTable.addElement("Name",441978987);
      hashTable.addElement("Name",156608303);
      hashTable.addElement("Name",770083383);
      hashTable.addElement("Name",791484257);
      hashTable.addElement("Name",752105496);
      hashTable.addElement("Name",403224712);
      hashTable.addElement("Name",976561472);
      hashTable.addElement("Name",406429072);
      hashTable.addElement("Name",679882006);
      hashTable.addElement("Name",143421530);
      hashTable.addElement("Name",964570203);
      hashTable.addElement("Name",361215154);
      hashTable.addElement("Name",153043332);
    }catch(Exception e){
      System.out.println(e);
    }

    System.out.println("Added 23 elements.");
    System.out.println(hashTable.size());
    System.out.println("The hash table currently: \n"+hashTable.toString());

    try{
      hashTable.addElement("Resize",123456789);
    }catch (Exception e){
      System.out.println(e);
    }

    System.out.println("Added one more element (Name = 'Resize' SIN = 123456789) so total comes to 24. This will trigger resizing");
    System.out.println(hashTable.size());
    System.out.println("The hash table after resizing \n"+hashTable.toString());


  }


}
