package figures.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Console {
protected Scanner scanner;
protected List<String> commands;

    public Console() {
        this.scanner = new Scanner(System.in);
        commands = new ArrayList<>();
    }
    protected void start(){
        System.out.println("Выберите команду, 99 если хотите прекратить работу: ");
        for (int i = 0; i < commands.size(); i++) {
            System.out.println("\t" + i + ". " + commands.get(i));
        }
        int choice =scanner.nextInt();
        while (choice != 99) {
            compel(choice);
            System.out.println("Выберите команду, 99 если хотите прекратить работу: ");
            for (int i = 0; i < commands.size(); i++) {
                System.out.println("\t" + i + commands.get(i));
            }
            choice = scanner.nextInt();
        }
    }
    protected abstract void compel(int num);
}
