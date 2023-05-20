import org.json.simple.parser.ParseException;

public class FromC2toC1 {

    public C2 c2;
    public C1 c1;

    public int getSum() throws ParseException {
        String json = "{\n" +
                "    \"N1\": \"10\",\n" +
                "    \"N2\": \"10\"\n" +
                "}";
        c2 = new C2(json);

        int x = Integer.parseInt(c2.getN1());
        int y = Integer.parseInt(c2.getN2());

        c1 = new C1(x,y);

        return c1.getSum();
    }

}
