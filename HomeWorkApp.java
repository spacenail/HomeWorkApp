public class HomeWorkApp {
    public static void main(String[] args) {

        //4. Создать массив из 5 сотрудников.

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Anton L", "engineer","antonL@mail.ru",
                "+74951101010", 1000,39);
        employeeArray[1] = new Employee("Artem M", "engineer","artemM@mail.ru",
                "+74951101011", 1100,30);
        employeeArray[2] = new Employee("Askold N", "developer","askoldN@mail.ru",
                "+74951101012", 2000,41);
        employeeArray[3] = new Employee("Armin V", "dj","arminV@mail.ru",
                "+74951101013", 5000,50);
        employeeArray[4] = new Employee("Alla W", "coffelady"," ",
                "+74951101014", 400,20);

//5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

        for (int i = 0; i < employeeArray.length; i++) {
            if(employeeArray[i].getAge() > 40){
                employeeArray[i].getInfo();
            }
        }

    }
}
