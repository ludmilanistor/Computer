import edu.tekwill.academy.computer.Computer;
import edu.tekwill.academy.computer.components.HardDrive;
import edu.tekwill.academy.computer.components.Motherboard;
import edu.tekwill.academy.computer.components.Processor;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args)
    {
       Computer computer = new Computer() {
        };

      Processor processor = new Processor() {
        };

        Motherboard motherboard = new Motherboard(){
        };

        HardDrive hardDrive = new HardDrive(){};

        

        System.out.println(computer);
        System.out.println(processor);
        System.out.println(motherboard);
        System.out.println(hardDrive);

    }


}



