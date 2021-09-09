package challenges;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Uniform {

    private String colour;
    private String size;
    private String name;

    public Uniform(String colour, String size, String name){
        this.colour = colour;
        this.size = size;
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public String getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return colour + " " +
                size + " " +
                name;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int numberOfUniforms = Integer.parseInt(buffer.readLine());

        while (numberOfUniforms < 1 || numberOfUniforms > 60)
            System.out.println("Digite um número maior ou igual a 1 e menor que 60!");

        String name;
        String colour;
        String size;
        String line;
        List<Uniform> list = new ArrayList<Uniform>();

        for (int i = 1; i <= numberOfUniforms; i++) {
            line = buffer.readLine();
            name = line;
            line = buffer.readLine();
            colour = line.substring(0, line.length() - 1);
            size = line.substring(line.length() - 1);
            Uniform uniform = new Uniform(colour, size, name);
            list.add(uniform);
        }
        list.stream().
                sorted(Comparator.comparing(Uniform::getName)).
                sorted(Comparator.comparing(Uniform::getSize).reversed()).
                sorted(Comparator.comparing(Uniform::getColour)).
                forEach(System.out::println);
    }
}
