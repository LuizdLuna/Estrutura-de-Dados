import java.util.Stack;

public class ExercicioAula5 {
    public static boolean isValidHTML(String html) {
        Stack<String> stack = new Stack<>();
        int i = 0;

        while (i < html.length()) {
            if (html.charAt(i) == '<') {
                int j = html.indexOf('>', i);
                if (j == -1) return false;
                
                String tag = html.substring(i + 1, j);
                
                if (!tag.startsWith("/")) {
                    stack.push(tag);
                } else {
                    if (stack.isEmpty() || !stack.pop().equals(tag.substring(1))) {
                        return false;
                    }
                }
                i = j;
            }
            i++;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String htmlCode1 = "<body><center><h1>The Little Boat</h1></center><p>...</p><ol><li>Will the salesman die?</li><li>What color is the boat?</li><li>And what about Naomi?</li></ol></body>";
        String htmlCode2 = "<body><center><h1>The Little Boat</h1></center><p>...</p><ol><li>Will the salesman die?</li><li>What color is the boat?</li><li>And what about Naomi?</ol></body>";

        System.out.println("Código 1 válido? " + isValidHTML(htmlCode1));
        System.out.println("Código 2 válido? " + isValidHTML(htmlCode2));
    }
}
