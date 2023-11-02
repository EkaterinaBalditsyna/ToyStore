import java.io.*;
importjava.util.*;

public class Toy {
    private int id;
    private String name;
    private double frequency;

    public Toy (int id, String name, double frequency){
        this.id = id;
        this.name = name;
        this.frequency = frequency;
    }
    public int getld(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getFrequency(){
        return frequency;
    }
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(new File("toys.txt"));
        List ids = new ArrayList();
        List names = new ArrayList();
        List frequency = new ArrayList();

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] tokens = line.split(",");
            ids.add(Integer.parselnt(tokens[0]));
            names.add(tokens[1]);
            frequencies.add(Doble.parseDouble(tokens[2]));
        }
        PriorityQueue toysQueue = new PriorityQueue(frequencies.size(), Comparator.comparingDouble(Toy::getFrequency));
        for (int i=0; i < frequencies.size(); i ++){
            Yoy toy = new Toy(ids.get(i), names.get(i), frequencies.get(i));
            toysQueue.add(toy);
        }
        Queue queue = new LinkedList();
        queue.addAll(toysQueue);

        writeToFile("result.txt", queue);
    }

    public static void writeToFile(String filename, Queue queue) throws IOException {
        BufferdWriter bw = new BufferdWriter(new FileWriter(filename));
        for (int i=0; i < 10; i++){
            Toy toy = queue.poll();
            bw.write(toy.getld() + "," + toy.getName() + "," + toy.getFrequency() + "n");
            }
            bw.close();
    }
}