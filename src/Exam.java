public class Exam {
    String subject;
    int extend;
    Exam() {
    }

    Exam(String subject, int extend) {
        this.subject = subject;
        this.extend = extend;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setExtend(int extend) {
        this.extend = extend;
    }

    public String getSubject() {return subject;}
    public int getExtend() {return extend;}
}
