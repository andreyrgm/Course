package co.argm.app;

import co.argm.app.model.Component;

import java.util.stream.Stream;

import static java.lang.System.out;

/**
 * Clase principal que demuestra la creación y visualización de una estructura jerárquica de componentes.
 */
public class Main {
    public static void main(String[] args) {
        // Crear componentes del PC
        Component pc = new Component("ATX PC Case");
        Component power = new Component("Power source 700W");
        Component motherboard = new Component("MainBoard Asus sockets AMD");
        Component cpu = new Component("CPU AMD Ryzen 5 2800");
        Component fan = new Component("CPU fan");
        Component heatsink = new Component("Heatsink");
        Component gc = new Component("Nvidia RTX 3080 8GB");
        Component gpu = new Component("Nvidia GPU RTX");
        Component gpuRam = new Component("4GB Ram");
        Component gpuRam2 = new Component("4GB Ram");
        Component gpuFans = new Component("fans");
        Component ram = new Component("Ram Memory 32GB");
        Component ssd = new Component("2T SSD disk");

        // Estructurar los componentes
        cpu.addComponent(fan).addComponent(heatsink);
        gc.addComponent(gpu).addComponent(gpuRam).addComponent(gpuRam2).addComponent(gpuFans);
        motherboard.addComponent(cpu).addComponent(gc).addComponent(ram).addComponent(ssd);
        pc.addComponent(power).addComponent(motherboard).addComponent(new Component("Keyboard"))
                .addComponent(new Component("Mouse"));

        // Mostrar la estructura jerárquica de componentes
        recursiveMethod(pc, 0)
                .forEach(c -> out.println("\t".repeat(c.getLevel()) + c.getName()));
    }

    /**
     * Método recursivo que asigna niveles jerárquicos a los componentes y devuelve un flujo de componentes
     * en orden jerárquico.
     *
     * @param c     el componente actual.
     * @param level el nivel jerárquico del componente.
     * @return un flujo de componentes en orden jerárquico.
     */
    public static Stream<Component> recursiveMethod(Component c, int level) {
        c.setLevel(level);
        return Stream.concat(Stream.of(c), c.getChildren().stream().flatMap(child -> recursiveMethod(child, level + 1)));
    }
}
