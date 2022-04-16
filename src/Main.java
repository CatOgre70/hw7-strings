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
        System.out.println();

        // Task 5. String to substrings

        fullName = "Ivanov Ivan Ivanovich";
        String[] words = fullName.split(" ");
        if(words.length != 3)
            throw new RuntimeException("Wrong string with full name!");
        System.out.println("Full name: " + fullName + "\nSecond name: " + words[0] + "\nFirst name: "
                + words[1] + "\nMiddleName: " + words[2]);
        System.out.println();

        // Task 6. First letters error

        StringBuilder str = new StringBuilder("ivanov ivan ivanovich");
        System.out.println("Было: " + str);

        // First letter checking
        if(Character.isLowerCase(str.charAt(0)))
            str.setCharAt(0, Character.toUpperCase(str.charAt(0)));
        for(int i = 1; i < str.length() - 1; i++){
            if(str.charAt(i) == ' '){
                if(Character.isLowerCase(str.charAt(i+1)))
                    str.setCharAt(i+1, Character.toUpperCase(str.charAt(i+1)));
            }
        }
        System.out.println("Стало: " + str);
        System.out.println();

        // Task 7. Join even and odd strings

        final int EVEN_AND_ODD_STRINGS_LENGTH = 3; // EVEN_AND_ODD_STRINGS_LENGTH should be < 5
        // Generating initial strings
        StringBuilder oddStringSB = new StringBuilder(""), evenStringSB = new StringBuilder("");
        for(int i = 1; i <= EVEN_AND_ODD_STRINGS_LENGTH * 2; i += 2)
            oddStringSB.append(i);
        for(int i = 2; i <= EVEN_AND_ODD_STRINGS_LENGTH * 2; i += 2)
            evenStringSB.append(i);
        System.out.println("First string = " + oddStringSB + "\nSecond string = " + evenStringSB);

        // Two strings joining
        StringBuilder joinStringSB = new StringBuilder("");
        for(int i = 0; i < EVEN_AND_ODD_STRINGS_LENGTH; i++) {
            joinStringSB.append(oddStringSB.charAt(i));
            joinStringSB.append(evenStringSB.charAt(i));
        }
        System.out.println("Join string = " + joinStringSB);
        System.out.println();

        // Task 8. Find and print duplicated characters

        // oddStringSB = new StringBuilder("aabccddefgghiijjkk");
        oddStringSB = new StringBuilder("aaaaabccddefggghiijjkk");
        System.out.println("Initial string = " + oddStringSB);
        evenStringSB = new StringBuilder("");

        int currentPosition = 0;
        char currentChar = 'a';
        boolean currentCharacterAppended = false;
        while (currentPosition < oddStringSB.length() - 1){
            if(oddStringSB.charAt(currentPosition + 1) == currentChar && !currentCharacterAppended) {
                evenStringSB.append(currentChar);
                currentCharacterAppended = true;
                currentPosition++;
            } else if(oddStringSB.charAt(currentPosition + 1) == currentChar && currentCharacterAppended) {
                currentPosition++;
            } else {
                currentChar = oddStringSB.charAt(currentPosition+1);
                currentCharacterAppended = false;
                currentPosition++;
            }
        }
        System.out.println("Result = " + evenStringSB);
    }
}