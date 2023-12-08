public class Main {
    public static void main(String[] args) {
//        stringObj();
//        bufferBuilder();
//        insertDeleteRevers();
//        compareSpeedBuilderBuffer();
    }

    private static void compareSpeedBuilderBuffer() {
        int iteration = 1_000_000;
        StringBuilder builder = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            builder.append("a");
        }
        long endTime = System.currentTimeMillis();
        long durationBuilder = endTime - startTime;

        StringBuffer buffer = new StringBuffer();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            buffer.append("a");
        }
        endTime = System.currentTimeMillis();
        long durationBuffer = endTime - startTime;
        System.out.println("Час для StringBuilder: " + durationBuilder);
        System.out.println("Час для StringBuffer: " + durationBuffer);
    }

    private static void insertDeleteRevers() {
        String initialString = "Hello World";
        StringBuilder builder = new StringBuilder(initialString);
        System.out.println(builder);

        int insertIndex = builder.indexOf("Hello") + "Hello".length();
        builder.insert(insertIndex, "Java");
        System.out.println(builder);

        int deleteStarts = builder.indexOf("World");
        int deleteEnds = deleteStarts + "World".length();
        builder.delete(deleteStarts, deleteEnds);
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);
    }

    private static void bufferBuilder() {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append(" World");
        builder.append("!");
        String builderResult = builder.toString();
        System.out.println(builderResult);

        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        buffer.append(" World");
        buffer.append("!");
        String bufferResult = buffer.toString();
        System.out.println(bufferResult);
    }

    private static void stringObj() {
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