public class BlockNode extends Node {
        @Override
        public int eval(){
                for(Node c : children()){
                        c.eval();
                }
                return 0;
        }
}
