package Strings.Solution8;

public class MyRegex {
    String ipPart = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    String pattern = ipPart + "." + ipPart + "." + ipPart + "." + ipPart;
}
