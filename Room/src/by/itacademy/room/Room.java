package by.itacademy.room;


public class Room {
    private String door;
    private String light;
    private int height;

    private Bed bed;
    private Table table;
    private Wardrobe wardrobe;

    public Room() {
    }

    public Room(String door, String light, int height, Bed bed, Table table, Wardrobe wardrobe) {
        this.door = door;
        this.light = light;
        this.height = height;
        this.bed = bed;
        this.table = table;
        this.wardrobe = wardrobe;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    public Bed getBed(){
        return bed;
    }

    public void setBed(Bed bed){
        this.bed = bed;
    }

    public Table getTable(){
        return table;
    }

    public void setTable(Table table){
        this.table = table;
    }

    public Wardrobe getWardrobe(){
        return wardrobe;
    }

    public void setWardrobe(Wardrobe wardrobe){
        this.wardrobe = wardrobe;
    }

    public String printInfoAboutMe(){
        return "Дверь " + getDoor() + ". Свет " +  getLight() + ". Высота комнаты " + getHeight() + " м.\n"
                + bed.printInfoAboutMe()
                + wardrobe.printInfoAboutMe();
    }

    public boolean equals(Room room){
        if(room!=null){
            return(this.door.equals(room.getDoor()) && this.light.equals(room.getLight()) && this.height == room.getHeight()
                    && this.bed.equals(room.getBed()) && this.table.equals(room.getTable()) && this.wardrobe.equals(room.getWardrobe()) );
        }
        return false;
    }
}