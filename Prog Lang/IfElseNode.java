public class IfElseNode extends Node {
//The else portion of this will not work.
        public int eval(){
                int bool = getChild(0).eval();
                if(bool == 1){
                        getChild(1).eval();
                        bool = getChild(0).eval();
                }
                return 0;
        }
}
