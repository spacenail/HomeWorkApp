//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

//2. Конструктор класса должен заполнять эти поля при создании объекта.

    public Employee (String fullName,
            String position,
            String email,
            String phoneNumber,
            int salary,
            int age){

        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

//3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

    public void getInfo(){
        System.out.printf("%s position=%s email=%s phone number=%s salary=%s age=%s \n",
                this.fullName,
                this.position, this.email,
                this.phoneNumber, this.salary, this.age );
    }

    public int getAge(){
        return this.age;
    }
}
