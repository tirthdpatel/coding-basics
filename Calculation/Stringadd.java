
class Stringadd {

    public String joinfruits(String str1, String str2) {
        return str1 + " " + str2;

    }

    public static void main(String[] args) {
        String str1 = "Apple";
        String str2 = "Banana";
        Stringadd obj = new Stringadd();
        String answer= obj.joinfruits(str1, str2);
        System.out.println(answer);
    }
}
