

/*Static Keyword = The Static Keyword in java is used for memory management primarily
                   It can be applied on variables , blocks ,nested classes & methods. */
// public class StaticKeyword {
//     String name;
//     static String school;
//     public static void main(String... s) {
//         StaticKeyword.school = "SNPS";
//         System.out.println(StaticKeyword.school);
//     }
// }
//A static keyword contain things can take memory one time only but objects can take multiple time
public class StaticKeyword {

    String name;
    static String school;

    public void changeschool() {
        school = "Indraprastha";
    }

    public static void main(String[] args) {
        StaticKeyword.school = "Sant Nirankari Public School";
        StaticKeyword student = new StaticKeyword();
        student.changeschool();
        student.name = "Kushant";
        System.out.println(student.name);
        System.out.println(school);

    }
}
