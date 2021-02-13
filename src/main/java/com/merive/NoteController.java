package com.merive;

import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;

import java.io.*;

public class NoteController {


    public TextArea text;
    public Pane pane;

    String path = "";

    public void open() {
        text.setText("");
        setPath();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null)
                if (text.getText().equals(""))
                    text.setText(line + "\n");
                else text.setText(text.getText() + line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void save() throws IOException {
        if (path.equals(""))
            setPath();
        writeToFile();
    }

    public void setPath() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select file");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("ALL FILES", "*.*"),
                new FileChooser.ExtensionFilter("ZIP", "*.zip"),
                new FileChooser.ExtensionFilter("PDF", "*.pdf"),
                new FileChooser.ExtensionFilter("TEXT", "*.txt"),
                new FileChooser.ExtensionFilter("IMAGE FILES", "*.jpg", "*.png", "*.gif")
        );


        File file = fileChooser.showOpenDialog(pane.getScene().getWindow());

        if (file != null)
            path = file.getPath();
    }

    public void writeToFile() throws IOException {
        FileWriter fw = new FileWriter(path);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(text.getText());
        bw.flush();
        bw.close();
    }
}
