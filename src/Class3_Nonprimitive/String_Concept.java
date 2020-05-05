package Class3_Nonprimitive;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class String_Concept {
    public static void main(String[] args) {
        String cityName = "New York City";
        int result = cityName.length();
        System.out.println("The length of '" + cityName + "' is "+result);

        String lowercaseCityName = cityName.toLowerCase();
        System.out.println("The lower case shows like "+ lowercaseCityName);

        // System.out.println("The lower case shows like "+ cityName.toLowerCase());
        String uppercaseCityName = cityName.toUpperCase();
        System.out.println("The upper case shows like "+ uppercaseCityName);

        Boolean  isEqual = lowercaseCityName.equals(uppercaseCityName);
        System.out.println("The result of Equal method is "+ isEqual);

        Boolean  isEqualIgnoreCase = lowercaseCityName.equalsIgnoreCase (uppercaseCityName);
        System.out.println("The result of Equal method is "+isEqualIgnoreCase);

        String isCity = "Hello world....how are you?";
        boolean Result = isCity.contains("hello");
        System.out.println("Does the sentence contain Hello word?"+ Result);
        // Find the word how and ignore the cases
        String Ans = isCity.toLowerCase();
        boolean Demo = Ans.contains("how");
        System.out.println("Does your sentence contain how word?"+Demo);
        // OR
        boolean Answer = isCity.toLowerCase().contains("how");
        System.out.println("Does your sentence contain how word?"+Answer);
        String NewCity = "New York City";
        //replace method

        String AfterReplace = NewCity.replace( 'C',  'c');
        System.out.println(AfterReplace);
        NewCity = NewCity.replace("York","Lake");
        System.out.println(NewCity);




    }
}
