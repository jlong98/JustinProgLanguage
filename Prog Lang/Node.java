import java.util.LinkedList;

public abstract class Node {
        private LinkedList<Node> child;

        public void addChild(Node n){
                if(child == null){
                        child = new LinkedList<Node>();
                }
                child.add(n);
        }

        public Node child(int index){
                return child.get(index);
        }

        public LinkedList<Node> children() {
                return child;
        }

        public abstract int eval();
}
