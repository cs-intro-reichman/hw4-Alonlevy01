public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        boolean pAlgo[] = new boolean[N+1];
        int t=2;
        int counter =0;
        int ratio;
        System.out.println("Prime numbers up to "+N+":");

        for (int i=2;i<pAlgo.length;i++) pAlgo[i]=true;
        while (t<=Math.sqrt(N)) {
            if (pAlgo[t] == true) {
                for (int p = t+1;p<pAlgo.length;p++) {
                    if (p % t == 0) {
                        pAlgo[p] = false;
                    }
                }
            }
            t++;
        }
        for (int i=2;i<pAlgo.length;i++) {
            if (pAlgo[i] == true) {
                System.out.println(i);
                counter++;
            }
        }
        ratio = counter*100/N;
        System.out.println("There are " +counter+ " primes between 2 and " + N + " ("+ ratio +"% are primes)");
    }
}