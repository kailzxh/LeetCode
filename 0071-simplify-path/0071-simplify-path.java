class Solution {
    public String simplifyPath(String path) {
        // Use stack to keep track of valid directory names
        Stack<String> stack = new Stack<>();

        // Split the input path by "/"
        String[] components = path.split("/");

        for (String dir : components) {
            if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop(); // Go one level up
                }
            } else if (!dir.equals("") && !dir.equals(".")) {
                stack.push(dir); // Valid directory name
            }
            // else: empty string or ".", do nothing
        }

        // Construct the simplified path
        StringBuilder simplifiedPath = new StringBuilder();
        for (String dir : stack) {
            simplifiedPath.append("/").append(dir);
        }

        return simplifiedPath.length() == 0 ? "/" : simplifiedPath.toString();
    }
}
