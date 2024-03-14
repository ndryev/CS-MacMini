public class isIPv4Address {
    public static void main(String[] args) {
        String iPv4 = "172.16.254.1";
        System.out.println(isIPv4Address(iPv4));
    }
    public static boolean isIPv4Address (String iPv4){
        String pattern = "25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9]";
        String[] ips = iPv4.split("\\.");
        if (ips.length != 4) return false;
        for (String ip : ips) {
            if (!ip.matches(pattern)) return false;
        }
        return true;
    }
}
