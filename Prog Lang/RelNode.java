public class RelNode extends Node {
        public int eval(){
                int res1 = getChild(0).eval();
                int res2 = getChild(2).eval();
                RelopNode a = (RelopNode) getChild(1);
                String op = a.symbol;
                if(op.equals(">")){
                        if(res1 > res2)
                                return 1;
                        else
                                return 0;
                }else if(op.equals("<")){
                        if(res1 < res2)
                                return 1;
                        else
                                return 0;
                }else if(op.equals(">=")){
                        if(res1 >= res2)
                                return 1;
                        else
                                return 0;
                }else if(op.equals("<=")){
                        if(res1 <= res2)
                                return 1;
                        else
                                return 0;
                }else if(op.equals("!=")){
                        if(res1 != res2)
                                return 1;
                        else
                                return 0;
                }else if(op.equals("==")){
                        if(res1 == res2)
                                return 1;
                        else
                                return 0;
                }else{
                        return 0;
                }
        }
}
