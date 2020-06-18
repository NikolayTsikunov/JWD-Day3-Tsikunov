package by.tsikunov.day3.reader;

import by.tsikunov.day3.exception.ProgramException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Reader {
    public List<String> readFromFile(String filePath) throws ProgramException {
        Path path = Paths.get(filePath);
        List<String> lines;

        if(!Files.exists(path)) {
            throw new ProgramException("Can't find file");
        }
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            throw new ProgramException("Can't read from file");
        }
        return lines;
    }
}
