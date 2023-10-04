package edu.tekwill.academy.computer;

import edu.tekwill.academy.computer.components.HardDrive;
import edu.tekwill.academy.computer.components.Motherboard;
import edu.tekwill.academy.computer.components.Processor;
import edu.tekwill.academy.computer.peripherals.Monitor;

public class Computer {

    public static void main(String[] args)
    {
        Processor processor = new Processor() {
        };

        Motherboard motherboard = new Motherboard(){
        };

        HardDrive hardDrive = new HardDrive(){};

        Monitor monitor = new Monitor(){};

        System.out.println(monitor);
        System.out.println(motherboard);
        System.out.println(hardDrive);

    }
}


