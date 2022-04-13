public class Main {

    public static void main(String[] args) {
        // Task 1. Fist, middle, second and full name

        String firstName = "Ivan", middleName = "Ivanovich", secondName = "Ivanov",
                fullName = secondName + " " + firstName + " " + middleName;

        System.out.println(fullName);

        // Task 2. Full name in upper case for accounting department

        fullName = fullName.toUpperCase();

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);

        // Task 3. 'ё' to 'е' replacement. Version 1

        StringBuilder fullNameSB = new StringBuilder("Горбунков Семён Семёнович");

        for(int i = 0; i < fullNameSB.length(); i ++){
            if(fullNameSB.charAt(i) == 'ё')
                fullNameSB.setCharAt(i, 'е');
        }

        System.out.println("Данные ФИО сотрудника — " + fullNameSB);

        // Task 3. 'ё' to 'е' replacement. Version 2

        fullName = "Горбунков Семён Семёнович";

        char[] fullNameChar = fullName.toCharArray();
        for(int i = 0; i < fullNameChar.length; i++){
            if(fullNameChar[i] == 'ё')
                fullNameChar[i] = 'е';
        }
        fullName = new String(fullNameChar);

        System.out.println("Данные ФИО сотрудника — " + fullName);

        // Task 3. 'ё' to 'е' replacement. Version 3

        fullName = "Горбунков Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName);

    }
}