class Decipherer {


    public static String decipher(String message) {
        int count = message.length();
        int keyNumber = count / 2;
        message = message.replace("@#?", " ");
        String newMessage = message.substring(5, keyNumber);
        String reverseMessage = new StringBuilder(newMessage).reverse().toString();
        return reverseMessage;
    }

    public static void main(String[] args) {
        System.out.print(decipher("0@sn9tirppa@#?ia'jgtvryko1"));
        System.out.print(decipher("q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj"));
        System.out.print(decipher("aopi?sedohtém@#?sedhtmg+p9l!"));

    }
}