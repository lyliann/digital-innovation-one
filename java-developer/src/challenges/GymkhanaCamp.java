package challenges;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class GymkhanaCamp {

    public static void main(String[] args) throws IOException {
        boolean direction = false; //sentido anti-horário
        int indexIn = 0;
        int indexOut = 0;
        int steps = 0;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        int numStudents = Integer.parseInt(buffer.readLine());
        while(true) {
            LinkedList<Students> linkedList = new LinkedList<Students>();
            for (int i = numStudents; i >= 1 ; i--) {
                line = buffer.readLine();
                String[] student = line.split(" ");
                linkedList.add(new Students(student[0], Integer.parseInt(student[1])));
            }
            int sms = linkedList.get(0).getSMS();
            while (linkedList.size() > 1) {
                steps = sms % linkedList.size();
                direction = sms % 2 == 0;
                if (direction) {//sentido horário
                    indexOut = indexIn - steps;
                    if (indexOut < 0) indexOut += linkedList.size();
                }else { //sentido anti-horário
                    indexOut = indexIn + steps;
                    if (indexOut >= linkedList.size()) indexOut-= linkedList.size();
                }
                sms = linkedList.get(indexOut).getSMS();
                linkedList.remove(indexOut);
                indexIn = sms % 2 == 0 ? indexOut : indexOut - 1;
                if (indexIn < 0) indexIn = linkedList.size() - 1;
                if (indexIn >= linkedList.size()) indexIn = 0;
            }
            System.out.println("Vencedor(a): " + linkedList.get(0).getName());
            numStudents = Integer.parseInt(buffer.readLine());
            if (numStudents == 0) break;
        }
    }
}
class Students {
    private String name;
    private int SMS;

    public Students(String name, int SMS) {
        this.name = name;
        this.SMS = SMS;
    }

    public String getName() {
        return this.name;
    }

    public int getSMS() {
        return this.SMS;
    }
}
