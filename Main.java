public class Main {
    public static void main(String[] args) {
        TextFileHandler tfh = new TextFileHandler("1st handler");
        ImageFileHandler ifh = new ImageFileHandler("2nd handler");
        DocFileHandler dfh = new DocFileHandler("3rd handler");
        tfh.setHandler(ifh);
        ifh.setHandler(dfh);

        tfh.process(new File("demo1", "text","C:/OOP"));
        tfh.process(new File("demo2", "image","C:/OOP"));
        tfh.process(new File("demo3", "doc","C:/OOP"));
    }
}