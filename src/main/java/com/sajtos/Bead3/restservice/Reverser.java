package com.sajtos.Bead3.restservice;

public class Reverser {
    private final String content;

    public Reverser(String inputText) {
        this.content = reverse(inputText);
    }

    public String getContent() {
        return content;
    }

    private String reverse(String inputText) {
        byte[] strAsByteArray = inputText.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++) {
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        }
        return new String(result);
    }

}
