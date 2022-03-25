public class VarNode extends Node {
        public String name;

        public VarNode(String image) {
                super();
                name = image;
        }

        public int eval() {
                return LongJ.ram.get(name);
        }
}

