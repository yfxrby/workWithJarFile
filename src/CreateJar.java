import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.jar.Attributes;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;
import java.util.zip.ZipEntry;

public class CreateJar {

    public static void main(String[] args) {

        Manifest manifest = new Manifest();
        manifest.getMainAttributes().put(Attributes.Name.MANIFEST_VERSION, "1.0");
        manifest.getMainAttributes().put(Attributes.Name.MAIN_CLASS, "first.Test");
        try (JarOutputStream out = new JarOutputStream(Files.newOutputStream(Paths.get("myJar.jar")), manifest)) {
            out.putNextEntry(new ZipEntry("first/Test.class"));
            Files.copy(Paths.get("first/Test.class"), out);
            out.closeEntry();
            out.putNextEntry(new ZipEntry("first/Test$WeekDay.class"));
            Files.copy(Paths.get("first/Test$WeekDay.class"), out);
            out.closeEntry();
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }

    }

}
