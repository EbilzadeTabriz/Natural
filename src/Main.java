  class Animal{
    private String name;

      public Animal(String name) {
          this.name = name;
      }

      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }

      public String speak(){
          return "Animal is speaking";
      }
  }
  class Cat extends Animal {

      public Cat(String name) {
          super(name);
      }

      @Override
      public String speak() {
          return super.getName() + " mouuuuu";

      }
  }
      class Dog extends Animal {
          public Dog(String name) {
              super(name);
          }

          @Override
          public String speak() {
              return super.getName()+" Bark bark bark";
          }
      }
      class Horse extends Animal{
          public Horse(String name) {
              super(name);
          }

          @Override
          public String speak() {
              return super.getName()+ " Viouuuu";
          }
      }



public class Main {
    public static void speaken(Object object){
        if (object instanceof Dog){
            Dog dog = (Dog) object;
            System.out.println(dog.speak());

        } else if (object instanceof Cat) {
            Cat cat =(Cat) object;
            System.out.println(cat.speak());

        } else if (object instanceof Horse) {
            Horse horse = (Horse) object;
            System.out.println(horse.speak());


        }

    }


    public static void main(String[] args) {

       Dog dog = new Dog("Jeckson");
       Cat cat = new Cat("Keale");
       Horse horse=new Horse("Laki");
       Animal animal = new Animal("");
       speaken(dog);
       speaken(cat);
       speaken(horse);



//       if (dog instanceof ){
//           System.out.println("THis object is from Dog class");
//       }

//        AdvanceSubscriber advanceSubscriber = new AdvanceSubscriber("Kenan",200,"Baku");
//            advanceSubscriber.learnBalance();
//            advanceSubscriber.useNaturalGas(20);
    }
}