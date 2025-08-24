package by.itacademy.room;

public class Wardrobe {
    private int doors;
    private int shelfs;
    private int length;

    public Wardrobe() {
    }

    public Wardrobe(int doors, int shelfs, int length){
        this.doors = doors;
        this.length = length;
        this.shelfs = shelfs;
    }

    public Wardrobe(int doors) {
        this.doors = doors;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getShelfs() {
        return this.shelfs;
    }

    public void setShelfs(int shelfs) {
        this.shelfs = shelfs;
    }

    public int getDoors() {
        return this.doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String printInfoAboutMe(){
        return "Также в комннате стоит шкаф с " + getDoors() + " дверьми" +
                "и высотой " + getLength()+ " метра. Открыв его вы видете внутри "+ getShelfs() + " полок с вещами.\n";
    }

    public boolean equals(Wardrobe wardrobe){
        if (wardrobe != null){
            return (this.doors == wardrobe.getDoors() && this.shelfs == wardrobe.getShelfs() && this.length == wardrobe.getLength());
        }
        return false;
    }
}