public class Bus {
    private int busno;
    private boolean ac;
    private int capacity;
    Bus(int no,boolean ac,int cap){
        this.busno = no;
        this.ac = ac;
        this.capacity = cap;
    }
    public int getBusno(){
        return busno;
    }

    public boolean isAc(){
        return ac;
    }
    public void setAc(boolean Ac){
        Ac = ac;
    }

    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int cap){
        capacity = cap;
    }
    public void displayBusInfo(){
        System.out.print("Bus No:"+ busno);
        System.out.print("  Ac:"+ ac);
        System.out.print("  Seats:"+ capacity);
        System.out.println();
    }

}
