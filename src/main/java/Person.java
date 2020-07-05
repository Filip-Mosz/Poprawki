public class Person implements Comparable {
    private int age;
    private String name;
    @MaxLength(minValue = 3, maxValue = 20)
    private String surname;

    public Person(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;

        try {
            if(!StringLengthValidator.validate(this)){
                throw new IllegalArgumentException("Niepoprawna długość nazwiska");
            }
        } catch (IllegalAccessException e){
            e.printStackTrace();
        }
    }

    @Override
    public int compareTo(Object o) {
        if (o == null || getClass() != o.getClass()){
            Person otherOne = (Person) o; //rzutowanie Obiektu na Person

            if (this.age < otherOne.age){
                return - 1;
            } else if (this.age == otherOne.age){
                return (this.surname.compareTo(otherOne.surname));
            } else return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
