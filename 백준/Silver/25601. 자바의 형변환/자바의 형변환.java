import java.io.*;
import java.util.*;

public class Main{
    static class TreeNode{
        String value;
        List<TreeNode> children;
        
        public TreeNode(String value){
            this.value = value;
            this.children = new ArrayList<>();
        }
        
        public void addChild(TreeNode child){
            children.add(child);
        }
    }
    
    public static void main(String[] agrs) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        Map<String, TreeNode> nodeMap = new HashMap<>();
        
        for(int i = 0; i < n - 1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String child = st.nextToken();
            String parent = st.nextToken();
            
            nodeMap.putIfAbsent(parent, new TreeNode(parent));
            nodeMap.putIfAbsent(child, new TreeNode(child));
            
            TreeNode parentNode = nodeMap.get(parent);
            TreeNode childNode = nodeMap.get(child);
            parentNode.addChild(childNode);
        }
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        
        TreeNode root = findRoot(nodeMap);
        
        if(isDescendant(root,a,b) || isDescendant(root, b, a)){
            System.out.println(1);
            return;
        }
        
        System.out.println(0);
    }
    
    private static TreeNode findRoot(Map<String, TreeNode> nodeMap){
        Set<TreeNode> allNodes = new HashSet<>(nodeMap.values());
        for(TreeNode node : nodeMap.values()){
            for(TreeNode child : node.children){
                allNodes.remove(child);
            }
        }
        return allNodes.iterator().next();
    }
    
    private static boolean isDescendant(TreeNode root, String ancestor, String descendant){
        if(root == null) return false;
        if(root.value.equals(ancestor)){
            return contains(root, descendant);
        }
        for(TreeNode child : root.children){
            if(isDescendant(child, ancestor, descendant)){
                return true;
            }
        }
        return false;
    }
    
    private static boolean contains(TreeNode root, String target){
        if(root == null) return false;
        if(root.value.equals(target)) return true;
        for(TreeNode child : root.children){
            if(contains(child, target)){
                return true;
            }
        }
        return false;
    }
}