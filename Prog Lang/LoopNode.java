public class LoopNode extends Node {

        public int eval(){
                int bool = getChild(0).eval();
                while(bool == 1){
                        getChild(1).eval();
                        bool = getChild(0).eval();
                }
                return 0;
        }
}
