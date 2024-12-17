class Decipherer {


    public static String decipher(String message) {
        int count = message.length();
        int keyNumber = count / 2;
        String newMessage = message.substring(5,5 + keyNumber);
        newMessage = newMessage.replace("@#?", " ");
        String reverseMessage = new StringBuilder(newMessage).reverse().toString();
        return reverseMessage;
    }

    public static void main(String[] args) {
        System.out.println(decipher("0@sn9sirppa@#?ia'jgtvryko1"));
        System.out.println(decipher("q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj"));
        System.out.println(decipher("aopi?sedohtém@#?sedhtmg+p9l!"));
    }
}