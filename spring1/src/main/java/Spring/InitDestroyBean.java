package Spring;

public class InitDestroyBean {
    private String message;

    private void init() {
        System.out.println(" Init");
    }

    private void destroy() {
        System.out.println(" Destroy ");
    }

    public void setMessage(String message) {
    }


}
