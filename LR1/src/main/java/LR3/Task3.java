package LR3;

import javax.imageio.stream.ImageOutputStream;
import java.util.Scanner;

/* What are all the supertypes of String? Of Scanner? Of
ImageOutputStream? Note that each type is its own supertype. A class or

interface without declared supertype has supertype Object*/
public class Task3 {
    public static void doTask() {

        String s; // public final class String   implements java.io.Serializable, Comparable<String>, CharSequence
        // реализует интерфейсы  Serializable, Comparable и CharSequence
        Scanner scanner; // public final class Scanner implements Iterator<String>, Closeable
        // реализует интерфейсы  Iterator и Closeable
        ImageOutputStream imageOutputStream;// public interface ImageOutputStream extends ImageInputStream, DataOutput
        //Наследует от интерфейсов ImageInputStream  и DataOutput
    }
}
