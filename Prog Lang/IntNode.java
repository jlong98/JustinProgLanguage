public class IntNode extends Node {
        private int value;

        public IntNode(String image){
                super();
                value = Integer.parseInt(image);
        }

        @Override
        public int eval(){
                return value;
        }
}
