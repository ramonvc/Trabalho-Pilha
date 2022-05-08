public class Story {
    private int top;
    int cont;
    private String contact[];
    private String oldVersion[]; // Guarda a penúltima versão
    boolean y;

    public Story(int size) {
        this.contact = new String[size];
        this.oldVersion = new String[size];
        this.top = 0;
        this.cont = 0;
        this.y = false;
    }

    public boolean isEmpty() {
        return this.top == 0;
    }

    public boolean isFull() {
        return this.top > this.contact.length;
    }

    public void CtrlY() {
        // Anula a última restauração
        if(y && this.oldVersion[cont - 1] != null) {
            this.push(this.oldVersion[cont - 1]);
            cont -= 1;
            this.y = true;
        }
    }

    public void CtrlZ() {
        // Restaura a última versão do contato
        this.oldVersion[cont] = this.pop();
        this.y = true;
        this.cont += 1;
    }

    public void push(String cont) throws ArrayIndexOutOfBoundsException {
        if(this.isFull()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        this.contact[top] = cont.toString();
        this.top += 1;
        this.y = false;
    }

    public String pop() throws ArrayIndexOutOfBoundsException {
        if(this.isEmpty()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        this.top -= 1;
        String con = this.contact[this.top];
        this.contact[top] = null;
        this.y = false;
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