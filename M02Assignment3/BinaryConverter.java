public class BinaryConverter {
    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        for (int i = 0; i < binaryString.length(); i++) {
            char ch = binaryString.charAt(i);
            if (ch != '0' && ch != '1') {
                throw new BinaryFormatException("Invalid binary charecter: " + ch);
            }
        }

        // if valid, then convert using Integer.parseInt
        return Integer.parseInt(binaryString, 2);
    }
}