import java.io.IOException;
import java.util.*;

public class Temp {

    public static void main(String[] args) throws IOException {
        @SuppressWarnings("RedundantTypeArguments (explicit type arguments speedup compilation and analysis time)")
        HashMap<Character, Integer> map = new HashMap<>(Map.<Character, Integer>ofEntries(
                Map.entry('!',9),
                Map.entry('"',6),
                Map.entry('#',24),
                Map.entry('$',29),
                Map.entry('%',22),
                Map.entry('&',24),
                Map.entry('\'',3),
                Map.entry('(',12),
                Map.entry(')',12),
                Map.entry('*',17),
                Map.entry('+',13),
                Map.entry(',',7),
                Map.entry('-',7),
                Map.entry('.',4),
                Map.entry('/',10),
                Map.entry('0',22),
                Map.entry('1',19),
                Map.entry('2',22),
                Map.entry('3',23),
                Map.entry('4',21),
                Map.entry('5',27),
                Map.entry('6',26),
                Map.entry('7',16),
                Map.entry('8',23),
                Map.entry('9',26),
                Map.entry(':',8),
                Map.entry(';',11),
                Map.entry('<',10),
                Map.entry('=',14),
                Map.entry('>',10),
                Map.entry('?',15),
                Map.entry('@',32),
                Map.entry('A',24),
                Map.entry('B',29),
                Map.entry('C',20),
                Map.entry('D',26),
                Map.entry('E',26),
                Map.entry('F',20),
                Map.entry('G',25),
                Map.entry('H',25),
                Map.entry('I',18),
                Map.entry('J',18),
                Map.entry('K',21),
                Map.entry('L',16),
                Map.entry('M',28),
                Map.entry('N',25),
                Map.entry('O',26),
                Map.entry('P',23),
                Map.entry('Q',31),
                Map.entry('R',28),
                Map.entry('S',25),
                Map.entry('T',16),
                Map.entry('U',23),
                Map.entry('V',19),
                Map.entry('W',26),
                Map.entry('X',18),
                Map.entry('Y',14),
                Map.entry('Z',22),
                Map.entry('[',18),
                Map.entry('\\',10),
                Map.entry(']',18),
                Map.entry('^',7),
                Map.entry('_',8),
                Map.entry('`',3),
                Map.entry('a',23),
                Map.entry('b',25),
                Map.entry('c',17),
                Map.entry('d',25),
                Map.entry('e',23),
                Map.entry('f',18),
                Map.entry('g',30),
                Map.entry('h',21),
                Map.entry('i',15),
                Map.entry('j',20),
                Map.entry('k',21),
                Map.entry('l',16),
                Map.entry('m',22),
                Map.entry('n',18),
                Map.entry('o',20),
                Map.entry('p',25),
                Map.entry('q',25),
                Map.entry('r',13),
                Map.entry('s',21),
                Map.entry('t',17),
                Map.entry('u',17),
                Map.entry('v',13),
                Map.entry('w',19),
                Map.entry('x',13),
                Map.entry('y',24),
                Map.entry('z',19),
                Map.entry('{',18),
                Map.entry('|',12),
                Map.entry('}',18),
                Map.entry('~',9),
                Map.entry(' ',0)
                ));

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.nextLine();
            int finalAmount = 0;
            for (char i : input.toCharArray()) {
                finalAmount+=map.get(i);
            }
            System.out.println(finalAmount);
        }
    }
}