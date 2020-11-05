package training.trainer;

public class TrainerMain {

    public static void main(String[] args) {
        Trainer trainer = new Trainer("Anna",1990);

        //trainer.setName("Ralph");
        System.out.println(trainer.getName());

        Trainer anotherTrainer = new Trainer("Józsi",1987);
        //anotherTrainer.setName("Rolli");
        System.out.println(anotherTrainer.getName());
        trainer.setYearOfBirth(1991);
        anotherTrainer.setYearOfBirth(1992);
        System.out.println(trainer.getYearOfBirth());
        System.out.println(anotherTrainer.getYearOfBirth());
        ;

        System.out.println(anotherTrainer.getName());
        System.out.println(anotherTrainer.getNameAndYOB());
        anotherTrainer.setName("Anna");
        System.out.println(anotherTrainer.getName());

        Trainer newTrainer = new Trainer("Laci", 1980);
        System.out.println(newTrainer.getNameAndYOB());


    }
}
