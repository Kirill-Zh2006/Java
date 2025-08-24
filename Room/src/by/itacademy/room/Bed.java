package by.itacademy.room;

import java.util.concurrent.ThreadLocalRandom;

public class Bed {
        private int width;
        private boolean madeUp = ThreadLocalRandom.current().nextBoolean();;

        public Bed() {
        }

        public Bed(int width, boolean madeUp){
            this.width = width;
            this.madeUp = madeUp;;
        }

        public Bed(boolean madeUp) {
            this.madeUp = madeUp;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public boolean getMadeUp() {
            return this.madeUp;
        }

        public void setMadeUp(boolean madeUp) {
            this.madeUp = madeUp;
        }

        public String printInfoAboutMe() {
            String made;

            if (getMadeUp()){
                made = "заправлена.";
            }
            else {
                made = "не заправлена.";
            }
            return "После того, как вы зашли в комнату, вы видете кровать длинной " + getWidth() + " " + made + " \n";
        }

        public boolean equals(Bed bed){
            if (bed != null){
                return (this.width == bed.getWidth() && this.madeUp == bed.getMadeUp());
            }
            return false;
        }
}
