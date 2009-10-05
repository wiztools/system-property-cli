package org.wiztools.util;

import java.util.Properties;
import java.util.Map;
import java.util.TreeMap;

public class SystemPropertyCli{
    public static void main(String[] arg){
        Properties p = System.getProperties();

        // Sort:
        Map<String, String> m = new TreeMap(p);

        // Print sorted system properties:
        for(String key: m.keySet()){
          String value = p.getProperty(key);
          if("\n".equals(value)){
            value = "\\n";
          }
          else if("\r".equals(value)){
            value = "\\r";
          }
          else if("\r\n".equals(value)){
            value = "\\r\\n";
          }
          System.out.println(key + " = " + value);
        }
    }
}
