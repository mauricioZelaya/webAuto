public class DNAComplement {

    public static String makeComplement(String dna) {
        //Your code
        String aux;
        aux = dna.replace('T','X').replace('A','T').replace('X','A').replace('C','X').replace('G','C').replace('X','G');
        return aux;
    }
}
