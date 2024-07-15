

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "himanshu";
        int length = str.length();
        char[] arr = str.toCharArray();

        // Calling the method to remove duplicates
        String result = duplicateChar(arr, length);
        System.out.println("Original String: " + str);
        System.out.println("String without duplicates: " + result);
    }

    public static String duplicateChar(char[] arr, int length) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < length; i++) {
            boolean isDuplicate = false;
            
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            if (!isDuplicate) {
                sb.append(arr[i]);
            }
        }
        
        return sb.toString();
    }
}
