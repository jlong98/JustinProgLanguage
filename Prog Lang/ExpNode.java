public class ExpNode extends Node {
        public int sum = 0;

        public int eval() {
                int result = getChild(0).eval();
                for(int i = 1;i<children.size();i+=2){
                        OpNode a = (OpNode) getChild(i);
                        String op = a.symbol;
                        if(op.equals("+")){
                                result += getChild(i+1).eval();
                        }else if(op.equals("-")){
                                result -= getChild(i+1).eval();
                        }else if(op.equals("*")){
                                result *= getChild(i+1).eval();
                        }else {
                                result /= getChild(i+1).eval();
                        }
                }
                return result;
        }
}


