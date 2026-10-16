package Modul03.Prob1;

import java.util.Random;

public class Dice {
        private int number;

        public Dice() {
            this.number = rollNumber();
        }

        public int getNumber(){
            return number;
        }

        private int rollNumber() {
            Random rand = new Random();
            return rand.nextInt(6) + 1;
        }

    public void setNumber(int number) {
        this.number = number;
    }

    }