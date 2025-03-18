package com.FirstProgram;

public class XorTableExample {
    public static void main(String[] args) {
                byte[] p1 = {
            (byte)0x7A, (byte)0x93, (byte)0x38, (byte)0x58,
            (byte)0x5B, (byte)0x95, (byte)0x2D, (byte)0x5E,
            (byte)0x5B, (byte)0x83, (byte)0x3C, (byte)0x3D
        };

        byte[] key = {
            (byte)0x29, 
            (byte)0xE6, 
            (byte)0x48, // used when L1 mod 4 = 2
            (byte)0x3D  // used when L1 mod 4 = 3
        };

        // Print a header
        System.out.printf("%-4s %-8s %-8s %-8s %-20s%n",
                "L1", "P1[L1]", "L1%4", "KeyUsed", "XOR Result (Hex & ASCII)");

        for (int i = 0; i < p1.length; i++) {
            int pVal  = Byte.toUnsignedInt(p1[i]); // so we can print hex cleanly
            int kVal  = Byte.toUnsignedInt(key[i % 4]);
            int xorVal = pVal ^ kVal;             // the XOR result

            // Convert to 0xHH format
            String pHex   = String.format("0x%02X", pVal);
            String keyHex = String.format("0x%02X", kVal);
            String xHex   = String.format("0x%02X", xorVal);

            // Determine printable ASCII or not
            char asciiChar = (char)xorVal;
            // We only show the character if it’s in a “printable” ASCII range,
            // adjust as you prefer. Here we allow 0x20..0x7E for readability.
            String asciiStr;
            if (xorVal >= 0x20 && xorVal <= 0x7E) {
                asciiStr = "'" + asciiChar + "'";
            } else if (xorVal == 0) {
                asciiStr = "(stop)"; // your table called 0x00 'stop'
            } else {
                asciiStr = "(non‐printable)";
            }

            String xorResult = String.format("%-6s - %-10s", xHex, asciiStr);

            System.out.printf("%-4d %-8s %-8d %-8s %-20s%n",
                    i, pHex, (i % 4), keyHex, xorResult);

            // If the XOR result is 0, you might break out of the loop
            // if that’s the convention in your table (like a null terminator).
            if (xorVal == 0) {
                break;
            }
        }
    }
}
