public class AssignNode extends Node {

        public int eval(){
                VarNode v = (VarNode) getChild(0);
                ExpNode i = (ExpNode) getChild(1);
                int x = i.eval();
                String name = v.name;
                LongJ.ram.put(name, x);
                return 0;
        }
}

