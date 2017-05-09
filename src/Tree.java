/**
 * Created by 看什么看没见过屏幕啊 on 2017/4/2.
 */
public class Tree{

    private TreeNode root;
    private static Tree tree = new Tree();

    private Tree(){
        root = new TreeNode("");
    }

    public static Tree getTree(){
        return tree;
    }

    public TreeNode getNode(){
        return root;
    }

//    真表示有，假表示没有
    public boolean hasTree(){
        if(root == null){
            return false;
        }
        return true;
    }

    public boolean hasNode(TreeNode root){
        if(root == null){
            return false;
        }
        return true;
    }

    public boolean hasChild(TreeNode root){
        if(root.child == null){
            return false;
        }
        return true;
    }

    public boolean hasBro(TreeNode root){
        if(root.bro == null){
            return false;
        }
        return true;
    }

    public TreeNode getChild(TreeNode root){
        return root.child;
    }

    public TreeNode getBro(TreeNode root){
        return root.bro;
    }

//    show total tree val
    public void showTree() {
        if (!hasTree()) {
            return ;
        }
        System.out.println(root.val);
        showTree(root.bro);
        showTree(root.child);
    }

    public void showTree(TreeNode root){
        if (!hasNode(root)) {
            return ;
        }
//        System.out.println(root.num + " " + root.val);
        System.out.println(root.val);
        showTree(root.bro);
        showTree(root.child);
    }

//    show treenode val
    public void showVal(TreeNode root){
        if(!hasNode(root))
            return;
        System.out.println(root.val);
    }

//    insert child
    public void insertChild(TreeNode root, String val){
        TreeNode newChild = new TreeNode(val);
        if(!hasNode(root))
            return;
        if(!hasNode(root.child)){
            root.child = newChild;
            return;
        }
        root = root.child;
        while(hasNode(root.bro)){
            root = root.bro;
        }
        root.bro = newChild;
    }

//    insert brother
    public void insertBro(TreeNode root, String val){
        TreeNode newBro = new TreeNode(val);
        if(!hasNode(root))
            return;
        while(hasNode(root.bro))
            root = root.bro;
        root.bro = newBro;
    }

//    delete node
    public void deleteNode(TreeNode del){
        TreeNode t = this.root;
        deleteNode(t, del);
    }

    private void deleteNode(TreeNode root, TreeNode del){
        if(root.child != del && root.bro != del)
        {
            deleteNode(root.child, del);
            deleteNode(root.bro, del);
        }
        else if(root.child == del){
            root.child = root.child.bro;
            delete(del);
        }
        else if(root.bro == del){
            root.bro = root.bro.bro;
            delete(del);
        }
        else
            delete(del);
    }

    private void delete(TreeNode del){
        if(del.child != null)
            delete(del.child);
        if(del.bro != null)
            delete(del.bro);
    }

//    update node val
    public void updateVal(TreeNode root, String val){
        if(!hasNode(root))
            return;
        root.val = val;
    }



}
