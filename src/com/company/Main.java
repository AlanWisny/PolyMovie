package com.company;

public class Main {

    public static void main(String[] args) {

        for(int i = 1; i < 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }

    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) +1;
        System.out.println("Random #number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new TenaciuosD();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
    class Movie {
        public String getName() {
            return name;
        }

        private String name;

        public Movie(String name){
            this.name = name;
        }

        public String plot() {
            return "no plot here";
        }
    }

    class Jaws extends Movie{

        public Jaws() {
            super("Jaws");
        }

        public String plot() {
            return "A shark eats lots of people";
        }
    }

    class IndependenceDay extends Movie{

        public IndependenceDay() {
            super("Independence Day");
        }

        public String plot() {
            return "Aliens shoot up the government.";
        }
    }

    class MazeRunner extends Movie{

        public MazeRunner() {
            super("MazeRunner");
        }

        public String plot() {
            return "Kids try and escape a maze.";
        }
    }

    class TenaciuosD extends Movie{

        public TenaciuosD() {
            super("Tenacious D and the pick of Destiny.");
        }

        public String plot() {
            return "Two dudes try to take over the world of rock and roll by trying to acquire the pick of Destiny, only to learn that the power of rock was inside them all along.";
        }
    }

    class Forgetable extends Movie{

        public Forgetable() {
            super("unknown");
        }

    //No plot here
    }

















