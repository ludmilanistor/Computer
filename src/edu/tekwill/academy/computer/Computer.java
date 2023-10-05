package edu.tekwill.academy.computer;

import edu.tekwill.academy.computer.components.*;
import edu.tekwill.academy.computer.peripherals.*;

public class Computer {

    public static void main(String[] args)
    {
        Processor processor = new Processor() {
        };

        Motherboard motherboard = new Motherboard(){
        };

        HardDrive hardDrive = new HardDrive(){};

        Monitor monitor = new Monitor(){};

        Mouse mouse = new Mouse(){};

        Keyboard keyboard = new Keyboard();


//        System.out.println(monitor);
//        System.out.println(motherboard);
//        System.out.println(hardDrive);

    }
}


