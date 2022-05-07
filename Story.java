public class Story {
    private int top;
    private String contact[];
    private String oldVersion; // Guarda a penúltima versão

    public Story(int size) {
        this.contact = new String[size];
        this.oldVersion = new String();
        this.top = 0;
    }

    public boolean isEmpty() {
        return this.top == 0;
    }

    public boolean isFull() {
        return this.top > this.contact.length;
    }

    public void CtrlY() {
        // Anula a última restauração
        this.push(oldVersion);
    }

    public void CtrlZ() {
        // Restaura a última versão do contato
        this.oldVersion = this.pop();
    }

    public void push(String cont) throws ArrayIndexOutOfBoundsException {
        if(this.isFull()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        this.contact[top] = cont.toString();
        this.top += 1;
    }

    public String pop() throws ArrayIndexOutOfBoundsException {
        if(this.isEmpty()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        this.top -= 1;
        String con = this.contact[this.top];
        this.contact[top] = null;
        return con;
    }

    public String toString() {
        String stackTrace = "";
        for(String con : contact) {
            stackTrace += (con != null) ? con + "\n\n" : "";
        }
        return stackTrace;
    }
}