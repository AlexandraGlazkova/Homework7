public class Main {
    public static void main(String[] args) {
        System.out.println();


//    Задание 1
//    Представим, что мы работаем в небольшой компании. Данные сотрудников хранятся в неструктурированном
//    формате, и бухгалтерия попросила написать программу, в которой  можно работать с Ф. И. О.
//    сотрудников.
//    Напишите четыре строки:
//    первая с именем firstName — для хранения имени;
//    вторая с именем middleName — для хранения отчества;
//    третья с именем lastName — для хранения фамилии;
//    четвертая с именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
//    Выведите в консоль фразу: “ФИО сотрудника — ….”
//    В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
        System.out.println("Задание 1");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника - " + fullName);
    }
}
