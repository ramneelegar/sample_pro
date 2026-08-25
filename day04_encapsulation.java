
class BankAccount {
    private int bal;

    public void setBal(int bal) {
        if (bal > 0)
            this.bal = bal;
    }

    public int getBal() {
        return bal;
    }
}

class Customer {
    private int cid;
    private String cname;
    private long cnum;

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setCnum(long cnum) {
        this.cnum = cnum;
    }

    public int getCid() {
        return cid;
    }

    public String getCname() {
        return cname;
    }

    public long getCnum() {
        return cnum;
    }
}

public class day04_encapsulation {
    public static void main(String[] args) {

        BankAccount b = new BankAccount();
        b.setBal(-1000);
        System.out.println(b.getBal());

        Customer c = new Customer();
        c.setCid(1);
        c.setCname("ram");
        c.setCnum(8956456542L);

        System.out.println(c.getCid());
        System.out.println(c.getCname());
        System.out.println(c.getCnum());
    }
}