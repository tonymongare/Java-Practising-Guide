class CPU {
    double cores;

    class Processor {
        String Manufacture;
        double speed;

        double getCpuCores() {
            return 4.4;
        }
    }

    protected class RAM {
        double memory;
        String Manufacturer;

        double getSpeed() {
            return 4.5;
        }
    }

}
class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU();

        CPU.Processor obj = cpu.new Processor();

        CPU.RAM ram = cpu.new RAM();

        System.out.println("The system cpu has the followign number of cores" +obj.getCpuCores());
        System.out.println("The metrics for the RAM is as follows:" +ram.getSpeed());


    }

}

////
