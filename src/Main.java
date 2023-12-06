public class Main {
    public static void main(String[] args) {
        String primitiveString = "text";
        String objectString = new String("text");
        System.out.println(primitiveString);
        System.out.println(objectString);

        if (primitiveString == "text") {
            System.out.println("primitiveString == text");
        }
        if (objectString == "text") {
            System.out.println("objectString == text");
        }
        if (primitiveString == objectString) {
            System.out.println("primitiveString == objectString");
        }
    }
}

/*
git init
git add README.md
git commit -m "initial commit"
git branch -M main
git remote add origin git@github.com:A1MaHaiD/test.git
git push -u origin main
*/

/*
ssh-keygen -t ed25519 -sk -C "super.lukianchuk2010@gmail.com"
cat ~/.ssh/id_ed25519.pub | clip
*/