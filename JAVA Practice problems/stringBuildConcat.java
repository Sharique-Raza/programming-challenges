public class stringBuildConcat {


    public static void main(String[] args) {
        String[] arr = new String[] {"HEY "+"MY "+"NAME "+"IS "+"SHARIQUE "};

        StringBuilder sb = new StringBuilder();

        for (String str : arr) {
            sb.append(str).append(" ");
            
        }
        System.out.println(sb);
        System.out.println(arr);
    }
}
