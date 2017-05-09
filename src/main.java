
/**
 * Created by 看什么看没见过屏幕啊 on 2017/4/2.
 */
public class main {

    public static void main(String[] agrs){
        Tree root = Tree.getTree();
        root.updateVal(root.getNode(), "gg");
        root.insertChild(root.getNode(), "good");
        root.insertChild(root.getNode(), "abc");
        root.insertChild(root.getChild(root.getNode()), "孙子1");
        root.insertBro(root.getChild(root.getChild(root.getNode())), "孙子2");
        root.insertChild(root.getChild(root.getChild(root.getNode())), "曾孙子1");
        root.insertChild(root.getNode(), "dfs");
        root.insertChild(root.getBro(root.getChild(root.getNode())), "孙子4");
        root.insertBro(root.getChild(root.getBro(root.getChild(root.getNode()))), "孙子5");
        root.insertChild(root.getChild(root.getBro(root.getChild(root.getNode()))), "曾孙子6");
        root.insertChild(root.getNode(), "dggg");
        root.showTree();
        root.deleteNode(root.getChild(root.getNode()));
        root.showTree();
    }
}
