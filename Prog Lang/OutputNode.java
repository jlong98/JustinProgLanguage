public class OutputNode extends Node {

        public int eval(){
                Node c = getChild(0);
                int value = c.eval();
                System.out.println(value);
                return 0;

        }
}

