package ro.uvt.info.designpatternslab2025;

import java.util.ArrayList;
import java.util.List;

public class AlignLeft extends AlignStrategy {
    @Override
    public void render(Paragraph paragraph, Context context) {
        String text = paragraph.getText();
        int lineWidth = context.getLineWidth();
        List<String> lines = wrapText(text, lineWidth);
        
        for (String line : lines) {
            System.out.println(line);
        }
    }
    
    private List<String> wrapText(String text, int lineWidth) {
        List<String> lines = new ArrayList<>();
        String[] words = text.split("\\s+");
        StringBuilder currentLine = new StringBuilder();
        
        for (String word : words) {
            if (currentLine.length() + word.length() + 1 <= lineWidth) {
                if (currentLine.length() > 0) {
                    currentLine.append(" ");
                }
                currentLine.append(word);
            } else {
                if (currentLine.length() > 0) {
                    lines.add(currentLine.toString());
                }
                currentLine = new StringBuilder(word);
            }
        }
        if (currentLine.length() > 0) {
            lines.add(currentLine.toString());
        }
        return lines;
    }
}

