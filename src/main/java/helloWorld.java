public class helloWorld {
    public static void main (String args[]){
        System.out.println("hello world");
        System.out.println(makeComplement("AAAA"));
    }

    public static String makeComplement(String dna) {
        //Your code
        String aux;
        aux = dna.replace('A','T');
        //aux = aux.replace('C','G');
        return aux;
    }
}
