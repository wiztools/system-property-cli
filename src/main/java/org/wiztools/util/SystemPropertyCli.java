package org.wiztools.util;

import java.util.Properties;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SystemPropertyCli{
    public static void main(String[] arg){
        Properties p = System.getProperties();
        List<String> keys = new ArrayList<String>();
        for(String key: p.stringPropertyNames()){
            keys.add(key);
        }

        // Sort the keys:
        Collections.sort(keys);

        // Print sorted system properties:
        for(String key: keys){
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

