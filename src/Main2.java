ort model.Person;

public class Main2 {
  public static void main(String[]args){
      Person person1 = new Person("goga", "belaruss", 1980);
      Person person2 = (Person) person1.clone();
      System.out.println(person2);
    }
}
