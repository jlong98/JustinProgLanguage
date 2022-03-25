
import java.util.Scanner;
public class InputNode extends Node {

        public int eval() {
                System.out.print("Enter int: ");
                int input = LongJ.scan.nextInt();
                VarNode c = (VarNode) getChild(0);
                String name = c.name;
                LongJ.ram.put(name, input);
                return 0;
        }
}

