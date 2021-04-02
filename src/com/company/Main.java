package com.company;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here!";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws () {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats a lot of people.";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over the planet.";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    public String plot() {
        return "Kids try to escape the maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    // no method overriding here.
}

public class Main {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + (i+1) + "\nName: " + movie.getName() + "\nPlot: " + movie.plot() + "\n");
        }

}

    public static Movie randomMovie() {
        // Generates a number from 0-5.
        int randomNumber = (int) (Math.random() * 5 + 1);

        switch (randomNumber) {
            case 1 : return new Jaws();
            case 2 : return new IndependenceDay();
            case 3 : return new MazeRunner();
            case 4 : return new StarWars();
            case 5 : return new Forgetable();
            default: return null;
        }
}


//        for(int i = 0 ; i < 10; i++) {
//            double randomNumber = (int) (Math.random() * 5 + 1);
//            System.out.println((randomNumber));
//        }


}
