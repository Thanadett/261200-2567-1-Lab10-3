public class TextFileHandler implements  Handler{
    private String handlerName;
    private  Handler handler;

    public TextFileHandler(String handlername) {
        this.handlerName = handlername;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(File file) {
        if(file.getFileType().equals("text")) {
            System.out.println("Processing " + file.getFilePath()
                    + "/" + file.getFileName() + " by " + handlerName);
        } else if (handler != null) {
            System.out.println(handlerName + " forwards request to "
                    + handler.getHandlerName());
            handler.process(file);
        } else {
            System.out.println("File not supported");
        }
    }

    @Override
    public String getHandlerName() {
        return this.handlerName;
    }
}
