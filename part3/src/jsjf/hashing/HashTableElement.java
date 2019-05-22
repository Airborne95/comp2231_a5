package jsjf.hashing;

/**
 * @author Mohammad Chaudhry
 * T00554758
 */
public class HashTableElement {


  private String name; //name of person
  private int SIN; //SIN of person
  private boolean deleted; //to determine of an element was deleted

  public HashTableElement(String name, int SIN){
    this.name = name;
    this.SIN = SIN;
    this.deleted = false;
  }

  /**
   * Public method to get the Name
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Public method to change the value of name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Public method to get the SIN (Social Insurance Number)
   * @return SIN
   */
  public int getSIN() {
    return SIN;
  }

  /**
   * Public method to check whether an element has been deleted
   * @return deleted
   */
  public boolean isDeleted() {
    return deleted;
  }

  /**
   * Public method to change the value of deleted
   */
  public void setDeleted(boolean deleted) {
    this.deleted = deleted;
  }

  public String toString(){
    return "Name: " + name + " SIN: " + SIN;
  }
}
